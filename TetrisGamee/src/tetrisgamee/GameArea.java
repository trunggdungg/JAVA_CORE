package tetrisgamee;

import block.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GameArea extends JPanel {

    private int gridRows; // (số dòng), chiều cao của lưới  
    private int gridColumns;// (số cột), chiều rộng của lưới
    private int gridCellSize;// kích thước ô lưới

    private Color[][] background;

    private TetrisBlock block;
// lưu các khối
    private TetrisBlock[] blocks;

//luu next block
    private TetrisBlock nextBlock;

     private int scoreValue = 0;
    private int levelValue = 1;
    public GameArea(JPanel placeHolder, int columns) {

    //    placeHolder.setVisible(false);
        this.setBounds(placeHolder.getBounds());
        this.setBackground(placeHolder.getBackground());
        this.setBorder(placeHolder.getBorder());

        gridColumns = columns;
        gridCellSize = this.getBounds().width / gridColumns; // kích thước của 1 ô lưới = chiều rộng/ số cột
        gridRows = this.getBounds().height / gridCellSize;// tính được số ô theo chiều dọc
        //  spawnBlock();

       // background = new Color[gridRows][gridColumns];

        blocks = new TetrisBlock[]{new IShape(),
            new JShape(),
            new LShape(),
            new OShape(),
            new SShape(),
            new TShape(),
            new ZShape(),};

    }
    
    //check gameover
    public boolean checkGameOver() {
        if (block.getY() <= 0) {
            TetrisGamee.playGameOverSound();
            TetrisGamee.gameOver(scoreValue);
            return true;
        }
        return false;
    }
    //    public void resetGame() {
//        grid = new int[gridRows][gridColumns];
//        scoreValue = 0;
//        levelValue = 1;
//        spawBlock();
//    }

    public void backGroundInit(){
         background = new Color[gridRows][gridColumns];
    }
    //spwan các khối
    public void spawnBlock() {
          // Lưu trữ khối tiếp theo
    nextBlock = block;


        Random random = new Random();
        block = blocks[random.nextInt(blocks.length)];
        block.spawn(gridColumns);
    }
    //
 public void drawNextBlock(Graphics g) {
 if (nextBlock != null) {
        int x = gridColumns + 1; // Vị trí hiển thị khối tiếp theo
        
        int y = 0;

        int[][] shape = nextBlock.getShape();
        Color color = nextBlock.getColor();

        for (int row = 0; row < shape.length; row++) {
            for (int col = 0; col < shape[row].length; col++) {
                if (shape[row][col] != 0) {
                    g.setColor(color);
                    g.fillRect(x + col * gridCellSize, y + row * gridCellSize, gridCellSize, gridCellSize);
                    g.setColor(Color.BLACK);
                    g.drawRect(x + col * gridCellSize, y + row * gridCellSize, gridCellSize, gridCellSize);
                }
            }
        }
    }
}

    public boolean isBlockOutOfBounds() {
        if (block.getY() < 0) {
            block = null;
            return true;
        }
        return false;
    }
    
    //
 


    // Di chuyển khối sang trái
    public void moveBlockLeft() {
        if (block == null) {
            return;
        }
        if (checkLeft()) {
            TetrisGamee.playMoveSound();
            block.moveLeft();
            repaint();
        }

    }

    // Di chuyển khối sang phải
    public void moveBlockRight() {
        if (block == null) {
            return;
        }
        if (checkRight() == false) {
            return;
        }
          TetrisGamee.playMoveSound();
        block.moveRight();
        repaint();

    }

    public void dropBlock() {

        while (checkBottom()) {
              TetrisGamee.playMoveSound();
            block.moveDown();
        }
        repaint();
    }

    //di chuyển khối xuống
    public boolean moveBlockDown() {
        if (checkBottom() == false) {
            //  blockOnBackground();
            // checkLine();
         
            return true;
        }
     
        block.moveDown();
        repaint();
        return false;
    }
    
// xoay khối
   public void rotateBlock() {
    if (block == null || !canRotate()) {
        return;
    }
  TetrisGamee.playMoveSound();
    block.rotate();
    if (block.getLeftEdge() < 0) {
        block.setX(0);
    }

    if (block.getRightEdge() >= gridColumns) {
        block.setX(gridColumns - block.getWidth());
    }

    if (block.getBottomEdge() >= gridRows) {
        block.setY(gridRows - block.getHeight());
    }

    repaint();
}
   
   //kiêm tra xem khi xoay có vướngko
private boolean isBlocked(int[][] rotatedShape) {
    int x = block.getX();
    int y = block.getY();

    // kiểm tra từng ô của hình khối đã xoay
    for (int row = 0; row < rotatedShape.length; row++) {
        for (int col = 0; col < rotatedShape[0].length; col++) {
            if (rotatedShape[row][col] != 0) {
                int gridX = x + col;
                int gridY = y + row;

                // kiểm tra xem ô này có bị chặn hay không
                if (gridX < 0 || gridX >= gridColumns || gridY < 0 || gridY >= gridRows || background[gridY][gridX] != null) {
                    return true;
                }
            }
        }
    }

    return false;
}

    // 
 public boolean canRotate() {
    // Tạo một bản sao của hình khối đã xoay
    int[][] rotatedShape = block.getRotatedShape();

    // kiểm tra xem hình khối đã xoay có bị khuất không
    if (isBlocked(rotatedShape)) {
        return false;
    }

    // kiểm tra xem hình khối đã xoay có giao động với các khối đã cho không
    for (int row = 0; row < rotatedShape.length; row++) {
        for (int col = 0; col < rotatedShape[0].length; col++) {
            if (rotatedShape[row][col] != 0) {
                int gridX = block.getX() + col;
                int gridY = block.getY() + row;

                // kiểm tra xem ô này có nằm trong phạm vi của lưới không
                if (gridX >= 0 && gridX < gridColumns && gridY >= 0 && gridY < gridRows) {
                    // kiểm tra xem ô này đã được vẽ khối chưa
                    if (background[gridY][gridX] != null) {
                        return false;
                    }
                }
            }
        }
    }

    return true;
}


    

    //check điểm cuối
    public boolean checkBottom() {
        if (block.getY() + block.getHeight() == gridRows) {
            return false;
        }

        int[][] shape = block.getShape();
        int w = block.getWidth();
        int h = block.getHeight();

        for (int col = 0; col < w; col++) {
            for (int row = h - 1; row >= 0; row--) {
                if (shape[row][col] != 0) {
                    int x = col + block.getX();
                    int y = row + block.getY() + 1;
                    if (y < 0) {
                        break;
                    }
                    if (background[y][x] != null) {
                        return false;
                    }

                    break;
                }
            }

        }
        return true;

    }

    //check phải
    public boolean checkRight() {

        if (block.getX() + block.getWidth() == gridColumns) {
            return false;
        }

        int[][] shape = block.getShape();
        int w = block.getWidth();
        int h = block.getHeight();

        for (int row = 0; row < h; row++) {
            for (int col = w - 1; col >= 0; col--) {
                if (shape[row][col] != 0) {
                    int x = col + block.getX() + 1;
                    int y = row + block.getY();
                    if (y < 0) {
                        break;
                    }
                    if (background[y][x] != null) {
                        return false;
                    }

                    break;
                }
            }

        }
        return true;
    }

    //check trái
    public boolean checkLeft() {
        int minX = 0;
        if (block.getX() <= minX) {
            return false;
        }

        int[][] shape = block.getShape();
        int w = block.getWidth();
        int h = block.getHeight();

        for (int row = 0; row < h; row++) {
            for (int col = 0; col < w; col++) {
                if (shape[row][col] != 0) {
                    int x = col + block.getX() - 1;
                    int y = row + block.getY();
                    if (y < 0) {
                        break;
                    }
                    if (background[y][x] != null) {
                        return false;
                    }

                    break;
                }
            }

        }
        return true;
    }

//    public boolean checkRight() {
//
//        if (block.getRightEdge() == gridColumns) {
//            return false;
//        }
//        return true;
//    }
//    //check trái
//
//    public boolean checkLeft() {
//        
//        if (block.getLeftEdge()==0 {
//            return false;
//        }
//        return true;
//    }
    
    // vẽ giữ lại các khối đã vẽ
    public void drawGrid(Graphics g) {
        Color color;
        for (int r = 0; r < gridRows; r++) {
            for (int c = 0; c < gridColumns; c++) {
                color = background[r][c];
                if (color != null) {
                    int x = c * gridCellSize;
                    int y = r * gridCellSize;
                    g.setColor(color);
                    g.fillRect(x, y, gridCellSize, gridCellSize);
                    g.setColor(Color.black);
                    g.drawRect(x, y, gridCellSize, gridCellSize);
                }

            }

        }
    }

    // kiểm tra hàng đầy chưa
    public int checkLine() {
        boolean lineFilled;
        int rowDeleted = 0;
        for (int r = gridRows - 1; r >= 0; r--) {
            lineFilled = true;
            for (int c = 0; c < gridColumns; c++) {
                if (background[r][c] == null) {
                    lineFilled = false;
                    break;
                }
            }
            if (lineFilled) {
                rowDeleted++;
                deleteLine(r);
                shiftDown(r);
                deleteLine(0);

                r++;
                
                repaint();
            }
        }
         if (rowDeleted > 0) {
            TetrisGamee.playDeleteSound();
        }
        return rowDeleted ;
    }
// xóa hàng đầy

    public void deleteLine(int r) {
        for (int i = 0; i < gridColumns; i++) {
            
            background[r][i] = null;
        }
    }
// đẩy hàng bị xóa xuống

    public void shiftDown(int r) {
        for (int row = r; row > 0; row--) {
            for (int col = 0; col < gridColumns; col++) {
                background[row][col] = background[row - 1][col];
            }
        }
    }

    //lưu trạng thái hiện tại của khối
    public void blockOnBackground() {
        int shape[][] = block.getShape();
        int h = block.getHeight();
        int w = block.getWidth();

        int xPos = block.getX();
        int yPos = block.getY();

        Color color = block.getColor();

        for (int r = 0; r < h; r++) {
            for (int c = 0; c < w; c++) {
                if (shape[r][c] == 1) {
                    background[r + yPos][c + xPos] = color;
                }
            }

        }
    }
    //vẽ các khối

    private void drawBlock(Graphics g) {

        int h = block.getHeight();
        int w = block.getWidth();
        Color c = block.getColor();
        int shape[][] = block.getShape();
        for (int row = 0; row < h; row++) { //  vòng này vẽ ô lưới theo chiều dọc
            for (int col = 0; col < w; col++) {
                if (shape[row][col] == 1) {
                    int x = (block.getX() + col) * gridCellSize;
                    int y = (block.getY() + row) * gridCellSize;
                    g.setColor(c);
                    g.fillRect(x, y, gridCellSize, gridCellSize);
                    g.setColor(Color.black);
                    g.drawRect(x, y, gridCellSize, gridCellSize);
                }

            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int y = 0; y < gridRows; y++) { //  vòng này vẽ ô lưới theo chiều dọc
            for (int x = 0; x < gridColumns; x++) {

                g.drawRect(x * gridCellSize, y * gridCellSize, gridCellSize, gridCellSize);
            }
        }

        drawGrid(g);
        drawBlock(g);
       // drawNextBlock(g); 

    }

}
