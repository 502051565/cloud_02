package com.cloud.goods1.controller;

import com.cloud.goods1.util.ResponseResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author monkey_lwy@163.com
 * @date 2020-08-07 15:50
 * @desc
 */
@RestController
public class GoodsController {

    @RequestMapping("/getGoods.do")
    public ResponseResult getUser() {
        return ResponseResult.success("返回成功","myGoods1");
    }
}
