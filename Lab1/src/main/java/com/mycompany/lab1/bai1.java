/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai1 {

    public static void main(String[] args) {
        // sinh viên code ở đây
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap ho ten: ");
        String hoTen=sc.nextLine();
        System.out.println("diem trung binh: ");
        double diemTB=sc.nextDouble();
        System.out.printf("%S,%.2lf diem\n",hoTen,diemTB);
    }
}
