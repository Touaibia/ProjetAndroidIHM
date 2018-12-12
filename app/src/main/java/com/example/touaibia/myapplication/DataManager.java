package com.example.touaibia.myapplication;

import java.util.List;

public class DataManager {

    private static DataManager INSTANCE;
    private String name;
    private List<String> nameList;

    public List<String> getNameList(){
        return nameList;
    }

    public void addName(String name){
        nameList.add(name);

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private DataManager(){


    }
     public static DataManager getInstance(){
        if(INSTANCE == null){
            INSTANCE = new DataManager();
        }
        return INSTANCE;
     }
}
