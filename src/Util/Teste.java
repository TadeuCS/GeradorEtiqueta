/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.text.NumberFormat;

/**
 *
 * @author Tadeu
 */
public class Teste {

    public static void main(String[] args) {
        double valor = 10.2;
        try {
            String valorString=NumberFormat.getCurrencyInstance().format(valor);
            System.out.println(valorString);
            System.out.println(valorString.replace("R$ ", "").replace(".", "").replace(",", "."));
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println();
    }

}
