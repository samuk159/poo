/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistencia_em_csv;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author samuk159
 */
public class AlunoDAO {
    
    private File arquivo = new File("dados/alunos.csv");
    private List<Aluno> alunos;

    public List<Aluno> ler(JProgressBar barraProgresso) throws IOException {
        if (alunos == null) {
            List<String> linhas = Files.readAllLines(arquivo.toPath());
            barraProgresso.setValue(0);
            barraProgresso.setMaximum(linhas.size());
            alunos = new ArrayList<>();

            for (int i = 0; i < linhas.size(); i++) {
                String linha = linhas.get(i);
                
                if (!linha.trim().isEmpty()) {
                    String[] colunas = linha.split(",");
                    
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    
                    Aluno a = new Aluno();
                    a.setId(i);
                    a.setNome(colunas[0]);
                    a.setTelefone(colunas[1]);
                    a.setCpf(Long.parseLong(colunas[2]));
                    a.setPeriodo(Integer.parseInt(colunas[3]));

                    alunos.add(a);
                    barraProgresso.setValue(i + 1);
                }
            }
        }
        
        return alunos;
    }
    
    public List<Aluno> buscar(String texto, JProgressBar barraProgresso) throws IOException {        
        if (texto == null || texto.isEmpty()) {
            return ler(null);
        } else {
            barraProgresso.setValue(0);
            barraProgresso.setMaximum(alunos.size());
            List<Aluno> filtrados = new ArrayList<>();
            
            for (Aluno a : alunos) {
                try {
                    Thread.sleep(1000);
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
    
    public Aluno salvar(Aluno a) throws IOException {        
        if (a.getId() == null) {
            alunos.add(a);
        } else {
            alunos.set(a.getId(), a);
        }
        
        salvarArquivo();
        return a;
    }
    
    public void remover(Aluno a) throws IOException {
        alunos.remove((int) a.getId());
        salvarArquivo();
    }
    
    private void salvarArquivo() throws IOException {
        String texto = "";
        
        for (Aluno a : alunos) {
            String[] colunas = { 
                a.getNome(), 
                a.getTelefone(), 
                String.valueOf(a.getCpf()), 
                String.valueOf(a.getPeriodo()) 
            };
            String linha = String.join(",", colunas);
            texto += linha + "\n";
        }
        
        FileUtils.writeStringToFile(arquivo, texto, "UTF-8");
    }
    
}
