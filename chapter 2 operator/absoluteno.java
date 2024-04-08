import java.util.Scanner;

public class absoluteno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float no=sc.nextFloat();
        if(no<0){
            float n;
            n = no * (-1);
            System.out.println(n);
        }else{
            System.out.println(no);
        }
        sc.close();
    }
}