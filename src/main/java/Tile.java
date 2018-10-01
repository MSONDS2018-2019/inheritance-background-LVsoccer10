import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.io.IOException;
import javax.imageio.ImageIO;
/**
 * TODO
 * @author jddevaughnbrown
 *
 */
public class Tile {

    /**
     * The size of the tile. For our purposes, this is known to be the size of the tile image.
     */
    public static final int WIDTH = 64, HEIGHT = 64;

    /**
     * The row, col location of the tile in our grid. For our purposes, the region is 10 by 8.
     */
    private int row, col;

    /**
     * The image of the tree.
     */
    private BufferedImage treeImage;

    /**
     * Constructs the Tile class.
     * @param x - the x location of the tile
     * @param y - the y location of the tile
     * @param filename - the filename of the file that contains the desired tile
     */
    public Tile(int i, int j, String filename) {
        try {
            treeImage = ImageIO.read(new URL("file:" + filename));
        } catch (IOException e) {
            System.out.println("Failed to load 'tree_1.png' image.");
        }

        setLocation(i, j);
    }

    /**
     * Sets the location of the tree.
     * @param xPos - the x location of the tile
     * @param yPos - the y location of the tile
     */
    public void setLocation(int xPos, int yPos) {
        this.row = xPos;
        this.col = yPos;
    }

    /**
     * Finds the row of the tile.
     * @return the row location
     */
    public int getRow() {
        return this.row;
    }

    /**
     *  Finds the column of the tile.
     * @return the column location
     */
    public int getCol() {
        return this.col;
    }

    /**
     *  Draws the tree at its location in the window.
     * @param g2 - the graphics object to draw the tree on
     */
    public void draw(Graphics2D g2) {
        g2.drawImage(treeImage, null, row * WIDTH, col * HEIGHT);
    }

}
