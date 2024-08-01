package hw28_06_24;
// Калькулятор для  строк

public class StringCalculator implements CalculatorInterface<String>{
    @Override
    public String add(String a, String b) {
        return a + b;
    }

    @Override
    public String sub(String a, String b) {
        throw new UnsupportedOperationException("Subtraction is not supported for strings.");
    }
    @Override
    public String multi(String a, String b) {
        throw new UnsupportedOperationException("Multiplication is not supported for strings.");
    }


    public String multi(String a, Integer b) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < b; i++) {
            result.append(a);
        }
        return result.toString();
    }

    @Override
    public String div(String a, String b) {
        throw new UnsupportedOperationException("Division is not supported for strings.");
    }

}
