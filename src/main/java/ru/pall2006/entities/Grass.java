package ru.pall2006.entities;

import ru.pall2006.MapConsoleRenderer;

public class Grass extends Entity {
    public Grass(MapConsoleRenderer mapConsoleRenderer) {
        super(mapConsoleRenderer);
    }
    @Override
    public String toString() {
        return "..";
    }
}
