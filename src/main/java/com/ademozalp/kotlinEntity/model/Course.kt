package com.ademozalp.kotlinEntity.model

import jakarta.persistence.*

@Entity
data class Course @JvmOverloads constructor(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(nullable = false)
    val name: String,
    @OneToMany(mappedBy = "course")
    val students: List<Student>? = ArrayList()
){
    constructor() : this(null, "", ArrayList())
}
