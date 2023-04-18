package com.example.musclemate.Database.Entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity
public class Exercises {
    @PrimaryKey
    @NonNull
    public String exerciseName;

    @ColumnInfo(name = "exerciseMuscleGroup")
    public String exerciseMuscleGroup;

    public Exercises(String exerciseName, String exerciseMuscleGroup){
        this.exerciseName = exerciseName;
        this.exerciseMuscleGroup = exerciseMuscleGroup;
    }
}

