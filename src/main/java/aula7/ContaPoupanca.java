package aula7;

public class ContaPoupanca extends Conta {
    private float taxaRendimento;

    @Override
    public void aplicarTaxa() {
        float rendimento = this.getSaldo() * (taxaRendimento / 100);
        this.setSaldo(this.getSaldo() + rendimento);
    }
    
    //getters e setters
    
    public float getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(float taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }    
    
}
