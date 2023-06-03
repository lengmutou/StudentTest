import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.function.IntConsumer;

/*
 * @author  lengmu
 * @version 1.0
 */
public class test extends Object {
    public static void main(String[] args) {
        int[] arr = {5,3,6,7,8,1};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int a = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = a;
                }
            }
        }
//        Arrays.stream(arr).forEach(System.out::print);
//        test(System.out::println);
    }
//    public String test(){
//            try{
//            }catch (Exception e){
//
//            }finally {
//
//            }
//    }

}
abstract class test01{
   test01 (){

    }

}
