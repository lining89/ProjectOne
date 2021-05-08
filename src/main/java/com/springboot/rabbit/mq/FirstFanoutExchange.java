package com.springboot.rabbit.mq;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Mr ● Li
 * @version 1.0
 * @date 2021/4/28 10:23
 */
@Configuration
public class FirstFanoutExchange {
    //创建第一个交换机
    @Bean(name = "myFirstFanoutExchange")
    public FanoutExchange getFirstFanoutExchange(){
        return new FanoutExchange("my-fanout-exchange");
    }

    //将第一个消息队列绑定到交换机
    @Bean
    public Binding bindingFirstFanoutExchange(@Qualifier("myFirstQueue") Queue myFirstQueue, @Qualifier("myFirstFanoutExchange") FanoutExchange myFirstFanoutExchange){
        return BindingBuilder.bind(myFirstQueue).to(myFirstFanoutExchange);
    }
    //将第二个消息队列绑定到交换机
    @Bean
    public Binding bindingSecondFanoutExchange(@Qualifier("mySecondQueue")Queue mySecond, @Qualifier("myFirstFanoutExchange") FanoutExchange myFirstFanoutExchange){
        return BindingBuilder.bind(mySecond).to(myFirstFanoutExchange);
    }
    //将第三个消息队列绑定到交换机
    @Bean
    public Binding bindingThirdFanoutExchange(@Qualifier("myThirdQueue")Queue myThirdQueue, @Qualifier("myFirstFanoutExchange") FanoutExchange myFirstFanoutExchange){
        return BindingBuilder.bind(myThirdQueue).to(myFirstFanoutExchange);
    }
}
