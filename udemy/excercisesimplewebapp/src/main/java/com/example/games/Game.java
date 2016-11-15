package com.example.games;

public class Game {

    private String title;
    private String yearOfRelease;
    private boolean isMultiplayer;

    public Game(String title, String yearOfRelease, boolean isMultiplayer) {
        this.title = title;
        this.yearOfRelease = yearOfRelease;
        this.isMultiplayer = isMultiplayer;
    }

    public String getTitle() {
        return title;
    }

    public String getYearOfRelease() {
        return yearOfRelease;
    }

    public boolean getIsMultiplayer() {
        return isMultiplayer;
    }
}
