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

public class Exer5 {
    
    public static void main (String []args){
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Entre com um número em metros: ");
    double metros = scan.nextDouble();
    
    double centimetros = metros*100;
     System.out.println("O número convertido em centímetros é:  " + centimetros);
    
    }
    
    
}
