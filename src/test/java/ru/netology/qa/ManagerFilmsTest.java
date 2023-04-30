package ru.netology.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerFilmsTest {
    @Test
    public void SholFilms() {
        String film1 = "Brat";
        String film2 = "Brat2";
        String film3 = "Brat3";
        String film4 = "Brat4";
        String film5 = "Brat5";
        String film6 = "Brat6";
        String film7 = "Brat7";
        ManagerFilms manager = new ManagerFilms();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        String[] actual = manager.filmAll();
        String[] expected = {film1, film2, film3, film4, film5, film6, film7,};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        String film1 = "Brat";
        String film2 = "Brat2";
        String film3 = "Brat3";
        String film4 = "Brat4";
        String film5 = "Brat5";
        String film6 = "Brat6";
        String film7 = "Brat7";
        ManagerFilms manager = new ManagerFilms();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        String[] actual = manager.lostFilm();
        String[] expected = {film7, film6, film5, film4, film3, film2, film1};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test3() {
        String film1 = "Brat";
        String film2 = "Brat2";
        String film3 = "Brat3";
        String film4 = "Brat4";
        String film5 = "Brat5";
        String film6 = "Brat6";
        String film7 = "Brat7";
        String film8 = "Brat8";
        String film9 = "Brat9";
        String film10 = "Brat10";
        String film11 = "Brat11";
        String film12 = "Brat12";
        ManagerFilms manager = new ManagerFilms(12);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);
        manager.addFilm(film12);

        String[] actual = manager.lostFilm();
        String[] expected = {film12, film11, film10, film9, film8, film7, film6, film5, film4, film3, film2, film1,};
        Assertions.assertArrayEquals(expected, actual);
    }

}
