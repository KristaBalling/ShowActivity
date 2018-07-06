package com.theironyard.showactivity.showactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView showMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle extras = getIntent().getExtras();

        showMessage = (TextView) findViewById(R.id.messageTextView);

        //check
        if (extras != null) {
            String message = extras.getString("Message");
            int myInt = extras.getInt("Value");

            showMessage.setText("Message is : " + message + " and : " + String.valueOf(myInt));
        }

    }
}
