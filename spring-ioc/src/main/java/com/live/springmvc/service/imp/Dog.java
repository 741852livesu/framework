package com.live.springmvc.service.imp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @author: sulh
 * @date: 2021年08月03日 11:10
 * @version: 1.0
 */
@Service
@Slf4j
public class Dog extends AbstractAnimal {
    @Override
    public void eat() {
        log.info("dog->eat...");
    }
}
