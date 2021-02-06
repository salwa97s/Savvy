package com.example.savvyapplication.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.savvyapplication.R;
import com.example.savvyapplication.RecviewadapterFreetime;
import com.example.savvyapplication.ArrayClasses.freetime;

import java.util.ArrayList;
import java.util.List;

public class FreetimeFragment extends Fragment {

    View v ;
    private RecyclerView MyRecView ;
    private List<freetime> lstFreetime ;
    private ImageView nextmonth;
    private Button btnNext;
    private TextView now;

    public FreetimeFragment(){}


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v=inflater.inflate(R.layout.fragment_freetime,container,false);
        MyRecView=(RecyclerView)v.findViewById(R.id.freetimerec_id);
        RecviewadapterFreetime recadapter = new RecviewadapterFreetime(getContext(),lstFreetime);
        MyRecView.setLayoutManager(new LinearLayoutManager(getActivity()));
        MyRecView.setAdapter(recadapter);

        return v;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstFreetime = new ArrayList<>();
        lstFreetime.add(new freetime("TUE","10:00 - 12:00",R.drawable.eightligh,"28|Jan"));
        lstFreetime.add(new freetime("TUE","18:00 - 20:00",R.drawable.eightligh ,"28"));
        lstFreetime.add(new freetime("WED","14:00 - 16:00",R.drawable.ninedark,"29|Jan"));
        lstFreetime.add(new freetime("THU","9:00 - 10:00",R.drawable.zerolight,"30|Jan"));
        lstFreetime.add(new freetime("THU","17:00 - 19:00",R.drawable.zerolight,"30|Jan"));
        lstFreetime.add(new freetime("FRI","10:00 - 11:00",R.drawable.onedark,"31|Jan"));


    }

}
