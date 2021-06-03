package aula5;

public class Usuario {
    
    private String nome;
    private int idade;
    private String senha = "123";
    
    public String getNome() {
        if (this.nome == null || this.nome.isEmpty()) {
            return "Sem nome";
        }
        
        return this.nome;
    }
    
    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            System.out.println("Nome não informado");
        } else {        
            this.nome = nome;
        }
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        if (idade > -1) {
            this.idade = idade;
        } else {
            System.out.println("Idade não pode ser menor que 0");
        }
    }
    
    public String getSenha() {
        return senha;
    }
    
    public void alterarSenha(String senhaAtual, String novaSenha) {
        if (senhaAtual.equals(this.senha)) {
            this.senha = novaSenha;
        } else {
            System.out.println("Senha atual não confere");
        }
    }
    
}
