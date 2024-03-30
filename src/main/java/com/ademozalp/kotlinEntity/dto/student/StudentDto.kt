package com.ademozalp.kotlinEntity.dto.student

import com.ademozalp.kotlinEntity.dto.course.CourseDto
import com.ademozalp.kotlinEntity.model.Student

data class StudentDto @JvmOverloads constructor(
    val id: Long? = null,
    val name: String,
    val surname: String,
    val age: Int?=0,
    val grade: Int? = 0,
    val course: CourseDto? = null
){
    companion object {
        @JvmStatic
        fun convert(from: Student): StudentDto {
            return StudentDto(
                from.id,
                from.name,
                from.surname,
                from.age,
                from.grade,
                from.course?.let { CourseDto(it.id, it.name) }
            )
        }
    }
}