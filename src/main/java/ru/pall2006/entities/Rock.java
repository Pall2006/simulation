package ru.pall2006.entities;

import ru.pall2006.MapConsoleRenderer;

public class Rock extends Entity {
    public Rock(MapConsoleRenderer mapConsoleRenderer) {
        super(mapConsoleRenderer);
    }
    public String toString() {
        return "Rk";
    }
}
