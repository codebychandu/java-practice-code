package Basic;

import java.io.File;

public class checkFileSize {
    public static void main(String[] args) {
        // Display the file sizes in bytes for two files.
        System.out.println("/home/students/abc.txt  : " + new File("AsciiValue.java").length() + " bytes");
        System.out.println("/home/students/test.txt : " + new File("D:\\important documents\\12th.pdf").length() + " bytes");
    }
}
