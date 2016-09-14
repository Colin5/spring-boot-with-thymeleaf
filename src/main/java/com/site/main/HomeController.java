package com.site.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by shengquan.wu on 2016/9/14.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(ModelMap map){
        map.addAttribute("host", "http://www.test.com");
        return "index";
    }

}
