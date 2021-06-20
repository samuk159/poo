package aula7;

public class ContaCorrente extends Conta {
    private float taxaMensal;
    
    @Override
    public void aplicarTaxa() {
        this.setSaldo(this.getSaldo() - taxaMensal);
    }
    
    //getters e setters

    public float getTaxaMensal() {
        return taxaMensal;
    }

    public void setTaxaMensal(float taxaMensal) {
        this.taxaMensal = taxaMensal;
    }
    
    
}
