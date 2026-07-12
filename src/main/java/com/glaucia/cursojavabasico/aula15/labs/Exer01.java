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
public class Exer01 {
    
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        
      
          System.out.println("Entre com o primeiro número: ");
           int num1 = scan.nextInt();
        
         System.out.println("Entre com o segundo número: ");
           int num2 = scan.nextInt();
           
           if(num1 > num2){
               System.out.println("PRIMEIRO NÚMERO É MAIOR: "+ num1);
           }else if (num2> num1){
               System.out.println("SEGUNDO NÚMERO É MAIOR: "+ num2); 
           }
        
    }
    
    
}
