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

public class Exer6 {
    
    public static void main (String []args){
        
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Entre com o valor do raio do círculo:  ");
       double raio = scan.nextDouble();
       
       // área = pi r ao quadrado
       
       
       double area = Math.PI * Math.pow(raio,2);
        System.out.println("Essa é a área do círculo" + area);
        
        
        
    }
    
}
