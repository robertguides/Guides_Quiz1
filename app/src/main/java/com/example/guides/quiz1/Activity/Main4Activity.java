package com.example.guides.quiz1.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.guides.quiz1.R;

public class Main4Activity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
    }
    public void Home(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
    public void goOne(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);

    }
    public void goTwo(View view){
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);

    }
    public void goThree(View view){
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);

    }

}
