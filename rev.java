class rev {

    public int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        return rev;
    }

    
}
class Main {
    
    public static void main(String[] args) {
        int n = 12345;

        rev obj = new rev();

        System.out.println("Reverse of " + n + " is: " + obj.reverse(n));

        if (n == obj.reverse(n)) {
            System.out.println(n + " is a Palindrome Number");
        } else {
            System.out.println(n + " is not a Palindrome Number");
        }
    }   
    
}
