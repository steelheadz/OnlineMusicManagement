package com.wll.controller;

import com.wll.enums.HTTPStatus;
import com.wll.pojo.Admin;
import com.wll.service.impl.AdminServiceImpl;
import com.wll.utils.R;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author wll
 * @since 2025-04-24
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Resource
    private AdminServiceImpl adminService;


    @PostMapping("/login")
    public R login(@RequestBody Admin loginAdmin) {
        Admin admin = adminService.login(loginAdmin);
        if (Objects.isNull(admin)) {
            return R.other(HTTPStatus.CLIENT_ERROR.getCode(), "用户名或者密码错误", null);
        } else {
            return R.success("登录成功", admin);
        }
    }


    @PostMapping("/registry")
    public R registry(@RequestBody Admin loginAdmin) {
        boolean res = adminService.registry(loginAdmin);

        if (res) {
            return R.success("登录成功", res);
        } else {
            return R.other(HTTPStatus.CLIENT_ERROR.getCode(), "用户名或者密码错误", res);
        }
    }

}
