package practicando.junit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

class PeluqueriaTest {

    Peluqueria pelu = new Peluqueria();

    @Test
    public void testGetDiasApertura() {
        String[] expected = { "Lunes", "Martes" };
        String[] actual = pelu.getDiasApertura();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testPeluqueriaAbreLunes() {
        boolean actual = pelu.estaAbierto("Lunes");
        assertTrue(actual);

    }

    @Test
    public void testPeluqueriaCierraMiercoles() {
        boolean actual = pelu.estaAbierto("miercoles");
        assertFalse(actual);
    }

    @Test
    public void testLanzarExcepcionSiDiaNoAcabaEnEs() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            pelu.estaAbierto("marte");
        });
        String expected = "No es un día de la semana";
        String actual = exception.getMessage();
        assertEquals(expected, actual);
    }

    //Enum
    // @ParameterizedTest
    // @EnumSource( value = Peluqueria.Dia.class , names = {"LUNES", "MARTES"})
    // public void testPeluquriaEstaAbierta(Peluqueria.Dia dia){
    //     boolean actual = pelu.estaAbierto(dia);
    //     assertTrue(actual);
    // }

    // @ParameterizedTest
    // @EnumSource( value = Peluqueria.Dia.class , names = {"MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO"})
    // public void testPeluquriaEstaCerrada(Peluqueria.Dia dia){
    //     boolean actual = pelu.estaAbierto(dia);
    //     assertFalse(actual);
    // }

    //Asuncion
    // Comprueba que es 15, pero no el descuento de 30/2 + 5
    // @Test
    // public void testAplicarDescuento(){
    //     Calculadora calc = new Calculadora();
    //     assumeTrue(calc.dividir(pelu.getPrecioCortePelo(), 2) == 15);
    // }
}