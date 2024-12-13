package ru.netology.javaqa.filmcatalog.services;

public class FilmManager {
    private String[] films = new String[0];
    private int limit;

    public FilmManager() {
        this.limit = 5;
    }

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public void save(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;

    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLenght;
        if (films.length < limit) {
            resultLenght = films.length;
        } else {
            resultLenght = limit;
        }
        String[] temp = new String[resultLenght];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = films[films.length - 1 - i];
        }
        return temp;
    }


}
