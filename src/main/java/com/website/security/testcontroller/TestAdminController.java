package com.website.security.testcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestAdminController {

    @GetMapping("/admin")
    public String adminPage(){
        return "admin controller";
    }
}
