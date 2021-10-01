package EstruturaRepeticao.Listas;

public class fila {

    public processo processoAtual;
    public fila proximaFila;

    public fila() {
        this.processoAtual == null;
        this.proximaFila == null;
    }

    public void inserirFila(processo processoNovo){

        if(this.processoAtual == null) {
            this.processoAtual = processoNovo;
            this.proximaFila = new fila();
        } else {
                this.proximaFila.inserirFila(processoNovo   );
        }
    }

    public processo removerfila(){
        processo removido = this.processoAtual;
        this.processoAtual = this.proximaFila.processoAtual;
        this.proximaFila = this.proximaFila.proximaFila;
        return removido;
    }

    public String checkfila(String vazia) {
        if(this.proximaFila.proximaFila == null) {
            vazia = vazia + " " + this.processoAtual.getPrioridade() + " " + this.processoAtual.getTempo();

        } else {
            vazia = vazia + " " + this.processoAtual.getPrioridade() + " " + this.processoAtual.getTempo() + "&&"+ this.proximaFila.checkfila(vazia);
        }
        return vazia;
    }

    public boolean vaziafila() {
        if(this.proximaFila == null) {
            return true;
        }
        return false;
    }

}
