package com.example.smash_api_fragment.model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FightersAPI {
    @GET("smashapicsv.json")
    Call<List<Fighters>> getlistsmash();
}
