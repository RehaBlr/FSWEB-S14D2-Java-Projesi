package com.workintech.model;

import com.workintech.enums.PaintColor;

public class Carpet {
    private int width;
    private int height;
    private PaintColor color;

    public Carpet(int width, int height, PaintColor color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void lying(){
        System.out.println("Carpet is lying on Bedroom floor.");
    }
}
