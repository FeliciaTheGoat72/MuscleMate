package com.example.musclemate.Database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.musclemate.Database.Entity.Exercises


@Dao
interface ExerciseDao {

    // CRUD:
    // Create
    @Insert(onConflict.OnConflictStrategy.REPLACE)
    suspend fun insert(item: Exercises)
    // Read
    @Query("SELECT * FROM grocery_items")
    fun readExercises(): LiveData<List<Exercises>>

    // Update
    @Update
    suspend fun update(item: Exercises)

    // Delete
    @Delete
    suspend fun delete(item: Exercises)
}