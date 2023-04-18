package com.example.musclemate.Database.Entity;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Exercises.class}, version = 1)
public abstract class ExerciseDatabase extends RoomDatabase {
    private static final String DB_NAME = "exercise_db";
    private static ExerciseDatabase instance;

    public static synchronized ExerciseDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    ExerciseDatabase.class, DB_NAME).allowMainThreadQueries().build();
        }
        return instance;
    }

    public abstract ExerciseDao exerciseDao();
}
