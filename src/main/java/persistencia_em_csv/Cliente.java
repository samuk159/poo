/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistencia_em_csv;

/**
 *
 * @author samuk159
 */
public class Cliente {
    private String nome;
    private String telefone;
    private Long cpf;

    public Cliente() {}

    public Cliente(String nome, String telefone, Long cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    //getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
}
