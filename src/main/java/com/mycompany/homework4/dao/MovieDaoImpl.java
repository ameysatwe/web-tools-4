package com.mycompany.homework4.dao;

import com.mycompany.homework4.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieDaoImpl implements MovieDAO{

    private final String jdbcURL = "jdbc:mysql://localhost:3306/moviesDB";
    private final String jdbcUsername = "amey";
    private final String jdbcPassword = "7507";

    private static final String INSERT_MOVIE_SQL = "INSERT INTO movies (title, genre, director, release_year) VALUES (?, ?, ?, ?);";
    private static final String SELECT_ALL_MOVIES = "SELECT * FROM movies;";

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public void addMovie(Movie movie) {
        System.out.println("addMovie Method called");
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_MOVIE_SQL)) {
            preparedStatement.setString(1, movie.getTitle());
            preparedStatement.setString(2, movie.getGenre());
            preparedStatement.setString(3, movie.getDirector());
            preparedStatement.setInt(4, movie.getReleaseYear());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Movie> getAllMovies() {
        List<Movie> movies = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_MOVIES)) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String genre = rs.getString("genre");
                String director = rs.getString("director");
                int releaseYear = rs.getInt("release_year");
                movies.add(new Movie(title, genre, director, releaseYear));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return movies;
    }

    @Override
    public List<Movie> searchMovies(String keyword) {
        List<Movie> movies = new ArrayList<>();
        String sql = "SELECT * FROM movies WHERE title LIKE ? OR genre LIKE ? OR director LIKE ?";

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            System.out.println("keyword"+keyword);
            // Set the query parameters
            preparedStatement.setString(1, "%" + keyword + "%");
            preparedStatement.setString(2, "%" + keyword + "%");
            preparedStatement.setString(3, "%" + keyword + "%");

            // Execute the query and process the ResultSet
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    Movie movie = new Movie();
                    movie.setTitle(resultSet.getString("title"));
                    movie.setGenre(resultSet.getString("genre"));
                    movie.setDirector(resultSet.getString("director"));
                    movie.setReleaseYear(resultSet.getInt("release_year"));
                    movies.add(movie);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();  // Log or rethrow as needed
        }
        System.out.println("size"+movies.size());
        return movies;
    }
}
