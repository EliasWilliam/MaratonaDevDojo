package EstruturaRepeticao;

public class EstruturaCondicionais {
    // Imprima o dia da semana, considerando 1 como domingo
    public static void main(String[] args){

    byte dia = 5;
        switch(dia){
            default:
            System.out.println("Opção inválida");
            case 1:
            System.out.println("Domingo");
            break;
            case 2:
            System.out.println("Segunda");
            break;
            case 3:
            System.out.println("Ter");
            break;
            case 4:
            System.out.println("Quarta");
            break;
            case 5:
            System.out.println("Quinta");
            case 6:
            System.out.println("Sexta");
            break;
            case 7:
            System.out.println("Sábado");
            break;
        
        }
    }

}

