package com.littlenb.customer.common;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @author svili
 **/
public class JsonModelWrapper {

    private static final JSONObject JSON_EMPTY = new JSONObject();

    private static final JSONArray JSON_ARRAY_EMPTY = new JSONArray();

    /**
     * @param code    error code
     * @param message error msg
     * @return json format with {"success":false,"code":"","message":""}
     */
    public static JsonModel error(String code, String message) {
        // result = {}
        return new JsonModel(Boolean.FALSE, code, message, JSON_EMPTY);
    }

    /**
     * @param result the data object
     * @return json format with
     * {"success":true,"code":"0","message":"success","result":}
     */
    public static JsonModel success(Object result) {
        // code = "0" and message = "success"
        return new JsonModel(Boolean.TRUE, "0", "success", result);
    }

    /**
     * return success JsonModel and set result with empty JSON
     */
    public static JsonModel success() {
        return success(JSON_EMPTY);
    }

    /**
     * return success JsonModel and set result with empty JSONArray
     */
    public static JsonModel successWithEmptyArray() {
        return success(JSON_ARRAY_EMPTY);
    }




}
