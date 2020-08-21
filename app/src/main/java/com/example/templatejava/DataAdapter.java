package com.example.templatejava;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;


import androidx.recyclerview.widget.RecyclerView;



public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataHolder>{
    private String[] dataStringArray;
    public class DataHolder extends RecyclerView.ViewHolder {
        public EditText editText;

        public DataHolder(EditText editText) {
            super(editText);
            this.editText = editText;
        }
    }

    public DataAdapter(String[] data){
        this.dataStringArray = data;
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
        return dataStringArray.length;
    }

}
