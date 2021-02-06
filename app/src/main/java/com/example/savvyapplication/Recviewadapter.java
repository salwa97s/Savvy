package com.example.savvyapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.savvyapplication.ArrayClasses.hobbies;
import com.example.savvyapplication.pages.Interests;

import java.util.List;

public class Recviewadapter extends RecyclerView.Adapter<Recviewadapter.MyViewHolder>{

    private Context mContext;
    private List<hobbies> mData ;

    public Recviewadapter(Context mContext, List<hobbies> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_h,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

      //holder.H_title.setText(mData.get(position).getHobby());
        holder.H_thumbnail.setImageResource(mData.get(position).getPic());
        String g = mData.get(position).getHobby();

        holder.cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext , Interests.class);
                intent.putExtra("CODE", "true");
                intent.putExtra("TYPE", mData.get(position).getHobby());
                mContext.startActivity(intent);
            }
        });


    }


    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static  class MyViewHolder extends RecyclerView.ViewHolder{

       // TextView H_title ;
        ImageView H_thumbnail ;
        CardView cardview ;



        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
          //  H_title = (TextView)itemView.findViewById(R.id.title_id);
            H_thumbnail = (ImageView)itemView.findViewById((R.id.img_id));
            cardview = (CardView)itemView.findViewById(R.id.cardv);

        }
    }
}
