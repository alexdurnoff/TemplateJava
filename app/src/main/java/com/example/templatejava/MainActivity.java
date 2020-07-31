package com.example.templatejava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ScrollView scrollView = findViewById(R.id.my_scroll);
        TableLayout tableLayout = new TableLayout(this);
        for (int i = 0; i < 1000; i++){
            TableRow tableRow = new TableRow(this);
            for (int j = 0; j <25; j++){
                TextView textView = new TextView(this);
                tableRow.addView(textView);
            }
            tableLayout.addView(tableRow);
        }
        scrollView.addView(tableLayout);
    }
}
