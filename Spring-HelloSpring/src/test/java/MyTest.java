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
        // 获取Spring的上下文对象，使用Spring去管理bean。
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 从Spring最后陪你过取出bean，并使用。
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
