import java.util.Scanner;

class A1 {

    public boolean even(int a) {

        if (a % 2 == 0) {
            return true;
        } 
        return false;
    }
}

class B1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number:");
        int a = s.nextInt();

        A1 obj = new A1();

        if (obj.even(a)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

         s.close();
    }
   
}

