import java.util.Locale;
import java.util.Scanner;

public class MainPractice {
    public static void main(String[] agrs) {
        // timUSCLNVaBSCNN();
        tongCacUoc();
        thoiGian();
    }

    private static void thoiGian() {
        int gio = nhapThoiGian(0, 23, "Gio");
        int phut = nhapThoiGian(0, 59, "Phut");
        int giay = nhapThoiGian(0, 59, "Giay");

        System.out.println("Thoi gian vua nhap la: " + gio + " gio " + phut + " phut " + giay + " giay");
    }

    private static int nhapThoiGian(int giaTriNN, int giaTriLN, String ten) {
        boolean flag;
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            flag = true;
            System.out.print("Nhap vao so " + ten.toLowerCase() + ": ");
            n = scanner.nextInt();

            if (!(giaTriNN <= n && n <= giaTriLN)) {
                System.out.println(ten + " phai nam trong khoang tu " + giaTriNN + " den " + giaTriLN + ", vui long nhap lai!");
                flag = false;
            }
        } while (!flag);

        return n;
    }

    private static void tongCacUoc() {
        int n = 100;
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                tong += i;
            }
        }

        System.out.println("Tong cac uoc cua " + n + " = " + tong);
    }

    private static void timUSCLNVaBSCNN() {
        int a = 10;
        int b = 30;
        int uscln = uscln(a, b);
        System.out.print("USCLN cua " + a + " va " + b + " la: " + uscln);
        System.out.println();
        System.out.print("BSCNN cua " + a + " va " + b + " la: " + (a * b) / uscln);

    }

    private static int uscln(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }

        return a;
    }
}
