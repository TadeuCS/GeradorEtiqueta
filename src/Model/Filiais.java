/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tadeu
 */
@Entity
@Table(name = "FILIAIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Filiais.findByCgc", query = "SELECT f FROM Filiais f WHERE f.cgc = :cgc")})
public class Filiais implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODEMPRESA")
    private String codempresa;
    @Column(name = "NOMEEMPRESA")
    private String nomeempresa;
    @Column(name = "CGC")
    private String cgc;

    public Filiais() {
    }

    public Filiais(String codempresa) {
        this.codempresa = codempresa;
    }

    public String getCodempresa() {
        return codempresa;
    }

    public void setCodempresa(String codempresa) {
        this.codempresa = codempresa;
    }

    public String getNomeempresa() {
        return nomeempresa;
    }

    public void setNomeempresa(String nomeempresa) {
        this.nomeempresa = nomeempresa;
    }

    public String getCgc() {
        return cgc;
    }

    public void setCgc(String cgc) {
        this.cgc = cgc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codempresa != null ? codempresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Filiais)) {
            return false;
        }
        Filiais other = (Filiais) object;
        if ((this.codempresa == null && other.codempresa != null) || (this.codempresa != null && !this.codempresa.equals(other.codempresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Filiais[ codempresa=" + codempresa + " ]";
    }
    
}
