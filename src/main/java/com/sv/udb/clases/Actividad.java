/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

/**
 *
 * @author JMagoSV
 */
public class Actividad {
    private int codi;
    private String nomb;

    public Actividad() {
    }

    public Actividad(int codi, String nomb) {
        this.codi = codi;
        this.nomb = nomb;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    @Override
    public String toString() {
        return nomb;
    }
    
}
