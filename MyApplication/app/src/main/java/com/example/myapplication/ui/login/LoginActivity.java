package com.example.myapplication.ui.login;

import android.Manifest;
import android.app.Activity;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.data.model.CatCategoria;
import com.example.myapplication.data.model.CatTipoUsuario;
import com.example.myapplication.data.model.Persona;
import com.example.myapplication.data.model.User;
import com.example.myapplication.data.model.Usuario;
import com.example.myapplication.ui.login.LoginViewModel;
import com.example.myapplication.ui.login.LoginViewModelFactory;
import com.example.myapplication.utilities.Adaptador;
import com.example.myapplication.utilities.PostService;

import java.util.Date;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginActivity extends AppCompatActivity implements Callback<CatCategoria> {

    private LoginViewModel loginViewModel;

    private CatTipoUsuario catTipoUsuario = new CatTipoUsuario(1,"administrador","1",new Date());
    private Persona persona = new Persona(1L,"12222");
    private Usuario usuario = new Usuario(1, "admin","admin", "1", new Date(), catTipoUsuario, persona);
    String imei = "";
    static final Integer PHONESTATS = 0x1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginViewModel = ViewModelProviders.of(this, new LoginViewModelFactory())
                .get(LoginViewModel.class);

        final EditText usernameEditText = findViewById(R.id.username);
        final EditText passwordEditText = findViewById(R.id.password);
        final Button loginButton = findViewById(R.id.login);
        final ProgressBar loadingProgressBar = findViewById(R.id.loading);

        loginViewModel.getLoginFormState().observe(this, new Observer<LoginFormState>() {
            @Override
            public void onChanged(@Nullable LoginFormState loginFormState) {
                if (loginFormState == null) {
                    return;
                }
                loginButton.setEnabled(loginFormState.isDataValid());
                if (loginFormState.getUsernameError() != null) {
                    usernameEditText.setError(getString(loginFormState.getUsernameError()));
                }
                if (loginFormState.getPasswordError() != null) {
                    passwordEditText.setError(getString(loginFormState.getPasswordError()));
                }
            }
        });

        loginViewModel.getLoginResult().observe(this, new Observer<LoginResult>() {
            @Override
            public void onChanged(@Nullable LoginResult loginResult) {
                if (loginResult == null) {
                    return;
                }
                loadingProgressBar.setVisibility(View.GONE);
                if (loginResult.getError() != null) {
                    showLoginFailed(loginResult.getError());
                }
                if (loginResult.getSuccess() != null) {
                    updateUiWithUser(loginResult.getSuccess());
                }
                setResult(Activity.RESULT_OK);

                //Complete and destroy login activity once successful
               // finish();
            }
        });

        TextWatcher afterTextChangedListener = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // ignore
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // ignore
            }

            @Override
            public void afterTextChanged(Editable s) {
                loginViewModel.loginDataChanged(usernameEditText.getText().toString(),
                        passwordEditText.getText().toString());
            }
        };
        usernameEditText.addTextChangedListener(afterTextChangedListener);
        passwordEditText.addTextChangedListener(afterTextChangedListener);
        passwordEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    loginViewModel.login(usernameEditText.getText().toString(),
                            passwordEditText.getText().toString());
                }
                return false;
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadingProgressBar.setVisibility(View.VISIBLE);
                loginViewModel.login(usernameEditText.getText().toString(),
                        passwordEditText.getText().toString());
                //consultarPermiso(Manifest.permission.READ_PHONE_STATE, PHONESTATS );
                usuario.setUsuario(usernameEditText.getText().toString());
                usuario.setContrasena(passwordEditText.getText().toString());
                find(usuario);

                try {

                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }catch (Exception e){
                    e.printStackTrace();
                }

                //finish();

            }
        });

    }

    private void consultarPermiso(String permiso, Integer requestCode){
        if(ContextCompat.checkSelfPermission(LoginActivity.this, permiso) != PackageManager.PERMISSION_GRANTED){
            if(ActivityCompat.shouldShowRequestPermissionRationale(LoginActivity.this, permiso)){
                ActivityCompat.requestPermissions(LoginActivity.this, new String[]{permiso}, requestCode);
            } else {
                ActivityCompat.requestPermissions(LoginActivity.this, new String[]{permiso}, requestCode);
            }

        }else {
            imei = obtenerIMEI();
            Toast.makeText(this, permiso + "permiso de lectura de imei", Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(this, imei , Toast.LENGTH_LONG).show();
    }

    private void updateUiWithUser(LoggedInUserView model) {
        String welcome = getString(R.string.welcome) + model.getDisplayName();
        // TODO : initiate successful logged in experience
        Toast.makeText(getApplicationContext(), welcome, Toast.LENGTH_LONG).show();
    }

    private void showLoginFailed(@StringRes Integer errorString) {
        Toast.makeText(getApplicationContext(), errorString, Toast.LENGTH_SHORT).show();
    }

    public String quitaNulo(String var) {
        String res = "";
        if (var != null && var.trim().length() > 0) {
            res = var.trim().replace(".null.", "").replace("null", "").replace(".NULL.", "").replace("NULL", "");
        } else {
            res = "";
        }
        return res.trim();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case 1:{
                if (grantResults.length >  0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    imei = obtenerIMEI();
                }
                else {
                    Toast.makeText(LoginActivity.this, "No hay permiso de lectura del IMEI", Toast.LENGTH_SHORT).show();
                }
            }
        }
        return;
    }

    private String obtenerIMEI(){
        final TelephonyManager telephonyManager = (TelephonyManager) this.getSystemService(Context.TELEPHONY_SERVICE);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            //return telephonyManager.getImei();
        }else{
            //return telephonyManager.getDeviceId();
        }
        return null;
    }

    private void find(Usuario usuario){


        //Call<CatCategoria> call2 = Adaptador.getServicios().findOne("2");

        if(usuario.getUsuario().contains("admin") && usuario.getContrasena().contains("admin1234")){

        }else {
            Call<CatCategoria> call = Adaptador.getServicios().findOne("2");
            call.enqueue(this);
        }

    }


    @Override
    public void onResponse(Call<CatCategoria> call, Response<CatCategoria> response) {
        if(response.isSuccessful()){
            Log.d("onResponse diseases", "exito si hay conexion");
            CatCategoria respuesta = response.body();
            Log.d("REspuesta: ", respuesta.toString());
        }else {
            Log.d("onResponse diseases", "error, pero hay conexion");
        }
    }

    @Override
    public void onFailure(Call<CatCategoria> call, Throwable t) {
        Log.d("onResponse diseases", "no  hay conexion" + t.toString());
    }


    private boolean validarUsuario(String usuario, String contrasena){


        return false;
    }
}