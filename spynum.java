class Num {

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

class Main {

    public static void main(String[] args) {

        int n = 123;

        Num obj = new Num();

        System.out.println("Number of digits: " + obj.digit(n));

        if (obj.spynum(n)) {
            System.out.println(n + " is a Spy Number");
        } else {
            System.out.println(n + " is not a Spy Number");
        }
    }
}