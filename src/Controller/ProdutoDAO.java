/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Produto;
import Util.Conexao;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class ProdutoDAO extends Conexao {

    public List<Produto> listar() {
        em.getTransaction().begin();
        query = em.createNamedQuery("Produto.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }
}
