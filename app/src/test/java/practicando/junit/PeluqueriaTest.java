package practicando.junit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

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
        assertTrue(pelu.estaAbierto("Lunes"));

    }

    @Test
    public void testPeluqueriaCierraMiercoles() {
        assertFalse(pelu.estaAbierto("miercoles"));
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

}