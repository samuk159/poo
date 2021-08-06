/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package layout_managers;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author samuk159
 */
public class ExemploBorderLayout 
    extends JFrame implements ActionListener {
    
    public ExemploBorderLayout() {
        setSize(400, 200);
        setLayout(new BorderLayout(5, 5));
        addBotao("Norte", BorderLayout.NORTH);
        addBotao("Sul", BorderLayout.SOUTH);
        addBotao("Oeste", BorderLayout.WEST);
        addBotao("Centro", BorderLayout.CENTER);
        addBotao("Leste", BorderLayout.EAST);
    }
    
    private void addBotao(String titulo, String regiao) {
        JButton botao = new JButton(titulo);
        botao.addActionListener(this);
        add(botao, regiao);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton botao = (JButton) e.getSource();
        botao.setVisible(false);
    }    
}
