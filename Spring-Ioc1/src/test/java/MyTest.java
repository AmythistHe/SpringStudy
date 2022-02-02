import com.He.dao.UserDaoMysqlImpl;
import com.He.service.UserService;
import com.He.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author AmythistHe
 * @version 1.0
 * @description
 * @create 2022/2/2 11:34
 */
public class MyTest {
    public static void main(String[] args){
//        UserService userService = new UserServiceImpl();
//        // �û���̬�������Ȼ��ͨ����������new����ʵ���˿��Ʒ�ת(IOC)
//        // ����Ҫͨ������Աnew���󣬽��
//        ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());
//        userService.getUser();
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");
        userServiceImpl.getUser();
    }
}
