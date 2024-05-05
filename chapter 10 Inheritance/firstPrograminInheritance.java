// package chapter 10 Inheritance;

public class firstPrograminInheritance {

    static class Base{
        public int x;

        public int getX(){
            return x;
        }
        public void setX(int x){
            System.out.println("I am the Base and setting x now");
            this.x = x;
        }
        public void printMe(){
            System.out.println("I am the constructor ");
        }
    }

    static class Derived extends Base{
        public int y;   
        public int getY(){
            return y;
        }
        public void setY(int y){
            System.out.println("I am the Derived and setting y now");
            this.y = y;
        }
    }

    public static void main(String[] args) {
        // Creating a object of a base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        // creating a object of a derived class
        Derived d = new Derived();
        d.setX(5);
        d.setY(6);
        System.out.println(d.getX());
        System.out.println(d.getY());
    }
    
}
