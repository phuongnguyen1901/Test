package Careelink;

import java.io.IOException;

public class MainTest {
    public static void main(String[] args) {
        Multi3 a = new Multi3();
        a.run();
        Multi4 b = new Multi4();
        b.run();
    }

}
class Multi3 implements Runnable {
    public void run() {
        System.out.println("thread is running...");
        Runtime rt = Runtime.getRuntime();
        try {
            rt.exec(new String[]{"cmd.exe", "/c", "mvn test -Dcucumber.options=\"src/test/resources/Careelink/CoverLetter/CheckDescription.feature\""});
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
class Multi4 implements Runnable {
    public void run() {
        System.out.println(" 1thread is running...");
        Runtime rt = Runtime.getRuntime();
        try {
            rt.exec(new String[]{"cmd.exe", "/c", "mvn test -Dcucumber.options=\"src/test/resources/Careelink/CoverLetter/CheckDisplayScreen.feature\""});
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
