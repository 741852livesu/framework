package com.live.common.proxy.javastatic.service.imp;

import com.live.common.proxy.javastatic.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @author: sulh
 * @date: 2021年08月12日 10:41
 * @version: 1.0
 */

@Slf4j
@Service
@Qualifier("adminServiceImp")
public class AdminServiceImpl implements AdminService {

    @Override
    public void update() {
        log.info("修改管理系统数据");
    }

    @Override
    public Object find() {
        log.info("查看管理系统数据");
        return new Object();
    }
}
