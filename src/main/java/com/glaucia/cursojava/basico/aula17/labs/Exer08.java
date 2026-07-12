/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.cursojava.basico.aula17.labs;

import java.util.Scanner;

/**
 *
 * @author Glaucia Oliveira
 */
public class Exer08 {
    
     public static void main (String []args){
        
        Scanner scan = new Scanner(System.in);
        int num;
        int soma=0;
        double media; 
                
                
          for(int i = 0; i<5; i++){
            System.out.println("Digite um número: ");
            num = scan.nextInt();
            soma += num;
            
          }
        media = soma/5;
        
         System.out.println("A soma dos números é: "+soma);
          System.out.println("A média dos números é:"+media);
     }
     
    
}
