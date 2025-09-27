package com.iplus.studentManagement.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.iplus.studentManagement.Entity.*;
import com.iplus.studentManagement.Repository.*;

@Service
public class studentservice {
    private final studentrepository repo;

    public studentservice(studentrepository repo) {
        this.repo = repo;
    }

    public List<student> getAll() { return repo.findAll(); }

    public student save(student s) { return repo.save(s); }
}