package ch06;

public class CalculatorExam {
    public static void main(String[] args) {
        Calculator Cal = new Calculator();
        Cal.powerOn();

        int result = Cal.plus(5,6);
        System.out.println(result);

        int x=10;
        int y=4;
        double result2=Cal.divide(x,y);
        System.out.println(result2);

        double result1 = Cal.areaRectangle(7);
        System.out.println(result1);
        result1 = Cal.areaRectangle(5,6);
        System.out.println(result1);
    }
}
