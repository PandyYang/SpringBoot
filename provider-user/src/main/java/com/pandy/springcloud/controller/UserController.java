package com.pandy.springcloud.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.converters.Auto;
import com.pandy.springcloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Pandy
 */
@Controller
@ResponseBody
public class UserController {

    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping("/eurekainfo")
    public String info(){
        InstanceInfo instance = eurekaClient.getNextServerFromEureka("provider-user", false);
        return instance.getHomePageUrl();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Long id){
        return new User(id);
    }
}
