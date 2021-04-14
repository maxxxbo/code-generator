package io.renren.utils;

import com.alibaba.fastjson.JSONReader;
import lombok.Data;

import java.io.Serializable;

@Data
public class JsonResult implements Serializable {

    private static final long serialVersionUID = 4191300392489716398L;

    private final static int SUCCESS = 0;
    private final static int ERROR = 500;

    private int code;
    private String msg;
    private Object data;

    private JsonResult(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static JsonResult success() {
        return success(null);
    }

    public static JsonResult success(Object data) {
        return getInstance(SUCCESS, null, data);
    }

    public static JsonResult error(String msg) {
        return getInstance(ERROR, msg, null);
    }

    public static JsonResult getInstance(int code, String msg, Object data) {
        return new JsonResult(code, msg, data);
    }


}
