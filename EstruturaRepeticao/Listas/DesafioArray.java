package EstruturaRepeticao.Listas;

import java.util.Scanner;
import java.util.Arrays;

public class DesafioArray {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

      System.out.println("Quantas notas: ");

      int qntdNotas = entrada.nextInt();

      double [] notas = new double[qntdNotas];

      for(int i = 0; i < notas.length; i++) {
          System.out.print("Informe a nota " + (i + 1) + ": ");
          notas[i] = entrada.nextDouble();
      }

        double total = 0;

      for(double nota: notas) {
          total +=  nota;
      }


      System.out.println("A média é : " + (total / notas.length));
      System.out.println(Arrays.toString(notas));

        entrada.close();

    }
}
