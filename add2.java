class A1 {
    public int add(int a,int b){

        int c=a+b;
        return c;
    }

    public int sub(int a,int b){

        int c=a-b;
        return c;
    }

    public int mul(int a,int b){

        int c=a*b;
        return c;
    }

    public int div(int a,int b){

        int c=a/b;
        return c;
    }


}

class B1{
    public static void main (String[] args){
        

        A1 obj=new A1();
        int a=10;
        int b=20;
        
        obj.add(a,b);
        obj.sub(a,b);
        obj.mul(a,b);
        obj.div(a,b);
        System.out.println( "Addition "+obj.add(a,b));
        System.out.println("Subtraction "+obj.sub(a,b));
        System.out.println("Multiplication "+obj.mul(a,b));
        System.out.println("Division "+obj.div(a,b));

      
    }
}

