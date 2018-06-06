// @RequestMapping - GET/POST/PUT 등 요청 구분 III
package bitcamp.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping("/exam03_3")
public class Exam03_3 {

    @GetMapping(value="m1")
    @ResponseBody
    public String m1() {
        return "Exam03_2.m1()";
    }
    
    @PostMapping(value="m2")
    @ResponseBody
    public String m2() {
        return "Exam03_2.m2()";
    }
}
