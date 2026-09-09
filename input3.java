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

        System.out.println("Enter your choice:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

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

            default:
                System.out.println("Invalid choice");
        }

        s.close();
    }
}