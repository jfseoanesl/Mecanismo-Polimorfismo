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
public class PorComision extends Empleado {
    private double tVentas, pComision;

    public PorComision(double tV, double pC) {
        super();
        this.tVentas = tV;
        this.pComision = pC;
    }

    public double gettVentas() {
        return tVentas;
    }

    public void settVentas(double tVentas) {
        this.tVentas = tVentas;
    }

    public double getpComision() {
        return pComision;
    }

    public void setpComision(double pComision) {
        this.pComision = pComision;
    }
    
    @Override
    public double liquidarNominaMes(){
        return this.tVentas * this.pComision;
    }
    
}
