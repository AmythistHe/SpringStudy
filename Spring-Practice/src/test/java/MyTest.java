import com.He.dao.StudentDao;
import com.He.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author AmythistHe
 * @version 1.0
 * @description
 * @create 2022/2/8 18:15
 */
public class MyTest {
    /**
     * select
     */
    @Test
    public void test1() {
        StudentDao studentDao = getStudentDao();
        studentDao.selectStudent().stream().forEach(System.out::println);
    }

    /**
     * add
     */
    @Test
    public void test2() {
        StudentDao studentDao = getStudentDao();
        studentDao.addStudent(new Student(1111, "ะกอ๕", 50.1f));
    }

    /**
     * delete
     */
    @Test
    public void test3() {
        StudentDao studentDao = getStudentDao();
        studentDao.deleteStudent(1111);
    }

    /**
     * update
     */
    @Test
    public void test4() {
        StudentDao studentDao = getStudentDao();
        studentDao.updateStudent(1006, 89);
    }

    public StudentDao getStudentDao() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        return studentDao;
    }
}
