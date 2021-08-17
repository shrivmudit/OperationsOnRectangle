public class Rectangle {
    int Length, width;

    public Rectangle(int Length, int width) {
        this.Length = Length;
        this.width = width;
    }

    public int area() {
        return Length*width;
    }

    public int perimeter() {
        return 2*(Length+width);
    }
}
