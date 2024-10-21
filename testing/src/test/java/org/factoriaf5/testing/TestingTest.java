package org.factoriaf5.testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestingTest {
    private Testing testing;

    @BeforeEach
    public void init(){
        this.testing = new Testing();
    }


    @Test
    public void testSumar() {
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
        int num = 5;
        
        // When - Cuando
        boolean result = testing.checkPositivo(num);
        // Then - Entonces
        assertEquals(true, num > 0);
        assertTrue(num > 0);
        assertFalse(num < 0);
        assertNotNull(result);
        //assertEquals("El número no puede ser negativo", result2);
        
    }
    @Test
    public void testCheckPositivoError() {
        //crear el objecto
        int num = -5;
        assertThrows(IllegalArgumentException.class, () -> {testing.checkPositivo(num);});
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
    public void testContarLetrasNoA() {
        String  cadena = "gehnlk";
        int result = testing.contarLetrasA(cadena);
        // Then - Entonces
        assertEquals(0,  result);
    }

    @Test
    public void testContarLetrasAisEmpty() {
        String cadena = "";
        int result = testing.contarLetrasA(cadena);
        assertEquals(0, result);
    }



    @Test
    public void testContieneElemento() {
        //crear el objecto
        
        String elemento = "hola";
        List<String> lista = List.of(new String[]{"hola", "mundo", "java"});
        

        // When - Cuando
        boolean result = testing.contieneElemento(lista, elemento);

        // Then - Entonces
        assertTrue(result);
    }
    @Test
    public void testContieneElementoNo() {
        //crear el objecto
        
        String elemento = "adios";
        List<String> lista = List.of(new String[]{"hola", "mundo", "java"});
        

        // When - Cuando
        boolean result = testing.contieneElemento(lista, elemento);

        // Then - Entonces
        assertFalse(result);
    }
    @Test
    public void testContieneElementoVacio() {
        String elemento = "adios";
        List<String> lista = Collections.emptyList();
        // When - Cuando
        boolean result = testing.contieneElemento(lista, elemento);
        // Then - Entonces
        assertFalse(result);
    }

    @Test
    public void testRevertirCadena() {
        String elemento1 = "hola pato";
        
        // When - Cuando
        String result = testing.revertirCadena(elemento1);

        // Then - Entonces
        assertEquals("otap aloh", result);
        assertNotNull(result);
        assertFalse(result.equals("pato hola"));
    }

    @Test
    public void testFactorial() {
        int num = 4;
        

        // When - Cuando
        long result = testing.factorial(num);

        // Then - Entonces
        assertEquals(24, result);
    }
    @Test
    public void testFactorialNegativo() {
        int num = -4;
        
        // When - Cuando
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            testing.factorial(num);});

        // Then - Entonces
        assertEquals("Factorial no definido para números negativos", exception.getMessage());
    }

    @Test
    public void testEsPrimo() {
        int num2 = 12;

        // When - Cuando
        boolean result2 =  testing.esPrimo(num2);

        // Then - Entonces
        assertFalse(result2);
    }

    @Test
    public void testEsPrimoMenorIguala1() {
        
        int num3 = 0;
        boolean result3 =  testing.esPrimo(num3);

        // Then - Entonces
        assertFalse(result3);
    }

    @Test
    public void testEsPrimoMayorACuatro() {
        
        int num = 7;
        boolean result =  testing.esPrimo(num);

        // Then - Entonces
        assertTrue(result);
    }

    
    @Test
    public void testMensajeConRetraso() throws InterruptedException {
        //daba error todo el tiempo porque era poniendo el throws arriba
        
        // When - Cuando
        String result = testing.mensajeConRetraso();
        
        // Then - Entonces
        assertEquals("Listo después de retraso", result);
    }
    
    @Test
    public void testConvertirAString(){

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

        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        double result = testing.calcularMedia(lista);

        assertEquals(3.00, result);
        
    }

    @Test
    public void testCalcularMediaVacia() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            testing.calcularMedia(List.of()); // Lista vacía
        });
        assertEquals("La lista no puede ser nula o vacía", exception.getMessage());
    }
    
    @Test
    public void testCalcularMediaNula() {
        IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class, () -> {
            testing.calcularMedia(null);
        });
        assertEquals("La lista no puede ser nula o vacía", exception2.getMessage());
    }

    @Test
    public void testConvertirListaAStringUnNull(){

        List<String> lista2 = new ArrayList<>();
        lista2.add("uno");
        lista2.add(null);
        lista2.add("tres");

        String result2 = testing.convertirListaAString(lista2);
        assertEquals("UNO,NULL,TRES", result2);
    }

    @Test
    public void testConvertirListaAStringNula(){

        List<String> lista3 = new ArrayList<>();
        lista3.add(null);
        lista3.add(null);
        lista3.add(null);

        String result3 = testing.convertirListaAString(lista3);

        assertEquals("NULL,NULL,NULL", result3);
    }

    @Test
    public void testConvertirListaAStringVacia(){

        List<String> lista = new ArrayList<>();

        String result = testing.convertirListaAString(lista);

        assertEquals("", result);
    }

}
