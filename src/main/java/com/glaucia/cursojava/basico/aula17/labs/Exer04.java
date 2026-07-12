/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.cursojava.basico.aula17.labs;

/**
 *
 * @author Glaucia Oliveira
 */
public class Exer04 {
    
     public static void main (String []args){
         
         //pais A população : 80000 taxa anual de crescimento 3%
         //pais B população : 200000 taxa anual de crescimento de 1.5%
         // numero de anos que o país A vai precisar para lacançar o numero de habitantes do país B
         
        double  popA = 80000;
         double popB = 200000;
         int cont = 0;
         
         while(popA<popB){
             popA += (popA/100)*3;
             popB += (popB/100)*1.5;
             cont ++;
         }
        System.out.println("População A:" +popA);
        System.out.println("População B:" +popB);
        System.out.println("Quantidaded de anos:" +cont);
     }
}
