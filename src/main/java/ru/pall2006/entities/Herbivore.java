package ru.pall2006.entities;


import ru.pall2006.MapConsoleRenderer;

public class Herbivore extends Creature {
    public Herbivore(MapConsoleRenderer mapConsoleRenderer, int speed, int healthPoints) {
        super(mapConsoleRenderer, speed, healthPoints);
    }
    @Override
    public void makeMove() {
     // реализация
    }
    public void die(Grass grass) {
        grass.setCoordinates(this.getCoordinates());

    }
    public String toString() {
        return "Hb";
    }
}
