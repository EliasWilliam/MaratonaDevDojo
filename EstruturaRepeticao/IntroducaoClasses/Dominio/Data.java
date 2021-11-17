package EstruturaRepeticao.IntroducaoClasses.Dominio;

public class Data {

    int dia;
    int mes;
    int ano;


    Data() {

        // dia = 1
        // mes = 1
        // ano = 1970
        this(1, 1, 1970);

        int a;
        a = 0;

        System.out.println(a);
    }

    Data(int dia, int mes, int ano)   {


        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
}
