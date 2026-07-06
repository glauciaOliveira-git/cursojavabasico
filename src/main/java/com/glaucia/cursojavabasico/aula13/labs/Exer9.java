/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.cursojavabasico.aula13.labs;



/**
 *
 * @author Glaucia Oliveira
 */ import java.util.Scanner;

public class Exer9 {
    
    public static void main (String []args){
        
         Scanner scan = new Scanner (System.in);
         
         System.out.println("Entre com o valor dos graus em Farenheit: ");
         double valorF = scan.nextDouble();
         
         double valorConvertido = (5*(valorF-32)/9);
         System.out.println("O valor convertido em Celsius è:   "+ valorConvertido);
         
         
    }
    
}
