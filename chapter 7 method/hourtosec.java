import java.util.Scanner;

public class hourtosec {

    static int hourtosecond(String time){
        String[] part = time.split(":");

        int hour = Integer.parseInt(part[0]);
        int minutes = Integer.parseInt(part[1]);
        int seconds = Integer.parseInt(part[2]);
        int totalsec = hour * 3600 + minutes * 60 + seconds;
        return totalsec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time in hour:minutes:seconds format: ");
        String time = sc.nextLine();
        int totalsec = hourtosecond(time);
        System.out.println("Total second is: " + totalsec);


        sc.close();
    }
}
