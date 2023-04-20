package com.example.database_exer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecViewAdapter extends RecyclerView.Adapter<RecViewAdapter.ViewHolder> {


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.person_list, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {



    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView inputName, inputAge, btnDelete;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            inputName = itemView.findViewById(R.id.inputName);
            inputAge = itemView.findViewById(R.id.inputAge);
            btnDelete = itemView.findViewById(R.id.btnDelete);

        }
    }


    public RecViewAdapter() {
    }
}

