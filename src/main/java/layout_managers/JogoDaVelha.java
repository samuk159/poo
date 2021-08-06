/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package layout_managers;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author samuk159
 */
public class JogoDaVelha extends JFrame implements ActionListener {
    
    JButton[][] botoes = new JButton[3][3];
    String lastChar = "o";

    public JogoDaVelha() {
        setSize(200, 200);
        setLayout(new GridLayout(3, 3));
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton botao = new JButton("");
                botao.setFont(new Font("Arial", Font.PLAIN, 30));
                botao.addActionListener(this);
                add(botao);
                botoes[i][j] = botao;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton botao = (JButton) e.getSource();
        marcar(botao);        
    }
    
    private void marcar(JButton botao) {
        if (!botao.getText().isEmpty()) {
            return;
        }
        
        if (lastChar.equals("o")) {
            lastChar = "x";
        } else {
            lastChar = "o";
        }
        
        botao.setText(lastChar);
        
        String vencedor = verificarVencedor();
        
        if (vencedor != null) {
            JOptionPane.showMessageDialog(this, vencedor + " venceu");
            reiniciar();
            return;
        } else if (tabuleiroCheio()) {
            JOptionPane.showMessageDialog(this, "Empate");
            reiniciar();
            return;
        }
        
        if (lastChar.equals("x")) {
            jogadaComputador();
        }
    }
    
    private String verificarVencedor() {
        for (int i = 0; i < 3; i++) {
            if (!botoes[i][0].getText().isEmpty()
                && botoes[i][0].getText().equals(botoes[i][1].getText()) 
                && botoes[i][1].getText().equals(botoes[i][2].getText())) {
                return botoes[i][0].getText();
            }
            
            if (!botoes[0][i].getText().isEmpty()
                && botoes[0][i].getText().equals(botoes[1][i].getText()) 
                && botoes[1][i].getText().equals(botoes[2][i].getText())) {
                return botoes[0][i].getText();
            }
        }
        
        if (!botoes[0][0].getText().isEmpty()
            && botoes[0][0].getText().equals(botoes[1][1].getText()) 
            && botoes[1][1].getText().equals(botoes[2][2].getText())) {
            return botoes[0][0].getText();
        }
        
        if (!botoes[0][2].getText().isEmpty()
            && botoes[0][2].getText().equals(botoes[1][1].getText()) 
            && botoes[1][1].getText().equals(botoes[2][0].getText())) {
            return botoes[0][2].getText();
        }
        
        return null;
    }
    
    private boolean tabuleiroCheio() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (botoes[i][j].getText().isEmpty()) {
                    return false;
                }
            }
        }
        
        return true;
    }

    private void reiniciar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botoes[i][j].setText("");
            }
        }
        
        lastChar = "o";
    }

    private void jogadaComputador() {
        if (verificarCombinacao("o") || verificarCombinacao("x")) {
            return;
        }
        
        int x, y;        
        
        do {
            x = ThreadLocalRandom.current().nextInt(0, 2 + 1);
            y = ThreadLocalRandom.current().nextInt(0, 2 + 1);

            System.out.println(x + " - " + y);
        } while (botoes[x][y].getText() != null && !botoes[x][y].getText().isEmpty());
        
        marcar(botoes[x][y]);
    }
    
    private boolean verificarCombinacao(String c) {
        for (int i = 0; i < 3; i++) {
            if (c.equals(botoes[i][0].getText()) && c.equals(botoes[i][1].getText()) && botoes[i][2].getText().isEmpty()) {
                marcar(botoes[i][2]); return true;
            }
            
            if (c.equals(botoes[i][0].getText()) && c.equals(botoes[i][2].getText()) && botoes[i][1].getText().isEmpty()) {
                marcar(botoes[i][1]); return true;
            }
            
            if (c.equals(botoes[i][1].getText()) && c.equals(botoes[i][2].getText()) && botoes[i][0].getText().isEmpty()) {
                marcar(botoes[i][0]); return true;
            }
            
            
            if (c.equals(botoes[0][i].getText()) && c.equals(botoes[1][i].getText()) && botoes[2][i].getText().isEmpty()) {
                marcar(botoes[2][i]); return true;
            }
            
            if (c.equals(botoes[0][i].getText()) && c.equals(botoes[2][i].getText()) && botoes[1][i].getText().isEmpty()) {
                marcar(botoes[1][i]); return true;
            }
            
            if (c.equals(botoes[1][i].getText()) && c.equals(botoes[2][i].getText()) && botoes[0][i].getText().isEmpty()) {
                marcar(botoes[0][i]); return true;
            }
        }
        
        if (c.equals(botoes[0][0].getText()) && c.equals(botoes[1][1].getText()) && botoes[2][2].getText().isEmpty()) {
            marcar(botoes[2][2]); return true;
        }
        
        if (c.equals(botoes[0][0].getText()) && c.equals(botoes[2][2].getText()) && botoes[1][1].getText().isEmpty()) {
            marcar(botoes[1][1]); return true;
        }
        
        if (c.equals(botoes[1][1].getText()) && c.equals(botoes[2][2].getText()) && botoes[0][0].getText().isEmpty()) {
            marcar(botoes[0][0]); return true;
        }
        
        
        if (c.equals(botoes[0][2].getText()) && c.equals(botoes[1][1].getText()) && botoes[2][0].getText().isEmpty()) {
            marcar(botoes[2][0]); return true;
        }
        
        if (c.equals(botoes[0][2].getText()) && c.equals(botoes[2][0].getText()) && botoes[1][1].getText().isEmpty()) {
            marcar(botoes[1][1]); return true;
        }
        
        if (c.equals(botoes[1][1].getText()) && c.equals(botoes[2][0].getText()) && botoes[0][2].getText().isEmpty()) {
            marcar(botoes[0][2]); return true;
        }
        
        return false;
    }
    
}
