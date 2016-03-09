package com.goribun.common.utils.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.goribun.common.utils.collections.ArrayUtil;

import java.util.List;
import java.util.Map;

/**
 * Created by WangXuesong on 2016/3/9.
 */
public class JsonUtil {

    private static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    /**
     * object转json<br/>
     * 默认日期格式yyyy-MM-dd HH:mm:ss<br/>
     * 默认禁用循环引用检测<br/>
     *
     * @param obj 对象
     * @return json
     */
    public static String object2json(Object obj) {
        // DisableCircularReferenceDetect为了避免ref问题
        return JSON.toJSONStringWithDateFormat(obj, DEFAULT_DATE_FORMAT, SerializerFeature.DisableCircularReferenceDetect);
    }

    public static String object2json(Object obj, SerializerFeature... features) {
        return JSON.toJSONStringWithDateFormat(obj, DEFAULT_DATE_FORMAT, ArrayUtil.append(features, SerializerFeature.DisableCircularReferenceDetect));
    }


    public static String object2jsonWithDateFormat(Object obj, String dateFormat, SerializerFeature... features) {
        return JSON.toJSONStringWithDateFormat(obj, dateFormat, ArrayUtil.append(features, SerializerFeature.DisableCircularReferenceDetect));
    }

    /**
     * json转对象
     *
     * @param jsonStr
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T json2object(String jsonStr, Class<T> clazz) {
        return JSON.parseObject(jsonStr, clazz);
    }

    /**
     * json转list
     *
     * @param jsonStr
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> List<T> json2list(String jsonStr, Class<T> clazz) {
        return JSON.parseArray(jsonStr, clazz);
    }

    /**
     * json转map
     *
     * @param jsonStr
     * @return
     */
    public static Map<String, Object> json2Map(String jsonStr) {
        // TODO: 16/3/10 实现存在问题
        //return JSON.parseObject(jsonStr,Map.class);

        return JSON.parseObject(jsonStr, new TypeReference<Map<String, Object>>() {
        });

    }
}