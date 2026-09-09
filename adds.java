class A1 {
    public void add(){
        int a=10;
        int b=20;

        int c=a+b;
        System.out.println("Addition "+c);
    }

    public void sub(){
        int a=10;
        int b=20;

        int c=a-b;
        System.out.println("Subtraction "+c);
    }

    public void mul(){
        int a=10;
        int b=20;

        int c=a*b;
        System.out.println("Multiplication "+c);
    }

    public void div(){
        int a=10;
        int b=20;

        int c=a/b;
        System.out.println("Division "+c);
    }


}

class B1{
    public static void main (String[] args){
        

        A1 obj=new A1();
       
        
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
      
    }
}

