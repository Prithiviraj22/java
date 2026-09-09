import java.util.Scanner;

class Name3 {

    public String Name2(String a,String b){

        return a+b;

    }
    
}
class B {

    public static void main(String[] args) {
         
        Scanner name = new Scanner(System.in);


        System.out.println("ENTER THE STRING");
        String a = name.nextLine();

        System.out.println("ENTER THE STRING");
        String b = name.nextLine();

        Name3 obj = new Name3 ();

        System.out.println("FullName : " + obj.Name2(a,b));

        name.close();

      
    }
}