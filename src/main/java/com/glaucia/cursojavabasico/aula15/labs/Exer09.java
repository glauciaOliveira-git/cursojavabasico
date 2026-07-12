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
public class Exer09 {
    
      public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        
        
        
       System.out.println("Entre com o primeiro número: ");
       int num1 = scan.nextInt();
       
         System.out.println("Entre com o segundo número: ");
       int num2 = scan.nextInt();
       
         System.out.println("Entre com o terceiro número: ");
       int num3 = scan.nextInt();
       
       //se num1>=num2 e num1>=num3 e num3>=num2
       
       if(num1<=num2 && num1<=num3 && num2<=num3){
         System.out.println(num3 + "  -  " + num2 + " - "  + num1 +  " - " );  
         
         
       }else if (num2<=num1 && num2<=num3 && num1<=num3){
         System.out.println(num3 + "  -  " + num1 + " - "  + num2 +  " - " );  
           
       
       
        }else if (num2<=num1 && num2<=num3 && num3<=num1){
         System.out.println(num1 + "  -  " + num3 + " - "  + num2 +  " - " );  
         
         
           
       }else if (num3<=num1 && num3<=num2 && num1<=num2){
         System.out.println(num2 + "  -  " + num1 + " - "  + num3 +  " - " );
         
           
       }else if (num3<=num1 && num3<=num2 && num2<=num1){
         System.out.println(num1 + "  -  " + num2 + " - "  + num3 +  " - " );  
         
       }
       
       
       
       
      }
      
}

