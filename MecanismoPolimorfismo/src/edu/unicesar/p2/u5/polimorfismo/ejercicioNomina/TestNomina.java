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
public class TestNomina {
    public static void main(String arg[]){
        
        Empleado nomina[] = new Empleado[4] ;
        
        Empleado a = new Asalariado(1000);
        nomina[0]=a;
        Empleado b = new PorHora(60, 100, 200);
        nomina[1]=b;
        Empleado c = new PorHora(30, 500, 700);
        nomina[2]=c;
        Empleado d = new PorComision(50000, 0.5);
        nomina[3]=d;
        
        double total =0;
        int n=1;
        for(int i=0; i<nomina.length;i++){
            
            System.out.printf("Nomina empleado %d=%.2f\n", n, nomina[i].liquidarNominaMes());
            total+=nomina[i].liquidarNominaMes();
            n++;
        }
        System.out.println("--------------------------------");
        System.out.println("Total por Nomina: " + total);
    }
}
