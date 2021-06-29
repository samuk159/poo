package heranca_e_composicao;

public class Funcionario extends Pessoa {
    private float salario;
    //getters e setters
    
    public final int getJornada() {
        return 40;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
