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
        for (int i = 0; i < 100; i++){
            TableRow tableRow = new TableRow(this);
            for (int j = 0; j <20; j++){
                TextView testText = new TextView(this);
                testText.setText("говно");
                testText.setWidth(100);
                testText.setFocusable(true);
                tableRow.addView(testText);
            }
            tableLayout.addView(tableRow);
        }
        scrollView.addView(tableLayout);
    }

    public void onScroll(TableLayout tableLayout){
        int visible_row = tableLayout.getVisibility();
    }
}
