package EstruturaRepeticao.Listas;

import java.util.Scanner;
import java.util.Arrays;

public class NotaArray {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas Notas: ");

        int  qntasNotas = entrada.nextInt();

        double [] notas = new double[qntasNotas];


        for(int i = 0; i < notas.length; i++) {
            System.out.print("Diga a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        double total = 0;
        for(double nota: notas){
            total += nota;
        }

        entrada.close();

    }


}
