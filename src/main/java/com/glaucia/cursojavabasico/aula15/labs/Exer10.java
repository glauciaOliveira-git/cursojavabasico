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
public class Exer10 {
    
     public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        
       System.out.println("Entre com o turno que você estuda: ");
       String turno = scan.next();
       
       switch (turno ){
           
           case "m": 
           case "M": System.out.println("Bom dia!!!!");break;
           
             case "v": 
           case "V": System.out.println("Ba tarde!!!!");break;
           
             case "n": 
           case "N": System.out.println("Boa noite!!!!");break;
           
           default : System.out.println("valor inválido");
           
       }
       
       
       
       
     }
     
    
}
