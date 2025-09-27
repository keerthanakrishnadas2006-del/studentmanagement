package com.iplus.studentManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.iplus.studentManagement.Entity.student;

public interface studentrepository extends JpaRepository<student, Long> {
}