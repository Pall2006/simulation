package ru.pall2006;

import ru.pall2006.Coordinates;
import ru.pall2006.entities.*;

import java.util.HashMap;
import java.util.Map;

public class MapOfWorld {
    HashMap<Coordinates, Entity> entities = new HashMap<>();

    public MapOfWorld(HashMap<Coordinates, Entity> entities) {
        this.entities = entities;
    }


    public void addEntities(Entity entity) {
        entities.put(entity.getCoordinates(), entity);
    }

    public void multiply(int count, MapConsoleRenderer mapConsoleRenderer, Entity entity) {
        for (int i = 0; i < count; i++) {
            Entity newEntity = createEntityOfType(entity, mapConsoleRenderer);
            entities.put(newEntity.getCoordinates(), newEntity);
        }
    }

    private Entity createEntityOfType(Entity entity, MapConsoleRenderer mapConsoleRenderer) {
        if (entity instanceof Rock) {
            return new Rock(mapConsoleRenderer);
        } else if (entity instanceof Grass) {
            return new Grass(mapConsoleRenderer);
        } else if (entity instanceof Herbivore) {
            return new Herbivore(mapConsoleRenderer, 2, 10);
        } else  {
            return new Predator(mapConsoleRenderer, 3, 10, 10);
        }
    }


//    public void setupDefaultEntityPosition() {
//    }

    public void showEntitiesOnRender(MapConsoleRenderer mapConsoleRenderer) {
        for (Map.Entry<Coordinates, Entity> entry : entities.entrySet()) {
            Coordinates coord = entry.getKey();
            Entity entity = entry.getValue();
            mapConsoleRenderer.worldCoordinates[coord.getRow()][coord.getColumn()] = entity.toString();
        }
    }
}
