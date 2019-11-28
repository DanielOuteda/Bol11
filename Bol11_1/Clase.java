/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bol11_1;

/**
 *
 * @author doutedasolla
 */
public class Clase {

    private int valorPrimario;
    private int valorSecundario;

    public Clase() {
        valorPrimario = 5;
        valorSecundario = 10;
    }

    public Clase(int valp) {
        valorPrimario = valp;
        valorSecundario = 10;
    }

    public Clase(int valp, int vals) {
        valorPrimario = valp;
        valorSecundario = vals;
    }

    public int getPrimario() {
        return valorPrimario;
    }

    public int getSecundario() {
        return valorSecundario;
    }
}
