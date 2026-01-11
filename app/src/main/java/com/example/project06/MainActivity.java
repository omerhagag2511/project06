package com.example.project06;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int num = 0;
    TextView text;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);
    }

    public void go(View view) {
        num += 1;
        text.setText("This is a click number:"+ num);

        if (num <= 6) {
            text.setText("This is a click number:"+ num);
        }
        else{
            text.setText("Enough to click. Go to new start!");
            num = 0;
        }
    }
}