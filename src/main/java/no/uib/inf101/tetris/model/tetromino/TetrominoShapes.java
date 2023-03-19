package no.uib.inf101.tetris.model.tetromino;

/**
 * Class containing the different Tetromino shapes
 * 
 */
class TetrominoShapes {

    private static boolean[][] shape;

    /**
     * Returns the shape of a L tetromino
     * 
     * @return the shape of a L tetromino
     */
    static boolean[][] shapeL() {
        shape = new boolean[][] {
                { false, false, false, false },
                { true, true, true, false },
                { true, false, false, false },
                { false, false, false, false }
        };
        return shape;
    }

    /**
     * Returns the shape of a J tetromino
     * 
     * @return the shape of a J tetromino
     */
    static boolean[][] shapeJ() {
        shape = new boolean[][] {
                { false, false, false, false },
                { true, true, true, false },
                { false, false, true, false },
                { false, false, false, false }
        };
        return shape;
    }

    /**
     * Returns the shape of a O tetromino
     * 
     * @return the shape of a O tetromino
     */
    static boolean[][] shapeO() {
        shape = new boolean[][] {
                { false, false, false, false },
                { false, true, true, false },
                { false, true, true, false },
                { false, false, false, false }
        };
        return shape;
    }

    /**
     * Returns the shape of a S tetromino
     * 
     * @return the shape of a S tetromino
     */
    static boolean[][] shapeS() {
        shape = new boolean[][] {
                { false, false, false, false },
                { false, true, true, false },
                { true, true, false, false },
                { false, false, false, false }
        };
        return shape;
    }

    /**
     * Returns the shape of an I tetromino
     * 
     * @return the shape of an I tetromino
     */
    static boolean[][] shapeI() {
        shape = new boolean[][] {
                { false, false, false, false },
                { true, true, true, true },
                { false, false, false, false },
                { false, false, false, false }
        };
        return shape;
    }

    /**
     * Returns the shape of a Z tetromino
     * 
     * @return the shape of a Z tetromino
     */
    static boolean[][] shapeZ() {
        shape = new boolean[][] {
                { false, false, false, false },
                { true, true, false, false },
                { false, true, true, false },
                { false, false, false, false }
        };
        return shape;
    }

    /**
     * Returns the shape of a T tetromino
     * 
     * @return the shape of a T tetromino
     */
    static boolean[][] shapeT() {
        shape = new boolean[][] {
                { false, false, false, false },
                { true, true, true, false },
                { false, true, false, false },
                { false, false, false, false }
        };
        return shape;
    }
}
