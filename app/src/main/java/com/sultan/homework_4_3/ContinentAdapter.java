package com.sultan.homework_4_3;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sultan.homework_4_3.databinding.ItemContinentBinding;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentViewHolder> {

    private ArrayList<Continent> continentList;
    private OnItemClick onItemClick;

    public ContinentAdapter(ArrayList<Continent> continentList, OnItemClick onItemClick) {
        this.continentList = continentList;
        this.onItemClick = onItemClick;
    }


    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(ItemContinentBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.bind(continentList.get(position));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClick.onClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return continentList.size();
    }
}
class ContinentViewHolder extends RecyclerView.ViewHolder{

    private ItemContinentBinding binding;

    public ContinentViewHolder(ItemContinentBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Continent continent){
        binding.tvContinent.setText(continent.getName());
    }
}
