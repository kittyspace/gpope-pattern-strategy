package com.gp.opelyan.pattern.strategy.trasportation;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 502
 * @Date: Create in 2019-10-06 16:01
 * @Description:
 */
public class TrasportStrategyFactory {

    public static String AIRCRAFT = "AIRCRAFT";
    public static String HIGHRAIL = "HIGHRAIL";
    private static Map<String,Trasport> trasportStrategyMap = new HashMap<String,Trasport>();
    static {
        trasportStrategyMap.put(AIRCRAFT,new Aircraft());
        trasportStrategyMap.put(HIGHRAIL,new HighRail());
    }

    public static Trasport get(String trasportKey){
        if(trasportStrategyMap.containsKey(trasportKey)){
            return trasportStrategyMap.get(trasportKey);
        }else{
            System.out.println("没有提供您所选的交通工具");
            return null;
        }


    }
}
