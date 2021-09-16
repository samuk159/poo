package heranca_e_composicao;

public class Desenvolvedor extends Funcionario {
    Computador computador;
    
    public void programar() {}
    
    //getters e setters

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }
    
}
