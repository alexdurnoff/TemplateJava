package com.example.templatejava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.icu.text.SymbolTable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DataAdapter myAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.addButton = findViewById(R.id.add_row_button);
        this.recyclerView = findViewById(R.id.spreadsheet);
        recyclerView.setHasFixedSize(true);
        layoutManager = new GridLayoutManager(this, 19);
        recyclerView.setLayoutManager(layoutManager);
    }

    public void openSheet(View view){
        DataLine[] dataLines = new DataLine[1000];
        for (int i = 0; i <dataLines.length; i++){
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
        String[] dataString = new String[dataLines.length*19];
        for (int i=0; i < dataLines.length; i++){
            for (int j = 0; j < 19; j++){
                dataString[i*19 + j] = dataLines[i].getDataValue()[j];
            }
        }
        addNewSheet(dataString);
    }

    public void addNewSheet(String[] dataString){
        this.myAdapter = new DataAdapter(dataString);
        this.recyclerView.setAdapter(this.myAdapter);
    }

    public void addRow(View view){
        int numberOfAddedRow = getCurrentRow();
        System.out.println(numberOfAddedRow);
        for (int i = numberOfAddedRow*19; i <numberOfAddedRow*19 + 19; i++){

        }

    }

    public int getCurrentRow(){
        EditText text = (EditText) layoutManager.getFocusedChild();
        for (int i = 0; i < layoutManager.getItemCount(); i++){
            EditText currentText = (EditText) layoutManager.findViewByPosition(i);
            if (currentText==text){
                return i/19;
            }
        }
        return 0;
    }

}
