/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.cursojavabasico.aula15.labs;

import java.util.Scanner;

/**
 *
 * @author Glaucia Oliveira
 */
public class Exer11 {
    
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        
       System.out.println("Entre com o salário do trabalhador: ");
       double salario = scan.nextDouble();
      int percentual = 0;
       
       if (salario<=280.00){
           percentual =20;
           
       }else if (salario>280.00 && salario<=700.00){
           percentual = 15;
           
       }else if (salario>700.00 && salario<=1500.00){
           percentual = 15;
           
       }else if (salario>=1500.00){
           percentual = 5;
           
       }
       
       double aumento = (salario/100)* percentual;
               double salarioAjustado = salario + aumento;
               
                       
                       
       System.out.println("Salário: "+salario);
       
       System.out.println("Percentual: "+ percentual);
       
       System.out.println("Aumento: "+aumento);
       
       System.out.println("Salário Ajustado: "+salarioAjustado);
    }
    
    
}
