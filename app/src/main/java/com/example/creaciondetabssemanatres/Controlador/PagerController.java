package com.example.creaciondetabssemanatres.Controlador;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
public class PagerController extends FragmentPagerAdapter {

    int numoftabs;

    public PagerController(@NonNull FragmentManager fm, int behavior)
    {
        super(fm, behavior);
        this.numoftabs = behavior;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new Inicios();
            case 1:
                return new Buscar();
            case 2:
                return new Bibliotecas();
            default:
                return null;
        }
    }
    @Override
    public int getCount() {

        return numoftabs;
    }
}