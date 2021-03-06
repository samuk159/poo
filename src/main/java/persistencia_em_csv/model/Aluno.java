/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistencia_em_csv.model;

/**
 *
 * @author samuk159
 */
public class Aluno extends BaseModel {
    private String nome;
    private String telefone;
    private Long cpf;
    private Integer periodo;

    public Aluno() {}

    public Aluno(String nome, String telefone, Long cpf, Integer periodo) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.periodo = periodo;
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

    public Integer getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }
}
