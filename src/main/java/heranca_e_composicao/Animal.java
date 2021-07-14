package heranca_e_composicao;

public /*final*/ class Animal {
    private String nome;
    private String raca;
    private Float peso;

    public Animal() { }

    public Animal(String nome, String raca, Float peso) {
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
    }   
    
    public void comer() { }
    
    //getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }    
    
}
