
// dynamic methods dispatched 

class phone{
    public void call(){
        System.out.println("calling...");
    }
    public void on(){
        System.out.println("Phone is ringing...");
    }
    
}

class nokia extends phone{
    public void music(){
        System.out.println("Music Playing...");
    }
    public void on(){
        System.out.println("Nokia Phone is ringing...");
    }
}

public class dynamicMethodDispatch {
    public static void main(String[] args) {
        phone obj = new phone();
        obj.call();

        nokia obj2 = new nokia();
        obj2.music();

    }
}
