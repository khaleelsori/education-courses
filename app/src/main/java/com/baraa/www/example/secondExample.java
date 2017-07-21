package com.baraa.www.example;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class secondExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_example);
    }

    public void goToNextScreen(View view) {
        Context context = secondExample.this;
        Class destinationActivity = thirdExample.class;
        Intent intent = new Intent(context, destinationActivity);
        startActivity(intent);
    }

    public void goToBeforeScreen(View view) {
        Context context = secondExample.this;
        Class destinationActivity = Example.class;
        Intent intent = new Intent(context, destinationActivity);
        startActivity(intent);
    }
}