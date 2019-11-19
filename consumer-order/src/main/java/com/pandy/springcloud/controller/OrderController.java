package com.pandy.springcloud.controller;

import com.pandy.springcloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * @author Pandy
 */
@Controller
@ResponseBody
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;//spring提供的一个用于访问rest接口的模板对象
    private String url = "http://localhost:7901/user/";
    @GetMapping("/order/{id}")
    public User getOrder(@PathVariable Long id){
        //访问提供者获取数据
        User user = restTemplate.getForObject(url+id,User.class);//通过rest获得json数据然后转换成user对象
        return user;
    }

    @GetMapping("/discovery")
    public Object discovery(){
        String url2 = "http://localhost:7901/provider/discovery";
        return restTemplate.getForObject(url2,Object.class);
    }
}
