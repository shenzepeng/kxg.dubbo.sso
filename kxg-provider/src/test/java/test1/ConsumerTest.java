package test1;
import com.kxg.dubbo.sso.provider.DubboProviderBootstrap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DubboProviderBootstrap.class})
public class ConsumerTest {
    @Test
    public void test(){
        System.out.println("t");
    }
}
