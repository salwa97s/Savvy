package com.example.savvyapplication.pages;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import com.example.savvyapplication.R;

public class PermissionPage extends AppCompatActivity {

    private static final int RESULT_LOAD_IMAGE=1;
    Button  btnNext;
    Dialog mydia ;
    Switch cal , loc , noti ;
    ImageView dia ;
    TextView diatxt ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permission_page);


        btnNext = (Button)findViewById(R.id.btndone2);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (PermissionPage.this , MainPage.class);
                startActivity(intent);
            }
        });

        cal=(Switch)findViewById(R.id.switch1);
        loc=(Switch)findViewById(R.id.switch2);
        noti=(Switch)findViewById(R.id.switch3);



        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cal.isChecked()){
                    AlertDialog.Builder builder = new AlertDialog.Builder(PermissionPage.this);
                    //builder.setMessage("Allow SAVVY to access your calendar ?");
                    builder.setTitle("Allow SAVVY to access your calendar ? ");
                    builder.setIcon(R.drawable.calendaricon);
                    builder.setNegativeButton("Deny", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    builder.setPositiveButton("Allow", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
            }
        });

        loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(loc.isChecked()){
                    AlertDialog.Builder builder = new AlertDialog.Builder(PermissionPage.this);
                   // builder.setMessage("Allow SAVVY to access this device's locarion ?");
                    builder.setTitle("Allow SAVVY to access this device's locarion ?");
                    builder.setIcon(R.drawable.locationicon);
                    builder.setNegativeButton("Deny", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    builder.setPositiveButton("Allow", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
            }
        });

        noti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(noti.isChecked()){
                    AlertDialog.Builder builder = new AlertDialog.Builder(PermissionPage.this);
                    builder.setTitle("Allow SAVVY to send you notification ?");
                    builder.setIcon(R.drawable.noti);
                    builder.setNegativeButton("Deny", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    builder.setPositiveButton("Allow", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
            }
        });

    }

}
