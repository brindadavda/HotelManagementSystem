package com.example.hotelmanagementsystem.Activity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.ui.AppBarConfiguration;

import com.example.hotelmanagementsystem.R;
import com.example.hotelmanagementsystem.fragment.Chief;
import com.example.hotelmanagementsystem.fragment.Home;
import com.example.hotelmanagementsystem.fragment.Manager;
import com.example.hotelmanagementsystem.fragment.User;
import com.example.hotelmanagementsystem.fragment.Waiter;
import com.example.hotelmanagementsystem.fragment.bill_counter;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);
        toolbar = findViewById(R.id.toolbar);

        //set action bar as toolbar
        setSupportActionBar(toolbar);

        //set the drawer layout to open and close
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,
                drawerLayout,
                toolbar,
                R.string.OpenDrawer,
                R.string.CloseDrawer);

        drawerLayout.addDrawerListener(toggle);

        toggle.syncState();

        //load home fragment as a default
        loadFragment(new Home());


         //set the navView by clicking on different menu item open that fragment
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                switch (id){
                    case R.id.nav_home:Toast.makeText(MainActivity.this, "Home Fragment click", Toast.LENGTH_SHORT).show();
                        loadFragment(new Home());
                        break;
                    case R.id.nav_bill:
                        Toast.makeText(MainActivity.this, "Bill Counter Fragment click", Toast.LENGTH_SHORT).show();
                        loadFragment(new bill_counter());
                        break;
                    case R.id.nav_chief:
                        Toast.makeText(MainActivity.this, "Chief Fragment click", Toast.LENGTH_SHORT).show();
                        loadFragment(new Chief());
                        break;
                    case R.id.nav_manager:
                        Toast.makeText(MainActivity.this, "Manager Fragment click", Toast.LENGTH_SHORT).show();
                        loadFragment(new Manager());
                        break;
                    case R.id.nav_user:
                        Toast.makeText(MainActivity.this, "User Fragment click", Toast.LENGTH_SHORT).show();
                        loadFragment(new User());
                        break;
                    case R.id.nav_waiter:
                        Toast.makeText(MainActivity.this, "Waiter Fragment click", Toast.LENGTH_SHORT).show();
                        loadFragment(new Waiter());
                        break;
                }

                drawerLayout.closeDrawer(GravityCompat.START);

                return true;
            }
        });

    }

    //for open the select fragment
    private void loadFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.container,fragment);
        ft.commit();
    }

    //check whether drawer is open or not when back button pressed by user
    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else
        {
            super.onBackPressed();
        }
    }



}