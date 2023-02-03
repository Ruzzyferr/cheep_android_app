package com.example.project_ruzgar_bulut.api;

import com.example.project_ruzgar_bulut.Entity.ProductSearch;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ShopProductAPI {
    @POST("/shopProducts/cheapest")
    Call<String> sendRequest(@Body ProductSearch productSearch);
}
