package com.example.root.sendbroadcast;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send(View view)
    {
        Intent intent=new Intent();
        intent.setAction("com.example.root.sendbroadcast");//it should be unique so we are using package name here
        intent.putExtra("title","My Action");
        intent.putExtra("text","My Own Action");
        sendBroadcast(intent);
    }
}
