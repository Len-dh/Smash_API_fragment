package com.example.smash_api_fragment.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.smash_api_fragment.R;
import com.example.smash_api_fragment.model.Fighters;
import com.google.gson.Gson;

public class Activity_details extends Activity {
    //AFFICHAGE
    //variables pour toutes les donnees
    public TextView name;
    public ImageView imToUrlCh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);


        //initial
        name = (TextView) findViewById(R.id.name);
        imToUrlCh = (ImageView) findViewById(R.id.imToUrlCh);


        //recupere le GSON passer en entree et le retransforme en objet console
        String jsonFighters = getIntent().getStringExtra("fighter_key");
        Gson gson = new Gson();
        Fighters item = gson.fromJson(jsonFighters, Fighters.class);

        //actualise la vue en fonction des parametres
        name.setText(item.getName());//affiche le nom de la console
        //Picasso.get().load(item.getImToUrlCh()).into(imToUrlCh);

    }
}
