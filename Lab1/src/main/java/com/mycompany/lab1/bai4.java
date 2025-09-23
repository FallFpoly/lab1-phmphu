/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai4 {

    public static void main(String[] args) {
          // sinh viên code ở đây
          Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("nhap a: ");
        a=sc.nextInt();
        System.out.println("nhap b: ");
        b=sc.nextInt();
        System.out.println("nhap c: ");
        c=sc.nextInt();
        double TrungBinh=(a+b+c)/3;
        System.out.println("Trung binh: "+TrungBinh);
    }
}
