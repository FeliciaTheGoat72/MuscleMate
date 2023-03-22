package com.example.musclemate;

public class Exercise implements IExercise{
    private final String exerciseName;
    private final int exerciseID;

    public Exercise(String exerciseName, int exerciseID){
        this.exerciseName = exerciseName;
        this.exerciseID = exerciseID;
    }

    public String getExerciseName(){
        return exerciseName;
    }

    public int getExerciseID(){
        return exerciseID;
    }
}
