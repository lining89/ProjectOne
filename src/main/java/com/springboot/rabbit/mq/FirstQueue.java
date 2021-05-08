package com.springboot.rabbit.mq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Mr ● Li
 * @version 1.0
 * @date 2021/4/28 10:14
 */
@Configuration
public class FirstQueue {

    //创建第一个消息队列
    @Bean(name = "myFirstQueue")
    public Queue getFirstQueue(){
        return new Queue("my-first-queue");
    }
    //创建第二个消息队列
    @Bean(name = "mySecondQueue")
    public Queue getSecondQueue(){
        return new Queue("my-second-queue");
    }
    //创建第三个消息队列
    @Bean(name = "myThirdQueue")
    public Queue getThreeQueue(){
        return new Queue("my-third-queue");
    }
}
