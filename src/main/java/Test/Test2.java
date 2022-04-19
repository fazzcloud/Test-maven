package Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: Fazzcloud
 * @Date: 2022/4/14 20:48
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class Test2 {
    public static void main(String[] args) {
        String str =  "{\"username\":\"qzcsbj\", \"password\":\"123456\"}";
        //创建map
        HashMap<String, String> params = new HashMap<>();
        //利用fastjson中JSONObject处理json串
        JSONObject jsonObject = JSONObject.parseObject(str);
        Set<String> keys = jsonObject.keySet();
        for (String key:keys){
            params.put(key,jsonObject.getString(key));
        }

        //遍历
        Set<String> keyname = params.keySet();
        for(String key:keyname){
            System.out.println("key="+key+",name="+params.get(key));
        }

    }
}
