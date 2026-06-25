package com.pertemuan_9.belajar_spring_webmvc;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    void hello(HttpServletResponse response) throws IOException {
        response.getWriter().println("Hello");
    }

}
