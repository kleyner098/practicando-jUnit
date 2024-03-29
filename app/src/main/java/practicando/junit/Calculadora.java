package practicando.junit;

public class Calculadora {

    public int suma(int x, int y){
        return x + y;
    }

    public int resta (int x, int y){
        return x - y;
    }

    public boolean esPar(int num ){
        return (num % 2 == 0);
    }

    public int[] incrementarArray(int[] original){
        int[] newArr = new int[original.length];

        for(int i=0; i < original.length; i++){
            newArr[i] = original[i]+1;
        }

        return newArr;
    }

    public int dividir(int num, int den){
        
        if (den == 0){
            throw new IllegalArgumentException("Error, dividisión por 0");
        }else{
            return num/den;
        }
        
    }
}