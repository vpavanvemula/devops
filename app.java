public class Main {
    public static void main(String[] args) {
        // Output text to the console
        System.out.println("Hello, World!");

        // Variables and data types
        String name = "Pavan";
        int number = 5;

        // Calling a method
        int result = calculateSquare(number);
        System.out.println("The square of " + number + " is: " + result);

        // Conditional logic
        if (result > 20) {
            System.out.println(result + " is greater than 20.");
        } else {
            System.out.println(result + " is 20 or less.");
        }

        // Simple loop
        System.out.println("\nCounting from 1 to 3:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Count: " + i);
        }
    }

    // A helper method that takes an integer and returns its square
    public static int calculateSquare(int n) {
        return n * n;
    }
}
