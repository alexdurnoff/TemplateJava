package com.example.templatejava;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;


import androidx.recyclerview.widget.RecyclerView;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataHolder>{
    private DataLine[] dataLines;
    public class DataHolder extends RecyclerView.ViewHolder {
        public EditText editText;

        public DataHolder(EditText editText) {
            super(editText);
            this.editText = editText;
        }
    }

    public DataAdapter(DataLine[] dataLines){
        this.dataLines = dataLines;
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
        for (int i = 0; i < 19; i++){
            holder.editText.setText(dataLines[position].getDataValue()[i]);
        }

    }

    @Override
    public int getItemCount(){
        return dataLines.length;
    }









}
