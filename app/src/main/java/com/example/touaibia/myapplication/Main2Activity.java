package com.example.touaibia.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    Button button ;
    EditText edittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
    }

    public void init(){
        button= findViewById(R.id.main_activity_retour);
        edittext =findViewById(R.id.main2_activity_text);
        button.setOnClickListener(this);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.main_activity_retour:
                saveData();
                break;
        }

    }

  private void saveData(){
        String name = edittext.getText().toString();
        if(!name.isEmpty()){
            DataManager.getInstance().setName(name);
        }

        finish();
  }



}
