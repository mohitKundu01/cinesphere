package com.cinesphere.cinesphere.movie.model;

public class Movie {

    private Long id;
    private String title;
    private String description;
    private String language;

    public Movie(Long id, String title, String description, String language){
        this.id = id;
        this.title = title;
        this.description = description;
        this.language = language;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
