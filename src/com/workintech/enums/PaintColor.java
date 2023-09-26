package com.workintech.enums;

public enum PaintColor {
    BLUE(0),
    WHITE(1),
    RED(2),
    GREEN(3);

    private int colorCode;

    PaintColor(int colorCode) {
        this.colorCode = colorCode;
    }
}
