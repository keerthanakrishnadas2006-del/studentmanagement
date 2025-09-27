package com.iplus.studentManagement.Controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.iplus.studentManagement.Entity.course;
import com.iplus.studentManagement.Service.courseservice;

@RestController
@RequestMapping("/courses")
public class coursecontroller {
    private final courseservice service;

    public coursecontroller(courseservice service) {
        this.service = service;
    }

    @GetMapping
    public List<course> getAll() { return service.getAll(); }

    @PostMapping
    public course create(@RequestBody course c) { return service.save(c); }
}