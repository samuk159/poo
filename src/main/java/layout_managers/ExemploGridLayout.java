/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package layout_managers;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author samuk159
 */
public class ExemploGridLayout extends JFrame {

    public ExemploGridLayout() {
        setSize(300, 300);
        setLayout(new GridLayout(2, 3, 5, 5));
        
        for (int i = 1; i <= 5; i++) {
            add(new JButton(String.valueOf(i)));
        }
        
        add(new JTextField());
    }
    
}
