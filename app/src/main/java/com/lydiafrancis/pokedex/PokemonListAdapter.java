package com.lydiafrancis.pokedex;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PokemonListAdapter extends RecyclerView.Adapter<PokemonListAdapter.PokemonListViewHolder> {
    private Pokemon[] pokemon;

    public PokemonListAdapter(Pokemon[] pokemon){
        this.pokemon = pokemon;
    }

    @Override
    public PokemonListViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemon_list_item, parent, false);
        return new PokemonListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PokemonListViewHolder viewHolder, int index) {
        viewHolder.pokemonNameView.setText(pokemon[index].getName());
        String Id = pokemon[index].getId().toString();
        viewHolder.pokemonNumberView.setText(Id);

        Log.d("Name", "name: " + pokemon[index].getName() );
        Log.d("Id", "id: " + Id);

        //String imageString = Pokemon.pokemon[index].getImage();
        //int id = viewHolder.itemView.getResources().getIdentifier(imageString, "drawable",
                //viewHolder.itemView.getContext().getPackageName());
        //viewHolder.pokemonSpriteView.setImageResource(id);
    }

    @Override
    public int getItemCount() {
        return pokemon.length;
    }

    public static class PokemonListViewHolder extends RecyclerView.ViewHolder {
        private TextView pokemonNameView;
        private TextView pokemonNumberView;
        private ImageView pokemonSpriteView;
        public PokemonListViewHolder(View itemView) {
            super(itemView);
            pokemonNameView = itemView.findViewById(R.id.ListNameTextViewId);
            pokemonNumberView = itemView.findViewById(R.id.ListNumberTextViewId);
            //pokemonSpriteView = itemView.findViewById(R.id.ListSpriteViewId);
        }
    }
}
