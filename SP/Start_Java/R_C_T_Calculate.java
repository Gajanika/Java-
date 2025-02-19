import java.util.Scanner;

class All {

    // Method to calculate the area of a rectangle
    public void calculateRectangleArea(double length, double width) {
        double area = length * width;
        System.out.println("The area of the Rectangle is: " + area);
    }

    // Method to calculate the area of a triangle
    public void calculateTriangleArea(double base, double height) {
        double area = 0.5 * base * height;
        System.out.println("The area of the Triangle is: " + area);
    }

    // Method to calculate the area of a circle
    public void calculateCircleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("The area of the Circle is: " + area);
    }

    public static void main(String[] args) {
        All calculator = new All();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Ask the user for their choice
            System.out.println("What area would you like to calculate?");
            System.out.println("Enter C for Circle, T for Triangle, R for Rectangle, or Q to quit:");
            String choice = scanner.next().toUpperCase();

            switch (choice) {
                case "C": // Circle
                    System.out.println("Enter the radius of the Circle:");
                    double radius = scanner.nextDouble();
                    calculator.calculateCircleArea(radius);
                    break;

                case "T": // Triangle
                    System.out.println("Enter the base of the Triangle:");
                    double base = scanner.nextDouble();
                    System.out.println("Enter the height of the Triangle:");
                    double height = scanner.nextDouble();
                    calculator.calculateTriangleArea(base, height);
                    break;

                case "R": // Rectangle
                    System.out.println("Enter the length of the Rectangle:");
                    double length = scanner.nextDouble();
                    System.out.println("Enter the width of the Rectangle:");
                    double width = scanner.nextDouble();
                    calculator.calculateRectangleArea(length, width);
                    break;

                case "Q": // Quit
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;

                default: // Invalid input
                    System.out.println("Invalid choice. Please enter C, T, R, or Q.");
            }

            System.out.println(); // Add a blank line for better readability
        }
    }
}

