package ru.pall2006;


import java.util.Objects;
import java.util.Random;

public class Coordinates {
    private int row;
    private int column;

    public Coordinates(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public Coordinates() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Coordinates that = (Coordinates) o;
        return row == that.row && column == that.column;
    }

    public Coordinates generateRandomCoordinates(MapConsoleRenderer mapConsoleRenderer) {
        Random random = new Random();
        int maxRows = mapConsoleRenderer.worldCoordinates.length;
        int maxColumns = mapConsoleRenderer.worldCoordinates[0].length;
        int randomRow;
        int randomColumn;

        do {
            randomRow = random.nextInt(maxRows);
            randomColumn = random.nextInt(maxColumns);
        } while (!mapConsoleRenderer.worldCoordinates[randomRow][randomColumn].equals(".."));
        return new Coordinates(randomRow, randomColumn);
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, column);
    }
}


