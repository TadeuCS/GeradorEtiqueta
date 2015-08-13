/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Tadeu
 */
public class Etiqueta {
    private String REFERENCIA;
    private String PRECO;
    private String PRECO2;
    private double PERCENT;
    private String DIFERENCA;
    private int numParcelas;
    private String PARCELA;
    private String DESCRICAO;

    public String getDESCRICAO() {
        return DESCRICAO;
    }

    public void setDESCRICAO(String DESCRICAO) {
        this.DESCRICAO = DESCRICAO;
    }

    public String getPARCELA() {
        return PARCELA;
    }

    public void setPARCELA(String PARCELA) {
        this.PARCELA = PARCELA;
    }

    public String getREFERENCIA() {
        return REFERENCIA;
    }

    public void setREFERENCIA(String REFERENCIA) {
        this.REFERENCIA = REFERENCIA;
    }

    public String getPRECO() {
        return PRECO;
    }

    public void setPRECO(String PRECO) {
        this.PRECO = PRECO;
    }

    public String getPRECO2() {
        return PRECO2;
    }

    public void setPRECO2(String PRECO2) {
        this.PRECO2 = PRECO2;
    }

    public double getPERCENT() {
        return PERCENT;
    }

    public void setPERCENT(double PERCENT) {
        this.PERCENT = PERCENT;
    }

    public String getDIFERENCA() {
        return DIFERENCA;
    }

    public void setDIFERENCA(String DIFERENCA) {
        this.DIFERENCA = DIFERENCA;
    }

    public int getNumParcelas() {
        return numParcelas;
    }

    public void setNumParcelas(int numParcelas) {
        this.numParcelas = numParcelas;
    }

}
