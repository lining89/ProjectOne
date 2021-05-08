package com.springboot.rabbit.common;

import com.springboot.rabbit.exception.BusinessException;
import com.springboot.rabbit.exception.ExceptionResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mr ● Li
 * @version 1.0
 * @date 2021/4/28 16:42
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    @ResponseBody
    public ExceptionResponse bindingErrorHandler(MethodArgumentNotValidException e){
        log.error(e.getMessage(), e);
        ExceptionResponse exceptionResponse = new ExceptionResponse();
        BindingResult bindingResult = e.getBindingResult();

        List<FieldError> fieldErrorList = bindingResult.getFieldErrors();

        List<String> message = new ArrayList<>();
        for (FieldError fieldError : fieldErrorList) {
            message.add(formatStr(fieldError.getField()) + " : " + fieldError.getDefaultMessage());
        }

        exceptionResponse.setErrorCode(ExceptionResponse.BINDING_ERROR_CODE);
        exceptionResponse.setErrorMessage(ExceptionResponse.BINDING_ERROR_MESSAGE);
        exceptionResponse.setErrorData(message.toString());

        return exceptionResponse;
    }

    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public ExceptionResponse businessErrorHandler(BusinessException e){
        log.error(e.getMessage(), e);
        ExceptionResponse exceptionResponse = new ExceptionResponse();
        exceptionResponse.setErrorCode(e.getErrorCode());
        exceptionResponse.setErrorMessage(e.getMessage());
        return exceptionResponse;
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ExceptionResponse commonErrorHandler(Exception e){
        log.error(e.getMessage(), e);
        ExceptionResponse exceptionResponse = new ExceptionResponse();

        exceptionResponse.setErrorMessage(ExceptionResponse.SYSTEM_ERROR_MESSAGE);
        exceptionResponse.setErrorCode(ExceptionResponse.SYSTEM_ERROR_CODE);
        return exceptionResponse;
    }

    private String formatStr(String str) {
        StringBuilder sbf = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char tempChr = str.charAt(i);
            if (tempChr >= 'A' && tempChr <= 'Z') {
                sbf.append("_");
            }
            sbf.append(tempChr);
        }
        return sbf.toString().toLowerCase();
    }
}
