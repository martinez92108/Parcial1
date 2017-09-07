package com.i032114.parcial1;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bnv=(BottomNavigationView) findViewById(R.id.bnv_1);
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.item_1:

                        unoFragment pant=new unoFragment();
                        //vincular pantallas
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.fl_1,pant)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();



                        Toast.makeText(MainActivity.this, "ITEM_1", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item_2:
                        dosFragment pa=new  dosFragment();
                        //vincular pantallas
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.fl_1,pa)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();
                        Toast.makeText(MainActivity.this, "ITEM_2", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item_3:
                        tresFragment pa1=new  tresFragment();
                        //vincular pantallas
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.fl_1,pa1)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();




                        Toast.makeText(MainActivity.this, "ITEM_3", Toast.LENGTH_SHORT).show();
                        break;


                }
                return false;
            }
        });
    }







    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }




}
