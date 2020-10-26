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
public class PorHora extends Empleado {
    private int hTrabajadas;
    private double pHora, pHExtra;

    public PorHora(int hTrabajadas, double pHora, double pHExtra) {
        super();
        this.hTrabajadas = hTrabajadas;
        this.pHora = pHora;
        this.pHExtra = pHExtra;
    }

    public PorHora() {
        this(0,0,0);
    }

    public int gethTrabajadas() {
        return hTrabajadas;
    }

    public void sethTrabajadas(int hTrabajadas) {
        this.hTrabajadas = hTrabajadas;
    }

    public double getpHora() {
        return pHora;
    }

    public void setpHora(double pHora) {
        this.pHora = pHora;
    }

    public double getpHExtra() {
        return pHExtra;
    }

    public void setpHExtra(double pHExtra) {
        this.pHExtra = pHExtra;
    }
    
    @Override
    public double liquidarNominaMes(){
       int he=0;
       if(this.hTrabajadas>40) he = this.hTrabajadas-40;
       
       return ((this.hTrabajadas-he)*this.pHora) + (he*this.pHExtra);
    }
}
