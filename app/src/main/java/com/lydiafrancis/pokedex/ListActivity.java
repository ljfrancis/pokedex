package com.lydiafrancis.pokedex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;


public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        RecyclerView pokemonListRecyclerView = findViewById(R.id.PokemonListRecyclerView);
        PokemonListAdapter pokemonListAdapter = new PokemonListAdapter(Pokemon.pokemon);
        pokemonListRecyclerView.setAdapter(pokemonListAdapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        pokemonListRecyclerView.setLayoutManager(layoutManager);




        /*
        ArrayAdapter<String> projectsListAdapter =
                new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, pokemonNameList);

        ListView pokemonListView = (ListView) (v.findViewById(R.id.projectsList_view));
        pokemonListView.setAdapter(projectsListAdapter);

        pokemonListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(), ProjectDetailActivity.class);
                intent.putExtra("projectid",i );
                startActivity(intent);

            }
        });

        */



    }
}
