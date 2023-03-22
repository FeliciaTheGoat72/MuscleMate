package com.example.musclemate.ExerciseActivities;

import com.example.musclemate.IExercise;

public class MuscleGroupActivity implements IExercise {
    private String exerciseName = "Curls";
    private String muscleGroup = "Arms";
    private int exerciseID = 0;


    public void beginExercise(){

    }


    public void endExercise(){

    }


    public String getExerciseName(){
        return exerciseName;
    }


    public int getExerciseID(){
        return exerciseID;
    }
}
