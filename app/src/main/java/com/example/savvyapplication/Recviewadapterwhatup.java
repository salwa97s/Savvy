package com.example.savvyapplication;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.savvyapplication.ArrayClasses.event;

import java.util.List;

public class Recviewadapterwhatup extends RecyclerView.Adapter<Recviewadapterwhatup.MyViewHolderE> {

    Context mContext ;
    List<event> mData;
    Dialog myDialog;

    public Recviewadapterwhatup(Context mContext, List<event> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolderE onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v ;
        v= LayoutInflater.from(mContext).inflate(R.layout.cardview_whatup,parent,false);
        final MyViewHolderE VHolder = new MyViewHolderE(v);

        //dialog

        /*myDialog = new Dialog(mContext);
        myDialog.setContentView(R.layout.dialog_event);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));*/

        VHolder.events_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(mContext,"ADDING TO CALENDAR",Toast.LENGTH_SHORT).show();
                //myDialog.show();
            }
        });

        return VHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolderE holder, int position) {

        holder.tv_ETitle.setText(mData.get(position).getTitle());
        holder.tv_EDate.setText((mData.get(position).getDate()));
        holder.tv_Edec.setText(mData.get(position).getDescription());
        holder.tv_Etime.setText(mData.get(position).getTime());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public static class MyViewHolderE extends RecyclerView.ViewHolder{

        private TextView tv_ETitle , tv_EDate , tv_Edec , tv_Etime ;
        private ImageView img_Event;
        private LinearLayout events_contact;


        public MyViewHolderE(@NonNull View itemView) {
            super(itemView);

            events_contact = (LinearLayout)itemView.findViewById(R.id.EventCV);
            tv_ETitle = (TextView)itemView.findViewById(R.id.txt_eventTitle);
            tv_EDate = (TextView)itemView.findViewById(R.id.txt_eventDate);
            tv_Edec = (TextView)itemView.findViewById(R.id.txt_eventDescription);
            tv_Etime = (TextView)itemView.findViewById(R.id.txt_eventTime);

        }
    }
}
