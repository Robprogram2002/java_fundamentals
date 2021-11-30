package com.tutorial.Proyect2Movies.Datos;

import com.tutorial.Proyect2Movies.Domain.Movie;
import com.tutorial.Proyect2Movies.Exception.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataAccessImp implements IDataAccess {
    @Override
    public boolean exist(String fileName) throws DataAccessEx {
        File file = new File(fileName);
        return file.exists();
    }

    @Override
    public List<Movie> listMovies(String fileName) throws DataReaderEx {
        File file = new File(fileName);
        List<Movie> movies = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while(line != null) {
                Movie movie = new Movie(line);
                movies.add(movie);
                line = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            throw new DataReaderEx("Resource not found. Error when listing movies");
        } catch (IOException e) {
            throw new DataReaderEx("Ioexception. Error when listing movies");
        }

        return movies;
    }

    @Override
    public void insert(Movie newMovie, String fileName, boolean override) throws DataWritterEx {
        File file = new File(fileName);
        try {
            var writer = new PrintWriter(new FileWriter(file, !override));
            String name =  newMovie.getName();
            System.out.println(name);
            writer.println(name);
            writer.close();
        } catch (IOException e) {
            throw new DataWritterEx("Exception to insert movie");
        }
    }

    @Override
    public String search(String fileName, String name) throws DataReaderEx {
        File file = new File(fileName);
        String result = "Movie not found";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            int index = 1;
            while(line != null) {
                Movie movie = new Movie(reader.readLine());
                if (name.equalsIgnoreCase(movie.getName())) {
                    result = "Movie " + movie.getName() + "was found in the line " + index;
                    break;
                }
                index++;
                line = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            throw new DataReaderEx("Resource not found. Error when searching movies");
        } catch (IOException e) {
            throw new DataReaderEx("Ioexception. Error when searching movies");
        }

        return result;
    }

    @Override
    public void create(String fileName) throws DataAccessEx {
        File file = new File(fileName);
        try {
            var writer = new PrintWriter(new FileWriter(file));
            writer.close();
            System.out.println("File was created successfully!!");
        }  catch (FileNotFoundException e) {
            //e.printStackTrace();
            throw new DataReaderEx("Resource not found. Error when creating file");
        } catch (IOException e) {
            throw new DataReaderEx("Ioexception. Error when creating file");
        }
    }

    @Override
    public void delete(String fileName) throws DataAccessEx {
        File file = new File(fileName);
        if (file.exists()) {
            file.delete( );
            System.out.println("File was deleted successfully!!");
        } else {
            throw new DataAccessEx("File not found when deleting");
        }
    }
}
