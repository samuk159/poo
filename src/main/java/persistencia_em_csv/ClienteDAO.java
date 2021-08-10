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
import org.apache.commons.io.FileUtils;

/**
 *
 * @author samuk159
 */
public class ClienteDAO {
    
    private File arquivo = new File("dados/clientes.csv");
    private List<Cliente> clientes;

    public List<Cliente> ler() throws IOException {
        if (clientes == null) {
            List<String> linhas = Files.readAllLines(arquivo.toPath());
            clientes = new ArrayList<>();

            for (String linha : linhas) {
                if (!linha.trim().isEmpty()) {
                    String[] colunas = linha.split(",");

                    Cliente c = new Cliente();
                    c.setNome(colunas[0]);
                    c.setTelefone(colunas[1]);
                    c.setCpf(Long.parseLong(colunas[2]));

                    clientes.add(c);
                }
            }
        }
        
        return clientes;
    }
    
    public Cliente salvar(Cliente c) throws IOException {
        ler();
        clientes.add(c);
        salvarArquivo();
        return c;
    }
    
    private void salvarArquivo() throws IOException {
        String texto = "";
        
        for (Cliente c : clientes) {
            String[] colunas = { c.getNome(), c.getTelefone(), String.valueOf(c.getCpf()) };
            String linha = String.join(",", colunas);
            texto += linha + "\n";
        }
        
        FileUtils.writeStringToFile(arquivo, texto, "UTF-8");
    }
    
}
