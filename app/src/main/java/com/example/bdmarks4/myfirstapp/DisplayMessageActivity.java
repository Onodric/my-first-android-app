package com.example.bdmarks4.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String user_name = intent.getStringExtra(MainActivity.FROM_NAME);
        String fromText = "From ";

        // Capture the layout's TextView and set the string as its text
        TextView messageView = (TextView) findViewById(R.id.messageView);
        messageView.setText(message);
        TextView fromView = (TextView) findViewById(R.id.fromView);
        fromView.setText(fromText + user_name);
    }
}
