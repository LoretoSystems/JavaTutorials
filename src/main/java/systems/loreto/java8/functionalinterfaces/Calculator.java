package systems.loreto.java8.functionalinterfaces;

@FunctionalInterface
interface CalculatorOperation {
    int calculate(int a, int b);
}

class Calculator {
    public int performOperation(int a, int b, CalculatorOperation operation) {
        return operation.calculate(a, b);
    }
}