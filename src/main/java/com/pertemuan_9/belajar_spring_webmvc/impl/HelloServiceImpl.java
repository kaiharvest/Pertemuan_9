package com.pertemuan_9.belajar_spring_webmvc.impl;

import com.pertemuan_9.belajar_spring_webmvc.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {

        if (name == null || name.isBlank()) {
            return "Hello Guest";
        }

        return "Hello " + name;
    }
}