package com.song.common.model;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 王质松
 * @date 2022/7/8 16:20
 */

public class Result extends HashMap<String,Object> {

    private static final long serialVersionUID = -5106804900353108379L;

    public Result() {
        put("code", 0);
    }

    public static Result error() {
        return error(500, "未知异常，请联系管理员");
    }

    public static Result error(String msg) {
        return error(500, msg);
    }

    public static Result error(int code, String msg) {
        Result r = new Result();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static Result ok(Object msg) {
        Result r = new Result();
        r.put("msg", msg);
        return r;
    }


    public static Result ok(Map<String, Object> map) {
        Result r = new Result();
        r.putAll(map);
        return r;
    }

    public static Result ok() {
        Result r = new Result();
        r.put("msg", "操作成功");
        return r;
    }

    @Override
    public Result put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
