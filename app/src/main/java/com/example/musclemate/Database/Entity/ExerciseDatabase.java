package com.example.musclemate.Database.Entity;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Exercises.class}, version = 1)
public abstract class ExerciseDatabase extends RoomDatabase {
    public abstract ExerciseDao exerciseDao();
}
