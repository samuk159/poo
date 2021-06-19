package aula6;

public class Vendedor extends Funcionario {
    private Float comissao;
    private Cliente[] clientes;
    
    public void vender() {}
    
    //getters e setters

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
