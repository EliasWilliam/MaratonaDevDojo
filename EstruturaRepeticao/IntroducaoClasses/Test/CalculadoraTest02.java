package EstruturaRepeticao.IntroducaoClasses.Test;

import EstruturaRepeticao.IntroducaoClasses.Metodo.Dominio.Calculadora;

public class CalculadoraTest02 {
    
    public static void main(String [] args) {
        Calculadora calculadora = new Calculadora();
       double result = calculadora.DivideDoisNumeros(8,2);
       System.out.println(result);
    }
}
