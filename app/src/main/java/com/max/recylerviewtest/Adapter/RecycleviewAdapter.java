package com.max.recylerviewtest.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.max.recylerviewtest.R;


public class RecycleviewAdapter extends RecyclerView.Adapter<RecycleviewAdapter.RecycleviewViewholder> {

    String[] data;

    public RecycleviewAdapter(String[] data) {
        this.data = data;
    }

    @Override
    public RecycleviewViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.viewlist, parent, false);
        return new RecycleviewViewholder(view);
    }



    @Override
    public void onBindViewHolder(RecycleviewViewholder holder, int position) {
        String name = data[position];
        holder.textView.setText(name);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class RecycleviewViewholder extends RecyclerView.ViewHolder {
        TextView textView;

        public RecycleviewViewholder(View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.listtext);
        }
    }
}
