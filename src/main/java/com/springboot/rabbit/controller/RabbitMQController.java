package com.springboot.rabbit.controller;

import com.springboot.rabbit.common.CommonResponse;
import com.springboot.rabbit.exception.BusinessException;
import com.springboot.rabbit.message.Messages;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Mr ● Li
 * @version 1.0
 * @date 2021/4/28 10:05
 */
@Controller
public class RabbitMQController {

    @Autowired
    RabbitTemplate rabbitTemplate;
    @RequestMapping(value = "/first/rabbit", method = RequestMethod.POST)
    @ResponseBody
    public CommonResponse firstRabbit(){
        int a = 6/2;
        if(a == 3){
            throw new BusinessException(Messages.CODE_20012);
        }

        return CommonResponse.getInstance();
        //rabbitTemplate.convertAndSend("my-fanout-exchange","","第一次往队列中添加值");
    }
}
