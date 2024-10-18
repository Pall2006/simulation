package ru.pall2006.entities;

import ru.pall2006.Coordinates;
import ru.pall2006.MapConsoleRenderer;


public abstract class Entity {
    protected Coordinates coordinates;

    public Entity(MapConsoleRenderer mapConsoleRenderer) {
        this.coordinates = new Coordinates().generateRandomCoordinates(mapConsoleRenderer);
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
}

