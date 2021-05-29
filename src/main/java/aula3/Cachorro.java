/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

/**
 *
 * @author samuk159
 */
public class Cachorro {
    
    String nome;
    String cor;
    String raca;
    Float peso;

    Cachorro() {
        peso = 0f;
        latir();
    }
    
    Cachorro(String nome) {
        this();
        this.nome = nome;
    }

    Cachorro(String nome, String cor, String raca, Float peso) {
        this(nome);
        this.cor = cor;
        this.raca = raca;
        this.peso = peso;
    }    

    void latir() {
        System.out.println("Au au!");
    }

    void comer(String comida) {
        System.out.println("Comendo " + comida);
    }
    
}
