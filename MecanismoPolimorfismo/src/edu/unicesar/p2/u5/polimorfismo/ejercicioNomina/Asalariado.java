package edu.unicesar.p2.u5.polimorfismo.ejercicioNomina;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author jairo
 */
public class Asalariado extends Empleado {
    private double pSemanal;

    public Asalariado(double pSemanal) {
        super();
        this.pSemanal = pSemanal;
    }

    public Asalariado() {
        this(0);
    }

    public double getpSemanal() {
        return pSemanal;
    }

    public void setpSemanal(double pSemanal) {
        this.pSemanal = pSemanal;
    }
    
    @Override
    public double liquidarNominaMes(){
        return this.pSemanal * 4;
    }
    
}
