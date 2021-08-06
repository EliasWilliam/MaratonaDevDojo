package EstruturaRepeticao.IntroducaoClasses.Test;

import EstruturaRepeticao.IntroducaoClasses.Dominio.Carro;

//Crie uma classe carro com os seguintes atributos
//nome/modelo/ano e em seguida crie dois objetos distintos e imprima seus valores

public class CarroTest {
    
    public static void main(String[] args){
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Tesla";
        carro1.ano = 2020;
        carro1.modelo ="Sporting";

        carro2.nome = "Fusca";
        carro2.ano = 1978;
        carro2.modelo = "GT 500";

        System.out.println("\nCarro1");
        System.out.println(carro1.nome);
        System.out.println(carro1.ano);
        System.out.println(carro1.modelo);

        System.out.println("\nCarro2");
        System.out.println(carro1.nome);
        System.out.println(carro1.ano);
        System.out.println(carro1.modelo);
    }
}
