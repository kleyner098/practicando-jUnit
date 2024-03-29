package practicando.junit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class CalculadoraTest {
    Calculadora calc = new Calculadora();

    @Test
    public void testSuma(){
        int expected = 3;
        int actual = calc.suma(1, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testResta(){
        int expected = 3;
        int actual = calc.resta(5, 2);
        assertEquals(expected, actual);
    }

    // @Test
    // public void testEsPar(){
    //     boolean actual = calc.esPar(2);
    //     assertTrue(actual);
    // }

    @ParameterizedTest
    @ValueSource(ints = {-2,2,-100000,200000,})
    public void testEsPar(int numero){
        boolean actual = calc.esPar(numero);
        assertTrue(actual);
    }
    
    @Test
    public void testIncrementarArray(){
        int[] expected = {2,3,4};
        int[] actual = calc.incrementarArray( new int[]{1,2,3});
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testDividir(){
        Exception exception = assertThrows(IllegalArgumentException.class, ()->calc.dividir(10, 0));
        String esperado = "Error, dividisión por 0";
        String real = exception.getMessage();
        assertEquals(esperado, real);
    }
}
