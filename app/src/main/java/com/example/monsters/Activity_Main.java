package com.example.monsters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


public class Activity_Main extends Activity_Base {

    private MainViewController main_controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_controller= new MainViewController(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        if(main_controller.isClicked())
            main_controller.startTimer();
    }

    @Override
    protected void onStop() {
        super.onStop();
        main_controller.stopTimer();
    }
}