/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package layout_managers;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author samuk159
 */
public class ExemploBoxLayout extends JFrame {

    public ExemploBoxLayout() {
        setSize(200, 200);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(new JButton("Um"));
        add(new JButton("Dois"));
        add(new JButton("Três"));
    }
    
}
