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

public class Exer12 {
    
    public static void main (String []args){
           Scanner scan = new Scanner (System.in);
           
             System.out.println("Entre com a altura:  ");
           double altura = scan.nextDouble();
           
           double pesoIdeal = (72.7*altura)-58;
           System.out.println("Peso ideal será: "+ pesoIdeal);
           
           
        
    }
    
}
