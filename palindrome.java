class Num {

    public int digit(int n) {
        int count = 0;

        while (n != 0) {
            n = n / 10;
            count++;
        }

        return count;
    }

    public int product(int n) {
        int product = 1;

        while (n != 0) {
            int d = n % 10;
            product = product * d;
            n = n / 10;
        }

        return product;
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

    public int reverse(int n) {
        int rev = 0;

        while (n != 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }

        return rev;
    }

    public boolean palindrome(int n) {
        int original = n;
        int rev = reverse(n);

        return original == rev;
    }
}

class Main {

    public static void main(String[] args) {

        int n = 121;

        Num obj = new Num();

        System.out.println("Value: " + n);
        System.out.println("Number of digits: " + obj.digit(n));
        System.out.println("Product: " + obj.product(n));
        System.out.println("Reverse: " + obj.reverse(n));

        if (obj.spynum(n)) {
            System.out.println("Spy Number: Yes");
        } else {
            System.out.println("Spy Number: No");
        }

        if (obj.palindrome(n)) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }
    }
}