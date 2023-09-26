package com.workintech.model;

//POJO(Plain Old Java Object)
public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilts;

    public Bed(String style, int pillows, int height, int sheets, int quilts) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilts = quilts;
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilts() {
        return quilts;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n*****************\n");
        builder.append("BED\n");
        builder.append("Style: " + style + "\n");
        builder.append("Height: " + height + "\n");
        builder.append("Pillows: " + pillows + "\n");
        builder.append("Sheets: " + sheets + "\n");
        builder.append("Quilts: " + quilts + "\n");
        return builder.toString();
    }
}
