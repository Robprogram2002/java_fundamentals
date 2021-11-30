package com.tutorial.Proyect2Movies.Presentation;

import com.tutorial.Proyect2Movies.Datos.IMovieCatalog;
import com.tutorial.Proyect2Movies.Datos.MovieCatalogImp;

import java.util.Scanner;

public class MoviePresentation {
    public static void main(String[] args) {
        int option = -1;
        IMovieCatalog catalog = new MovieCatalogImp();
        Scanner console = new Scanner(System.in);

        while(option != 0) {
            System.out.println("Please enter an option :\n");
            System.out.println("1. Init movie catalog \n");
            System.out.println("2. Add new movie \n");
            System.out.println("3. list movies \n");
            System.out.println("4. Search a movie \n");
            System.out.println("0. Close \n");

            option = Integer.parseInt(String.valueOf(console.nextLine().charAt(0)));

            switch (option) {
                case 1 -> catalog.initCatalog();
                case 2 -> {
                    System.out.println("Please, enter the name of the movie : ");
                    String name = console.nextLine().trim();
                    catalog.addMovie(name);
                }
                case 3 -> catalog.listMovies();
                case 4 -> {
                    System.out.println("Please, enter the movie's name for search");
                    String search_name = console.nextLine().trim();
                    catalog.searchMovie(search_name);
                }
                case 0 -> System.out.println("See you later, return soon");
                default -> System.out.println("Please enter a valid option number");
            }
        }
    }
}
