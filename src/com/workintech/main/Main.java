package com.workintech.main;


import com.workintech.model.*;
import com.workintech.enums.LampType;
import com.workintech.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
//        PaintColor.BLUE.name();
//        PaintColor.BLUE.ordinal();

        Lamp lamp = new Lamp(LampType.LAVA, true, 5);
        Ceiling ceiling = new Ceiling(3, PaintColor.WHITE);
        Bed bed = new Bed("Çift Kişilik", 4, 1, 2, 3);
        Wardrobe wardrobe = new Wardrobe(2, 3, 30);
        Carpet carpet = new Carpet(4, 3, PaintColor.RED);

        Bedroom bedroom = new Bedroom("Bedroom",
                lamp, ceiling, bed, wardrobe, new Carpet(4, 3, PaintColor.RED));
        bedroom.getCarpet().lying();
        bedroom.getLamp().turnOn();
        bedroom.getCeiling().create();
        //bedroom.getWalls();
        //Bedroom bedroom1 = new Bedroom()
        for (Wall wall : bedroom.getWalls()){
            wall.create();
        }

        System.out.println(bedroom);
        System.out.println(PaintColor.WHITE);

       /* System.out.println("********************");
        String name1 = "User1";
        String name2 = "User1";
        String name3 = name1;

        name3 = "User2";
        System.out.println(name1);

        if(name2 == name3){
            System.out.println("Eşit");
        } else{
            System.out.println("Eşit Değil");
        }*/

    }
}