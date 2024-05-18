// package chapter 11 classes_and_object;

// Queation: Create and abstract class pen with methods write() and refill as abstract methods.
abstract class pen{
    abstract void draw();
    abstract void erase();
}
class fountainPen extends pen{
    void draw(){
        System.out.println("drawing");
    }
    void erase(){
        System.out.println("erasing");
    }
    void write(){
        System.out.println("writing");
    }
}

public class abstractClass {
    public static void main(String[] args) {
        fountainPen a = new fountainPen();
        a.draw();
        a.erase();
        a.write();
    }
    
}
