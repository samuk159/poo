/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistencia_em_csv.dao;

import persistencia_em_csv.model.BaseModel;
import persistencia_em_csv.model.Curso;

/**
 *
 * @author samuk159
 */
public class CursoDAO extends BaseDAO<Curso> {
    @Override
    protected String getNomeArquivo() {
        return "cursos";
    }

    @Override
    protected Curso lerColunas(String[] colunas, int i) {
        Curso c = new Curso();
        c.setId(i);
        c.setNome(colunas[0]);
        if (!colunas[1].isEmpty() && !colunas[1].equals("null"))
            c.setDuracao(Integer.parseInt(colunas[1]));
        
        return c;
    }

    @Override
    protected String[] criarColunas(Curso model) {
        return new String[] {
          model.getNome(),
          String.valueOf(model.getDuracao())
        };
    }
}
