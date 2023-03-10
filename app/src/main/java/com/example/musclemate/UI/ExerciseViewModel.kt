package com.example.musclemate.ExerciseViewModels;


import androidx.lifecycle.ViewModel
import com.example.musclemate.Database.Entity.Exercises
import com.example.musclemate.ExerciseRepository
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.musclemate.IExercise;
import com.example.musclemate.Repository;

import java.util.List;

class MainViewModel(private val repository: ExerciseRepository) : ViewModel()
{
    fun insert(item: Exercises) = GlobalScope.launch {
        repository.insert(item)
    }

    fun delete(item: Exercises) = GlobalScope.launch {
        repository.delete(item)
    }

    fun allExercises() = repository.allExercises()
//    private Repository mRepository;
//    private final LiveData<List<IExercise>> mExercises;
}
