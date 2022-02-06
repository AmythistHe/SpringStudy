import com.He.mapper.UserMapper;
import com.He.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author AmythistHe
 * @version 1.0
 * @description
 * @create 2022/2/6 17:44
 */
public class MyTest {
    @Test
    public void test1() throws IOException {
        String resources = "mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(resources);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.selectUser();

        userList.stream().forEach(System.out::println);
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        userMapper.selectUser().stream().forEach(System.out::println);
    }

    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
        userMapper.selectUser().stream().forEach(System.out::println);
    }
}
