package com.lydiafrancis.pokedex;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

public class DetailActivity extends AppCompatActivity {


    Integer pokemonId = 1;
    TextView nameTextView, typesTextView, descriptionTextView, HPTextView, speedTextView;
    TextView attackTextView, defenseTextView, specialAttackTextView, specialDefenseTextView;
    ImageView pokemonSpriteView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);

        nameTextView = findViewById(R.id.DetailNameTextViewId);
        typesTextView = findViewById(R.id.DetailTypesTextViewId);
        pokemonSpriteView = findViewById(R.id.PokemonSpriteViewId);
        descriptionTextView= findViewById(R.id.DetailDescriptionTextViewId);

        HPTextView = findViewById(R.id.DetailHPTextViewId);
        speedTextView = findViewById(R.id.DetailSpeedTextViewId);
        attackTextView = findViewById(R.id.DetailAttackTextViewId);
        defenseTextView = findViewById(R.id.DetailDefenseTextViewId);
        specialAttackTextView = findViewById(R.id.DetailSpecialAttackTextViewId);
        specialDefenseTextView = findViewById(R.id.DetailSpecialDefenseTextViewId);

        setPokemon(pokemonId);

    }

    public void setPokemon(int pokemonId) {
        if (pokemonId == 0) {pokemonId = Pokemon.pokemon.length;}
        nameTextView.setText(Pokemon.pokemon[pokemonId - 1].getName());
        typesTextView.setText(Pokemon.pokemon[pokemonId - 1].getTypes());
        descriptionTextView.setText(Pokemon.pokemon[pokemonId - 1].getDescription());

        HPTextView.setText(Pokemon.pokemon[pokemonId - 1].getHP().toString());
        speedTextView.setText(Pokemon.pokemon[pokemonId - 1].getSpeed().toString());
        attackTextView.setText(Pokemon.pokemon[pokemonId - 1].getAttack().toString());
        defenseTextView.setText(Pokemon.pokemon[pokemonId - 1].getDefense().toString());
        specialAttackTextView.setText(Pokemon.pokemon[pokemonId - 1].getSpecialAttack().toString());
        specialDefenseTextView.setText(Pokemon.pokemon[pokemonId - 1].getSpecialDefense().toString());

        //set image
        String imageString = Pokemon.pokemon[pokemonId - 1].getImage();
        int id = getResources().getIdentifier(imageString, "drawable", this.getPackageName());
        pokemonSpriteView.setImageResource(id);

    }

    public void previousPokemon(View view){
        pokemonId = (pokemonId - 1) % Pokemon.pokemon.length;
        this.setPokemon(pokemonId);
    }

    public void nextPokemon(View view){
        pokemonId = (pokemonId % Pokemon.pokemon.length) + 1;
        this.setPokemon(pokemonId);
    }

}