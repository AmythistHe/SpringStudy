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
// ����������
@Configuration
@ComponentScan("com.He.pojo")
@Import(config2.class)  // ��������������
public class config {
    // @Beanע���൱��xml�ļ��е�bean��ǩ��
    // ��ע���Ӧ���������֣��൱��bean��ǩ��id��
    // ��Ӧ�����ķ���ֵ�൱��bean��ǩ��class��
    @Bean
    public User getUser() {
        return new User();
    }
}
