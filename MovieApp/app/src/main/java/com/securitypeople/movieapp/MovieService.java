package com.securitypeople.movieapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MovieService {

    // GET("users/{user}/repos")
    //  Call<List<Repo>> listRepos(@Path("user") String user);
    @GET("now_playing?api_key=a07e22bc18f5cb106bfe4cc1f83ad8ed")
    Call<MoviesResponse> getMovies();
}
