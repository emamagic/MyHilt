package com.example.myhilt

import androidx.room.Entity
import androidx.room.PrimaryKey
import dagger.hilt.EntryPoint

@Entity
data class MyEntity(
    val name: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null
)