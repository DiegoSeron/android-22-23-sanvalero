package com.example.pokemon_api_01.entities;

import com.google.gson.annotations.SerializedName;

public class Pokemon {

    /*
        "name": "ivysaur",
        "url": "https://pokeapi.co/api/v2/pokemon/2/"
     */

    @SerializedName("name")
    private String name;
    @SerializedName("url")
    private String url;

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
