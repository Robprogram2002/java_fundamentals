package com.tutorial.Proyect2Movies.Datos;

import com.tutorial.Proyect2Movies.Domain.Movie;
import com.tutorial.Proyect2Movies.Exception.*;

import java.util.List;

public class MovieCatalogImp implements IMovieCatalog {

    private final DataAccessImp data = new DataAccessImp();

    @Override
    public void addMovie(String name) {
        try {
            boolean override = !data.exist(FILENAME);
            Movie newMovie = new Movie(name);
            System.out.println(newMovie.getName());
            data.insert(newMovie, FILENAME, override );
        } catch (DataAccessEx e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void listMovies() {
        try {
            List<Movie> movies = data.listMovies(FILENAME);
            movies.forEach(movie -> {
                System.out.println("Movie " + "No. " + movie.getMovieId() + " : " + movie.getName());
            });
        } catch (DataReaderEx e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void searchMovie(String name) {
        try {
            System.out.println(data.search(FILENAME, name));
        } catch (DataReaderEx e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void initCatalog() {
        try {
            data.create(FILENAME);
        } catch (DataAccessEx e) {
            System.out.println(e.getMessage());
        }
    }
}
