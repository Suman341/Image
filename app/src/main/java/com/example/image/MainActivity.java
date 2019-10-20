package com.example.image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button click;
    ImageView img1, img2, img3, img4;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click     = findViewById(R.id.btnView);
        img1   = findViewById(R.id.img1);
        img2   = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4  = findViewById(R.id.img4);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counter > 3){
                    counter = 0;
                }

                if(counter == 0)
                {
                    img1.setImageResource(R.drawable.joker);
                    img2.setImageResource(R.drawable.two);
                    img3.setImageResource(R.drawable.three);
                    img4.setImageResource(R.drawable.four);
                }

                if (counter == 1)
                {
                    img1.setImageResource(R.drawable.one);
                    img2.setImageResource(R.drawable.joker2);
                    img3.setImageResource(R.drawable.three);
                    img4.setImageResource(R.drawable.four);
                }

                if (counter == 2)
                {
                    img1.setImageResource(R.drawable.one);
                    img2.setImageResource(R.drawable.two);
                    img3.setImageResource(R.drawable.joker3);
                    img4.setImageResource(R.drawable.four);
                }

                if(counter == 3)
                {
                    img1.setImageResource(R.drawable.one);
                    img2.setImageResource(R.drawable.two);
                    img3.setImageResource(R.drawable.three);
                    img4.setImageResource(R.drawable.joker4);
                }
                counter++;
            }
        });
    }
}

