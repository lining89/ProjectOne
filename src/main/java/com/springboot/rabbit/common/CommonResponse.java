package com.springboot.rabbit.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.springboot.rabbit.message.Messages;
import com.springboot.rabbit.util.MessagesUtil;

import java.util.HashMap;
import java.util.List;

/**
 * @author Mr ● Li
 * @version 1.0
 * @date 2021/4/29 9:18
 */
public class CommonResponse {

    @JsonProperty("error_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer errorCode;

    @JsonProperty("error_message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String errorMessage;

    @JsonProperty("result_data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object resultData;

    @JsonProperty("row_start_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer rowStartNumber;

    @JsonProperty("row_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer rowCount;

    @JsonProperty("total_row_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long totalRowNumber;

    private CommonResponse(){}

    private CommonResponse(Integer errorCode, String errorMessage, Object resultData, Integer rowStartNumber, Integer rowCount, Long totalRowNumber){
        this.errorCode = errorCode;
        this.resultData = resultData;
        this.errorMessage = errorMessage;
        this.rowStartNumber = rowStartNumber;
        this.rowCount = rowCount;
        this.totalRowNumber = totalRowNumber;
    }

    public static CommonResponse getInstance(Integer errorCode, Object resultData, Integer rowStartNumber, Integer rowCount, Long totalRowNumber, String... args) {
        resultData = packResult(resultData);
        return new CommonResponse(errorCode, MessagesUtil.getMessage(errorCode, args), resultData, rowStartNumber, rowCount, totalRowNumber);
    }

    public static CommonResponse getInstance(Object resultData, Integer rowStartNumber, Integer rowCount, Long totalRowNumber) {
        resultData = packResult(resultData);
        return new CommonResponse(Messages.CODE_10000, MessagesUtil.getMessage(Messages.CODE_10000), resultData, rowStartNumber, rowCount, totalRowNumber);
    }

    public static CommonResponse getInstance(Object resultData) {
        resultData = packResult(resultData);
        return new CommonResponse(Messages.CODE_10000, MessagesUtil.getMessage(Messages.CODE_10000), resultData, null, null, null);
    }

    public static CommonResponse getInstance() {
        return new CommonResponse(Messages.CODE_10000, MessagesUtil.getMessage(Messages.CODE_10000), null, null, null, null);
    }

    public static CommonResponse getInstance(Integer errorCode, String msgData) {
        return new CommonResponse(errorCode, MessagesUtil.getMessage(errorCode, msgData), null, null, null, null);
    }

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

    public Object getResultData() {
        return resultData;
    }

    public void setResultData(Object resultData) {
        this.resultData = resultData;
    }

    public Integer getRowStartNumber() {
        return rowStartNumber;
    }

    public void setRowStartNumber(Integer rowStartNumber) {
        this.rowStartNumber = rowStartNumber;
    }

    public Integer getRowCount() {
        return rowCount;
    }

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    public Long getTotalRowNumber() {
        return totalRowNumber;
    }

    public void setTotalRowNumber(Long totalRowNumber) {
        this.totalRowNumber = totalRowNumber;
    }

    private static Object packResult(Object resultData) {
        if (resultData != null) {
            Object tempo = resultData;
            if (resultData instanceof List || resultData.getClass().isArray()) {
                tempo = new HashMap<String, Object>() {
                    {
                        put("items", resultData);
                    }
                };
            }
            return tempo;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "{" +
                "\"errorCode\": " + errorCode + "," +
                "\"errorMessage\": \"" + errorMessage + "\"," +
                "\"resultData\": " + resultData + "\"," +
                "\"rowStartNumber\": " + rowStartNumber + "\"," +
                "\"rowCount\": " + rowCount + "\"," +
                "\"totalRowNumber\": " + totalRowNumber +
                "}";
    }
}
