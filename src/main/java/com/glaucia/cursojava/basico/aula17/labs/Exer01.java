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
public class Exer01 {
    
    
    public static void main (String []args){
        
        Scanner scan = new Scanner(System.in);
         boolean notaValida = false;
        
        do{
         
          System.out.println("Digite uma nota: ");
        double nota = scan.nextDouble();
 
        
        if (nota >= 0 && nota <= 10){
            notaValida = true;
         System.out.println("Você digitou a nota: " + nota); 
         
        }else{
          System.out.println("A nota é inválida!Digite novamente! ");  
        }  
        } while(!notaValida);
        
            
        
        
    
    
    
        }
}
