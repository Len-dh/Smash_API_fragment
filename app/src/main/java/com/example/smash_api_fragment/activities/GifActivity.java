package com.example.smash_api_fragment.activities;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.bumptech.glide.Glide;
import com.example.smash_api_fragment.R;

public class GifActivity extends Activity {
    private ImageView imgif;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gif_layout);

        VideoView videoView =(VideoView)findViewById(R.id.videoView);

        Uri uri=Uri.parse("rtsp://r5---sn-4g5ednld.googlevideo.com/Cj0LENy73wIaNAltcAyvi-QbchMYJCAkFC1Mie5dMOCoAUIASARgv6-mhfKhjO1aigELZlk2N1lCLW1mczAM/BEEEABB31AD858757DE568C8DDFCA0A7A3A7F691.6F9F3B9703A6D6B9EFC36790CCA7C4313A793CC4/yt8/1/video.3gp");
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

        // imgif = (ImageView) findViewById(R.id.imaGif);
        // Glide.with(this).asGif().load("https://media.giphy.com/media/UtiwNokthANEY/giphy.gif").into(imgif);

    }
}
