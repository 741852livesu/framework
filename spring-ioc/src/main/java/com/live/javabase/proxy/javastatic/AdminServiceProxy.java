package com.live.javabase.proxy.javastatic;

import com.live.javabase.proxy.javastatic.service.AdminService;
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
public class AdminServiceProxy implements AdminService {

    
    private AdminService adminService;

    public AdminServiceProxy(@Qualifier("adminServiceImp") AdminService adminService) {
        this.adminService = adminService;
    }

    public void update() {
        log.info("判断用户是否有权限进行update操作");
        adminService.update();
        log.info("记录用户执行update操作的用户信息、更改内容和时间等");
    }

    public Object find() {
        log.info("判断用户是否有权限进行find操作");
        log.info("记录用户执行find操作的用户信息、查看内容和时间等");
        return adminService.find();
    }
}