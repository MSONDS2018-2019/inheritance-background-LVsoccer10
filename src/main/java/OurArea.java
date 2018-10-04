/**
 * Provides the base model implementation for the Area class.
 * Represents a Window constructed out of 64 x 64 tiles.
 * @author jddevaughnbrown
 *
 */
@SuppressWarnings("serial")
public class OurArea extends Area {

    /*
     * Variables from the parent class we have access to

  // The trees that are scattered around the area.
  Tree[] trees;

  // The area tile map, with each tile represented as an integer.
  int[][] tiles;

  // The tile values for grass (0) and stone (1) tiles.
  int GRASS;
  int STONE;

  // The number of tiles on the x-axis, and y-axis.
  int NUM_TILES_X;
  int NUM_TILES_Y;

  // The maximum position of a tree on the x-axis and y-axis.
  // Note: The minimum is simply (0, 0).
  double MAX_TREE_X;
  double MAX_TREE_Y;
     */

    /**
     * Constructs the OurArea.
     * @param numberOfTrees - the number of trees to place in the area
     */
    public OurArea(int numberOfTrees) {
        super(); // A magic function. I wonder what it does?
        //* Exercise #1. Setup the tree objects at random locations.
        trees = new Tree[numberOfTrees];
        for (int i = 0; i < numberOfTrees; i++) {
            trees[i] = new Tree((int) (Math.random() * MAX_TREE_X),
                    (int) (Math.random() * MAX_TREE_Y),
                    "images/tree_1.png");
        }
        //*/

        //* Exercise #3. Initialize the tiles.
        tiles = new Tile[NUM_TILES_X][NUM_TILES_Y];
        for (int i = 0; i < NUM_TILES_X; i++) {
            for (int j = 0; j < NUM_TILES_Y; j++) {
                // Example: Default to grass everywhere.
                tiles[i][j] = new Grass(i, j);

            }
        }

        // Example: Draw two stones at specific locations.
        tiles[0][0] = new Stone(0, 0);
        tiles[2][3] = new Stone(2, 3);
        tiles[2][7] = new Fire(2, 7);
        tiles[8][2] = new Fire(8, 2);
        tiles[9][2] = new Fire(9, 2);
        tiles[9][1] = new Fire(9, 1);
        tiles[9][3] = new Fire(9, 3);
        tiles[4][1] = new Fire(4,1);
        tiles[6][0] = new Water(6, 0);
        tiles[6][1] = new Water(6, 1);
        tiles[5][2] = new Water(5, 2);
        tiles[5][3] = new Water(5, 3);
        tiles[5][4] = new Water(5, 4);
        tiles[5][5] = new Water(5, 5);
        tiles[5][6] = new Water(5, 6);
        tiles[5][7] = new Water(5, 7);
        tiles[4][8] = new Water(4, 8);
        tiles[4][9] = new Water(4, 9);
        tiles[4][7] = new Water(4, 7);
        tiles[6][2] = new Water(6, 2);
        tiles[1][1] = new RedSoldier(1, 1);
        tiles[1][2] = new RedSoldier(1, 2);
        tiles[1][3] = new RedSoldier(1, 3);
        tiles[1][1] = new RedSoldier(1, 4);
        tiles[1][5] = new RedSoldier(1, 5);
        tiles[2][1] = new RedSoldier(2, 1);
        tiles[2][2] = new RedSoldier(2, 2);
        tiles[2][2] = new RedSoldier(2, 2);
        tiles[2][4] = new RedSoldier(2, 4);
        tiles[2][5] = new RedSoldier(2, 5);
        tiles[2][6] = new RedSoldier(2, 6);
        tiles[3][1] = new RedSoldier(3, 1);
        tiles[3][2] = new RedSoldier(3, 2);
        tiles[3][3] = new RedSoldier(3, 3);
        tiles[3][4] = new RedSoldier(3, 4);
        tiles[3][5] = new RedSoldier(3, 5);
        tiles[3][6] = new RedSoldier(3, 6);
        tiles[6][2] = new GreenSoldier(6, 2);
        tiles[6][3] = new GreenSoldier(6, 3);
        tiles[6][4] = new GreenSoldier(6, 4);
        tiles[6][5] = new GreenSoldier(6, 5);
        tiles[6][6] = new GreenSoldier(6, 6);
        tiles[6][7] = new GreenSoldier(6, 7);
        tiles[6][8] = new GreenSoldier(6, 8);
        tiles[7][2] = new GreenSoldier(7, 2);
        tiles[7][3] = new GreenSoldier(7, 3);
        tiles[7][4] = new GreenSoldier(7, 4);
        tiles[7][5] = new GreenSoldier(7, 5);
        tiles[7][6] = new GreenSoldier(7, 6);
        tiles[8][3] = new GreenSoldier(8, 3);
        tiles[8][4] = new GreenSoldier(8, 4);
        tiles[8][5] = new GreenSoldier(8, 5);
        tiles[8][6] = new GreenSoldier(8, 6);
        tiles[8][7] = new GreenSoldier(8, 7);
        tiles[8][8] = new GreenSoldier(8, 8);
        tiles[9][4] = new GreenSoldier(9, 4);
        tiles[9][5] = new GreenSoldier(9, 5);
        tiles[9][6] = new GreenSoldier(9, 6);
        //*/
    }

    @Override
    protected void drawTrees() {
        //* Exercise #2. Draw the trees.
        for (int i = 0; i < trees.length; i++) {
            drawTree(i);
        }
        //*/
    }

    @Override
    protected void drawTiles() {
        //* Exercise #4. Draw the tiles.
        for (int i = 0; i < NUM_TILES_X; i++) {
            for (int j = 0; j < NUM_TILES_Y; j++) {
                drawTile(i, j);
            }
        }
    }
}
