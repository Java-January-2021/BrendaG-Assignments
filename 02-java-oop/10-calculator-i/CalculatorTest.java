public class CalculatorTest {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setNum1(10.8);
        c.setNum2(10.2);
        c.setOperator('-');
        c.performOperation();
        c.getResults();
    }
}