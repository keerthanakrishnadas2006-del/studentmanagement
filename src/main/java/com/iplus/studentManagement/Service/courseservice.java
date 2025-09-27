package com.iplus.studentManagement.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.iplus.studentManagement.Entity.course;
import com.iplus.studentManagement.Repository.courserepository;

@Service
public class courseservice {
    private final courserepository repo;

    public courseservice(courserepository repo) {
        this.repo = repo;
    }

    public List<course> getAll() { return repo.findAll(); }

    public course save(course c) { return repo.save(c); }
}