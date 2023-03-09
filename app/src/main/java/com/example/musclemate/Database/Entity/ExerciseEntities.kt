package com.example.musclemate.Database.Entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

// This is a data class which store data.
// Entities class create a table in database,
// in our database we will create three column

@Entity(tableName = "exercises")

data class Exercises(

    // create itemName variable to
    // store grocery items.
    @ColumnInfo(name = "exerciseName")
    var exerciseName: String,

    // create itemQuantity variable
    // to store grocery quantity.
    @ColumnInfo(name = "exerciseReps")
    var exerciseReps: Int,


) {
    // Primary key is a unique key
    // for different database.
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}