import java.util.Scanner;

class A {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public float area(float pi, int r) {
        return pi * r * r;
    }
}

class B {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number:");
        int a = s.nextInt();

        System.out.println("Enter a number:");
        int b = s.nextInt();

        System.out.println("Enter a radius:");
        int r = s.nextInt();

        System.out.println("Enter your choice:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Area of Circle");

        int choice = s.nextInt();

        A obj = new A();

        if (choice == 1) {
            System.out.println("Addition = " + obj.add(a, b));

        } else if (choice == 2) {
            System.out.println("Subtraction = " + obj.sub(a, b));

        } else if (choice == 3) {
            System.out.println("Multiplication = " + obj.mul(a, b));

        } else if (choice == 4) {
            System.out.println("Division = " + obj.div(a, b));

        } else if (choice == 5) {
            System.out.println("Area of circle = " + obj.area(3.14f, r));

        } else {
            System.out.println("Invalid choice");
        }
        
        s.close();
    }
}