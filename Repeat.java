import java.util.Scanner;
class Repeat {

    public String repeat(String str, int n) {
        return str.repeat(n);
    }
  
}
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = s.nextLine();
        System.out.println("Enter a number:");
        int n = s.nextInt();
        Repeat obj = new Repeat();
        System.out.println(obj.repeat(str, n));
        s.close();
    }
}