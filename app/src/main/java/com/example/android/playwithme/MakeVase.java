package com.example.android.playwithme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MakeVase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_vase);
    }
    /**
     * Button returns app to main screen
     */
    public void backToMain(View view) {
        Intent openMain = new Intent(this, MainActivity.class);
        boolean makeVaseDone = true;
        openMain.putExtra("MAKE_VASE_DONE", makeVaseDone);
        startActivity(openMain);
    }
}
