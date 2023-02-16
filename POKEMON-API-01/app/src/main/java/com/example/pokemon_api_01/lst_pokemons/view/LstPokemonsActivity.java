package com.example.pokemon_api_01.lst_pokemons.view;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pokemon_api_01.R;
import com.example.pokemon_api_01.entities.Pokemon;
import com.example.pokemon_api_01.lst_pokemons.LstPokemonContract;

import java.util.ArrayList;

public class LstPokemonsActivity extends AppCompatActivity implements LstPokemonContract.View {

    private LstPokemonAdapter lstPokemonAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    public void successLstPokemon(ArrayList<Pokemon> lstPokemon) {
        //LstPokemonAdapter.adicionarListaPokemon(lstPokemon);
    }

    @Override
    public void failureLstPokemon(String error) {

    }
}
