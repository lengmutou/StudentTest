import java.util.Scanner;

/*
 * @author  lengmu
 * @version 1.0
 */
public class test012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        String s = String.valueOf(i);
        String str = "";
        for (int j = 0; j < s.length(); j++) {
            str = s.charAt(j)+str;
        }
        System.out.println(Integer.parseInt(str));
    }
}
