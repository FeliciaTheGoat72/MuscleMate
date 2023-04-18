package com.example.musclemate.Database.Entity;
import android.content.Context;

import com.example.musclemate.ExerciseActivities.MainActivity;

import java.io.*;
import java.util.*;



public class DatabaseThread implements Runnable {

    private Context context;

    private ExerciseDatabase db;
    public DatabaseThread(Context context) {
        this.context = context;
    }

    public void run()
    {
        db = ExerciseDatabase.getInstance(context);
        System.out.println("Database created");
    }

    public ExerciseDatabase getDb(){
        return db;
    }
}
