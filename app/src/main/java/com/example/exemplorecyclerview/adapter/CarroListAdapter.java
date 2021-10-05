package com.example.exemplorecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarroListAdapter extends RecyclerView.Adapter<CarroViewHolder> {
    @NonNull
    @Override
    public CarroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View carroView = inflater.inflate(R.layout.row_carro_list, parent, false);
        return new CarroViewHolder(carroView);
    }

    @Override
    public void onBindViewHolder(@NonNull CarroViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
