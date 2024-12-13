package ru.netology.javaqa.filmcatalog.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void empty() {
        FilmManager fm = new FilmManager();

        String[] expected = {};
        String[] actual = fm.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void oneFilm() {
        FilmManager fm = new FilmManager();
        fm.save("Movie1");
        String[] expected = {"Movie1"};
        String[] actual = fm.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void fiveFilms() {
        FilmManager fm = new FilmManager();
        fm.save("Movie1");
        fm.save("Movie2");
        fm.save("Movie3");
        fm.save("Movie4");
        fm.save("Movie5");
        String[] expected = {"Movie1", "Movie2", "Movie3", "Movie4", "Movie5"};
        String[] actual = fm.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastDefaul() {
        FilmManager fm = new FilmManager();
        fm.save("Movie1");
        fm.save("Movie2");
        fm.save("Movie3");
        fm.save("Movie4");
        fm.save("Movie5");
        fm.save("Movie11");
        fm.save("Movie21");
        fm.save("Movie31");
        fm.save("Movie41");
        fm.save("Movie51");
        String[] expected = {"Movie51", "Movie41", "Movie31", "Movie21", "Movie11"};
        String[] actual = fm.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastOne() {
        FilmManager fm = new FilmManager(1);
        fm.save("Movie1");
        fm.save("Movie2");
        fm.save("Movie3");
        fm.save("Movie4");
        fm.save("Movie5");
        fm.save("Movie11");
        fm.save("Movie21");
        fm.save("Movie31");
        fm.save("Movie41");
        fm.save("Movie51");
        String[] expected = {"Movie51"};
        String[] actual = fm.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastBelowLimit() {
        FilmManager fm = new FilmManager(20);
        fm.save("Movie1");
        fm.save("Movie2");
        fm.save("Movie3");
        fm.save("Movie4");
        String[] expected = {"Movie4", "Movie3", "Movie2", "Movie1"};
        String[] actual = fm.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


}
