package com.example.musclemate;

public class ExerciseCurls implements IExercise{
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
