package com.ademozalp.kotlinEntity.repository;

import com.ademozalp.kotlinEntity.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
