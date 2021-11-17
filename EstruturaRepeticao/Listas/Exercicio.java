package EstruturaRepeticao.Listas;

public class Exercicio {

    public static void main(String[] args) {

        double [] notasAlunoA = new double[3];

        notasAlunoA[0] = 7.5;
        notasAlunoA[1] = 9;
        notasAlunoA[2] = 8.4;

        System.out.println(notasAlunoA[0]);
        System.out.println(notasAlunoA[1]);
        System.out.println(notasAlunoA[2]);

        //percorrendo o array
        double total = 0;
        for(int i = 0; i < notasAlunoA.length; i++ ) {
            total += notasAlunoA[i];
        }

        System.out.println(total / 3);
    }
}
