package ru.pall2006.entities;

import ru.pall2006.MapConsoleRenderer;

public class Predator extends Creature{
    private int attackPower;

    public Predator(MapConsoleRenderer mapConsoleRenderer, int speed, int healthPoints, int attackPower) {
        super(mapConsoleRenderer, speed, healthPoints);
        this.attackPower = attackPower;
    }
    @Override
    public void makeMove() {
    }

//    public void attackHerbivore(Herbivore herbivores) {
//        if(this.getHealthPoints() >= herbivores.getHealthPoints()) {
//            herbivores.die(new Grass(this.getCoordinates()));
//        }
//    }

    public String toString() {
        return "Pr";
    }
}
