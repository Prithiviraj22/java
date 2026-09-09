class A1 {
    public void add(int a,int b){

        int c=a+b;
        System.out.println("Addition "+c);
    }

    public void sub(int a,int b){

        int c=a-b;
        System.out.println("Subtraction "+c);
    }

    public void mul(int a,int b){

        int c=a*b;
        System.out.println("Multiplication "+c);
    }

    public void div(int a,int b){

        int c=a/b;
        System.out.println("Division "+c);
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
      
    }
}

