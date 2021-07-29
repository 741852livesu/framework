package com.live;

import com.live.springmvc.entity.User;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.beans.PropertyValue;

/**
 * @Description:
 * @author: sulh
 * @date: 2021年07月21日 18:44
 * @version: 1.0
 */
public class TestMain {
    public static void main(String[] args) {
        User user = new User();

        System.out.println(user.getUsername());
        BeanWrapper beanWrapper = PropertyAccessorFactory.forBeanPropertyAccess(user);
        beanWrapper.setPropertyValue("username", "itboyhub");
        PropertyValue pv = new PropertyValue("id", "www.itboyhub.com");
        beanWrapper.setPropertyValue(pv);
        user.setUsername("love");
        System.out.println("user = " + user);
    }
}
