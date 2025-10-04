/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai2 {

    public static void main(String[] args) {
          // sinh viên code ở đây
          Scanner sc=new Scanner(System.in);
        double cd,cr,ChuVi;
        System.out.println("nhap chieu dai: ");
        cd=sc.nextDouble();
        System.out.println("nhap chieu rong: ");
        cr=sc.nextDouble();
        ChuVi=(cd+cr)*2;
        System.out.println("chu vi hcn: "+ChuVi);
    }
}
