git remote add origin git@github.com:Pall2006/simulation.git
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
