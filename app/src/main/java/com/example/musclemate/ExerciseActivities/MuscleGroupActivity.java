package com.example.musclemate.ExerciseActivities;

import com.example.musclemate.IExercise;

public class MuscleGroupActivity implements IExercise {
    private String exerciseName = "Curls";
    private String muscleGroup = "Arms";
    private int exerciseID = 0;

    @Override
    public void beginExercise(){

    }

    @Override
    public void endExercise(){

    }

    @Override
    public String getExerciseName(){
        return exerciseName;
    }

    @Override
    public int getExerciseID(){
        return exerciseID;
    }
}
