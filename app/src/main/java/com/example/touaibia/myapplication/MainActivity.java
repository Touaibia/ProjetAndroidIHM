package com.example.touaibia.myapplication;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button ;
    private RecyclerView recyclerView;
    private NameListAdapter nameListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameListAdapter = new NameListAdapter();
        init();
    }


    public void init(){
        button = findViewById(R.id.main_activity_edit);
        recyclerView = findViewById(R.id.activity_main_recycle_view);
        button.setOnClickListener(this);
    }

    @Override
    protected void onResume(){

        super.onResume();
        nameListAdapter.updateData(DataManager.getInstance().getNameList());

    }

    private void initList(){
        
    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.main_activity_edit:
                Intent intent = new Intent(this, Main2Activity.class);
                startActivity(intent);
                break;
        }

    }
}
