package com.example.a533.cours_11_android;

import android.graphics.Bitmap;

public class Marqueur implements PlanViewDisplayable {

    private float PositionX = 0;
    private float PositionY = 0;
    private Bitmap marqueur;

    public Marqueur(Bitmap marqueur) {
        this.marqueur = marqueur;
    }

    public void setPositionX(float postitionX) {
        PositionX = postitionX;
    }

    public void setPositionY(float postitionY) {
        PositionY = postitionY;
    }

    @Override
    public float getPositionX() {
        return PositionX;
    }

    @Override
    public float getPositionY() {
        return PositionY  - 100;
    }

    @Override
    public float getWidth() {
        return marqueur.getWidth();
    }

    @Override
    public float getHeight() {
        return marqueur.getHeight();
    }

    @Override
    public Bitmap getBitmap() {
        return marqueur;
    }
}
