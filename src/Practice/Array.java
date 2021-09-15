package Practice;

import java.util.Scanner;

public class Array {
    //Bài 1: Viết chương trình cho phép nhập n số và in ra theo thứ tự ngược lại.
    //Ví dụ: nhập 3,6,7 thì in ra 7,6,3
    //----------------------------------
    //Bài 2: Viết chương trình cho phép nhập n số (0 < n <= 100)
    //a, Tính tổng các số chẵn và các số lẻ.
    //b, Tính hiệu của số chẵn và số lẻ.
    //c, Tìm các số xuất hiện 1 lần trong mảng và in ra
    //d, Tìm số có trong mảng nhiều nhất
    //e, Tìm số lớn nhất và nhỏ nhất trong mảng và hiển thị vị trí của số đó.
    //f, Tìm và hiển thị các số là số nguyên tố trong mảng
    //l, In dãy số không bị lặp số nào trong mảng.
    //----------------------------------
    private int[] numbers;
    Scanner sc = new Scanner(System.in);

    public void ex1() {
        initArray();
        setValueToArray();
        display();
        reverseDisplay();
    }

    public void ex2(){
        initArray();
        setValueToArray();
        display();

        float totalEvenNumber = totalEvenNumber();
        float totalOddNumber = totalOddNumber();

        System.out.println("Cau a:");
        System.out.println("Tong cac so chan trong mang la: " + totalEvenNumber);
        System.out.println("tong cac so le trong mang la: " + totalOddNumber);
        System.out.println("Cau b:");
        System.out.println("Hieu giua tong cac so chan va tong cac so le la: " + (totalEvenNumber - totalOddNumber));
    }

    private void initArray(){
        int n;
        boolean flag;
        do {
            flag = true;

            System.out.print("Nhap vao n phan tu: ");
            n = sc.nextInt();

            if (!(0 < n && n <= 100)) {
                System.out.println("n phai nam trong khoang (0 < n <= 100), vui long nhap lai!");
                flag = false;
            }

        } while (!flag);

        numbers = new int[n];
    }

    private void setValueToArray(){
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("A[" + i + "] = ");
            numbers[i] = sc.nextInt();
        }
    }

    private void display(){
        System.out.print("Day so vua moi nhap la: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);

            if (i < numbers.length - 1) {
                System.out.print(", ");
            } else {
                System.out.print(". ");
            }
        }
        System.out.println();
    }

    private void reverseDisplay(){
        System.out.print("Day so theo thu tu nguoc la: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);

            if (i > 0) {
                System.out.print(", ");
            } else {
                System.out.print(". ");
            }
        }
    }

    private int totalEvenNumber(){
        int total = 0;
        for (int num :
             numbers) {
            if (num % 2 == 0){
                total += num;
            }
        }

        return total;
    }

    private int totalOddNumber(){
        int total = 0;
        for (int num :
                numbers) {
            if (num % 2 != 0){
                total += num;
            }
        }

        return total;
    }
}
