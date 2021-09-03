package com.live.common.proxy.javastatic;

import com.live.common.proxy.javastatic.service.AdminService;
import com.live.common.proxy.javastatic.service.imp.AdminServiceImpl;
import lombok.extern.slf4j.Slf4j;

/**
 * @Description:
 * @author: sulh
 * @date: 2021年08月12日 10:51
 * @version: 1.0
 */
@Slf4j
public class StaticProxyTest {

    public static void main(String[] args) {
        AdminService adminService = new AdminServiceImpl();
        AdminServiceProxy proxy = new AdminServiceProxy(adminService);
        proxy.update();
        log.info("=============================");
        proxy.find();
    }
}
