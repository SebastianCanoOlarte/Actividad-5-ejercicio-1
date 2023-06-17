/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad5ejercicionumero1;


public class Notas {
    double[] ListaNotas;
    public Notas(){
        ListaNotas = new double[5];
    }
    double CalcularPromedio(){
        double suma = 0;
        for(int i = 0;i<ListaNotas.length;i++){
            suma = suma + ListaNotas[i];
        }
        return (suma/ListaNotas.length);
    }
    double CalcularDesviacion(){
        double Promedio = CalcularPromedio();
        double Suma =0;
        for (int i=0; i<ListaNotas.length;i++){
            Suma+= Math.pow(ListaNotas[i]-Promedio,2);
        }
        return Math.sqrt(Suma/ListaNotas.length);
    }
    double CalcularMenor(){
        double Menor = ListaNotas[0];
        for(int i = 0;i<ListaNotas.length;i++){
            if(ListaNotas[i]<Menor){
                Menor = ListaNotas[i];
            }
        }
        return Menor;
    }
    double CalcularMayor(){
        double Mayor = ListaNotas[0];
        for(int i = 0;i<ListaNotas.length;i++){
            if(ListaNotas[i]>Mayor){
                Mayor = ListaNotas[i];
            }
        }
        return Mayor;
    }
}
    
