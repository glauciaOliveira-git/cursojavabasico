/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.cursojavabasico.aula13.labs;

/**
 *
 * @author Glaucia Oliveira
 */import java.util.Scanner;

public class Exer10 {
    
    public static void main (String []args){
        
         Scanner scan = new Scanner (System.in);
         
          System.out.println("Entre com o valor dos graus em Celcius: ");
         double valorC = scan.nextDouble();
         
         //	(0 °C × 9/5) + 32 = 32 °F

         
         double valorConvertido = (valorC*9/5)+32;
         System.out.println("O valor convertido em  Farenheit è:   "+ valorConvertido);
         
         
    }
    
}
