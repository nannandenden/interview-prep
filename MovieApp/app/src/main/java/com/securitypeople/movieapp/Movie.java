package com.securitypeople.movieapp;

import com.google.gson.annotations.SerializedName;

public class Movie {

    /**
     * vote_count: 1622,
     id: 351286,
     video: false,
     vote_average: 6.6,
     title: "Jurassic World: Fallen Kingdom",
     popularity: 279.588,
     poster_path: "/c9XxwwhPHdaImA2f1WEfEsbhaFB.jpg",
     original_language: "en",
     original_title: "Jurassic World: Fallen Kingdom",
     genre_ids: [
     28,
     12,
     878
     ],
     backdrop_path: "/gBmrsugfWpiXRh13Vo3j0WW55qD.jpg",
     adult: false,
     overview: "Several years after the demise of Jurassic World, a volcanic eruption threatens the remaining dinosaurs on the island of Isla Nublar. Claire Dearing, the former park manager and founder of the Dinosaur Protection Group, recruits Owen Grady to help prevent the extinction of the dinosaurs once again.",
     release_date: "2018-06-06"
     */

    private String title;

    @SerializedName("backdrop_path")
    private String backdropPath;

    private String overview;

    public Movie(String title, String backdropPath, String overview) {
        this.title = title;
        this.backdropPath = backdropPath;
        this.overview = overview;
    }

    public String getTitle() {
        return title;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public String getOverview() {
        return overview;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }
}
