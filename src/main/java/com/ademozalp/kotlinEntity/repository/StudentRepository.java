package com.ademozalp.kotlinEntity.repository;

import com.ademozalp.kotlinEntity.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
