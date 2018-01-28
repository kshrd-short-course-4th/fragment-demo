package com.example.rathana.fragmentdemo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showStaticFragment(View view) {
        startActivity(new Intent(this,StaticFagmentActivity.class));
    }

    public void showDynamicFragment(View view) {
        startActivity(new Intent(this,DynamicFagmentActivity.class));
    }
}
