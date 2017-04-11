package com.project.animationsexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img,imgBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         img= (ImageView) findViewById(R.id.imageView2);
        imgBTN= (ImageView) findViewById(R.id.imageView);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setVisibility(View.INVISIBLE);
                imgBTN.setVisibility(View.VISIBLE);

            }
        });
    }

    public void zoomImage(View view){


        img.setVisibility(View.VISIBLE);
        imgBTN.setVisibility(View.INVISIBLE);

    }


}
