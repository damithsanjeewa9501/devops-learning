package com.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String home() {
        return "Employee Management API Running";
    }

    @GetMapping("/employees")
    public String employees() {
        return "[{\"id\":1,\"name\":\"John\"},{\"id\":2,\"name\":\"David\"}]";
    }
}
