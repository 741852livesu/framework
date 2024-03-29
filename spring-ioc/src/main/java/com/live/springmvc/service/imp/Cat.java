package com.live.springmvc.service.imp;

import com.live.springmvc.service.Animal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @Description:
 * @author: sulh
 * @date: 2021年07月12日 17:14
 * @version: 1.0
 */
@Slf4j
@Service
public class Cat extends AbstractAnimal implements Animal {

    @PostConstruct
    @Override
    public void eat() {
        log.info("cat->eat...");
    }
}
