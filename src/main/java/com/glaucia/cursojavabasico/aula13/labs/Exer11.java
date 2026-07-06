/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.cursojavabasico.aula13.labs;

/**
 *
 * @author Glaucia Oliveira
 */
import java.util.Scanner;

public class Exer11 {
    
      public static void main (String []args){
        
         Scanner scan = new Scanner (System.in);
         
           System.out.println("Entre com o valor do primeiro n[umero inteiro:  ");
           int int1 = scan.nextInt();
           
             System.out.println("Entre com o valor do segundo número inteiro:  ");
           int int2 = scan.nextInt();
           
           System.out.println("Entre com o valor do número real:  ");
           double real1 = scan.nextDouble();
            
           int resultado1 = (2*int1) *( 2/int2);
           
           double resultado2 = (3*int1) + real1;
           
           double resultado3 = Math.pow(real1, 3);
           
            System.out.println("Resultado1 è:  " +resultado1);
           System.out.println("Resultado2 è:  " +resultado2); 
         System.out.println("Resultado3 è:  " +resultado3);
         
         
      }
      
    
}
