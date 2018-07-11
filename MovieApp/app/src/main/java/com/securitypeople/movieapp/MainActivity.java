package com.securitypeople.movieapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMovies;
    private MovieAdapter adapter;
    private List<Movie> movies;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupView();
        setupNetwork();
    }

    private void setupNetwork() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        MovieService service = retrofit.create(MovieService.class);
        Call<MoviesResponse> call = service.getMovies();
        call.enqueue(new Callback<MoviesResponse>() {
            @Override
            public void onResponse(Call<MoviesResponse> call, Response<MoviesResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    System.out.print(response.body().results.size());
                    int start = movies.size();
                    movies.addAll(response.body().results);
                    adapter.notifyItemRangeInserted(start, movies.size());
                }
            }

            @Override
            public void onFailure(Call<MoviesResponse> call, Throwable t) {
                System.out.println(t.getLocalizedMessage());
            }
        });
    }

    private void setupView() {
        rvMovies = findViewById(R.id.rvMovies);
        rvMovies.setLayoutManager(new LinearLayoutManager(this));
        movies = new ArrayList<>();
        adapter = new MovieAdapter(this, movies);
        rvMovies.setAdapter(adapter);
    }
}
