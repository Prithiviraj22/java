import java.util.Scanner;

class A {
    public int input(int a, int b) {
        return a + b;
        
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

        int result = obj.input(a, b);

        System.out.println("Result = " + result);

        s.close();
    }
}