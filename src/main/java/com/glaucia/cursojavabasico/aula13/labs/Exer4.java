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

public class Exer4 {
    
    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        
         System.out.println("Digite a primeira nota:");
        double nota1 = scan.nextDouble();
        
        
         System.out.println("Digite a segunda nota:");
        double nota2 = scan.nextDouble();
        
        
         System.out.println("Digite a terceira nota:");
        double nota3 = scan.nextDouble();
        
        
         System.out.println("Digite a quarta nota:");
        double nota4 = scan.nextDouble();
        
        
        
        double media = (nota1+nota2+nota3+nota4)/4;
        
        System.out.println("A média das nots é: " +media);
        
    }
    
}
