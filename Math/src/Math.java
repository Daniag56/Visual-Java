//Nunca llames a tu clase math penco
public class Math {
    public static void main(String[] args) throws Exception {
        for(int i = 1; i <= 20; i++) {
            System.out.println((int)(java.lang.Math.random()*6)+1+"");
        }
        System.out.println();
    }
}
