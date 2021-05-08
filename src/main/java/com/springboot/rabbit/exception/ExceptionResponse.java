package com.springboot.rabbit.exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Mr ● Li
 * @version 1.0
 * @date 2021/4/28 16:54
 */
public class ExceptionResponse {

    public static Integer SYSTEM_ERROR_CODE = 20008;
    public static Integer BINDING_ERROR_CODE = 21000;
    public static String SYSTEM_ERROR_MESSAGE = "服务器系统异常";
    public static String BINDING_ERROR_MESSAGE = "传入的参数不正确";

    @JsonProperty("error_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer errorCode;

    @JsonProperty("error_message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String errorMessage;

    @JsonProperty("error_data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object errorData;

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Object getErrorData() {
        return errorData;
    }

    public void setErrorData(Object errorData) {
        this.errorData = errorData;
    }
}
