package org.example.Afisha.Afisha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaManagerTest {
    AfishaFilms film1 = new AfishaFilms("Бладшот", "Боевик");
    AfishaFilms film2 = new AfishaFilms("Вперед", "Мультфильм");
    AfishaFilms film3 = new AfishaFilms("Отель 'Белград'", "Комедия");
    AfishaFilms film4 = new AfishaFilms("Джентльмены", "Боевик");
    AfishaFilms film5 = new AfishaFilms("Человек-неведимка", "Ужасы");
    AfishaFilms film6 = new AfishaFilms("Тролли. Мировой тур", "Мультфильм");
    AfishaFilms film7 = new AfishaFilms("Номер один", "Комедия");

    AfishaManager manager = new AfishaManager();

    @Test
    public void AddFilmsNull() {

        AfishaFilms[] expected = {};
        AfishaFilms[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void AddFilmsOne() {

        manager.addFilms(film1);

        AfishaFilms[] expected = {film1};
        AfishaFilms[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void AddFilmsAll() {

        manager.addFilms(film1);
        manager.addFilms(film2);
        manager.addFilms(film3);
        manager.addFilms(film4);
        manager.addFilms(film5);
        manager.addFilms(film6);
        manager.addFilms(film7);

        AfishaFilms[] expected = {film1, film2, film3, film4, film5, film6, film7};
        AfishaFilms[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void LimitFilmsAll() {
        AfishaManager manager = new AfishaManager(7);

        manager.addFilms(film1);
        manager.addFilms(film2);
        manager.addFilms(film3);
        manager.addFilms(film4);
        manager.addFilms(film5);
        manager.addFilms(film6);
        manager.addFilms(film7);

        AfishaFilms[] expected = {film7, film6, film5, film4, film3, film2, film1};
        AfishaFilms[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void LimitFilmsClassic() {
        AfishaManager manager = new AfishaManager();

        manager.addFilms(film1);
        manager.addFilms(film2);
        manager.addFilms(film3);
        manager.addFilms(film4);
        manager.addFilms(film5);
        manager.addFilms(film6);
        manager.addFilms(film7);

        AfishaFilms[] expected = {film7, film6, film5, film4, film3};
        AfishaFilms[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void LimitFilmsOne() {
        AfishaManager manager = new AfishaManager(1);

        manager.addFilms(film5);
        manager.addFilms(film6);
        manager.addFilms(film7);

        AfishaFilms[] expected = {film7};
        AfishaFilms[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void LimitFilmsZero() {
        AfishaManager manager = new AfishaManager(0);

        manager.addFilms(film1);
        manager.addFilms(film2);
        manager.addFilms(film3);
        manager.addFilms(film4);
        manager.addFilms(film5);
        manager.addFilms(film6);
        manager.addFilms(film7);

        AfishaFilms[] expected = {};
        AfishaFilms[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}
