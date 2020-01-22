package com.example.simpleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FunFactActivity extends AppCompatActivity {

    private TextView factTextView;
    private Button showFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_fact);

        //Assign the views from the layout file to the corresponding views. This has to be after setContentView func.
        factTextView = findViewById(R.id.factTextView); //R class can be found in project(not android), app -> build -> generated -> source -> r (these files under build shld not be edited.
        showFactButton = findViewById(R.id.showFactButton); //Sometimes depending on the version of android studio we might need to cast the right side to (Button) or (TextView).

        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View v){

                List<String> randomFacts = new ArrayList<>();
                randomFacts.add("Ostriches can run faster than horses.");
                randomFacts.add("Olympic gold medals are mostly made from silver");
                randomFacts.add("Ostriches can run faster than horses.");
                randomFacts.add("Mammoths still walked the earth when the Great. Pyramid was being built.");



                //Updating the textView with a new fact since button was clicked.
                Random randomGenerator = new Random();
                    int randomNumber = randomGenerator.nextInt(randomFacts.size()); //Given the bound 3 is optional. But preferred.
                    String newFact = randomFacts.get(randomNumber) + " ";
                    // String newFact = "Ostriches can run faster than horses.";
                    factTextView.setText(newFact);


            }


        };

        showFactButton.setOnClickListener(listener); //By ctrl+Q on this method we found out that the parameter should be of view type. Therefore, we wrote the func above View.OnClickListener.
    }
}
