package com.example.musclemate.ExerciseViewModels;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.musclemate.IExercise;
import com.example.musclemate.Repository;

import java.util.List;

public class MainViewModel extends AndroidViewModel {
    private Repository mRepository;
    private final LiveData<List<IExercise>> mExercises;
}
