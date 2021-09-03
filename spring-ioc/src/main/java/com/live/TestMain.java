package com.live;

import com.live.springmvc.entity.Student;
import com.live.springmvc.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.beans.PropertyValue;

/**
 * @Description:
 * @author: sulh
 * @date: 2021年07月21日 18:44
 * @version: 1.0
 */
@Slf4j
public class TestMain {
        public static void main(String[] args) {
            log.info("ClassLodarDemo's ClassLoader is " + Student.class.getClassLoader());
            log.info("The Parent of ClassLodarDemo's ClassLoader is " + Student.class.getClassLoader().getParent());
            log.info("The GrandParent of ClassLodarDemo's ClassLoader is " + Student.class.getClassLoader().getParent().getParent());
    }
}
