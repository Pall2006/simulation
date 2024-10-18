package ru.pall2006.entities;

import ru.pall2006.Coordinates;
import ru.pall2006.MapConsoleRenderer;
import ru.pall2006.MapOfWorld;
import ru.pall2006.entities.Creature;

import java.util.Map;

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
