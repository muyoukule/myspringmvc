package com.muyoukule.oa.controller;

import org.springmvc.stereotype.Controller;
import org.springmvc.ui.ModelMap;
import org.springmvc.web.bind.annotation.RequestMapping;
import org.springmvc.web.bind.annotation.RequestMethod;

/**
 * ClassName: OrderController
 * Description:
 */
@Controller
public class OrderController {
    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public String detail(ModelMap modelMap) {
        // 向request域中存储数据
        modelMap.addAttribute("orderNo", "123456456456456");
        // 转发到视图
        return "detail";
    }
}
