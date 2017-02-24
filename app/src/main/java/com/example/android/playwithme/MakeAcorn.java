package com.example.android.playwithme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MakeAcorn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_acorn);
    }
    /**
     * Button returns app to main screen
     */
    public void backToMain(View view) {
        Intent openMain = new Intent(this, MainActivity.class);
        boolean makeAcornDone = true;
        openMain.putExtra("MAKE_ACORN_DONE", makeAcornDone);
        startActivity(openMain);
    }
}