package com.example.musclemate
import com.example.musclemate.Database.Entity.Exercises
import com.example.musclemate.Database.Entity.ExerciseDatabase

class ExerciseRepository(private val db: ExerciseDatabase) {

    suspend fun insert(item: Exercises) = db.exerciseDao().insert(item)
    suspend fun delete(item: Exercises) = db.exerciseDao().delete(item)

    fun allExercises() = db.exerciseDao().getAll()
}