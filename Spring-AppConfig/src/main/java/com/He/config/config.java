package com.He.config;

import com.He.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author AmythistHe
 * @version 1.0
 * @description
 * @create 2022/2/5 12:42
 */
// 声明配置类
@Configuration
@ComponentScan("com.He.pojo")
@Import(config2.class)  // 导入其它配置类
public class config {
    // @Bean注解相当于xml文件中的bean标签，
    // 该注解对应方法的名字，相当于bean标签的id；
    // 对应方法的返回值相当于bean标签的class。
    @Bean
    public User getUser() {
        return new User();
    }
}
