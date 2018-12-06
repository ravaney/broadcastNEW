package com.example.lewis.broadcast;

import android.content.Intent;
import  android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button sendBroadcast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendBroadcast = findViewById(R.id.btn);
        sendBroadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("I_AM_HOME");
                sendBroadcast(intent);
            }
        });

    }
    public void sendCustomBroadcast(View view){
        Intent intent = new Intent();
        intent.setAction("com.example.lewis.broadcast");
        sendBroadcast(intent);
        //  LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }


}
