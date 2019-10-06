package com.gp.opelyan.pattern.strategy.trasportation;

/**
 * @Author: 502
 * @Date: Create in 2019-10-06 15:54
 * @Description:
 */
public abstract class Trasport {


    //交通工具类型
    public abstract String getName();

    public void go(){
        System.out.println("开始出发---");
        System.out.println("------");
        System.out.println("现已到达---");
    }

}
