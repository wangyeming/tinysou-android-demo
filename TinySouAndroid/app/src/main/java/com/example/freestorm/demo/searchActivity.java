package com.example.freestorm.demo;

import android.os.Bundle;

import com.freestorm.mymodule.tinysouAndroid.mymodule.app2.TinySouSearchActivity;


public class searchActivity extends TinySouSearchActivity {

    private Data app;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        app = (Data)getApplication();
        this.isAutoCom = app.getAC();
    }
}