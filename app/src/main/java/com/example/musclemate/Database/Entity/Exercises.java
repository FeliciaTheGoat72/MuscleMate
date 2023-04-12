package com.example.musclemate.Database.Entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity
public class Exercises {
    @PrimaryKey
    public String exerciseName;

    @ColumnInfo(name = "exerciseDescription")
    public String exerciseDescription;

    @ColumnInfo(name = "exerciseMuscleGroup")
    public String exerciseMuscleGroup;

    @ColumnInfo(name = "exerciseYoutubeLink")
    public String exerciseYoutubeLink;
}

