package week_7.task1;

class Area extends Shape {

    int breadth, length, sideLength, radius;

    public int RectangleArea() {
        return breadth * length;
    }

    public int SquareArea() {
        return sideLength * sideLength;
    }

    @Override
    public double CircleArea() {
        return (22 / 7) * radius;
    }

}
