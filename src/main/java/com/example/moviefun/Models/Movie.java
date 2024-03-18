package com.example.moviefun.Models;

import java.time.LocalDateTime;

public class Movie {

    private int id;
    private String title;
    private int releaseYear;
    private String description;
    private String tags;


    public Movie() {
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getDescription() {
        return description;
    }

    public String getTags() {
        return tags;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public int getYearsOld(){
        return LocalDateTime.now().getYear() - releaseYear;
    }


}
