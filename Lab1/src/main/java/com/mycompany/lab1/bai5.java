/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai5 {

    public static void main(String[] args) {
         // sinh viên code ở đây
         Scanner sc=new Scanner(System.in);
        double a,b,c;
        System.out.println("nhap a: ");
        a=sc.nextDouble();
        System.out.println("nhap b: ");
        b=sc.nextDouble();
        System.out.println("nhap c: ");
        c=sc.nextDouble();
        double delta=b*b-4*a*c;
        System.out.println("can delta: "+Math.sqrt(delta));
    }
}
