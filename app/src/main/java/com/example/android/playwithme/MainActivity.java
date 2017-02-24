package com.example.android.playwithme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Boolean makeAcornDone;
    Boolean makeVaseDone;
    Boolean makeDrumDone;
    Boolean makeLegoDone;
    Boolean makeMinecraftDone;
    String activityDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**checks to see if a value has been passed
         * from the Done button on the individual activity page and assigns string of the activity name if true is passed.
         */
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            makeAcornDone = false;
            makeVaseDone = false;
            makeMinecraftDone = false;
            makeLegoDone = false;
            makeDrumDone = false;
        } else {
            makeAcornDone = extras.getBoolean("MAKE_ACORN_DONE");
            makeVaseDone = extras.getBoolean("MAKE_VASE_DONE");
            makeDrumDone = extras.getBoolean("MAKE_DRUM_DONE");
            makeLegoDone = extras.getBoolean("MAKE_LEGO_DONE");
            makeMinecraftDone = extras.getBoolean("MAKE_MINECRAFT_DONE");
        }
        if (makeAcornDone) {
            activityDone = "an acorn whistle";
            displayActivitiesDone(activityDone);
        }
        if (makeVaseDone) {
            activityDone = "a vase and flowers";
            displayActivitiesDone(activityDone);
        }
        if (makeDrumDone) {
            activityDone = "a steel drum";
            displayActivitiesDone(activityDone);
        }
        if (makeLegoDone) {
            activityDone = "a Lego mini-house";
            displayActivitiesDone(activityDone);
        }
        if (makeMinecraftDone) {
            activityDone = "a Minecraft pig megalith";
            displayActivitiesDone(activityDone);
        }
    }
    /**
     * displays a toast message of congratulations if done value is passed from Activity page.
     *
     * @param toastDone passes the activity that was done to display in the toast.
     */
    public void displayActivitiesDone(String toastDone) {
        String textToToast = "You created " + toastDone + "! Way to go!";
        Toast.makeText(MainActivity.this, textToToast, Toast.LENGTH_SHORT).show();
        return;
    }
    /**
     * method opens flowers Activity for flower-making instructions
     */
    public void openVaseActivity(View view) {
        Intent openVase = new Intent(this, MakeVase.class);
        startActivity(openVase);
    }
    /**
     * method opens Lego Activity for house-making instructions
     */
    public void openLegoActivity(View view) {
        Intent openLego = new Intent(this, MakeLego.class);
        startActivity(openLego);
    }
    /**
     * method opens minecraft Activity for pig-making instructions
     */
    public void openMinecraftActivity(View view) {
        Intent openMinecraft = new Intent(this, MakeMinecraft.class);
        startActivity(openMinecraft);
    }
    /**
     * method opens acorn whistle Activity for acorn whistle-making instructions
     */
    public void openAcornActivity(View view) {
        Intent openAcorn = new Intent(this, MakeAcorn.class);
        startActivity(openAcorn);
    }
    /**
     * method opens steel drum Activity for steel drum-making instructions
     */
    public void openDrumActivity(View view) {
        Intent openDrum = new Intent(this, MakeDrum.class);
        startActivity(openDrum);
    }
}