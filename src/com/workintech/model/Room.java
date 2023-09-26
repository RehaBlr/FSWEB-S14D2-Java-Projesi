package com.workintech.model;

import com.workintech.enums.Direction;

import java.util.Arrays;

public class Room {
    private String name;
    private Ceiling ceiling;
    private Wall[] walls;
    private Lamp lamp;

    public Room(String name, Ceiling ceiling, Lamp lamp) {
        this.walls = new Wall[]{new Wall(Direction.NORTH),
                new Wall(Direction.EAST), new Wall(Direction.WEST),
                new Wall(Direction.SOUTH)};
        this.name = name;
        this.ceiling = ceiling;
        this.lamp = lamp;
    }

    public String getName() {
        return name;
    }

    public Wall[] getWalls() {
        return walls;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Lamp getLamp() {
        return lamp;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", ceiling=" + ceiling +
                ", walls=" + Arrays.toString(walls) +
                ", lamp=" + lamp +
                '}';
    }
}
