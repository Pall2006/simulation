package ru.pall2006;

import ru.pall2006.entities.*;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MapConsoleRenderer baseMapConsoleRenderer = new MapConsoleRenderer();
        HashMap<Coordinates, Entity> map = new HashMap<>();
        MapOfWorld mapOfWorld = new MapOfWorld(map);
        mapOfWorld.addEntities(new Rock(baseMapConsoleRenderer));
        mapOfWorld.addEntities(new Tree(baseMapConsoleRenderer));
        mapOfWorld.addEntities(new Rock(baseMapConsoleRenderer));
        mapOfWorld.addEntities(new Herbivore(baseMapConsoleRenderer, 5, 10));
        mapOfWorld.addEntities(new Predator(baseMapConsoleRenderer, 5, 10, 10));
        mapOfWorld.showEntitiesOnRender(baseMapConsoleRenderer);
        baseMapConsoleRenderer.render();
       mapOfWorld.multiply(5,baseMapConsoleRenderer, new Rock(baseMapConsoleRenderer));

//        StartSimulation startSimulation = new StartSimulation(mapOfWorld, baseMapConsoleRenderer);

    }
}
