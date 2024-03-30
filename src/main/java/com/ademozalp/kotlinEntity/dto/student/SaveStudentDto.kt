package com.ademozalp.kotlinEntity.dto.student

import com.ademozalp.kotlinEntity.model.Course
import com.ademozalp.kotlinEntity.model.Student
import jakarta.validation.constraints.NotEmpty
import org.jetbrains.annotations.NotNull

data class SaveStudentDto @JvmOverloads constructor(
    @field:NotEmpty val name: String,
    @field:NotEmpty val surname: String,
    val age: Int?=0,
    val grade: Int? = 0,
    @field:NotNull val courseId: Long
){
    companion object {
        @JvmStatic
        fun convert(from: SaveStudentDto, course:Course): Student {
            return Student(
                name = from.name,
                surname = from.surname,
                age = from.age,
                grade = from.grade,
                course = course
            )
        }
    }
}