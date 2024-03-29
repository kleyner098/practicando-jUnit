package practicando.junit;

import java.util.Arrays;

public class Peluqueria {

    enum Dia{
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO
    }
    // private Dia[] diasApertura = {Dia.LUNES,Dia.MARTES};
    private String[] diasApertura = {"Lunes", "Martes"};
    private int precioCortePelo = 30;
    private Calculadora calc = new Calculadora();

    // Este método debería devolver el array diasApertura
    public String[] getDiasApertura() {
        return diasApertura;
    }
    // public Dia[] getDiasApertura() {
    //     return diasApertura;
    // }


    /* Este método debería devolver verdadero si un día de la semana está 
     * presente en el array diasApertura. Si no debería devolver falso.
     * Si la cadena pasada no termina en "es" debería lanzar una excepción
     * IllegalArgumentException con un mensaje explicando que solo los días 
     * que no sean fin de semana son válidos.
    */
    public boolean estaAbierto(String diaSemana) {
        boolean abierto = false;
        if(diaSemana.endsWith("es")){
            for (int i = 0; i < diasApertura.length; i++) {
                if (diasApertura[i].toLowerCase().equals(diaSemana.toLowerCase())) {
                    abierto = true;
                }
            }
        }else{
            throw new IllegalArgumentException("No es un día de la semana");
        }
        return abierto;
    }

    // public boolean estaAbierto(Dia diaSemana) {
    //     boolean abierto = false;
    //     if (Arrays.asList(diasApertura).contains(diaSemana)) {
    //             abierto = true;
    //     }
    //     return abierto;
    // }

    public int getPrecioCortePelo() {
        return precioCortePelo;
    }


    public int aplicarDescuento(){
        return calc.dividir(precioCortePelo, 2) + 5;
    }



}