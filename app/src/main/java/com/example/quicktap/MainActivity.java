package com.example.quicktap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //プライベート変数の定義
    /*private TextView title;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*title = findViewById(R.id.title);*/

        //ボタンの定義
        ((Button)findViewById(R.id.start)).setOnClickListener(this);
        ((Button)findViewById(R.id.score)).setOnClickListener(this);
    }

    //onClickメソッド実装
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.start):
                Intent intentlevel = new Intent(getApplication(),GameLevel.class);
                startActivity(intentlevel);
                break;

            case (R.id.score):
                Intent intentscore = new Intent(getApplication(),HighScore.class);
                startActivity(intentscore);
                break;
        }

    }
}