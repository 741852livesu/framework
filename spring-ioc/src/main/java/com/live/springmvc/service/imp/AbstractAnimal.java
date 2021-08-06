package com.live.springmvc.service.imp;

import com.live.springmvc.service.Animal;

/**
 * @Description:
 * @author: sulh
 * @date: 2021年08月03日 11:04
 * @version: 1.0
 */
public abstract class AbstractAnimal implements Animal {

    void walk(String walk) {
        System.out.println(walk + ":running");
    }
}
