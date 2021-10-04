package XuLyNgoaiLe;

import java.io.IOException;

public class Main {
    public static void main(String[] agrs) {
        p();
        System.out.println("Normal flow...");
    }

    private static void m() throws IOException {
        throw new IOException("Device Error");
    }

    private static void n() throws IOException {
        try {
            m();
        }
        catch (Exception ex){
            System.out.println("Start N");
            ex.printStackTrace();
            System.out.println("Exception handle");
            System.out.println("End N");
        }
    }

    private static void p() {
        try {
            n();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Exception handle");
        }
    }
}
