package com.example.musclemate
import com.example.musclemate.Database.Entity.Exercises
import com.example.musclemate.Database.ExerciseDatabase

class ExerciseRepository(private val db: ExerciseDatabase) {

    suspend fun insert(item: Exercises) = db.getExerciseDao().insert(item)
    suspend fun delete(item: Exercises) = db.getExerciseDao().delete(item)

    fun allGroceryItems() = db.getExerciseDao().readExercises()
}