import java.util.Scanner;

class A {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int adds, int subs) {
        return adds * subs;
    }

    public int div(int adds, int subs) {
        return adds / subs;
    }

    public int digit(int n) {
        int count = 0;

        while (n != 0) {
            n = n / 10;
            count++;
        }

        return count;
    }

    public boolean spynum(int n) {
        int sum = 0;
        int product = 1;

        while (n != 0) {
            int d = n % 10;

            sum = sum + d;
            product = product * d;

            n = n / 10;
        }

        return sum == product;
    }
}

class B {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number:");
        int a = s.nextInt();

        System.out.println("Enter a number:");
        int b = s.nextInt();

        A obj = new A();

        int adds = obj.add(a, b);
        int subs = obj.sub(a, b);

        System.out.println("\nEnter your choice:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Number of Digits");
        System.out.println("6. Spy Number");

        int choice = s.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Addition = " + adds);
                break;

            case 2:
                System.out.println("Subtraction = " + subs);
                break;

            case 3:
                System.out.println("Multiplication = " + obj.mul(adds, subs));
                break;

            case 4:
                if (subs != 0) {
                    System.out.println("Division = " + obj.div(adds, subs));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            case 5:
                System.out.println("Number of digits in " + a + " = " + obj.digit(a));
                break;

            case 6:
                if (obj.spynum(a)) {
                    System.out.println(a + " is a Spy Number");
                } else {
                    System.out.println(a + " is not a Spy Number");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }

        s.close();
    }
}