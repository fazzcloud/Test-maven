package Test;

import com.alibaba.fastjson.JSON;

import java.util.Map;

/**
 * @Author: Fazzcloud
 * @Date: 2022/4/14 20:48
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class Test {
    //强制转换，将json转换为map
    public static void main(String[] args) {
        String str = "{\"username\":\"qzcsbj\", \"password\":\"123456\"}";
        Map maps = (Map) JSON.parse(str);
        System.out.println("这个是用JSON类来解析JSON字符串!!!");
        for (Object map : maps.entrySet()) {
            System.out.println(((Map.Entry) map).getKey() + "     " + ((Map.Entry) map).getValue());
        }
    }
}
