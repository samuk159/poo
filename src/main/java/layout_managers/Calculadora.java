/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package layout_managers;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author samuk159
 */
public class Calculadora extends JFrame {

    public Calculadora() {
        setSize(200, 250);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        JTextField campoConta = new JTextField();
        campoConta.setMaximumSize(new Dimension(180, 12));
        add(campoConta);
        
        JPanel painelDeBotoes = new JPanel();
        add(painelDeBotoes);
        painelDeBotoes.setLayout(new GridLayout(4, 4, 3, 3));
        
        painelDeBotoes.add(new JButton("1"));
        painelDeBotoes.add(new JButton("2"));
        painelDeBotoes.add(new JButton("3"));
        painelDeBotoes.add(new JButton("+"));
        
        painelDeBotoes.add(new JButton("4"));
        painelDeBotoes.add(new JButton("5"));
        painelDeBotoes.add(new JButton("6"));
        painelDeBotoes.add(new JButton("-"));
        
        painelDeBotoes.add(new JButton("7"));
        painelDeBotoes.add(new JButton("8"));
        painelDeBotoes.add(new JButton("9"));
        painelDeBotoes.add(new JButton("*"));
        
        painelDeBotoes.add(new JButton("C"));
        painelDeBotoes.add(new JButton("0"));
        painelDeBotoes.add(new JButton("="));
        painelDeBotoes.add(new JButton("/"));
    }
    
}
