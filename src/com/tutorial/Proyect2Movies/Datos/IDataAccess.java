package com.tutorial.Proyect2Movies.Datos;

import com.tutorial.Proyect2Movies.Domain.Movie;
import com.tutorial.Proyect2Movies.Exception.*;

import java.io.FileNotFoundException;
import java.util.List;

public interface IDataAccess {

    boolean exist(String fileName) throws DataAccessEx;

    List<Movie> listMovies(String fileName) throws DataReaderEx, FileNotFoundException;

    void insert(Movie newMovie, String fileName, boolean override) throws DataWritterEx;

    String search(String fileName, String name) throws DataReaderEx;

    void create(String fileName) throws DataAccessEx;

    void delete(String fileName) throws DataAccessEx;

}
