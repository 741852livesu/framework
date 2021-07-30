package com.live.service.imp;

import com.live.service.Animal;

/**
 * @Description:
 * @author: sulh
 * @date: 2021年07月12日 17:14
 * @version: 1.0
 */
public class Cat implements Animal<String> {

    @Override
    public void eat(String s) {
        System.out.println("Cat eat"+s);
    }
}
