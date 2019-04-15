package com.example.a533.cours_11_android;

import android.graphics.Bitmap;

public class Plan implements PlanViewDisplayable {

    private float PositionX = 0;
    private float PositionY = 0;
    private Bitmap plan;

    public Plan(Bitmap plan) {
        this.plan = plan;
    }

    @Override
    public float getPositionX() {
        return PositionX;
    }

    @Override
    public float getPositionY() {
        return PositionY;
    }

    @Override
    public float getWidth() {
        return plan.getWidth();
    }

    @Override
    public float getHeight() {
        return plan.getHeight();
    }

    @Override
    public Bitmap getBitmap() {
        return plan;
    }
}
