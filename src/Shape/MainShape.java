package Shape;


import java.util.ArrayList;

public class MainShape {
    public static void main(String[] agrs){
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(20,30);
        Square square = new Square(20);
        Triangle triangle = new Triangle(20,30,40);

        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(square);
        shapes.add(triangle);

        double maxP = -1;// Chu vi lớn nhất
        double maxS = -1;// Diện tích lớn nhất

        for (Shape shape: shapes) {
            double area = shape.Area();
            double perimeter = shape.Perimeter();

            if(area > maxS){
                maxS = area;
            }

            if (perimeter > maxP){
                maxP = perimeter;
            }
        }

        if (maxP != -1){
            System.out.println("Chu vi lon nhat = " + maxP);
        } else{
            System.out.println("Khong tim thay chu vi lon nhat!");
        }

        if(maxS != -1){
            System.out.println("Dien tich lon nhat = " + maxS);
        }else {
            System.out.println("Khong tim thay dien tich lon nhat!");
        }

        //BTVN:
        // 1.Bổ xung thêm phần nhập só lượng Shape và lựa chọn đó là hình gì (n <= 50)
        // 2.Kiểm tra hình có diện tích lớn nhất là hình gì?
        // 3.Kiểm tra hình có chu vi lớn nhất là hình gì?
    }
}
