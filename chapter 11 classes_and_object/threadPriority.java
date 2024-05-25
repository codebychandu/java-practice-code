
// Thread properties example program.
class mythr extends Thread{
    public mythr(String name) {
        super(name);
    }
    public void run(){
        // while (true) {
        //     System.out.println("Hello " + getName());
        // }
        System.out.println("Hello " + getName());
        
    }
}

public class threadPriority {
    public static void main(String[] args) {
        String name = "chandu1";
        mythr t1 = new mythr(name);
        mythr t2 = new mythr("chandu2");
        mythr t3 = new mythr("chandu3");
        mythr t4 = new mythr("chandu4");
        t1.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }    
}
