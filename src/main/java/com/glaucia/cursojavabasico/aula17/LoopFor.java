/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.cursojavabasico.aula17;

/**
 *
 * @author Glaucia Oliveira
 */
public class LoopFor {
    
      @SuppressWarnings("empty-statement")
      public static void main (String[]args){
          
          for(int i = 0;i<5; i++ ){
              System.out.println("O valor de i é: " +i);
              
          }
          
           for(int i = 5;i>=0; i-- ){
              System.out.println("O valor de i é: " +i);
           }
           
           
           for (int i=0, j = 10;i<j ;i++,j--){
               
          System.out.println("i= "+i+";j="+j);
           }
           
           
           
           int count = 0;
           for(;count<10 ;){
               System.out.println("Valor de count:  "+count);
               count +=2;
               
           }
           
           
           for( int cont=0; cont<10; cont+=2){
             System.out.println("Valor de count:  "+cont);  
               
           }
           
           //pode ser usado o for sem as chaves, mas não é recomendado
           //funciona quando tem só um bloco de comando
           int soma = 0;
           for(int i = 0;i<5;soma+= i++);
             System.out.println("Valor de soma:  "+soma); 
             
      }
    
}
