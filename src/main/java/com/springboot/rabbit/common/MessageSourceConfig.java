package com.springboot.rabbit.common;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

/**
 * @author Mr ● Li
 * @version 1.0
 * @date 2021/4/29 9:30
 */
@Configuration
public class MessageSourceConfig {

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasenames("locale/messages", "locale/mqMessages",
                "locale/eventMessage");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }
}
