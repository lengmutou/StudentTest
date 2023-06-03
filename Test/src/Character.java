import org.junit.Test;

import java.io.*;
import java.util.Arrays;
import java.util.function.Consumer;

/*
 * @author  lengmu
 * @version 1.0
 */
public class Character {
    @Test
    public void test01() throws IOException {
        File file = new File("../Photo01/test.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file));
        char[] chars = new char[(int) file.length()];
        inputStreamReader.read(chars);
        System.out.println(String.valueOf(chars));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String s = bufferedReader.readLine();
        System.out.println(s);

    }

    @Test
    public void test02() throws IOException {
        File file = new File("../Photo01/test.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file));
        outputStreamWriter.append("我是新加的文字!");
//        outputStreamWriter.write("我是新加的文字!");
        outputStreamWriter.flush();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));
        bufferedWriter.write("我是new！！");
        //刷新到文件中
        bufferedWriter.flush();
    }

    @Test
    public void test03() throws IOException {
        //要复制的文件
        File file = new File("../Photo01/test.txt");
        //复制到
        File newFile = new File("../Photo01/newFile.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file));
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(newFile));
        //创建新文件  或者 new File("路径",file.getName()); 就是复制了
        newFile.createNewFile();
        StringBuilder str = new StringBuilder();
        int c = -1;
        while ((c = inputStreamReader.read()) != -1) {
            str.append((char) c);
        }
        outputStreamWriter.write(str.toString());
        outputStreamWriter.flush();
        inputStreamReader.close();
        outputStreamWriter.close();
    }

    @Test
    public void test04() throws IOException {
        //批量复制
        //要复制的文件夹
        File file = new File("../Photo01");
        //复制到
        File targetFile = new File("../Photo02");
//        File targetFile1 = new File("../Photo01");
//        for (String s : targetFile1.list()) {
//            System.out.println(s);
//        }
        copy1(file,targetFile);
    }

    public void copy(File file, File targetFile) {
        //遍历当前路径下的所有 目录/文件
        Arrays.stream(file.list()).forEach(s -> {
            //当前目录 + 当前遍历到的 目录/文件名 = 当前要读取的 文件/目录 的路径
            File newFile = new File(file, "\\" + s);
            //目标目录 + 当前遍历到的 目录/文件名 = 当前要写入的 文件/目录 的路径
            File newTargetFile = new File(targetFile + "\\" + s);
            try {
                //如果当前需要复制的路径指向的是文件
                if (newFile.isFile()) {
                    //复制粘贴文件
                    FileInputStream fileInputStream = new FileInputStream(newFile);
                    FileOutputStream fileOutputStream = new FileOutputStream(newTargetFile);
                    byte[] bytes = new byte[(int) newFile.length()];
                    System.out.println(new String(bytes));
                    fileInputStream.read(bytes);
                    fileOutputStream.write(bytes);
                    fileOutputStream.flush();
                } else {
                    //如果当前需要复制的路径指向的是目录
                    //在要粘贴的目标位置 创建该目录
                    newTargetFile.mkdir();
                    //再次调用当前方法 复制粘贴 新的当前目录中的所有文件
                    copy(newFile,newTargetFile);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });
    }
    public void copy1(File file, File targetFile) {
        //遍历当前路径下的所有 目录/文件
        for (String s : file.list()) {
            //当前目录 + 当前遍历到的 目录/文件名 = 当前要读取的 文件/目录 的路径
            File newFile = new File(file, "\\" + s);
            //目标目录 + 当前遍历到的 目录/文件名 = 当前要写入的 文件/目录 的路径
            File newTargetFile = new File(targetFile + "\\" + s);
            try {
                //如果当前需要复制的路径指向的是文件
                if (newFile.isFile()) {
                    //复制粘贴文件
                    FileInputStream fileInputStream = new FileInputStream(newFile);
                    FileOutputStream fileOutputStream = new FileOutputStream(newTargetFile);
                    byte[] bytes = new byte[(int) newFile.length()];
                    fileInputStream.read(bytes);
                    fileOutputStream.write(bytes);
                } else {
                    //如果当前需要复制的路径指向的是目录
                    //在要粘贴的目标位置 创建该目录
                    newTargetFile.mkdir();
                    //再次调用当前方法 复制粘贴 新的当前目录中的所有文件
                    copy(newFile,newTargetFile);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
