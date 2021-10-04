import java.util.Scanner;


public class Main {
    //Hàm chính của chương trình
    public static void main(String[] agrs) {
//        /*//*/Bài tập về if else
//        int n = 1231239;
//
//        //B1: Viết chương trình kiểm tra n là số chẵn hay số lẻ
//        if(n % 2 == 0){
//            System.out.println("n la so chan!");
//        }else{
//            System.out.println("n la so le!");
//        }
//
//        //B2: Viết chương trình kiểm tra n là số dương hay số âm
//        if (n > 0){
//            System.out.println("n la so duong");
//        } else if (n < 0){
//            System.out.println("n la so am");
//        }else {
//            System.out.println("n = 0");
//        }*//*
//
//        //Cấu trúc rẽ nhánh switch - case
//        *//*int value = 10;
//
//        switch (value){
//            case 10:
//                System.out.println("10");
//                break;
//            case 1:
//                System.out.println("1");
//                break;
//            case 2:
//                System.out.println("2");
//                break;
//            default:
//                break;
//        }*//*
//
//        //Ví dụ: Nhập vào 1 tháng trong năm, kiểm tra mùa đó thuộc tháng mấy
//       *//* int month = 0;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Press month: ");
//        month = sc.nextInt();
//        String season = "";
//        switch (month){
//            case 1:
//            case 2:
//            case 3:
//                season = "Spring";
//                break;
//            case 4:
//            case 5:
//            case 6:
//                season = "Summer";
//                break;
//            case 7:
//            case 8:
//            case 9:
//                season = "Autumn";
//                break;
//            case 10:
//            case 11:
//            case 12:
//                season = "Winter";
//                break;
//            default:
//                season = "None";
//                break;
//        }
//
//        System.out.println("Season is " + season);*//*
//
//        //Vòng lặp
//        //for to do
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//        //While - là 1 vòng lặp có điều được xác định sẵn giá trị ban đầu
//        //Lưu ý, giá trị kiểm tra phải thay đổi sau mỗi lần lặp
//        //Trong trường hợp giá trị lặp không đổi thì vòng lặp nó sẽ trở thành
//        //vòng lặp vô vô hạn (loop)
//        int n = 10;
//        while (n > 0) {
//            System.out.println(n + n);
//            n--;
//        }
//        //Do - While - là vòng lặp cho chạy trước sau đó mới kiểm tra điều lặp sau
//        //Vòng lặp này thường được dùng cho mục địch nhập dữ liệu vì ban đầu dữ liệu
//        //hầu như chưa được xác định
//        Scanner sc = new Scanner(System.in);
//
//        int m;
//        boolean flag;
//        do {
//            flag = true;
//            System.out.print("Nhap vao m > 10 va <20");
//            m = sc.nextInt();
//
//            if (m <= 10 || m >= 20) {
//                flag = false;
//                System.out.println("gia tri vua nhap khong thoa man khoang gia tri, vui long nhap lai!!");
//            }
//        } while (!flag);
//
//        //Bài tập: Xây dựng lớp Square kế thừa từ Rectangle. Rectangle, Circle
//        //và Triangle kế thừa từ interface Shape. Trong Shape được khai báo
//        //2 phương thức Perimeter và Area.
//        //1.Tạo ra các hình và tính chu vi diện tích cho các hình đó
//        //2.Tìm hình có diện tích lớn nhất.
//        //3.Tìm hình có chu vi lớn nhất.
//        //Cả lớp làm trong vòng 15 phút. Sau đó mình sẽ chữa cùng các bạn!*/bạn
        test();
    }

    private static void hello() {
        //Viết ct nhập vào tên và hiển thị ra lời chào
        //Khởi tạo đối tượng lấy dữ liệu đầu vào từ bàn phím
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao ho ten cua ban: ");
        //Khởi tạo biến name và nhận giá trị nhập vào từ bàn phím
        String name = sc.nextLine();

        //Hiển thị lời chào cộng tên vừa nhập
        System.out.println("Xin chao " + name);
    }

    private static void testOperator() {
        int a = 9;
        int b = 3;

        System.out.println("a + b = " + a + " + " + b + " = " + (a + b));
        System.out.println("a - b = " + a + " - " + b + " = " + (a - b));
        System.out.println("a * b = " + a + " * " + b + " = " + (a * b));
        System.out.println("a / b = " + a + " / " + b + " = " + (a / b));
        System.out.println();
        System.out.println("a += b = " + a + " + " + b + " = " + (a += b));
        System.out.println("a -= b = " + a + " - " + b + " = " + (a -= b));
        System.out.println("a *= b = " + a + " * " + b + " = " + (a *= b));
        System.out.println("a /= b = " + a + " / " + b + " = " + (a /= b));
        System.out.println();
        System.out.println("a++ = " + a + " + 1 = " + (a++));
        System.out.println("a-- = " + a + " - 1 = " + (a--));
        System.out.println("++a = " + a + " + 1 = " + (++a));
        System.out.println("--a = " + a + " - 1 = " + (--a));
    }

    private static void conditionalStatement() {
        //Có 4 cách để sử dụng câu lệnh điều kiện
        //C1: Nếu điều kiện thỏa mãn thì mới thực thi câu lệnh thì ta dùng if
        //Ví dụ
        int n = 10;
        if (n == 10) {
            System.out.println("n = 10");
        }

        //C2: Nếu điều kiện thỏa mãn phủ định với điều kiện còn lại thì ta dùng if - else
        if (n == 10) {
            System.out.println("n = 10");
        } else {
            System.out.println("n != 10");
        }

        //C3: Nếu có nhiều điều kiện, điều kiện nào thoải mãn thì thực thi câu lệnh thì ta dùng if - else if
        if (n == 10) {
            System.out.println("n = 10");
        } else if (n > 10) {
            System.out.println("n > 10");
        }

        //C4: Điều kiện cuối cùng là phủ định của các điều kiện trên thì ta dùng if - else if - else
        if (n == 10) {
            System.out.println("n = 10");
        } else if (n > 10) {
            System.out.println("n > 10");
        } else {
            System.out.println("n < 10");
        }

        //BT Nhập vào 1 tháng trong năm thoải mãn điều kiện (month >=1 và month <= 12).
        // Kiểm tra và in ra mùa của tháng đó.
        //BT2: Viết 1 chương trình mô phỏng công tắc bật tắt đèn. (gợi ý dùng vòng lặp while).
    }

    private static void test() {
        //Immutable là không thể thay đổi
        // mutable là có thể thay đổi

        //String là 1 Immutable
        //Mỗi khi thao tác với String đều tạo ra 1 đối tượng mới
        //String str = "abc";
        //str += "xyz";

        //StringBuffer là 1 mutable
        StringBuffer str = new StringBuffer("abc");

        StringBuffer str1 = str;

        str.append("xyz");


        System.out.println("str: " + str);
        System.out.println("str1: " + str1);

    }
}
