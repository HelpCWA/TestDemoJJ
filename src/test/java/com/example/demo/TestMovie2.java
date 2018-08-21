package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)
public class TestMovie2 {
  @Autowired
  ActorRepository actorRepository;
  @Test
  public void testActor1() {
    Actor actor = new Actor();
    actor.setName("David Bullock");
    actor.setRealname("David Mae Bullowski");

    Movie movie = new Movie();
    movie.setTitle("Some Movie");
    movie.setYear(2019);
    movie.setDescription("About some movie...");

    Set<Movie> movies = new HashSet<Movie>();
    movies.add(movie);

    actor.setMovies(movies);
    actorRepository.save(actor);
    //Test values should always be unique
    assertEquals(actorRepository.findById(2L).get().getId(), actor.getId());
  }
}
