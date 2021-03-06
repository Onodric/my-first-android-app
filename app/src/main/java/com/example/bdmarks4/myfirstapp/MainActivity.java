package com.example.bdmarks4.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "come.example.bdmarks4.myfirstapp.MESSAGE";
    public static final String FROM_NAME = "come.example.bdmarks4.myfirstapp.FROM_NAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        EditText fromName = (EditText) findViewById(R.id.fromName);
        String message = editText.getText().toString();
        String user_name = fromName.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(FROM_NAME, user_name);
        startActivity(intent);
    }
}
