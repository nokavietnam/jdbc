package com.nokavietnam.jdbc.movie;

import com.nokavietnam.jdbc.actor.Actor;

import java.time.LocalDate;
import java.util.List;

public record Movie (Integer id,
                     String name,
                     List<Actor> actors,
                     LocalDate releaseDate) {

}
