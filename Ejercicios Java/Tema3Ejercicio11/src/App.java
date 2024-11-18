import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        float mb, kb;
        System.out.println("Introduce los Kilobytes: ");
        kb = sc.nextFloat();
        
        mb = kb / 1024;
        System.out.println("Los Megabytes son: " + mb);
    }
}
