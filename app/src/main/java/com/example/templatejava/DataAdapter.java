package com.example.templatejava;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;


import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataHolder>{
    private String[] dataStringArray;
    private ArrayList<String> dataStringList;
    public class DataHolder extends RecyclerView.ViewHolder {
        public EditText editText;

        public DataHolder(EditText editText) {
            super(editText);
            this.editText = editText;
        }
    }

    public DataAdapter(String[] data){
        this.dataStringArray = data;
        this.dataStringList = new ArrayList<>();
        for (int i = 0; i < dataStringArray.length; i++){
            dataStringList.add(i, dataStringArray[i]);
        }
    }

    public DataAdapter(ArrayList<String> dataStringList){
        this.dataStringList = dataStringList;
        this.dataStringArray = new String[dataStringList.size()];
        for (int i = 0; i < dataStringArray.length; i++){
            dataStringArray[i]= dataStringList.get(i);
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

    public String[] getDataStringArray() {
        return dataStringArray;
    }

    public void setDataStringArray(String[] dataStringArray) {
        this.dataStringArray = dataStringArray;
    }

    public ArrayList<String> getDataStringList() {
        return dataStringList;
    }

    public void setDataStringList(ArrayList<String> dataStringList) {
        this.dataStringList = dataStringList;
    }

    @Override
    public int getItemCount(){
        return dataStringArray.length;
    }

}
