package ru.pall2006.entities;

import ru.pall2006.Coordinates;
import ru.pall2006.MapConsoleRenderer;

public abstract class Creature extends Entity {

    private int speed;

    private int healthPoints;

    public Creature(MapConsoleRenderer mapConsoleRenderer, int speed, int healthPoints) {
        super(mapConsoleRenderer);
        this.speed = speed;
        this.healthPoints = healthPoints;
    }

    public abstract void makeMove();

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}

