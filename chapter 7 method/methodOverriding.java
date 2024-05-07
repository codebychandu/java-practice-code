// package chapter 7 method;

class A{
    public int a ;
    public int chandu(){
        return 6;
    }
    public void method2(){
        System.out.println("I am method 2 of class A");
    }
}

class B extends A{
    public void method2(){
        System.out.println("I am method 2 of class B");
    }
    public void method3(){
        System.out.println("I am method 3 of class B");
    }

}

public class methodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.method2();

        B b = new B();
        b.method2();
        b.method3();
        System.out.println(b.a);
        System.out.println(b.chandu());
    }
}
