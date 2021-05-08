package com.springboot.rabbit.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author Mr ● Li
 * @version 1.0
 * @date 2021/4/28 10:37
 */
@Component
@Slf4j
public class FanoutExchangeListener {
    @RabbitListener(queues = "my-first-queue")
    public void getFirstConsumer(String str){
        log.info("消息订阅者第一个队列返回的消息： " + str);
    }
}
