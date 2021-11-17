package EstruturaRepeticao.IntroducaoClasses.Test;

import EstruturaRepeticao.IntroducaoClasses.Dominio.Estudante;


public class EstudanteTest {
    
    public static void main(String[] args){

        Estudante estudante = new Estudante();
        estudante.nome = "Ted";
        estudante.idade = 18;
        estudante.sexo = 'm';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

// System.out.println("Nome " + professor.nome + "idade: " + professor.idade + " sexo:" + professor.sexo);
    }
}
