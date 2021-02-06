package com.example.savvyapplication.pages;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.example.savvyapplication.R;
import com.example.savvyapplication.Recviewadapter;
import com.example.savvyapplication.ArrayClasses.hobbies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Interests extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    List<hobbies> lsthoobies ;
    private Button donebtn ;
    private TextView chooseprice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interests);

        Intent intent = getIntent();
        String code = intent.getExtras().getString("CODE");
        if(code.contains("true")){
            bla();
        }

        chooseprice = (TextView)findViewById(R.id.ChoosenPriceid);


        lsthoobies = new ArrayList<>();
        lsthoobies.add(new hobbies("SPORTS", R.drawable.sport));
        lsthoobies.add(new hobbies("MUSIC", R.drawable.music));
        lsthoobies.add(new hobbies("ART", R.drawable.art));
        lsthoobies.add(new hobbies("DANCE", R.drawable.dance));
        lsthoobies.add(new hobbies("GAMING", R.drawable.gaming));
        lsthoobies.add(new hobbies("WATCH", R.drawable.watch));
        lsthoobies.add(new hobbies("MOVIE", R.drawable.movies));
        lsthoobies.add(new hobbies("PRACTICE", R.drawable.practice));


        RecyclerView myrv = (RecyclerView)findViewById(R.id.rec_id);
        Recviewadapter myAdapter = new Recviewadapter(this , lsthoobies);

        myrv.setLayoutManager(new GridLayoutManager(this, 3)) ;
        myrv.setAdapter(myAdapter);

        donebtn = (Button)findViewById(R.id.btndone);
        donebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Interests.this , PermissionPage.class);
                startActivity(intent);
            }
        });
    }

    public void bla(){

        Intent intent = getIntent();
        String type = intent.getExtras().getString("TYPE");

       final boolean[] checked = new boolean[]{false, false, false, false, false, false};


        if(type.contains("SPORTS"))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(Interests.this);
            String[] sporttypes = new String[]{"Football", "Basketball", "Yoga", "GYM", "Cycling", "Tennis" , "Running" , "Swimming"};
            final boolean[] checkeds = new boolean[]{false, false, false, false, false, false, false, false};
            final List<String> sportslist = Arrays.asList(sporttypes);
            builder.setTitle("select sports");
            builder.setIcon(R.drawable.sport);
            builder.setMultiChoiceItems(sporttypes, checkeds, new DialogInterface.OnMultiChoiceClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                    checkeds[which] = isChecked;
                    String temp = sportslist.get(which);
                    Toast.makeText(Interests.this, temp + " is checked", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }

        if(type.contains("MUSIC"))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(Interests.this);
            String[] MusicTypes = new String[]{"Piano", "Guitar", "Violin", "Saxophone", "Percussions", "Singing"};
            final List<String> sportslist = Arrays.asList(MusicTypes);
            builder.setTitle("select music");
            builder.setIcon(R.drawable.music);
            builder.setMultiChoiceItems(MusicTypes, checked, new DialogInterface.OnMultiChoiceClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                    checked[which] = isChecked;
                    String temp = sportslist.get(which);
                    Toast.makeText(Interests.this, temp + " is checked", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }

        if(type.contains("ART"))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(Interests.this);
            String[] ArtTypes = new String[]{"Sketching", "Painting", "Books", "Museums", "Photographic", "Sculpture"};
            final List<String> sportslist = Arrays.asList(ArtTypes);
            builder.setTitle("select Art");
            builder.setIcon(R.drawable.art);
            builder.setMultiChoiceItems(ArtTypes, checked, new DialogInterface.OnMultiChoiceClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                    checked[which] = isChecked;
                    String temp = sportslist.get(which);
                    Toast.makeText(Interests.this, temp + " is checked", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }

        if(type.contains("DANCE"))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(Interests.this);
            String[] DanceTypes = new String[]{"Salsa", "Balled", "Tango", "Clubbing", "BreakDance", "Flamingo"};
            final List<String> sportslist = Arrays.asList(DanceTypes);
            builder.setTitle("select dance");
            builder.setIcon(R.drawable.dance);
            builder.setMultiChoiceItems(DanceTypes, checked, new DialogInterface.OnMultiChoiceClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                    checked[which] = isChecked;
                    String temp = sportslist.get(which);
                    Toast.makeText(Interests.this, temp + " is checked", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }

        if(type.contains("GAMING"))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(Interests.this);
            String[] GamingTypes = new String[]{"PC", "Xbox", "Bowling", "Pool", "Escape room" , "Social games"};
            final List<String> sportslist = Arrays.asList(GamingTypes);
            builder.setTitle("select game ");
            builder.setIcon(R.drawable.gaming);
            builder.setMultiChoiceItems(GamingTypes, checked, new DialogInterface.OnMultiChoiceClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                    checked[which] = isChecked;
                    String temp = sportslist.get(which);
                    Toast.makeText(Interests.this, temp + " is checked", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            builder.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }

        if(type.contains("WATCH"))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(Interests.this);
            String[] WatchSportsTypes = new String[]{"Football", "Basketball", "Tennis"};
            final boolean[] checked3 = new boolean[]{false, false, false};
            final List<String> sportslist = Arrays.asList(WatchSportsTypes);
            builder.setTitle("select game to watch");
            builder.setIcon(R.drawable.watch);
            builder.setMultiChoiceItems(WatchSportsTypes, checked3, new DialogInterface.OnMultiChoiceClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                    checked3[which] = isChecked;
                    String temp = sportslist.get(which);
                    Toast.makeText(Interests.this, temp + " is checked", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }

        if(type.contains("MOVIE"))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(Interests.this);
            String[] MoviesTypes = new String[]{"Classic", "Comedy", "Romantic", "Drama", "Superheros", "Horror"};
            final List<String> sportslist = Arrays.asList(MoviesTypes);
            builder.setTitle("select movie :");
            builder.setIcon(R.drawable.movies);
            builder.setMultiChoiceItems(MoviesTypes, checked, new DialogInterface.OnMultiChoiceClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                    checked[which] = isChecked;
                    String temp = sportslist.get(which);
                    Toast.makeText(Interests.this, temp + " is checked", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }

        if(type.contains("PRACTICE"))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(Interests.this);
            String[] PracticeTypes = new String[]{"English", "Hebrew", "Arabic", "Russian", "Spanish", "French"};
            final List<String> sportslist = Arrays.asList(PracticeTypes);
            builder.setTitle("select Language :");
            builder.setIcon(R.drawable.practice);
            builder.setMultiChoiceItems(PracticeTypes, checked, new DialogInterface.OnMultiChoiceClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                    checked[which] = isChecked;
                    String temp = sportslist.get(which);
                    Toast.makeText(Interests.this, temp + " is checked", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }

    }


    public void showpop(View view) {
        PopupMenu popup = new PopupMenu(this,view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.prices_menu);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch(item.getItemId()){
            case R.id.y1:
                chooseprice.setText("Free");
                return true;

            case R.id.y2:
                chooseprice.setText("Symbolic Price");
                return true;
            case R.id.y3:
                chooseprice.setText("Price");
                return true;
            default:
                return false;
        }
    }
}
