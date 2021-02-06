package com.example.savvyapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.savvyapplication.ArrayClasses.freetime;
import com.example.savvyapplication.pages.MainPage;
import com.example.savvyapplication.pages.PermissionPage;
import com.example.savvyapplication.pages.RegisterPage;

import java.util.List;

public class RecviewadapterFreetime extends  RecyclerView.Adapter<RecviewadapterFreetime.MyViewHolderF> {

    Context mContext ;
    List<freetime> mData;
    public RecviewadapterFreetime(Context mContext, List<freetime> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolderF onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v ;
        v= LayoutInflater.from(mContext).inflate(R.layout.cardview_freetime,parent,false);
        final MyViewHolderF VHolder = new MyViewHolderF(v);
        return VHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolderF holder,final int position) {

        holder.tv_day.setText(mData.get(position).getDay());
        holder.tv_time.setText((mData.get(position).getHours()));
        holder.img_day.setImageResource(mData.get(position).getPhoto());

        holder.freetime_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (mContext , whatup.class);
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }



    public static class MyViewHolderF extends RecyclerView.ViewHolder{

        private TextView tv_day , tv_time ;
        private ImageView img_day;
        private LinearLayout freetime_contact;

        public MyViewHolderF(@NonNull View itemView) {
            super(itemView);

            freetime_contact = (LinearLayout)itemView.findViewById(R.id.freetimeCV);
            tv_day = (TextView)itemView.findViewById(R.id.txt_day);
            tv_time = (TextView)itemView.findViewById(R.id.txt_time);
            img_day = (ImageView)itemView.findViewById(R.id.Img_day);

        }
    }

}
