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
public class Exer07 {
    
      public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        
        
        
       System.out.println("Entre com o primeiro número: ");
       int num1 = scan.nextInt();
       
         System.out.println("Entre com o segundo número: ");
       int num2 = scan.nextInt();
       
         System.out.println("Entre com o terceiro número: ");
       int num3 = scan.nextInt();
       
        //se num1>num2> E num1>num3 primeiro número maior
       //se num2>num1> E num2>num3 segundo número é maior
       // se num3>num1 e num3>num2 terceiro númro é maior
       
         if(num1>=num2 && num1>=num3){
           System.out.println("O primeiro número é maior: " +num1);
           
           
       }else if(num2>=num1 && num2>=num3){
         System.out.println("O segundo número é maior: " +num2);
         
       }else if(num3>=num1 && num3>=num2){
         System.out.println("O terceiro número é maior: " +num3);
       
       }  
       //se num1<num2 e num1<num3 primeiro número vai seu o menor
       //se num2<num1 E num2<num3 segundo número é menor
       // se num3<num1 e num3<num2 terceiro número é menor 
         
       
       
         if(num1<=num2 && num1<=num3){
           System.out.println("O primeiro número é menor: " +num1);
           
           
       }else if(num2<=num1 && num2<=num3){
         System.out.println("O segundo número é menor: " +num2);
         
       }else if(num3<=num1 && num3<=num2){
         System.out.println("O terceiro número é menor: " +num3);
       
       }  
      }
    
}
