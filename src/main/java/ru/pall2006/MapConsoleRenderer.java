package ru.pall2006;

import java.util.Arrays;

public class MapConsoleRenderer {
    String[][] worldCoordinates;

    public MapConsoleRenderer() {
        this.worldCoordinates = new String[20][20];
        for (int i = 0; i < worldCoordinates.length; i++) {
            Arrays.fill(worldCoordinates[i], "..");
        }
    }
    public void render() {
        for (int i = 0; i < worldCoordinates.length; i++) {
            for (int j = 0; j < worldCoordinates[i].length; j++) {
                System.out.print(worldCoordinates[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//    public void render(MapOfWorld map) {
//        for(int rank = 8; rank>=1; rank--) {
//            String line = "";
//            for(File file : File.values()) {
//                System.out.println(file + String.valueOf(rank));
//
//            }
//        }
//    }
//}
