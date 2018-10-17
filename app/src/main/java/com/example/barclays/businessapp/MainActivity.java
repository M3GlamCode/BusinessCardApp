package com.example.barclays.businessapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        LinearLayout linearLayout = findViewById(R.id.layout);
        Bitmap originalBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.art2);
        Bitmap blurredBitmap = BlurBuilder.blur( MainActivity.this, originalBitmap );
        linearLayout.setBackground(new BitmapDrawable(getResources(), blurredBitmap));

    }//end of onCreate

}//end of public class
