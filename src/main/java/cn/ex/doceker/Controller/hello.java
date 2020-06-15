package cn.ex.doceker.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @RequestMapping("Hello")
    public String hello(){
        return "hello spring";
    }
}
