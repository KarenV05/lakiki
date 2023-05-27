package com.example.lakiki;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText$InspectionCompanion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.badge.BadgeUtils;

public class MainActivity extends AppCompatActivity {


    private EditText etMonth;
    private EditText etAdj1;
    private EditText etAdj2;
    private EditText etCostume;
    private EditText etNumber;
    private EditText etCelebrity;
    private EditText etLocation;
    private EditText etSubstance;
    private EditText etAdj3;
    private EditText etGoodorbad;
    private Button btnGenerate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMonth = findViewById(R.id.et_month);
        etAdj1 = findViewById(R.id.et_adjective1);
        etAdj2 = findViewById(R.id.et_adjective2);
        etCostume = findViewById(R.id.et_costume);
        etNumber = findViewById(R.id.et_number);
        etCelebrity = findViewById(R.id.et_celebrity);
        etLocation = findViewById(R.id.et_location);
        etSubstance = findViewById(R.id.et_substance);
        etAdj3 = findViewById(R.id.et_adjective3);
        etGoodorbad = findViewById(R.id.et_goodorbad);
        btnGenerate = findViewById(R.id.btn_generate);

        Intent intentDisplay = new Intent(this,DisplayActivity.class);

        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String story = "";
                story += etMonth.getText() + "30th is at its end, its time to dress up for the annual trend.\n";
                story += "I can feel the " + etAdj1.getText() + " air that signals october’s begining, hearing the never-ending" + etAdj2.getText() + " phone ringing.\n";
                story += "Dressing up as a " + etCostume.getText() + "to go trick or treating, I'll be pulling up to every house like a" + etAdj3.getText() + " meeting.\n";
                story += "Counting these racks, that's " + etNumber.getText() + "stacks.\n";
                story += "Knocking on the door, " + etCelebrity.getText() + "opens up giving me more ‘cause that's what im here for.\n";
                story += "Strutting " + etLocation.getText() + " like its a cat walk ‘cause that's what I know.\n";
                story += "Serving these looks, the competition shook; its definitely one for the books.\n";
                story += "Feasting on the treats, its true they gave me something " + etGoodorbad.getText() + "to eat.\n";
                story += "Arriving home like a bird just when dinner is served.\n";
                story += etSubstance.getText() + " filled tub, “oh you know I’m bout to grub” no crumbs.\n";
                story += "I ate, clean plate.\n";
                story += "Heading to beddy with my teddy, catching these hands if anyone ties to get me";

                intentDisplay.putExtra("story",story);

                startActivity(intentDisplay);

            }
        });
    }
}