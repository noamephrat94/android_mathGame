package com.example.mathgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    Button playButton = (Button)findViewById(R.id.btnstrat);
    RelativeLayout relativeLayout2 = (RelativeLayout) findViewById(R.id.gameRelativeLayout);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        Button playButton.setVisibility(View.INVISIBLE);
        relativeLayout2.setVisibility(View.VISIBLE);
    }

}