package ru.pall2006;

import java.util.Set;

public class StartSimulation {
    private Actions[] initActions;  // Действия перед началом симуляции
    private Actions[] turnActions;  // Действия, выполняемые каждый ход
    private MapOfWorld map;
    static int moveСounter = 0;
    private MapConsoleRenderer mapConsoleRenderer;

    public StartSimulation(MapOfWorld map, MapConsoleRenderer mapConsoleRenderer) {
        this.map = map;
        this.mapConsoleRenderer = mapConsoleRenderer;
    }

    Set<Actions> actions;
public void nextTurn() {

}
public void startSimulation() {

}
    public void pauseSimulation() {

    }
}
