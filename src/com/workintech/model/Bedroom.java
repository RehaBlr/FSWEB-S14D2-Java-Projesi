package com.workintech.model;

public class Bedroom extends Room{
    private Bed bed;
    private Wardrobe wardrobe;
    private Carpet carpet;

    public Bedroom(String name, Lamp lamp, Ceiling ceiling, Bed bed, Wardrobe wardrobe, Carpet carpet) {
        super(name, ceiling, lamp);
        this.bed = bed;
        this.wardrobe = wardrobe;
        this.carpet = carpet;
    }

    public Bed getBed() {
        return bed;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    @Override
    public String toString() {

        return "Bedroom{" +
                ", bed=" + bed +
                ", wardrobe=" + wardrobe +
                ", carpet=" + carpet +
                ", Room=" + super.toString() +
                '}';
    }
}
