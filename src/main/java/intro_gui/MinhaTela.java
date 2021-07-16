/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package intro_gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author samuk159
 */
public class MinhaTela extends JFrame {
    public MinhaTela() {
        super("Eu sou uma tela");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(320, 160);
        this.setVisible(true); 
        
        JPanel panel = new JPanel();        
        panel.add(new JLabel("Olá!"));
        panel.add(new JButton("Clique aqui"));
        
        this.add(panel);
    }    
}
