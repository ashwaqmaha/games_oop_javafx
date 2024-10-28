package ru.job4j.packman;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.HashSet;
import java.util.Set;

public class Pellets {
    private final int width;
    private final int height;
    private final int playerSize;
    private final int pelletSize;
    private final Set<double[]> pellets = new HashSet<>();
    public GraphicsContext gc;

    public Pellets(int width, int height, int playerSize, int pelletSize) {
        this.width = width;
        this.height = height;
        this.playerSize = playerSize;
        this.pelletSize = pelletSize;
    }

    public void initializePellets(Walls walls) {
        for (int i = 0; i < width; i += playerSize) {
            for (int j = 0; j < height; j += playerSize) {
                if (!walls.getMaze()[i / playerSize][j / playerSize]) {
                    pellets.add(new double[]{i + playerSize / 2.0 - pelletSize / 2.0, j + playerSize / 2.0 - pelletSize / 2.0});
                }
            }
        }
    }

    public void checkCollision(Pacman pacman) {
        pellets.removeIf(pellet -> pacman.playerX < pellet[0] + pelletSize && pacman.playerX + playerSize > pellet[0] &&
                pacman.playerY < pellet[1] + pelletSize && pacman.playerY + playerSize > pellet[1]);
    }

    public void draw() {
        gc.setFill(Color.WHITE);
        for (double[] pellet : pellets) {
            gc.fillOval(pellet[0], pellet[1], pelletSize, pelletSize);
        }
    }
}