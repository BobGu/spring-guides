package com.example.pojo;

public class People {

    private String name;
    private String birthPlace;
    private String favoriteHobby;

    public People(String name, String birthPlace, String favoriteHobby) {
        this.name = name;
        this.birthPlace = birthPlace;
        this.favoriteHobby = favoriteHobby;
    }

    public String getName() {
        return name;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public String getFavoriteHobby() {
        return favoriteHobby;
    }
}
