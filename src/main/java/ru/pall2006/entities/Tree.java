package ru.pall2006.entities;

import ru.pall2006.Coordinates;
import ru.pall2006.MapConsoleRenderer;
import ru.pall2006.entities.Entity;

public class Tree extends Entity {

    public Tree(MapConsoleRenderer mapConsoleRenderer) {
        super(mapConsoleRenderer);
    }

    public String toString() {
        return "Tr";
    }
}
