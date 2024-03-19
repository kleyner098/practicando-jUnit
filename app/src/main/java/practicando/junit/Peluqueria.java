
package practicando.junit;
import java.util.Arrays;

public class Peluqueria {

    private String[] diasApertura = {"Lunes", "Martes"};

    // Este método debería devolver el array diasApertura
    public String[] getDiasApertura() {
        return new String[]{};
    }

    /* Este método debería devolver verdadero si un día de la semana está 
     * presente en el array diasApertura. Si no debería devolver falso.
     * Si la cadena pasada no termina en "es" debería lanzar una excepción
     * IllegalArgumentException con un mensaje explicando que solo los días 
     * que no sean fin de semana son válidos.
    */
    public boolean estaAbierto(String diaSemana) {
        return false;
    }






}