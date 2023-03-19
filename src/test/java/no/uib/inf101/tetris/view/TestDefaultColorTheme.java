package no.uib.inf101.tetris.view;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.awt.Color;
import org.junit.jupiter.api.Test;

/**
 * Testing the class DefaultColorTheme
 */
public class TestDefaultColorTheme {

    @Test
    public void sanityTestDefaultColorTheme() {
        ColorTheme colors = new DefaultColorTheme();
        assertEquals(Color.BLACK, colors.getBackgroundColor());
        assertEquals(Color.WHITE, colors.getFrameColor());
        assertEquals(Color.BLACK, colors.getCellColor('-'));
        assertEquals(Color.RED, colors.getCellColor('r'));
        assertThrows(IllegalArgumentException.class, () -> colors.getCellColor('\n'));
    }

}
