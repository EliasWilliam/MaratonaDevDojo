package EstruturaRepeticao;

public class EstruturaCondicionais02 {

    //Utilizando o switch e dados os valores de 1 a 7, imprima se é dia útil ou fim de semana
    //Considerando 1 como domingo

    public static void main(String[] args){
        byte dia = 1;
        switch(dia) {
            case 1:
            case 7: 

            System.out.println("FDS");
            break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            
            System.out.println("Dia útil");
            break;
            default:
            System.out.println("Opção inválida !");
            break;

        }
    }
    
}