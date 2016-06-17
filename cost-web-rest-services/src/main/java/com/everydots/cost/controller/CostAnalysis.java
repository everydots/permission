package com.everydots.cost.controller;

import com.everydots.cost.beans.User;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/analysis")
public class CostAnalysis {

    @RequestMapping(value = "/services", method = RequestMethod.GET)
    public
    @ResponseBody
    Object login() throws Exception {
        User user = new User();
        user.setUsername("serverUser");
        user.setPassword("1111");
        return new ObjectMapper().writer().writeValueAsString(user);
    }
}
