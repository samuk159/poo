/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistencia_em_csv.dao;

import persistencia_em_csv.model.Aluno;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import org.apache.commons.io.FileUtils;
import persistencia_em_csv.model.BaseModel;

/**
 *
 * @author samuk159
 */
public class AlunoDAO extends BaseDAO<Aluno> {    
    private static AlunoDAO instancia;
    
    private AlunoDAO() {}
    
    public static AlunoDAO getInstancia() {
        if (instancia == null) {
            instancia = new AlunoDAO();
        }
        
        return instancia;
    }
    
    public List<Aluno> buscar(String texto, JProgressBar barraProgresso) throws IOException {        
        if (texto == null || texto.isEmpty()) {
            return ler(null);
        } else {
            barraProgresso.setValue(0);
            barraProgresso.setMaximum(lista.size());
            List<Aluno> filtrados = new ArrayList<>();
            
            for (Aluno a : lista) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                
                if (
                    a.getNome() != null && 
                    a.getNome().toLowerCase().contains(texto.toLowerCase())
                ) {
                    filtrados.add(a);
                } else if (
                    a.getCpf() != null && 
                    a.getCpf().toString().equals(
                        texto.replace(".", "").replace("-", "")
                    )
                ) {
                    filtrados.add(a);
                }
                
                barraProgresso.setValue(barraProgresso.getValue() + 1);
            }
            
            return filtrados;
        }
    }

    @Override
    protected String getNomeArquivo() {
        return "alunos";
    }
    
    @Override
    protected String[] criarColunas(Aluno a) {
        return new String[] { 
            a.getNome(), 
            a.getTelefone(), 
            String.valueOf(a.getCpf()), 
            String.valueOf(a.getPeriodo()) 
        };
    }

    @Override
    protected Aluno lerColunas(String[] colunas, int i) {
        Aluno a = new Aluno();
        a.setId(i);
        a.setNome(colunas[0]);
        a.setTelefone(colunas[1]);                    
        if (!colunas[2].isEmpty() && !colunas[2].equals("null"))
            a.setCpf(Long.parseLong(colunas[2]));
        if (!colunas[3].isEmpty() && !colunas[3].equals("null"))
            a.setPeriodo(Integer.parseInt(colunas[3]));
        
        return a;
    }
    
}
