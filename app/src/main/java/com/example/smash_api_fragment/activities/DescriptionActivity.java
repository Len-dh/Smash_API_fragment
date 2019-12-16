package com.example.smash_api_fragment.activities;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;;

import com.example.smash_api_fragment.R;
import com.squareup.picasso.Picasso;

public class DescriptionActivity extends Activity {

    public TextView tvname;
    public ImageView imageToUrlCh;
    public ImageView tvserie; //image
    public TextView tvfirstApp;
    public TextView tvdescCharac;
    public TextView tvtiersRanking;
    public View layout;


    private static final String TAG = "DescriptionActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description_layout);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String imUrl = intent.getStringExtra("imch");
        String serUrl = intent.getStringExtra("serie");

        Log.d(TAG, "onCreate: started.");
        tvname = (TextView) findViewById(R.id.name);
        tvname.setText(intent.getStringExtra("namec"));
        imageToUrlCh = (ImageView) findViewById(R.id.imToUrlCh);
        Picasso.with(getApplicationContext()).load(imUrl).into(imageToUrlCh);
        tvserie = (ImageView) findViewById(R.id.serieToUrl);
        Picasso.with(getApplicationContext()).load(serUrl).into(tvserie);
        tvfirstApp = (TextView) findViewById(R.id.firstApp);
        tvfirstApp.setText(intent.getStringExtra("firstApp"));
        tvdescCharac = (TextView) findViewById(R.id.descCharac);
        tvdescCharac.setText(intent.getStringExtra("descPer"));
        tvtiersRanking = (TextView) findViewById(R.id.tiersRanking);
        tvtiersRanking.setText(intent.getStringExtra("tranking"));

    }

    public void smash_layout(View view) {
        Intent intent = new Intent(this, GifActivity.class);
        startActivity(intent);
    }



    public void Popup (View v){
        CoordinatorLayout coor = v.findViewById(R.id.coordinator);
        Snackbar snackbar = Snackbar
                .make(coor, "Welcome to AndroidHive", Snackbar.LENGTH_LONG);

        snackbar.show();


    }


}
