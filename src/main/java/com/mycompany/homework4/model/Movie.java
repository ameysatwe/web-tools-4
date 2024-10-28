package com.mycompany.homework4.model;

public class Movie {

    private String title;

    private String genre;
    private String director;
    private Integer releaseYear;

    public Movie(String title,String genre,String director, Integer releaseYear){
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public Movie() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }
}
