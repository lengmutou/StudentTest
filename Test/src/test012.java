import java.math.BigInteger;
import java.util.Scanner;

/*
 * @author  lengmu
 * @version 1.0
 */
public class test012 {
    public static void main(String[] args) {
        int number = 20;
        BigInteger jc= BigInteger.valueOf(1);
        long in = 1;
        for (int i = 2; i <= number ; i++) {
            jc= jc.multiply(BigInteger.valueOf(i));
            in *=i;
            System.out.println(i);
        }
        System.out.println("in  "+in);
        System.out.println(number  + " 的阶乘是：");
        System.out.println(jc.toString());
    }
}
