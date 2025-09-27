package com.iplus.studentManagement.Controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.iplus.studentManagement.Entity.student;
import com.iplus.studentManagement.Service.studentservice;

@RestController
@RequestMapping("/students")
public class studentcontroller {
    private final studentservice service;

    public studentcontroller(studentservice service) {
        this.service = service;
    }

    @GetMapping
    public List<student> getAll() { return service.getAll(); }

    @PostMapping
    public student create(@RequestBody student s) { return service.save(s); }
}