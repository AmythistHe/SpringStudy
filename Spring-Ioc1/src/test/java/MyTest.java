import com.He.dao.UserDaoMysqlImpl;
import com.He.service.UserService;
import com.He.service.UserServiceImpl;

/**
 * @author AmythistHe
 * @version 1.0
 * @description
 * @create 2022/2/2 11:34
 */
public class MyTest {
    public static void main(String[] args){
        UserService userService = new UserServiceImpl();
        // 用户动态传入对象，然后通过程序主动new对象，实现了控制反转(IOC)
        // 不需要通过程序员new对象，解耦。
        ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());
        userService.getUser();
    }
}
