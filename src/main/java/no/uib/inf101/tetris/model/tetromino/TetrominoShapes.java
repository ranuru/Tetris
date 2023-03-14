package no.uib.inf101.tetris.model.tetromino;

/**
 * Class containing the different Tetromino shapes
 * 
 */
class TetrominoShapes {

    static boolean[][] shape;

    static boolean[][] shapeL() {
        shape = new boolean[][] {
                { false, false, false, false },
                { true, true, true, false },
                { true, false, false, false },
                { false, false, false, false }
        };
        return shape;
    }

    static boolean[][] shapeJ() {
        shape = new boolean[][] {
                { false, false, false, false },
                { true, true, true, false },
                { false, false, true, false },
                { false, false, false, false }
        };
        return shape;
    }

    static boolean[][] shapeO() {
        shape = new boolean[][] {
                { false, false, false, false },
                { false, true, true, false },
                { false, true, true, false },
                { false, false, false, false }
        };
        return shape;
    }

    static boolean[][] shapeS() {
        shape = new boolean[][] {
                { false, false, false, false },
                { false, true, true, false },
                { true, true, false, false },
                { false, false, false, false }
        };
        return shape;
    }

    static boolean[][] shapeI() {
        shape = new boolean[][] {
                { false, false, false, false },
                { true, true, true, true },
                { false, false, false, false },
                { false, false, false, false }
        };
        return shape;
    }

    static boolean[][] shapeZ() {
        shape = new boolean[][] {
                { false, false, false, false },
                { true, true, false, false },
                { false, true, true, false },
                { false, false, false, false }
        };
        return shape;
    }

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
