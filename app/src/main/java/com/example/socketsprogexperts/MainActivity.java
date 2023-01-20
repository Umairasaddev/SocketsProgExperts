package com.example.socketsprogexperts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        e1 = findViewById(R.id.edittext);
    }
    public void send(View v)
    {

        MessageSender messageSender = new MessageSender();
        messageSender.execute(e1.getText().toString());
    }
}