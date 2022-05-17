package com.example.quicktap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameLevel extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_level);

       //ボタンの定義
        ((Button) findViewById(R.id.button3)).setOnClickListener(this);
        ((Button) findViewById(R.id.button4)).setOnClickListener(this);
        ((Button) findViewById(R.id.button5)).setOnClickListener(this);
        ((Button) findViewById(R.id.buttonHome)).setOnClickListener(this);
    }

    //OnClickメソッド実装
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.button3):
                Intent intentgame3 = new Intent(getApplication(),GameAction.class);
                startActivity(intentgame3);
                break;
            case (R.id.button4):
                break;
            case (R.id.button5):
                break;
            case (R.id.buttonHome):
                Intent intentHome = new Intent(getApplication(),MainActivity.class);
                startActivity(intentHome);
                break;
        }
    }
}