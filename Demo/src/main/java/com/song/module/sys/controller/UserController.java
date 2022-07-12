package com.song.module.sys.controller;

import com.song.common.config.AbstractController;
import com.song.module.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 王质松
 * @date 2022/7/8 16:16
 */
@RestController
@RequestMapping("/sys/user")
public class UserController extends AbstractController {

    @Autowired
    private SysUserService sysUserService;



}
