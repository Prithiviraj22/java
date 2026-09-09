import java.util.Scanner;

class A {

    public int Lenth(int n) {

        int count = 0;

        while (n != 0) {
            count++;
            n = n / 10;
        }

        return count;
    }

    public int disarium(int n) {

        int digits = Lenth(n);
        int sum = 0;

        while (n != 0) {

            int digit = n % 10;

            sum = sum + (int) Math.pow(digit, digits);

            digits--;
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

        int sum = obj.disarium(n);

        System.out.println("Given Number : " + n);
        System.out.println("Disarium Sum : " + sum);

        if (sum == n) {
            System.out.println("Disarium Number");
        } else {
            System.out.println("Not a Disarium Number");
        }

        sc.close();
    }
}