package tetrisgamee;

import java.awt.Color;
import java.util.Random;

public class TetrisBlock {

    private int shape[][];
    private Color color;
    private int x, y;
    private int[][][] shapes;
    private int currentRotation;

    private Color blockColor[] = {Color.BLUE, Color.GREEN, Color.RED, Color.MAGENTA, Color.ORANGE, Color.YELLOW};

    public TetrisBlock(int[][] shape) {
        this.shape = shape;

        initShape();
    }

    

    public int[][] getShape() {
        return shape;
    }

    public Color getColor() {
        return color;
    }

    public int getHeight() {
        return shape.length;
    }

    public int getWidth() {
        return shape[0].length;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void moveDown() {
        y++;
    }

    public void moveLeft() {
        x--;
    }

    public void moveRight() {
        x++;
    }

    public int getBottomEdge() {
        return y + getHeight();
    }

    public int getLeftEdge() {
        return x;
    }

    public int getRightEdge() {
        return x + getWidth();
    }

    public void spawn(int gridWidth) {
        Random random = new Random();
        currentRotation = random.nextInt(shape.length);
        shape = shapes[currentRotation];
        y = -getHeight();
        x = random.nextInt(gridWidth - getWidth());

        color = blockColor[random.nextInt(blockColor.length)];
    }
    
    public void initShape() {
        shapes = new int[4][][];
        for (int i = 0; i < 4; i++) {
            int r = shape[0].length;
            int c = shape.length;
            shapes[i] = new int[r][c];
            for (int y = 0; y < r; y++) {
                for (int x = 0; x < c; x++) {
                    shapes[i][y][x] = shape[c - x - 1][y];
                }
            }
            shape = shapes[i];
        }
    }

    public void rotate() {
        currentRotation++;
        if (currentRotation > 3) {
            currentRotation = 0;
        }
        shape = shapes[currentRotation];
    }

    // lấy hình dạng xoay của khối
    public int[][] getRotatedShape() {
        int[][] rotatedShape = new int[shape[0].length][shape.length];
        for (int i = 0; i < shape.length; i++) {
            for (int j = 0; j < shape[0].length; j++) {
                rotatedShape[j][shape.length - 1 - i] = shape[i][j];
            }
        }

        return rotatedShape;
    }
    
    
}
