package com.example.yusadolat.lifecycleexample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Toast.makeText(this, "In onCreate", Toast.LENGTH_SHORT).show();
        Log.i("info", "In Oncreate");
    }


    @Override
    public void onStart() {
        //First unofficial call for onStart Method
        super.onStart();
        Toast.makeText(this, "in OnStart", Toast.LENGTH_SHORT).show();
        Log.i("info", "In Onstart method");
    }


    @Override
    public void onResume() {
        //First official call for onResume method

        super.onResume();
        Toast.makeText(this, "In OnResume", Toast.LENGTH_SHORT).show();
        Log.i("info", "In onResume method");
    }

    @Override
    public void onPause() {
        //Onpause call
        super.onPause();
        Toast.makeText(this, "onPause call", Toast.LENGTH_SHORT).show();
        Log.i("info", "In Onstop");

    }

    @Override
    public void onStop() {
        //Calling the onStop method
        super.onStop();
        Toast.makeText(this, "In onStop", Toast.LENGTH_SHORT).show();
        Log.i("info", "onStop Call");
    }



    @Override
    public void onDestroy() {
        //onDestroy call
        super.onDestroy();
        Toast.makeText(this, "On Destroy Call", Toast.LENGTH_SHORT).show();
        Log.i("info", "In onDestroy");
    }
}
