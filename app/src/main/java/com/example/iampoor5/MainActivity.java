package com.example.iampoor5;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.*;
import android.os.*;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    TextView text;

    public void verifyRichness(Button button) {
        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                if (((String) button.getText()).equalsIgnoreCase("i am poor")) text.setText("I AM POOR");
                else if (((String) button.getText()).equalsIgnoreCase("i am rich")) text.setText("I AM RICH");
            }
        });
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button2);
        button2 = findViewById(R.id.button15);
        text = findViewById(R.id.textView3);



        verifyRichness(button1);
        verifyRichness(button2);

    }





}