// HelloWorld.java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Creating an instance of the Calculator class
        Calculator calculator = new Calculator();
        int sum = calculator.add(5, 10);
        System.out.println("Sum of 5 and 10 is: " + sum);
    }
}

// Calculator.java
class Calculator {
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }
}