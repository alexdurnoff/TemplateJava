package com.example.templatejava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ScrollView scrollView = findViewById(R.id.scroll);
        TableLayout tableLayout = new TableLayout(this);
        for (int i = 0; i < 500; i++){
            TableRow tableRow = new TableRow(this);
            for (int j = 0; j <20; j++){
                EditText testText = new EditText(this);
                testText.setText("говно");
                testText.setWidth(100);
                tableRow.addView(testText);
            }
            tableLayout.addView(tableRow);
        }
        scrollView.addView(tableLayout);
    }
}
