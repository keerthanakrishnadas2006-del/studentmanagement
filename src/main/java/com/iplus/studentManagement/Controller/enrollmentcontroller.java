package com.iplus.studentManagement.Controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.iplus.studentManagement.Entity.enrollment;
import com.iplus.studentManagement.Service.enrollmentservice;

@RestController
@RequestMapping("/enrollments")
public class enrollmentcontroller {
    private final enrollmentservice service;

    public enrollmentcontroller(enrollmentservice service) {
        this.service = service;
    }

    @GetMapping
    public List<enrollment> getAll() { return service.getAll(); }

    @PostMapping
    public enrollment create(@RequestBody enrollment e) { return service.save(e); }
}