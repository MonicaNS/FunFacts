package com.example.simpleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FunFactActivity extends AppCompatActivity {

    private TextView factTextView;
    private Button showFactButton;
    private RelativeLayout relativeLayout;

    private factBook singleFact = new factBook();
    private colorBook singleColor = new colorBook();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_fact);

        //Assign the views from the layout file to the corresponding views. This has to be after setContentView func.
        factTextView = findViewById(R.id.factTextView); //R class can be found in project(not android), app -> build -> generated -> source -> r (these files under build shld not be edited.
        showFactButton = findViewById(R.id.showFactButton); //Sometimes depending on the version of android studio we might need to cast the right side to (Button) or (TextView).
        relativeLayout = findViewById(R.id.relativeLayout); //Made this for changing the background color

        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                factTextView.setText(singleFact.getFact());
                relativeLayout.setBackgroundColor(singleColor.getColor());

            }
        };

        showFactButton.setOnClickListener(listener); //By ctrl+Q on this method we found out that the parameter should be of view type. Therefore, we wrote the func above View.OnClickListener.
    }
}
/**
 Icon of the folder is under res -> mipmap folder. And the different suffixes represent the different resolutions for different devices.
 If we dont provide all the different resolutions, the android studio scale them according to the device in use.
 Whereas if it was an image, it would be under drawable


 And for each mipmap resolution there was a  ic_launcher_round.png file given to us by android studio. You can specify both round and square icons for
 android studio folders. But for this project we only had square icons therefore, we deleted each of those folders and updated the manifest file
 as well by deleting the line below under the application tag.
 android:roundIcon="@mipmap/ic_launcher_round"

 **/