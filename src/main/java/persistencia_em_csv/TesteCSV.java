/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistencia_em_csv;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author samuk159
 */
public class TesteCSV {    
    public static void main(String[] args) throws IOException {
        /*File arquivo = new File("dados/clientes.csv");
        List<String> linhas = Files.readAllLines(arquivo.toPath());
        
        for (String linha : linhas) {
            String[] colunas = linha.split(",");
            System.out.println(colunas[0]);
            System.out.println(colunas[1]);
            System.out.println(colunas[2]);
        }*/
        
        /*AlunoDAO dao = new AlunoDAO();
        List<Aluno> alunos = dao.ler();
        Aluno novoAluno = new Aluno(
            "Lucas", "(35) 4 4444-4444", 444_444_444_44l, 2
        );
        alunos.add(novoAluno);
        dao.salvarArquivo();*/
    }    
}
