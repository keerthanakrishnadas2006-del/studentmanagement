package com.iplus.studentManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.iplus.studentManagement.Entity.*;

public interface courserepository extends JpaRepository<course, Long> {
}