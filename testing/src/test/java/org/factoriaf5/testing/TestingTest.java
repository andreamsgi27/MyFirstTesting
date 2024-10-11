package org.factoriaf5.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TestingTest {
    @Test
    public void testSumar() {
        //Example example =  new Example(); crear el objecto
        Testing testing = new Testing();
        // Given - Teniendo:
        int num1 = 35; // parametros
        int num2 = 79;

        // When - Cuando
        int result = testing.sumar(num1, num2);

        // Then - Entonces
        assertEquals(114, result);
        assertTrue(result > 100);
        assertFalse(result > 120);
        assertNotNull(result);
        assertInstanceOf(Integer.class, result);
}

    @Test
    public void testCheckPositivo() {
        //crear el objecto
        Testing testing = new Testing();
        int num1 = 5;

        // When - Cuando
        boolean result = testing.checkPositivo(num1);

        // Then - Entonces
        assertEquals(true, result);
        assertTrue(num1 > 0);
        assertFalse(num1 < 0);
    }

    @Test
    public void testContarLetrasA() {
        //crear el objecto
        Testing testing = new Testing();
        String cadena = "manzana";
        char letra = 'a';
        

        // When - Cuando
        int result = testing.contarLetrasA(cadena);

        // Then - Entonces
        assertEquals(3, result);
    }
    }
