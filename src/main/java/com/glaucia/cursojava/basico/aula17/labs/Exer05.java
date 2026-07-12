/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.cursojava.basico.aula17.labs;

/**
 *
 * @author Glaucia Oliveira
 */import java.util.Scanner;

public class Exer05 {
    
      public static void main (String []args){
          Scanner scan = new Scanner(System.in);
          boolean valido= false;
             double  popA;
         double popB ;
         double taxaA;
         double taxaB;
         int cont = 0;
          
          
          do{
            System.out.println("Digite o valor da população A:");
          popA = scan.nextDouble();
          if(popA>0){
              valido=true;
              
          }else{
           System.out.println("Digite o valor maior que zero: ");   
          }
                       
          }while(!valido);
          
          valido= false;
           do{
            System.out.println("Digite o valor da população b:");
          popB = scan.nextDouble();
          if(popB >0){
              valido=true;
              
          }else{
           System.out.println("Digite o valor maior que zero: ");   
          }
                       
          }while(!valido);
           
           
           
            valido= false;
           do{
            System.out.println("Digite o valor da Taxa A:");
         taxaA = scan.nextDouble();
          if(taxaA >0){
              valido=true;
              
          }else{
           System.out.println("Digite o valor maior que zero: ");   
          }
                       
          }while(!valido);
           
           
           
           
           
             valido= false;
           do{
            System.out.println("Digite o valor da Taxa B:");
         taxaB = scan.nextDouble();
          if(taxaB >0){
              valido=true;
              
          }else{
           System.out.println("Digite o valor maior que zero: ");   
          }
                       
          }while(!valido);
           
           while(popA<popB){
             popA += (popA/100)*taxaA;
             popB += (popB/100)*taxaB;
             cont ++;
             
           }
        System.out.println("População A:" +popA);
        System.out.println("População B:" +popB);
        System.out.println("Quantidaded de anos:" +cont);
      }
    
}
