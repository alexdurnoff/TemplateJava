package com.example.templatejava;

import java.util.ArrayList;

public class DataLine {
    private int number;
    private String qf;
    private String purpose;
    private String breakerName;
    private String breakerType;
    private String breakerIt;
    private String breakerInstance;
    private String testCurrent;
    private String timeTrip1;
    private String timeTrip2;
    private String timeTrip3;
    private String uzoTypeName;
    private String uzoNominalCurrent;
    private String uzoTypeOfCurrent;
    private String uzoDiffCurrent;
    private String kabel;
    private String numberOfConductors;
    private String phase;
    private String isolation;
    private String loop;
    private String[] dataValue;

    public DataLine(String[] data, int number){
        this.qf = data[0];
        this.purpose = data[1];
        this.breakerName = data[2];
        this.breakerType = data[3];
        this.breakerIt = data[4];
        this.breakerInstance = data[5];
        this.testCurrent = data[6];
        this.timeTrip1 = data[7];
        this.timeTrip2 = data[8];
        this.timeTrip3 = data[9];
        this.uzoTypeName = data[10];
        this.uzoNominalCurrent = data[11];
        this.uzoTypeOfCurrent = data[12];
        this.uzoDiffCurrent = data[13];
        this.kabel = data[14];
        this.numberOfConductors = data[15];
        this.phase = data[16];
        this.isolation = data[17];
        this.loop = data[18];
        this.dataValue = data;

    }

    public String[] getDataValue(){
        return dataValue;
    }

    public int getNumber(){
        return this.number;
    }


}
