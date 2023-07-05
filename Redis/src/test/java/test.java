import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

import java.util.Set;

public class test {
    private Jedis jedis;
    @BeforeEach
    void load(){
        jedis = new Jedis("localhost",6379);

    }
    @Test
    void test(){
        System.out.println(jedis.keys("*"));
    }
    @AfterEach
    void de(){
        jedis.close();
    }
}
