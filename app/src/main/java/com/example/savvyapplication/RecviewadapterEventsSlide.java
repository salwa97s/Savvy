package com.example.savvyapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.savvyapplication.ArrayClasses.event;

import java.util.List;

public class RecviewadapterEventsSlide extends RecyclerView.Adapter<RecviewadapterEventsSlide.MyViewHolderS> {

    Context mContext ;
    List<event> mData;

    public RecviewadapterEventsSlide(Context mContext, List<event> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolderS onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v ;
        v= LayoutInflater.from(mContext).inflate(R.layout.cardview_pictureslide,parent,false);
        MyViewHolderS VHolder = new MyViewHolderS(v);

        return VHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolderS holder, int position) {

        holder.pic.setImageResource(mData.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolderS extends RecyclerView.ViewHolder{

        ImageView pic ;

        public MyViewHolderS(@NonNull View itemView) {
            super(itemView);

            pic = (ImageView)itemView.findViewById(R.id.img_event);
        }
    }
}
