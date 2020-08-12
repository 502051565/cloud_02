package com.cloud.user.controller;

import com.cloud.user.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author monkey_lwy@163.com
 * @date 2020-08-07 15:50
 * @desc
 */
@RestController
public class UserController {

    @Autowired
    private RestTemplate  restTemplate;


    @RequestMapping("/getUser.do")
    public ResponseResult getUser() {
        return ResponseResult.success("返回成功","myUser");
    }
    @RequestMapping("/getGoods.do")
    public ResponseResult getGoods() {
        return ResponseResult.success("返回成功",restTemplate.getForObject("http://localhost:80/getGoods.do",Object.class));
    }
}
