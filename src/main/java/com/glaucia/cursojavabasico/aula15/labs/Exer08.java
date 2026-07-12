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
public class Exer08 {
    
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        
        
        
       System.out.println("Entre com o preço do produto 1: ");
       double prod1 = scan.nextDouble();
       
         System.out.println("Entre com o preço do produto 2: ");
       double prod2 = scan.nextDouble();
       
         System.out.println("Entre com o preço do produto 3: ");
       double prod3 = scan.nextDouble();
       
       
         if(prod1<=prod2 && prod1<=prod3){
           System.out.println("O primeiro produto é o mais em conta: " +prod1);
           
           
       }else if(prod2<=prod1 && prod2<=prod3){
         System.out.println("O segundo produto é o mais em conta: " +prod2);
         
       }else if(prod3<=prod1 && prod3<=prod2){
         System.out.println("O terceiro produto é o mais em conta: " +prod3);
       
       }  
       
    }
    
    
}
