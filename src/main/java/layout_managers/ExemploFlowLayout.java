/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package layout_managers;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author samuk159
 */
public class ExemploFlowLayout extends JFrame {

    public ExemploFlowLayout() {
        setSize(300, 200);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(new JButton("Botão esquerdo"));
        add(new JButton("Botão central"));
        add(new JButton("Botão direito"));
    }
    
}
