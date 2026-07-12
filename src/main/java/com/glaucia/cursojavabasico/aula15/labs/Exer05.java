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
public class Exer05 {
    
     public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        
        
        
       System.out.println("Entre com a nota1 ");
       double nota1 = scan.nextDouble();
       
        System.out.println("Entre com a nota2 ");
       double nota2 = scan.nextDouble();
       
       double media = (nota1 + nota2)/2;
      
       
       if(media==10){
           
           System.out.println("APROVADO COM DISTINÇÃO ");
           
       }else if (media>=7){
           
           System.out.println("APROVADO ");
           
       }else{
           
            System.out.println("REPROVADO ");
           
       }
       
       
     }
     
    
}
