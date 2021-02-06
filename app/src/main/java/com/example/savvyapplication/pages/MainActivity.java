package com.example.savvyapplication.pages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.EventLog;
import android.view.View;
import android.widget.Button;

import com.example.savvyapplication.R;
import com.example.savvyapplication.fragments.EventFragment;

public class MainActivity extends AppCompatActivity {

    Button btn_login ;
    Button btn_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_login = (Button)findViewById(R.id.btnsend);
        btn_register = (Button)findViewById(R.id.btnregister);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();
            }
        });


        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this , RegisterPage.class);
                startActivity(intent);
            }
        });

    }

    public void next(){
        Intent intent = new Intent (MainActivity.this , Interests.class);
        intent.putExtra("CODE" , "flase");
        startActivity(intent);
    }
}
