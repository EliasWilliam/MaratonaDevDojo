package EstruturaRepeticao.classe;

public class Equals {

    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Elias";
        u1.email = "douglas.silva@zemail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Douglas";
        u2.email = "douglas.silva@zemail.com";

        System.out.print(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.print(u2.equals(u1));


    }
}
