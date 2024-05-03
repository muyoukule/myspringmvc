package com.muyoukule.oa.controller;

import org.springmvc.stereotype.Controller;
import org.springmvc.ui.ModelMap;
import org.springmvc.web.bind.annotation.RequestMapping;
import org.springmvc.web.bind.annotation.RequestMethod;

/**
 * ClassName: UserController
 * Description:
 */
@Controller
public class UserController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        // 向request域中绑定数据
        modelMap.addAttribute("username", "lisi");
        // 转发
        return "index";
    }
}
