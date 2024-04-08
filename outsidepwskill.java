import pw.skills.*;

public class outsidepwskill {

    public static void main(String[] args){
        App obj =new App();
        System.out.println("Outside package: " + obj.str_1);
        App3 obj2 = new App3();
        obj2.printfromchildclass();
        System.out.println("Child class call"+ obj.str_1);
    }
}


class App3 extends App{
    void printfromchildclass(){
        App3 obj = new App3();
        System.out.println("Child class: "+ obj.str_1);
    }
}