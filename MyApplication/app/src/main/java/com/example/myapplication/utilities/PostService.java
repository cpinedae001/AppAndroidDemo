package com.example.myapplication.utilities;

import com.example.myapplication.data.model.CatCategoria;
import com.example.myapplication.data.model.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PostService {

    @GET("/users/{id}")
    public Call<User> findId(@Path("id") String id);

    @GET("/usuario")
    public Call<User> findAll();

    @GET("api/Cat_Categoria")
    public Call<String> findAllCategorias();

    @GET("api/Cat_Categoria/{id}")
    public Call<CatCategoria> findOne(@Path("id") String id);
}
