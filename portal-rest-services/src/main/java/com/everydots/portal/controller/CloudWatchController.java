package com.everydots.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/cloud/cloudwatch")
public class CloudWatchController {

    @RequestMapping("/alarms")
    public void retrieveAlarms(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("search alarms!!");
    }
}
