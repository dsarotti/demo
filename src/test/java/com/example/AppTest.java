package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    App app = new App();
    @BeforeAll
    public void metodobeforeall(){
        //hacer algo
    }
    
    /**
     * Rigorous Test :-)
     */
    @Test
    public void sieteDebeDevolverNotable()
    {
        assertEquals("notable", app.notaTexto(7));
    }

    @Test
    public void ceroDebeDevolverInvalidArgument(){
        assertThrows(IllegalArgumentException.class,
            () -> {
                app.notaTexto(0);
            });
    }
}