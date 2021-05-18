package com.rajendra.onlinedailygroceries;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MyBaseActivity extends AppCompatActivity{
    DrawerLayout drawer;
    Toolbar toolbar;
    NavigationView navView;
    ActionBarDrawerToggle toggle;
    TextView nav_shop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_base);
        drawer = findViewById(R.id.drawer);
        toolbar = findViewById(R.id.toolbar);
        navView = findViewById(R.id.navView);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("MainActivity");


//
//        nav_shop = findViewById(R.id.nav_shop);
//
//
//        nav_shop.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent back = new Intent(MyBaseActivity.this, ExampleActivity.class);
//                startActivity(back);
//                finish();
//            }
//        });


        setSupportActionBar(toolbar);
        toggle = new ActionBarDrawerToggle(this, drawer, toolbar, 0, 0);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

//        NavigationView navigationView = (NavigationView) findViewById(R.id.navView);
//        navigationView.setNavigationItemSelectedListener(this);
    }


//    @Override
//    public boolean OnNavigationItemSelected(MenuItem menuItem) {
//        int id = menuItem.getItemId();
//
//        if (id == R.id.nav_shop) {
//            startActivity(new Intent(MyBaseActivity.this, com.rajendra.onlinedailygroceries.AllCategory.class));
//        }
//
//        DrawerLayout drawer1 = (DrawerLayout) findViewById(R.id.drawer);
//        drawer1.closeDrawer(GravityCompat.START);
//        return true;
//
//
//    }
}
