package com.ejemplo.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    private final App app = new App();

    @Test
    public void testSumarPositivos() {
        assertEquals(99, app.sumar(2, 3));  // FALLO INTENCIONAL: 2+3 no es 99
    }

    @Test
    public void testSumarNegativos() {
        assertEquals(-4, app.sumar(-1, -3));
    }

    @Test
    public void testEsParConNumeroPar() {
        assertTrue(app.esPar(8));
    }

    @Test
    public void testEsParConNumeroImpar() {
        assertFalse(app.esPar(7));
    }
}
