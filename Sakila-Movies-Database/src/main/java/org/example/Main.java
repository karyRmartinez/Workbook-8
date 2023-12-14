package org.example;
import java.sql.*;
import java.sql.Date;
import java.util.Scanner;
import java.util.List;
import org.apache.commons.dbcp2.BasicDataSource;

public class Main {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter the last name of an actor you like");
            String lastName = scanner.nextLine();

            DataManager dataManager = new DataManager();

            List<Actor> actors = dataManager.searchActorsByName(lastName);
            actors.forEach(System.out::println);


            System.out.println("Please enter an actor id to see movies: ");
            int actorId = scanner.nextInt();


            List<Film> films = dataManager.getMoviesByActorId(actorId);
            films.forEach(System.out::println);

      }
    }