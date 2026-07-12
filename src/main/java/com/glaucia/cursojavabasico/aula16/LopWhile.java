/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.cursojavabasico.aula16;

/**
 *
 * @author Glaucia Oliveira
 */
public class LopWhile {
    
     public static void main (String[]args){
         
         int i = 1;
         int max = 10;
         
          System.out.println("Contando até: "+max);
          
          while (i<=max){
             System.out.println("Valor de i: "+i);  
              i++;//i = i+1
              
              
          }
          
          System.out.println(i); 
          
          do{
              i++;
            System.out.println("Valor de i: " +i);   
              
          }while (i<13);
          System.out.println(i);   
         
     }
    
}
