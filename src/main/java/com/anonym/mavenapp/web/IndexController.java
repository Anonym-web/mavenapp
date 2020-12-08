package com.anonym.mavenapp.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author:Anonym
 * 2020/3/19
 */
@Controller
@Api(tags = "IndexController")
public class IndexController {


    @ApiOperation("我是一个接口")
    @RequestMapping(value = "/",method = RequestMethod.GET)
    @ResponseBody
    public String test(){

        return "I am a programmer!!!!";

    }
}
