package EstruturaRepeticao.Listas;

public class ArraysAula {
    public static void main(String[]args) {

        String [] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Vegeta";
        nomes[2] = "Gohan";

//nomes.length => retornar o tamanho do array

        for (int i = 0; i < 3; i++){

            System.out.println(nomes[i]);
        }
        
    }

}
