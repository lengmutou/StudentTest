import org.junit.Test;

import java.io.*;

/*
 * @author  lengmu
 * @version 1.0
 */
public class photoCopy {
    @Test
    public void test01() throws IOException {
//        System.out.println(new File("../Photo01").mkdir());
//        System.out.println(new File("../Photo02").mkdir());
        File file = new File("D:/idea.jpg");
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bytes = new byte[(int) file.length()];
        int read = fileInputStream.read(bytes);

        FileOutputStream fileOutputStream = new FileOutputStream(new File("../Photo01/",file.getName()));
        fileOutputStream.write(bytes);
    }
}
