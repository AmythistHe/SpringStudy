import com.He.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author AmythistHe
 * @version 1.0
 * @description
 * @create 2022/2/2 14:45
 */
public class MyTest {
    public static void main(String[] args){
        // ��ȡSpring�������Ķ���ʹ��Springȥ����bean��
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // ��Spring��������ȡ��bean����ʹ�á�
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
