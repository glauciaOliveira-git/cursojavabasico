/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.cursojava.basico.aula17.labs;

import java.util.Scanner;

/**
 *
 * @author Glaucia Oliveira
 */
public class Exer03 {
    
      public static void main (String []args){
          Scanner scan = new Scanner(System.in);
        boolean infValida=false;
        String name;
        int idade;
        double salario;
        String sexo;
        String estCivil;
          
          do{
              System.out.println("Digite o nome: ");
              name = scan.next();
              
              if(name.length()>=3){
                 infValida = true;
                 
              }else{
                System.out.println("Digite o nome com no mínimo 3 caracteres: ");  
              }
              }while(!infValida);
         
          
          
 
           infValida=false;
              do{
                  
              System.out.println("Digite a idade: "); 
              idade = scan.nextInt();
              if (idade >0 &&idade <150){
                infValida = true;  
                
              }else{
                   System.out.println("Digite a idade entre 0 e 150: ");    
                      }
              
              }while(!infValida);
              
              
              
              
              infValida=false;
                do{
              System.out.println("Digite o salário: ");
              salario = scan.nextDouble();
              if (salario > 0){
                  infValida = true;   
              }else{
                System.out.println("Digite o salário maior que zero: ");   
              }
              
                }while( !infValida);
                
                
                
                
                   infValida=false;
              do{
                
              System.out.println("Digite o sexo:  ");   
              sexo = scan.next();
              if (sexo.equalsIgnoreCase("f")|| sexo.equalsIgnoreCase("m")){
                  infValida = true;   
             
              }else{
                 System.out.println("Digite f para sexo feminino e m para sexo masculino: ");    
              }
              
              
              }while(!infValida);
              
              
              
                  infValida=false;
              do{
                  
                  
              System.out.println("Digite o Estado civil:");   
              estCivil = scan.next();
              
              if(estCivil.equalsIgnoreCase("c")||estCivil.equalsIgnoreCase("v")||
                      estCivil.equalsIgnoreCase("s")||estCivil.equalsIgnoreCase("d")){
                   infValida = true; 
              }else{
               System.out.println("Digite o Estado civil: C- Casada, v - Viúva, -s - Solteira e d - Divorciada: "); 
              }
              }while(!infValida); 
              
              
           System.out.println("Nome:"+ name); 
           System.out.println("Idade:"+ idade);
           System.out.println("salario:"+ salario);
           System.out.println("Sexo:"+ sexo);
           System.out.println("Estado Civil:"+ estCivil);
      }
    
}
