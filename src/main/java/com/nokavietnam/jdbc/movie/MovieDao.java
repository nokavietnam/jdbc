package com.nokavietnam.jdbc.movie;

import java.util.List;
import java.util.Optional;

public interface MovieDao {
    List<Movie> selectMoves();
    int insertMovie(Movie movie);
    int deleteMovie(int id);
    Optional<Movie> selectMovieById(int id);
    // TODO: Update
}
