package com.littlenb.customer.common;

import com.alibaba.fastjson.annotation.JSONType;

/**
 * SpringMVC ResponseBody for JSON Object.</br>
 * 数据接口必须使用此类作为返回类型.</br>
 *
 * @author svili
 */
@JSONType(orders = {"success", "code", "message", "result"})
public class JsonModel {

    /**
     * 成功
     */
    private Boolean success;

    /**
     * 响应代码
     */
    private String code;


    /**
     * 消息描述
     */
    private String message;

    /**
     * 数据对象
     */
    private Object result;

    public JsonModel(){}

    JsonModel(Boolean success, String code, String message, Object result) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.result = result;
    }

    /* getter */

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Object getResult() {
        return result;
    }

    public Boolean getSuccess() {
        return success;
    }

}
