package heranca_e_composicao;

public class Vendedor extends Funcionario {
    private Float comissao;
    private Cliente[] clientes;
    
    public void vender() {}
    
    //getters e setters
    
    /*@Override
    public final int getJornada() {
        return 44;
    }*/

    public Float getComissao() {
        return comissao;
    }

    public void setComissao(Float comissao) {
        this.comissao = comissao;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }
    
}
