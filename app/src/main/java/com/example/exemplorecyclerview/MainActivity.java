package com.example.exemplorecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewHolder.rv_carros = findViewById(R.id.rv_carros);

        //adapter
        CarroListAdapter carroListAdapter = new CarroListAdapter();
        mViewHolder.rv_carros.setAdapter(carroListAdapter);

        //layout
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mViewHolder.rv_carros.setLayoutManager(linearLayoutManager);
    }

    private static class ViewHolder {
        RecyclerView rv_carros;
    }
}