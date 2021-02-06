package com.example.savvyapplication.pages;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.example.savvyapplication.R;
import com.example.savvyapplication.fragments.EventFragment;
import com.example.savvyapplication.fragments.FreetimeFragment;
import com.example.savvyapplication.fragments.ProfileFragment;
import com.google.android.material.navigation.NavigationView;

public class MainPage extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerlayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);


        mDrawerlayout = (DrawerLayout) findViewById(R.id.drawerP);
        mToggle = new ActionBarDrawerToggle(this,mDrawerlayout,R.string.open,R.string.close);
        mDrawerlayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //**********************************************************

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        if(savedInstanceState==null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.Vfragment, new ProfileFragment()).commit();
            navigationView.setCheckedItem(R.id.Mevents);
            getSupportFragmentManager().beginTransaction().replace(R.id.Vfragment,new EventFragment()).commit();
        }


    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch(menuItem.getItemId()){
            case R.id.Mprofile:
                getSupportFragmentManager().beginTransaction().replace(R.id.Vfragment,new ProfileFragment()).commit();
                break;
            case R.id.Mevents:
                getSupportFragmentManager().beginTransaction().replace(R.id.Vfragment,new EventFragment()).commit();
                break;
            case R.id.Mtime:
                getSupportFragmentManager().beginTransaction().replace(R.id.Vfragment,new FreetimeFragment()).commit();
                break;
        }

        mDrawerlayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
