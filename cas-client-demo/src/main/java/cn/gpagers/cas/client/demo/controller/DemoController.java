package cn.gpagers.cas.client.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liuzijie on 2017/2/18.
 */
@Controller
@RequestMapping(value = "/")
public class DemoController {

    @RequestMapping(value = "/index")
    @ResponseBody
    public String index() {
        return "<div style='color:red;font-size:40px;background-color:orange'>welcome to demo system</div>";
    }


}
