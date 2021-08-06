/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package layout_managers;

import javax.swing.JFrame;

/**
 *
 * @author samuk159
 */
public class Main {

    public static void main(String[] args) {
        //JFrame tela = new ExemploFlowLayout();
        //JFrame tela = new ExemploBorderLayout();
        //JFrame tela = new ExemploBoxLayout();
        //JFrame tela = new ExemploGridLayout();
        JFrame tela = new Calculadora();
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }
    
}
