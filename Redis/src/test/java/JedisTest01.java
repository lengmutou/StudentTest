import com.lengmu.util.JedisPool;
import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

public class JedisTest01 {
    @Test
    void test01(){
        Jedis jedis = JedisPool.getConnect();
        System.out.println(jedis.keys("*"));
    }
}
