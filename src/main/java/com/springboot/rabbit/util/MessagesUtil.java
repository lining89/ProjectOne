package com.springboot.rabbit.util;

import com.springboot.rabbit.message.Messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Yan Jingchao
 */
@Component
public class MessagesUtil {

    private static Messages messages;

    @Autowired
    public MessagesUtil(Messages messages) {
        MessagesUtil.messages = messages;
    }

    public static String getMessage(Integer code, String... args) {

        return messages.getMessage(code, args);
    }

    public static String getMessage(Integer code) {
        return messages.getMessage(code, (String[]) null);
    }
}
