package com.live.springmvc.contronller.animal;

import com.live.springmvc.service.Animal;
import com.live.springmvc.service.imp.Cat;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationContextException;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.handler.MappedInterceptor;

import java.util.Map;

/**
 * @Description:
 * @author: sulh
 * @date: 2021年08月03日 11:13
 * @version: 1.0
 */
@Slf4j
@RestController
public class AnimalController implements ApplicationContextAware {
    @Nullable
    private ApplicationContext applicationContext;

    @RequestMapping("/animal/eat")
    public void eatTest() {
        Cat cat =new Cat();
        Map map = BeanFactoryUtils.beansOfTypeIncludingAncestors(applicationContext, Animal.class);
        log.info("结果集数组大小："+map.size());
        for (Object o : map.entrySet()) {
            log.info(o+":");
        }

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        this.applicationContext = applicationContext;
    }
}
