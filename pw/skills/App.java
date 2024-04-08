package pw.skills;

public class App {
    public String str_1 = "I am a Public Member";

    void printfromclass(){
        System.out.println("Within the class: "+ str_1);
    }
    public static void main(String[] args){
        App obj = new App();
        obj.printfromclass();
        System.out.println("Within class: "+ obj.str_1);
        App2 obj2 = new App2();
        obj2.printfromoutsideclass();
    }
}

class App2{
    void printfromoutsideclass(){
        App obj = new App();
        obj.printfromclass();
        System.out.println("Within Package , but outside the class: "+obj.str_1);

    }
}
