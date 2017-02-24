package com.example.android.playwithme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MakeDrum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_drum);
    }
    /**
     * Button returns app to main screen
     */
    public void backToMain(View view) {
        Intent openMain = new Intent(this, MainActivity.class);
        boolean makeDrumDone = true;
        openMain.putExtra("MAKE_DRUM_DONE", makeDrumDone);
        startActivity(openMain);
    }
}