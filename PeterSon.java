import java.util.Scanner;

class A {

    public int factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public int peterson(int n) {

        int sum = 0;

        while (n != 0) {

            int digit = n % 10;

            sum = sum + factorial(digit);

            n = n / 10;
        }

        return sum;
    }
}

class B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        A obj = new A();

        int sum = obj.peterson(n);

        System.out.println("Given Number : " + n);
        System.out.println("Factorial Sum : " + sum);

        if (sum == n) {
            System.out.println("Peterson Number");
        } else {
            System.out.println("Not a Peterson Number");
        }

        sc.close();
    }
}