package com.springboot.rabbit;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;


@SpringBootApplication(scanBasePackages = "com.springboot.rabbit")
public class DemoApplication {
    @Bean
    public HttpMessageConverters fastJsonMessageConverter(){
        //创建FastJson的消息转换器
        FastJsonHttpMessageConverter jsonConverter = new FastJsonHttpMessageConverter();
        //创建FastJson的配置对象
        FastJsonConfig config = new FastJsonConfig();
        //对Json数据进行格式化
        config.setSerializerFeatures(SerializerFeature.PrettyFormat);

        jsonConverter.setFastJsonConfig(config);
        HttpMessageConverter<?> converter = jsonConverter;
        return new HttpMessageConverters(converter);
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
