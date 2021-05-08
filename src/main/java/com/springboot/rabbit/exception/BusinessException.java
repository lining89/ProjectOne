package com.springboot.rabbit.exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.springboot.rabbit.util.MessagesUtil;

/**
 * @author Mr ● Li
 * @version 1.0
 * @date 2021/4/28 17:07
 */
public class BusinessException extends RuntimeException{

    @JsonProperty("error_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer errorCode;

    public BusinessException(Integer errorCode){
        super(MessagesUtil.getMessage(errorCode));
        this.errorCode = errorCode;
    }

    public BusinessException(Integer errorCode, String... args){
        super(MessagesUtil.getMessage(errorCode,args));
        this.errorCode = errorCode;
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public BusinessException(String message, Throwable cause){
        super(message, cause);
    }

    public BusinessException(Integer code, Throwable cause) {
        super(MessagesUtil.getMessage(code), cause);
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }
}
