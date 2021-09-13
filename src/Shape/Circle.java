package Shape;

public class Circle implements Shape {
    private float r;

    public Circle() {
        r = 0;
    }

    public Circle(float r) {
        this.r = r;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    @Override
    public double Perimeter() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double Area() {
        return 2 * Math.PI * r;
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
