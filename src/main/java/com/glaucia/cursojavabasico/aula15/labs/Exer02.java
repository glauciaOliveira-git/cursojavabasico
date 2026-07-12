/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.cursojavabasico.aula15.labs;

import java.util.Scanner;

/**
 *
 * @author Glaucia Oliveira
 */
public class Exer02 {
     public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        
        //se num >=0 positivo
        //se num < 0 negativo
        
       System.out.println("DIGITE UM NÚMERO: ");
       int num = scan.nextInt();
       
       if(num >=0){
           System.out.println("O NÚMERO É POSITIVO");
         
     }else{
           System.out.println("O NÚMERO É NEGATIVO");
           
       }
       
       
        
     }
     
    
}
