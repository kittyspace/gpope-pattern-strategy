package com.gp.opelyan.pattern.strategy.trasportation;

/**
 * @Author: 502
 * @Date: Create in 2019-10-06 16:16
 * @Description:
 */
public class TrasportStrategyTest {

    public static void main(String[] args) {
        Trasport aircraft = TrasportStrategyFactory.get("AIRCRAFT");
        String name = aircraft.getName();
        System.out.println(name);
        aircraft.go();

    }
}
