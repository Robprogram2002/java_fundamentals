package com.tutorial.Proyect2Movies.Domain;

import java.io.Serializable;

public class Movie implements Serializable {
    private String name;
    private double duration;
    private String director;
    private String[] actors;
    private String origin;
    private final int movieId;

    public static int moviesCounter;

    public Movie() {
        this.movieId = moviesCounter++;
    }

    public Movie(String name) {
        this();
        this.name = name;
    }

    public Movie(String name, double duration, String director, String[] actors, String origin) {
        this.name = name;
        this.duration = duration;
        this.director = director;
        this.actors = actors;
        this.origin = origin;
        this.movieId = moviesCounter++;
    }

    public static int getMoviesCounter() {
        return moviesCounter;
    }

    public int getMovieId() {
        return movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
