package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void sieteDebeDevolverNotable()
    {
        App app = new App();
        assertEquals("notable", app.notaTexto(7));
    }

    @Test
    public void ceroDebeDevolverInvalidArgument(){
        App app = new App();

        assertThrows(IllegalArgumentException.class,
            () -> {
                app.notaTexto(0);
            });
    }
}