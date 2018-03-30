package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button title_button = (Button) findViewById(R.id.ask_Button);
        final ImageView imageView = (ImageView) findViewById(R.id.imageView);
        final int[] array = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        title_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random_num = new Random();
                int number = random_num.nextInt(5);
                imageView.setImageResource(array[number]);
            }
        });
    }
}
