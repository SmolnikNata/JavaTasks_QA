package hw28_06_24;

public class Main {
    public static void main(String[] args) {
        CalculatorInterface<Integer> intCalc = new CalculatorInt();
        System.out.println(intCalc.add(1, 2));  // 3
        System.out.println(intCalc.div(10, 2));  // 5

        CalculatorInterface<Double> doubleCalc = new CalculatorDouble();
        System.out.println(doubleCalc.add(1.1, 2.2));  // 3.3
        System.out.println(doubleCalc.div(10.0, 2.0));  // 5.0

        StringCalculator strCalc = new StringCalculator();
        System.out.println(strCalc.add("Hello", " World"));  // "Hello World"
        System.out.println(strCalc.multi("Hello", 3));  // "HelloHelloHello"
    }
}
