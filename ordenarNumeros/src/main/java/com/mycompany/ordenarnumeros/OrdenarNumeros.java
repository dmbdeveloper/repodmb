/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenarnumeros;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class OrdenarNumeros {

    public static void main(String[] args)  {
        
    
        
        Scanner sc = new Scanner(System.in);
        String s="";
        while(sc.hasNext()){
        s = s + (Integer.toString(sc.nextInt()) + " ");
        }
        
        String [] string = s.split(" ");
        int [] x = new int [string.length];
        Scanner scan = new Scanner(s);
        int contador = 0;
        while(scan.hasNext()){
        x[contador] = scan.nextInt();
        contador++;
        }     
        Arrays.sort(x);
        
        for (int i = 0; i <= (x.length-1);i++){
        System.out.println(x[i]);
        }
        
    }
}

