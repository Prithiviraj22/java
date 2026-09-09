import java.util.Scanner;
class Message {
    public String message(String name) {
        return "Hello, " + name + "!";
    }
    
}
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a name:");
        String name = s.nextLine();
        Message obj = new Message();
        System.out.println(obj.message(name));
        s.close();
    }
}
