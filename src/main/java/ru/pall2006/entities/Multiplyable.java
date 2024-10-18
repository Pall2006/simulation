package ru.pall2006.entities;

import ru.pall2006.Coordinates;
import ru.pall2006.MapConsoleRenderer;
import ru.pall2006.MapOfWorld;

import java.util.Map;

public interface Multiplyable {
    void multiply(int count, MapConsoleRenderer mapConsoleRenderer, Entity entity, Map<Coordinates, Entity> map);

}
