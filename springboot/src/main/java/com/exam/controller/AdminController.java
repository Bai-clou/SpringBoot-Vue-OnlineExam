package com.exam.controller;

import com.exam.entity.Admin;
import com.exam.Result.ApiResult;
import com.exam.service.serviceimpl.AdminServiceImpl;
import com.exam.Result.ApiResultHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 管理员实体类
 *
 */
@RestController
public class AdminController {

    @Autowired
    private AdminServiceImpl adminService;
    @Autowired
    public AdminController(AdminServiceImpl adminService){
        this.adminService = adminService;
    }

    @GetMapping("/admins")
    public ApiResult findAll(){
        System.out.println("查询全部");
        return ApiResultHandler.success(adminService.findAll());
    }

    @GetMapping("/admin/{adminId}")
    public ApiResult findById(@PathVariable("adminId") Integer adminId){
        System.out.println("根据ID查找");
        return ApiResultHandler.success(adminService.findById(adminId));
    }

    @DeleteMapping("/admin/{adminId}")
    public ApiResult deleteById(@PathVariable("adminId") Integer adminId){
        adminService.deleteById(adminId);
        System.out.println("根据id删除=> id="+adminId);
        return ApiResultHandler.success();
    }

    @PutMapping("/admin/{adminId}")
    public ApiResult update(@PathVariable("adminId") Integer adminId, Admin admin){
        System.out.println("更新操作");
        return ApiResultHandler.success(adminService.update(admin));
    }

    @PostMapping("/admin")
    public ApiResult add(Admin admin){
        System.out.println("添加操作");
        return ApiResultHandler.success(adminService.add(admin));
    }
}
