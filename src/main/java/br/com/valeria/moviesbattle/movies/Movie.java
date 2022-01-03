package br.com.valeria.moviesbattle.movies;

import javax.persistence.Entity;

@Entity
public class Movie {

    private String title;
    private Integer year;
    private String imdb;
    private Double rating;

    public Movie() {
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getYear() {
        return this.year;
    }

    public String getImdb() {
        return this.imdb;
    }

    public Double getRating() {
        return this.rating;
    }
}
