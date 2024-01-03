package org.example.Afisha.Afisha;

public class AfishaManager {
    private AfishaFilms[] films = new AfishaFilms[0];
    private int limit = 5;

    public AfishaManager() {

    }

    public AfishaManager(int limit) {
        this.limit = limit;
    }


    public void addFilms(AfishaFilms film) {
        AfishaFilms[] tmp = new AfishaFilms[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        this.films = tmp;

    }

    public AfishaFilms[] findAll() {
        return films;
    }

    public AfishaFilms[] findLast() {
        int resultLength;
        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        AfishaFilms[] tmp = new AfishaFilms[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}

