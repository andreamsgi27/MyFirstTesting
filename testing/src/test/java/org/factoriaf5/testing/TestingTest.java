package org.factoriaf5.testing;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
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
        int num2 = -5;
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            testing.checkPositivo(num2);
        });
        // When - Cuando
        boolean result = testing.checkPositivo(num1);
        // Then - Entonces
        assertEquals(true, result);
        assertTrue(num1 > 0);
        assertFalse(num1 < 0);
        assertNotNull(result);
        //assertEquals("El número no puede ser negativo", result2);
        assertEquals("El número no puede ser negativo", exception.getMessage());
    }

    @Test
    public void testContarLetrasA() {
        //crear el objecto
        Testing testing = new Testing();
        String cadena = "manzana";
        

        // When - Cuando
        int result = testing.contarLetrasA(cadena);

        // Then - Entonces
        assertEquals(3, result);
        assertNotNull(result);
        assertFalse(result == 4);
        assertTrue(result == 3);

    }

    @Test
    public void testContieneElemento() {
        //crear el objecto
        Testing testing = new Testing();
        
        String elemento = "hola";
        String elemento2 = "jeje";
        List<String> lista = List.of(new String[]{"hola", "mundo", "java"});
        

        // When - Cuando
        boolean result = testing.contieneElemento(lista, elemento);
        boolean result2 = testing.contieneElemento(lista, elemento2);

        // Then - Entonces
        assertEquals(true, result);
        assertFalse(result2);
        assertNotNull(result);
        assertTrue(result);
        assertTrue(result == true);
        assertFalse(result == false);
    }

    @Test
    public void testRevertirCadena() {
        //crear el objecto
        Testing testing = new Testing();
        
        
        String elemento1 = "hola pato";
        

        // When - Cuando
        String result = testing.revertirCadena(elemento1);

        // Then - Entonces
        assertEquals("otap aloh", result);
        assertNotNull(result);
        assertTrue(result.equals("otap aloh"));
        assertFalse(result.equals("pato hola"));

    }

    @Test
    public void testFactorial() {
        //crear el objecto
        Testing testing = new Testing();
        
        
        int num = 4;
        int num2 = -4;
        

        // When - Cuando
        long result = testing.factorial(num);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            testing.factorial(-5);});

        // Then - Entonces
        assertEquals(24, result);
        assertFalse(num < 0);
        assertEquals("Factorial no definido para números negativos", exception.getMessage());
    }

    @Test
    public void testEsPrimo() {
        //crear el objecto
        Testing testing = new Testing();
        
        int num = 7;
        int num2 = 12;
        int num3 = 0;

        // When - Cuando
        boolean result = testing.esPrimo(num);
        boolean result2 =  testing.esPrimo(num2);
        boolean result3 =  testing.esPrimo(num3);

        // Then - Entonces
        assertEquals(true, result);
        assertFalse(result2);
        assertNotNull(result);
        assertTrue(result == true);
        assertFalse(result == false);
        assertFalse(result3);
    }
    
    @Test
    public void testMensajeConRetraso() throws InterruptedException {
        //daba error todo el tiempo porque era poniendo el throws arriba
        //crear el objecto
        Testing testing = new Testing();
        
        // When - Cuando
        String result = testing.mensajeConRetraso();
        
        // Then - Entonces
        assertEquals("Listo después de retraso", result);
    }
    
    @Test
    public void testConvertirAString(){
        //crear el objecto
        Testing testing = new Testing();

        // Crear una lista de ints para la prueba
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        List<String> result = testing.convertirAString(lista);
        List<String> result2 = testing.convertirAString(lista);

        // Definir el resultado esperado (una lista de Strings)
        List<String> esperado = new ArrayList<>();
        esperado.add("1");
        esperado.add("2");
        esperado.add("3");
        List<String> noEsperado = new ArrayList<>();
        noEsperado.add("hola");
        noEsperado.add("esto");
        noEsperado.add("no");

        assertEquals(esperado, result);
        assertNotEquals(noEsperado, result2);
        assertNotNull(result);
    }

    @Test
    public void testCalcularMedia() {
        // crear el objeto
        Testing testing = new Testing();

        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            testing.calcularMedia(List.of()); // Lista vacía
        });

        IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class, () -> {
            testing.calcularMedia(null);
        });
        assertEquals("La lista no puede ser nula o vacía", exception2.getMessage());

        

        double result = testing.calcularMedia(lista);

        assertEquals(3.00, result);
        assertNotNull(result);
        assertEquals("La lista no puede ser nula o vacía", exception.getMessage());
    }

    @Test
    public void testConvertirListaAString(){
        //crear el objecto
        Testing testing = new Testing();

        List<String> lista = new ArrayList<>();
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");

        List<String> lista2 = new ArrayList<>();
        lista2.add("uno");
        lista2.add(null);
        lista2.add("tres");

        List<String> lista3 = new ArrayList<>();
        lista3.add(null);
        lista3.add(null);
        lista3.add(null);

        String result = testing.convertirListaAString(lista);
        String result2 = testing.convertirListaAString(lista2);
        String result3 = testing.convertirListaAString(lista3);

        assertEquals("UNO,DOS,TRES", result);
        assertFalse(false, "TRES");
        assertTrue(true, "UNO,DOS,TRES");
        assertNotNull(result);
        assertEquals("UNO,NULL,TRES", result2);
        assertEquals("NULL,NULL,NULL", result3);
    }

}
