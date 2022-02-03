package com.example.creaciondetabssemanatres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import com.example.creaciondetabssemanatres.Controlador.PagerController;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import android.view.Menu;
import android.widget.Toast;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    TabItem tab1, tab2, tab3;

    PagerController pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);
        tab1 = findViewById(R.id.tabInicio);
        tab2 = findViewById(R.id.tabBuscar);
        tab3 = findViewById(R.id.tabBiblioteca);

        pagerAdapter = new PagerController(getSupportFragmentManager(),
                tabLayout.getTabCount());

        viewPager.setAdapter(pagerAdapter);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                viewPager.setCurrentItem(tab.getPosition());

                if (tab.getPosition() == 0) {
                    pagerAdapter.notifyDataSetChanged();
                }
                if (tab.getPosition() == 1) {
                    pagerAdapter.notifyDataSetChanged();
                }
                if (tab.getPosition() == 2) {
                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });


        viewPager.addOnPageChangeListener(new
                TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu mimenu) {

        getMenuInflater().inflate(R.menu.menu_principal, mimenu);
        return true;
    }

        @Override public boolean onOptionsItemSelected (MenuItem opcion_menu){

            int id = opcion_menu.getItemId();

            if (id == R.id.configuracion) {
                Toast.makeText(this, "Opcion de configuracion", Toast.LENGTH_LONG).show();
                return true;
            }
            if (id == R.id.informacion) {
                Toast.makeText(this, "Opcion de Informacion", Toast.LENGTH_LONG).show();
                return true;
            }
            if (id == R.id.politicayprivacidad) {
                Toast.makeText(this, "Opcion de politica y privacidad", Toast.LENGTH_LONG).show();
                return true;
            }
            if (id == R.id.Contactanos) {
                Toast.makeText(this, "Opcion de Contactanos para mas informacion", Toast.LENGTH_LONG).show();
                return true;
            }

            if (id == R.id.version) {
                Toast.makeText(this, "Opcion de Version", Toast.LENGTH_LONG).show();
                return true;
            }
            return super.onOptionsItemSelected(opcion_menu);
        }
    }















