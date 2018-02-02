/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JMagoSV
 */
public class Manejador {
    List<Actividad> listActi;

    public Manejador() {
        this.listActi = new ArrayList<>();
    }
    
    public boolean guarActi(int codi, String nomb)
    {
        boolean resp = false;
        try {
            this.listActi.add(new Actividad(codi, nomb));
            resp = true;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return resp;
    }
    
    public List<Actividad> consTodo()
    {
        return this.listActi;
    }
    
    public List<Actividad> limp()
    {
        this.listActi.clear();
        return this.consTodo();
    }
}
