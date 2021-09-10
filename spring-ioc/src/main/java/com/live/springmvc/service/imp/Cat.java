package com.live.springmvc.service.imp;

import com.live.springmvc.service.Animal;
import com.live.springmvc.service.FunctionInterfaceTest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @author: sulh
 * @date: 2021年07月12日 17:14
 * @version: 1.0
 */
@Slf4j
@Service
public class Cat implements Animal {

    public void test(int i, FunctionInterfaceTest singletonFactory) {
        log.info(" methon test");
        singletonFactory.eat();


    }

    @Override
    public void eat() {

        test(1, () -> list());


    }

    public Object list() {
        log.info("menthon list");
        return 2 + 2;
    }
}
