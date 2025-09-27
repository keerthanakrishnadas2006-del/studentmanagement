package com.iplus.studentManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.iplus.studentManagement.Entity.enrollment;

public interface enrollmentrepository extends JpaRepository<enrollment, Long> {
}