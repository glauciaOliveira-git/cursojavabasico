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
public class Exer03 {
      public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        
        //se num >=0 positivo
        //se num < 0 negativo
        
       System.out.println("Entre com a letra F ou M :  ");
       String input = scan.next();
       
       if(input.equalsIgnoreCase("f")){
       System.out.println("F = Feminino ");
       
      }else if (input.equalsIgnoreCase("m")){
      System.out.println("M = Masculino ");

}else{
       System.out.println("Sexo inválido ");
   
      }
    
}
}
