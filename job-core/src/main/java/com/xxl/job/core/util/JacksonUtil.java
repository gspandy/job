package com.xxl.job.core.util;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;

/**
 * Jackson util
 * 
 * 1、obj need private and set/get； 2、do not support inner class；
 * 
 * @author xuxueli 2015-9-25 18:02:56
 */
public class JacksonUtil {

    /**
     * bean、array、List、Map --> json
     * 
     * @param obj
     * @return
     * @throws Exception
     */
    public static String writeValueAsString(Object obj) {
        return JSON.toJSONString(obj);
    }

    /**
     * string --> bean、Map、List(array)
     * 
     * @param jsonStr
     * @param clazz
     * @return
     * @throws Exception
     */
    public static <T> T readValue(String jsonStr, Class<T> clazz) {
        return JSON.parseObject(jsonStr, clazz);
    }

    public static <T> T readValueRefer(String jsonStr, Class<T> clazz) {
        return JSON.parseObject(jsonStr, clazz);
    }

    public static void main(String[] args) {
        try {
            Map<String, String> map = new HashMap<String, String>();
            map.put("aaa", "111");
            map.put("bbb", "222");
            String json = writeValueAsString(map);
            System.out.println(json);
            System.out.println(readValue(json, Map.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
