package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText E;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=(Button)findViewById(R.id.Hbutton);
        E=(EditText)findViewById(R.id.PName);
        final TextView T= (TextView)findViewById(R.id.textView);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = E.getText().toString();
                T.setText("Hello , " + s);

            }
        });

    }

}