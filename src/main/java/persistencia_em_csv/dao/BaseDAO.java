/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistencia_em_csv.dao;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import org.apache.commons.io.FileUtils;
import persistencia_em_csv.model.Aluno;
import persistencia_em_csv.model.BaseModel;

/**
 *
 * @author samuk159
 */
public abstract class BaseDAO<T extends BaseModel> {
    private File arquivo;
    protected List<T> lista;
    
    public BaseDAO() {
        arquivo = new File("dados/" + getNomeArquivo() + ".csv");
        
        if (!arquivo.exists()) {
            try {
                arquivo.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public List<T> ler(JProgressBar barraProgresso) throws IOException {
        if (lista == null) {
            List<String> linhas = Files.readAllLines(arquivo.toPath());
            
            if (barraProgresso != null) {
                barraProgresso.setValue(0);
                barraProgresso.setMaximum(linhas.size());
            }
            
            lista = new ArrayList<>();

            for (int i = 0; i < linhas.size(); i++) {
                String linha = linhas.get(i);
                
                if (!linha.trim().isEmpty()) {
                    String[] colunas = linha.split(",");
                    
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    
                    T model = lerColunas(colunas, i);
                    lista.add(model);
                    
                    if (barraProgresso != null)
                        barraProgresso.setValue(i + 1);
                }
            }
        }
        
        return lista;
    }
    
    public T salvar(T a) throws IOException {    
        ler(null);
        
        if (a.getId() == null) {
            a.setId(lista.size());
            
            while (
                lista.stream()
                .filter(a2 -> a2.getId() == a.getId())
                .findAny().isPresent()
            ) {
                a.setId(a.getId() + 1);
            }
            
            lista.add(a);
        } else {
            int indice = -1;
            
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i) == a) {
                    indice = i;
                }
            }
            
            lista.set(indice, a);
        }
        
        salvarArquivo();
        return a;
    }
    
    public void remover(T a) throws IOException {
        ler(null);
        lista.remove(a);
        salvarArquivo();
    }
    
    private void salvarArquivo() throws IOException {
        String texto = "";
        
        for (T a : lista) {
            String[] colunas = criarColunas(a);
            String linha = String.join(",", colunas);
            texto += linha + "\n";
        }
        
        FileUtils.writeStringToFile(arquivo, texto, "UTF-8");
    }
    
    protected abstract String getNomeArquivo();
    protected abstract T lerColunas(String[] colunas, int i);
    protected abstract String[] criarColunas(T model);
}
