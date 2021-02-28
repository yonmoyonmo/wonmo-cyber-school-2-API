package yonmoyonmo.wonmocyberschool.com.src.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @GetMapping("/test")
    public String testGet(HttpServletRequest request){
        return request.getLocalAddr();
    }
    
}
