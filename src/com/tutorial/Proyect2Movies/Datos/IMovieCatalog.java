package com.tutorial.Proyect2Movies.Datos;

public interface IMovieCatalog {
    String FILENAME = "movies.txt";

    void addMovie(String name);
    void listMovies();
    void searchMovie(String name);
    void initCatalog();
}
