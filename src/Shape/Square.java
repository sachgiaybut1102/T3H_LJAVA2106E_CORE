package Shape;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double size) {
        super(size, size);
    }

    @Override
    public String getName(){
        return "Square";
    }
}
