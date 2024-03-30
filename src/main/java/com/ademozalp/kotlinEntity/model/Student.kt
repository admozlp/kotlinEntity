package com.ademozalp.kotlinEntity.model

import jakarta.persistence.*

@Entity
data class Student @JvmOverloads constructor(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(nullable = false)
    val name: String,
    @Column(nullable = false)
    val surname: String,
    val age: Int?=0,
    val grade: Int? = 0,
    @ManyToOne
    @JoinColumn(name = "course_id")
    val course: Course? = null
) {
    constructor() : this(null, "", "", 0, 0, null) {}
}