import java.io.*;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.UUID;

/*
 * @author  lengmu
 * @version 1.0
 */
public class test012 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://5b0988e595225.cdn.sohucs.com/images/20200113/9dfd4f286a7141eeb786377fd3b514d9.jpeg");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());

        String fileName = url.getFile().substring(url.getFile().lastIndexOf("."));
        UUID uuid = UUID.randomUUID();
        File file = new File("Photo01"+File.separator+uuid+fileName);
        System.out.println(file.getAbsolutePath());
        file.createNewFile();

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        int i = 0;
        while ((i=bufferedInputStream.read())!=-1){
            bufferedOutputStream.write(i);
        }
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        bufferedInputStream.close();
    }
}
