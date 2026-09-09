import java.util.Scanner;

public class Factorial {

    public int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }
    
}
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = s.nextInt();
        Factorial obj = new Factorial();
        System.out.println("Factorial of " + n + " is: " + obj.factorial(n));
        s.close();
    }
}