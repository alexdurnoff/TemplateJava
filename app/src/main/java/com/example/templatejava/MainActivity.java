package com.example.templatejava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private DataAdapter myAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.recyclerView = findViewById(R.id.spreadsheet);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        DataLine[] dataLines = new DataLine[50];
        for (int i = 0; i <50; i++){
            String[] source_data = new String[19];
            source_data[0] ="QF" + i;
            source_data[1] = "Линия " + (i+1);
            source_data[2] = "ABB S201";
            source_data[3] = "C";
            source_data[4] = "16";
            source_data[5] = "80-160";
            source_data[6] = "48";
            source_data[7] = "10";
            source_data[8] = "10";
            source_data[9] = "10";
            source_data[10] = "ABB F204";
            source_data[11] = "25";
            source_data[12] = "AC";
            source_data[13] = "30";
            source_data[14] = "ВВГнг-LS 5х2,5";
            source_data[15] = "5";
            source_data[16] = "";
            source_data[17] = "5000";
            source_data[18] = "0,34";
            DataLine dataLine = new DataLine(source_data, i);
            dataLines[i] = dataLine;
        }
        System.out.println("Создали массив данных");
        this.layoutManager = new LinearLayoutManager(this);
        System.out.println("Создали layoutManager");
        this.recyclerView.setLayoutManager(layoutManager);
        System.out.println("Добавили LayoutManager к RecyclerView");
        this.myAdapter = new DataAdapter(dataLines);
        System.out.println("Создали адаптер");
        this.recyclerView.setAdapter(this.myAdapter);
        System.out.println("Добавили адаптер в RecyclerView");
    }

}
