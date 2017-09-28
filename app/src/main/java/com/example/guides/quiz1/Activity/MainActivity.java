package com.example.guides.quiz1.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.guides.quiz1.Adapter.CustomAdapter;
import com.example.guides.quiz1.Model.Output;
import com.example.guides.quiz1.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String[] Codename;
    String[] Version;
    String[] Api;
    String[] Date;
    int[] logos;

    ListView list_Android;

    CustomAdapter adapter;

    ArrayList<Output> listAndroid;

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Codename =getResources().getStringArray(R.array.codename);
        Version =getResources().getStringArray(R.array.version);
        Api =getResources().getStringArray(R.array.api);
        Date =getResources().getStringArray(R.array.date);

        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);

        list_Android = (ListView) findViewById(R.id.LiAndroid);
        listAndroid= new ArrayList<Output>();
        logos = new int[]{R.drawable.cupcake, R.drawable.donut, R.drawable.eclair};

        for(int i = 0; i <Codename.length;i++){
            listAndroid.add(new Output(logos[i],Codename[i],Version[i],Api[i],Date[i]));

        }

        adapter = new CustomAdapter(this, listAndroid);
        list_Android.setAdapter(adapter);



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
