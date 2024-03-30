package com.ademozalp.kotlinEntity.dto.course

import com.ademozalp.kotlinEntity.model.Course
import jakarta.validation.constraints.NotEmpty

data class SaveCourseDto(
    @field:NotEmpty val name: String
) {
    companion object {
        @JvmStatic
        fun convert(from: SaveCourseDto): Course {
            return Course(name = from.name)
        }
    }
}