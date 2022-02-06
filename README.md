## Spring 学习记录
### 1.Spring-IOC
- 用户通过Set方法动态传入对象，然后通过程序主动new对象，实现了控制反转(IOC)。
这样就不需要通过程序员new对象，解耦。
- 在beans.xml文件中使用beans标签也可以实现IOC。
多个beans.xml文件可以通过import resource合并到一个xml文件中。
### 2.Spring-HelloSpring
- 首先在beans.xml文件中设置Bean的ID和属性，然后通过ClassPathXmlApplicationContext("beans.xml")
获取Spring的上下文对象，使用Spring去管理bean。最后通过getBean("beanID")取出并使用Bean。
### 3.Spring-DI
- beans标签中每个bean的property属性可以为各种类型的Bean属性注入值。
此外，p标签（相当于property）和c标签（基于带参构造器注入）也可以实现同样的功能。
### 4.Spring-Autowired
- 在beans.xml文件中可以通过autowire实现bean属性的自动注入，其中autowire="byName"用于在容器上下文中基于名字查找bean，
autowire="byType"用于在容器上下文中基于类型查找bean。
- @Autowired和@Resource注解也可以通过Set方法实现bean属性的自动注入。
其中@Autowired通过bean类型实现自动装配，@Resource通过bean名称和类型（默认名称）实现自动装配。
- @Qualifier用于手动指定@Autowired自动装配bean的id。
### 5.Spring-annotation
- 使用注解需要先在xml文件中设置注解支持。
```xml
<context:component-scan base-package="com.He"/>
<context:annotation-config/>
```
- @Component注解等价于在beans.xml文件中装配bean，@Value注解等价于beans.xml文件中的property属性。
- @Component有3个衍生注解，其中@Repository对应dao层，@Service对应service层，@Controller对应controller层。
- @Scope注解用于设置bean的作用域，默认为singleton。
- 注解使用简单，维护复杂；xml配置使用复杂，维护简单。

### 6.Spring-AppConfig
- @Configuration注解用于声明Bean的配置类，该类可以替代beans.xml文件。
@Configuration注解中包含了@Component注解，即该注解也会将bean装配到Spring容器中。
- @Bean注解相当于xml文件中的bean标签，该注解对应方法的名字，相当于bean标签的id；
对应方法的返回值相当于bean标签的class。
- 如果使用@Configuration注解替代bean.xml，则需要通过AnnotationConfigApplicationContext(config.class)
获取容器上下文，并完成配置类class对象的装载。
- @Import注解用于导入其它配置类。

### 7.Spring-AOP
- 方式1(使用原生Spring API接口)：编写log类，并实现对应的接口。然后在xml中通过pointcut配置切入点，
并通过advisor配置需要在切入点执行的log类。
```xml
<!--配置AOP-->
<aop:config>
    <!--切入点-->
    <aop:pointcut id="pointcut" expression="execution(* com.He.service.UserServiceImpl.*(..))"/>
    <!--执行环绕增加-->
    <aop:advisor advice-ref="log" pointcut-ref="pointcut"/>
    <aop:advisor advice-ref="afterLog" pointcut-ref="pointcut"/>
</aop:config>
```
- 方式2(自定义类)：编写log类，然后在xml文件中通过aspect和自定义类ID配置切入面，通过pointcut配置切入点，
最后通过before和after等标签配置log类中各个方法的执行位置。
```xml
<bean id="DIY" class="com.He.DIY.DIYPointCut"/>
    <aop:config>
        <!--自定义切面-->
        <aop:aspect ref="DIY">
            <!--切入点-->
            <aop:pointcut id="pointcut2" expression="execution(* com.He.service.UserServiceImpl.*(..))"/>
            <!--通知-->
            <aop:before method="before" pointcut-ref="pointcut2"/>
            <aop:after method="after" pointcut-ref="pointcut2"/>
        </aop:aspect>
    </aop:config>
```
- 方式3(使用注解实现)：编写log类，并通过@Aspect注解标注为切片类。然后再xml中通过<aop:aspectj-autoproxy/>开启AOP注解。
最后在log类中通过@Before、@After等注解配置对应的方法。

### Spring-Mybatis
- 相关依赖：Junit、Mybatis、Mysql、Spring、AOP、Mybatis-Spring。
- Mybatis使用流程：编写实体类、编写核心配置文件、编写接口、编写Mapper.xml、测试。
- Lombok中的@Data注解等价于@ToString、@EqualsAndHashCode、@Getter、@Setter、@RequiredArgsConstructor。
- Mybatis使用流程(基于Mybatis-Spring)：首先在xml文件中编写DataSource配置、sqlSessionFactory配置、sqlSessionTempLate(sqlSession)配置。
然后为接口添加实现类，并基于sqlSessionTempLate为实现类配置bean。最后测试。此外，如果想省略sqlSessionTempLate配置，
可以在接口的实现类中继承SqlSessionDaoSupport，并基于sqlSessionFactory为实现类配置bean。