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
import com.example.savvyapplication.ArrayClasses.freetime;

import org.w3c.dom.Text;

import java.util.List;

public class RecviewadapterEvents extends RecyclerView.Adapter<RecviewadapterEvents.MyViewHolderE> {

    Context mContext ;
    List<event> mData;
    Dialog myDialog;

    public RecviewadapterEvents(Context mContext, List<event> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolderE onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v ;
        v= LayoutInflater.from(mContext).inflate(R.layout.cardview_events,parent,false);
        final MyViewHolderE VHolder = new MyViewHolderE(v);

        //dialog

        myDialog = new Dialog(mContext);
        myDialog.setContentView(R.layout.dialog_event);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        VHolder.events_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView dialogtitle = (TextView)myDialog.findViewById(R.id.dialog_title);
                TextView dialogDate = (TextView)myDialog.findViewById(R.id.dialog_date);
                TextView dialogLocatio = (TextView)myDialog.findViewById(R.id.dialog_location);
                TextView dialogdesc = (TextView)myDialog.findViewById(R.id.dialog_desc);
                TextView dialogprice = (TextView)myDialog.findViewById(R.id.dialog_price);
                TextView dialogtime = (TextView)myDialog.findViewById(R.id.dialog_time);
                dialogtime.setText(mData.get(VHolder.getAdapterPosition()).getTime());
                dialogtitle.setText(mData.get(VHolder.getAdapterPosition()).getTitle());
                dialogDate.setText(mData.get(VHolder.getAdapterPosition()).getDateTotal());
                dialogLocatio.setText(mData.get(VHolder.getAdapterPosition()).getLocation());
                dialogprice.setText(mData.get(VHolder.getAdapterPosition()).getPrice());
                dialogdesc.setText(mData.get(VHolder.getAdapterPosition()).getDescriptionlong());

                Toast.makeText(mContext,"info",Toast.LENGTH_SHORT).show();
                myDialog.show();
            }
        });

        return VHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolderE holder, int position) {

        holder.tv_ETitle.setText(mData.get(position).getTitle());
        holder.tv_EDate.setText((mData.get(position).getDate()));
        holder.tv_Edec.setText(mData.get(position).getDescription());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public static class MyViewHolderE extends RecyclerView.ViewHolder{

        private TextView tv_ETitle , tv_EDate , tv_Edec , tv_ELocation ;
        private ImageView img_Event;
        private LinearLayout events_contact;


        public MyViewHolderE(@NonNull View itemView) {
            super(itemView);

            events_contact = (LinearLayout)itemView.findViewById(R.id.EventCV);
            tv_ETitle = (TextView)itemView.findViewById(R.id.txt_eventTitle);
            tv_EDate = (TextView)itemView.findViewById(R.id.txt_eventDate);
            tv_Edec = (TextView)itemView.findViewById(R.id.txt_eventDescription);

        }
    }
}
