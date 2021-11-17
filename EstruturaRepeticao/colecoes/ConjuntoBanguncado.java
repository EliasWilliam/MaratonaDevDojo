package EstruturaRepeticao.colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBanguncado {

    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("True");
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho é " +conjunto.size());
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.contains('x'));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        //conjunto.addall(nums); // união entre dois conjuntos
        conjunto.retainAll(nums);
        System.out.println(conjunto);
    }
}
