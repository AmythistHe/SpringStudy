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