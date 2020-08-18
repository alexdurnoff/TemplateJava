package com.example.templatejava;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;


import androidx.recyclerview.widget.RecyclerView;



public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataHolder>{
    private DataLine[] dataLines;
    private String[] dataStringArray;
    public class DataHolder extends RecyclerView.ViewHolder {
        public EditText editText;

        public DataHolder(EditText editText) {
            super(editText);рректно
            this.editText = editText;
        }
    }

    public DataAdapter(DataLine[] dataLines){
        this.dataLines = dataLines;
        this.dataStringArray = new String[dataLines.length*19];
        for (int i = 0; i < dataLines.length; i ++){
            String[] currentStringArray = dataLines[i].getDataValue();
            for (int j = 0; j < currentStringArray.length; j++){
                dataStringArray[i*19 + j] = currentStringArray[j];
                System.out.println(dataStringArray[i*19 + j]);
            }
        }
    }

    @Override
    public DataAdapter.DataHolder onCreateViewHolder(ViewGroup parent, int viewType){
        EditText text = (EditText) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.myeditlayout, parent, false);
        DataHolder my_holder = new DataHolder(text);
        return my_holder;
    }

    @Override
    public void onBindViewHolder(DataHolder holder, int position){
            holder.editText.setText(dataStringArray[position]);
    }

    @Override
    public int getItemCount(){
        return dataLines.length;
    }









}
