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
    private double PRECO;
    private double PRECO2;
    private double PERCENT;
    private String divisaoResto;
    private int numParcelas;

    public String getREFERENCIA() {
        return REFERENCIA;
    }

    public void setREFERENCIA(String REFERENCIA) {
        this.REFERENCIA = REFERENCIA;
    }

    public double getPRECO() {
        return PRECO;
    }

    public void setPRECO(double PRECO) {
        this.PRECO = PRECO;
    }

    public double getPRECO2() {
        return PRECO2;
    }

    public void setPRECO2(double PRECO2) {
        this.PRECO2 = PRECO2;
    }

    public double getPERCENT() {
        return PERCENT;
    }

    public void setPERCENT(double PERCENT) {
        this.PERCENT = PERCENT;
    }

    public String getDivisaoResto() {
        return divisaoResto;
    }

    public void setDivisaoResto(String divisaoResto) {
        this.divisaoResto = divisaoResto;
    }

    public int getNumParcelas() {
        return numParcelas;
    }

    public void setNumParcelas(int numParcelas) {
        this.numParcelas = numParcelas;
    }
    
}
