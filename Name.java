import java.util.Scanner;

class Name {
 
    public String FirstName(String a){

        return a;

    }
    
    public String LastName(String b){

        return b;

    }
    
    public String FullName(String a,String b){

        return a+b;

    }
    
}
class Main {

    public static void main (String[] args) {

         Scanner s = new Scanner(System.in);

        System.out.println("First Name:");
        String a = s.nextLine();

        System.out.println("Last Name:");
        String b = s.nextLine();

        Name obj = new Name();
        System.out.println("First Name = " + obj.FirstName(a));
        System.out.println("Last Name = " + obj.LastName(b));
        System.out.println("Full Name = " + obj.FullName(a,b));

        s.close();
    }
}
