/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.cursojavabasico.aula13.labs;

/**
 *
 * @author Glaucia Oliveira
 */

import java.util.Scanner;

public class Exer7 {
    
    public static void main (String []args){
       Scanner scan = new Scanner(System.in);
       
       System.out.println(" Entre com o valor do lado do quadrado: ");
       double lado = scan.nextDouble();
       
       double areaQ = Math.pow(lado, 2);
       System.out.println(" A área do quadrado é: " + areaQ);
          System.out.println(" O dobro da área do quadrado é: " + areaQ*2);
          
          
    }
    
}
