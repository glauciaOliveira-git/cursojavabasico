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
public class Exer04 {
    
     public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        
       System.out.println("Entre com a letra ");
       String letra = scan.next();
       
       if(letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||
               letra.equalsIgnoreCase("o")|| letra.equalsIgnoreCase("u")){       
         System.out.println("É vogal!!!");   
       }else{
          System.out.println("É uma consoante!!!");   
       }
       
     }
     
    
}
