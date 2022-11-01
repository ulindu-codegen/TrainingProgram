package week_7.task3;

public class CalculatorTest {

    public static void main(String[] args) {

        Calculator cal1 = new Calculator();

        cal1.addition(2, 3);
        cal1.addition(2, 3, 4);
        cal1.addition(2.35, 4.567);
        cal1.addition(2, 2.34);
        cal1.addition(2, 2.45, 3);

    }

}
