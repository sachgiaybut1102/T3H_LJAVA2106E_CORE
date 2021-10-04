package Shape;


import java.util.ArrayList;
import java.util.Scanner;

public class MainShape {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        Shape[] shapes;

        int n;

        Shape maxP;// Chu vi lớn nhất
        Shape maxS;// Diện tích lớn nhất

        boolean flag;

        do {
            flag = true;

            System.out.print("Enter value of n (0 < n <= 50): ");
            n = scanner.nextInt();

            if (!(0 < n && n <= 50)) {
                System.out.println("The value you just entered is invalid, please try again!");
                flag = false;
            }
        } while (!flag);

        shapes = new Shape[n];

        for (int i = 0; i < shapes.length; i++) {
            int selection;

            System.out.println("List shapes:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Triangle");
            System.out.print("Choose shape:");

            selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    Circle circle = new Circle();
                    circle.setR(getInput("Enter the radius of circle: "));

                    shapes[i] = circle;
                    break;
                case 2:
                    Rectangle rectangle = new Rectangle();
                    rectangle.setWidth(getInput("Enter the with of rectangle: "));
                    rectangle.setHeight(getInput("Enter the height of rectangle: "));

                    shapes[i] = rectangle;
                    break;
                case 3:
                    Square square = new Square();
                    square.setWidth(getInput("Enter the with of rectangle: "));

                    shapes[i] = square;
                    break;

                case 4:
                    Triangle triangle = new Triangle();

                    triangle.setA(getInput("Enter the size A of triangle: "));
                    triangle.setB(getInput("Enter the size B of triangle: "));
                    triangle.setC(getInput("Enter the size C of triangle: "));

                    shapes[i] = triangle;
                    break;
                default:
                    break;
            }

        }

        maxP = shapes[0];
        maxS = shapes[0];

        for (Shape shape : shapes) {
            if (shape.Area() > maxS.Area()) {
                maxS = shape;
            }

            if (shape.Perimeter() > maxP.Perimeter()) {
                maxP = shape;
            }
        }

        System.out.println("The shape max Area have value = " + maxS.Area() + " and it's a " + getName(maxS));
        System.out.println("The shape max Perimeter have value = " + maxP.Area() + " and it's a " + getName(maxP));


        //BTVN:
        // 1.Bổ xung thêm phần nhập só lượng Shape và lựa chọn đó là hình gì (n <= 50)
        // 2.Kiểm tra hình có diện tích lớn nhất là hình gì?
        // 3.Kiểm tra hình có chu vi lớn nhất là hình gì?
    }

    static String getName(Shape shape) {
        if (shape instanceof Circle) {
            return "Circle";
        } else if (shape instanceof Rectangle) {
            return "Rectangle";
        } else if (shape instanceof Square) {
            return "Square";
        } else if (shape instanceof Triangle) {
            return "Triangle";
        } else {
            return "Unknown";
        }
    }

    static float getInput(String content) {
        Scanner sc = new Scanner(System.in);
        float num = 0;
        boolean flag;

        do {
            try {
                flag = true;

                System.out.print(content);

                num = sc.nextFloat();

                if (num < 0 ){
                    System.out.println("Input value must be greater than 0, please re-enter!");
                    flag = false;
                }
            } catch (Exception ex) {
                flag = false;
                sc.nextLine();
                System.out.println("Input value is not number, please re-enter!");
            }
        }while (!flag);

        return num;
    }
}
