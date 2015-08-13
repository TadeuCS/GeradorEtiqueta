/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Filiais;
import Util.Conexao;

/**
 *
 * @author Tadeu
 */
public class FiliaisDAO extends Conexao {

    public Filiais buscar(String cnpj) {
        em.getTransaction().begin();
        query = em.createNamedQuery("Filiais.findByCgc").setParameter("cgc", cnpj);
        em.getTransaction().commit();
        return (Filiais) query.getSingleResult();
    }
    public Filiais getFirst() {
        em.getTransaction().begin();
        query = em.createQuery("SELECT f FROM Filiais f WHERE f.codempresa='00'");
        em.getTransaction().commit();
        return (Filiais) query.getSingleResult();
    }
}
