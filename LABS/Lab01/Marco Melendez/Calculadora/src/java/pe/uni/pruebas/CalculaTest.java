/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.uni.pruebas;

import pe.uni.service.CalculaService;

public class CalculaTest {

    public static void main(String[] args) {

        //Valores
        double n1 = 20.55;
        double n2 = 55.88;
        //Proceso
        CalculaService service = new CalculaService();
        double suma = service.calcSuma(n1, n2);
        double resta = service.calcResta(n1, n2);
        double multiplicacion = service.calcMultiplicacion(n1, n2);
        double division = service.calcDivision(n1, n2);
        double resto = service.calcResto(n1, n2);
        //Reporte
        System.out.println("suma = " + suma);
        System.out.println("resta = " + resta);
        System.out.println("multiplicacion = " + multiplicacion);
        System.out.println("division = " + division);
        System.out.println("resto = " + resto);
    }

}
