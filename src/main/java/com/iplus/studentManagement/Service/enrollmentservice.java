package com.iplus.studentManagement.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.iplus.studentManagement.Entity.enrollment;
import com.iplus.studentManagement.Repository.enrollmentrepository;

@Service
public class enrollmentservice {
    private final enrollmentrepository repo;

    public enrollmentservice(enrollmentrepository repo) {
        this.repo = repo;
    }

    public List<enrollment> getAll() { return repo.findAll(); }

    public enrollment save(enrollment e) { return repo.save(e); }
}