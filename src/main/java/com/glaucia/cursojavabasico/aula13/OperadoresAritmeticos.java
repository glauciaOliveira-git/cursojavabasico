/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.cursojavabasico.aula13;

/**
 *
 * @author Glaucia Oliveira
 */
public class OperadoresAritmeticos {
    
    public static void main (String []args){
        
        int resultado = 1+2;
        System.out.println(resultado);
        
        resultado = resultado - 1;
         System.out.println(resultado);
         
         resultado = resultado *2;
          System.out.println(resultado);
          
          resultado = resultado/2;
           System.out.println(resultado);
           
           resultado = resultado + 8;
            System.out.println(resultado);
            
            resultado = resultado %7;
            // valor do resultado dividido por 5 eu quero saber o resto / mode
             System.out.println(resultado);
             
             String primeiroNome = "Esta é";
             String segundoNome = "uma String concatenada";
             String terceiroNome = primeiroNome+segundoNome;
             System.out.println(terceiroNome);
             
             resultado = resultado + 1;
              System.out.println(resultado);
              
              resultado ++;
               System.out.println(resultado);
               
               //3
                System.out.println(++resultado);
                 System.out.println(resultado++);
        
                  System.out.println(resultado);
                  
                  resultado --;
                  System.out.println(resultado);
                  
                  System.out.println(resultado--);
                   System.out.println(--resultado);
    }
    
}
