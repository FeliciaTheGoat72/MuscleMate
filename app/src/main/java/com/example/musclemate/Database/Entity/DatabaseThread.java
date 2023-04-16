package com.example.musclemate.Database.Entity;
import android.content.Context;

import com.example.musclemate.ExerciseActivities.MainActivity;

import java.io.*;
import java.util.*;



public class DatabaseThread implements Runnable {

    private Context context;
    public DatabaseThread(Context context) {
        this.context = context;
    }

    public void run()
    {
        ExerciseDatabase db = ExerciseDatabase.getInstance(context);
        System.out.println("Database created");
    }
}
