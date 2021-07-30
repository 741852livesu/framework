package com.live.springmvc.compent;

/**
 * @Description:
 * @author: sulh
 * @date: 2021年05月28日 10:02
 * @version: 1.0
 */
@FunctionalInterface
public interface FunctionInterface {

    default int getAge() {
        return 1;
    }

    String getName();
}
