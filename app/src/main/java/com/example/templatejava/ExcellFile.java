package com.example.templatejava;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import jxl.Workbook;
import jxl.write.WritableSheet;

public class ExcellFile {
    private jxl.write.WritableWorkbook writableWorkbook;
    private WritableSheet sheet;
    private ArrayList<jxl.Cell[]> rowArrayList;
    private String[] data;
    private File file;

    public ExcellFile(File file) throws IOException {
        this.file= file;
        this.writableWorkbook = Workbook.createWorkbook(file);
        this.sheet = writableWorkbook.getSheet("Черновик");
        this.rowArrayList = new ArrayList<>();
        int i = 0;
        jxl.Cell[] row = sheet.getRow(i);
        String B = row[1].getContents();
        while (!(B.equals(""))){
            rowArrayList.set(i, row);
            i++;
            row = sheet.getRow(i);
            B = row[1].getContents();
        }
        this.data = new String[rowArrayList.size()*19];
        for (i=0; i < rowArrayList.size(); i++){
            row = rowArrayList.get(i);
            for (int j = 0; j <19; j++) data[i * 19 + j] = row[j].getContents();
        }



    }
    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }

}
