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
public class Exer3 {
    
      public static void main (String []args){
           Scanner scan = new Scanner(System.in);
           
            System.out.println("Digite um número:");
             int numero1 = scan.nextInt();
             
             System.out.println("Digite outro número:"); 
           int numero2 = scan.nextInt();
           
           int resultado = numero1+numero2;
           
           System.out.println("A soma dos dois números é: " + resultado);
      }
    
}
