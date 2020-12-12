package com.company;

import java.util.Scanner;

public class DemSoSinhVienThiDo {

    public static void main(String[] args) {
	// write your code here
        int[] arr = new DemSoSinhVienThiDo().insert();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean pass = new DemSoSinhVienThiDo().checkPass(arr[i]);
            if (pass) {
                count++;
            }
        }
        System.out.printf("Co: %d Sinh vien do ki thi ",count);

    }
    public int[] insert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong sinh vien <30 ");
        int sizeA = scanner.nextInt();
        while (sizeA>30){
            System.out.println("vui long nhap lai so luong sinh vien <30");
            sizeA = scanner.nextInt();
        }
        int[] arrA = new int[sizeA];
        System.out.println("nhap diem thi theo thu tu");
        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = scanner.nextInt();
        }
        return arrA;
    }
    public boolean checkPass(int grade) {
        if (grade>=5){
            return true;
        }
        return false;
    }
}
