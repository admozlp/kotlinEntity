package com.ademozalp.kotlinEntity.dto.course

import com.ademozalp.kotlinEntity.dto.student.StudentDto
import com.ademozalp.kotlinEntity.model.Course

data class CourseDto(
    val id: Long? = null,
    val name: String,
    val students: List<StudentDto>? = ArrayList()
){
    companion object {
        @JvmStatic
        fun convert(from: Course): CourseDto {
            val studentDtos = from.students?.map {
                StudentDto(
                    it.id,
                    it.name,
                    it.surname,
                    it.age,
                    it.grade,
                    null
                )
            }
            return CourseDto(
                from.id,
                from.name,
                studentDtos
            )
        }
    }
}
