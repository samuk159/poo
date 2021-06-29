/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes_e_objetos;

/**
 *
 * @author samuk159
 */
public class Aula3 {
    
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Spike";
        cachorro1.raca = "Pastor alemão";
        
        cachorro1.latir();
        cachorro1.comer("Ração");
        
        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "Bob";
        cachorro2.raca = "Buldogue";
        
        cachorro2.latir();
        cachorro2.comer("Carne");
        
        Cachorro cachorro3 = new Cachorro("Mel");
        Cachorro cachorro4 = new Cachorro("Rex", "Preto", "Rottweiller", 50f);
    }
    
    /*static class Cachorro {
        
        String nome;
        String cor;
        String raca;
        Float peso;
        
        void latir() {
            System.out.println("Au au!");
        }
        
        void comer(String comida) {
            System.out.println("Comendo " + comida);
        }
        
    }*/
    
}
