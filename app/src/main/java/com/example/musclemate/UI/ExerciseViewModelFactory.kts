package com.example.musclemate.UI

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.musclemate.Repository

class ExerciseViewModelFactory(private val repository: ExerciseRepository):ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ExerciseViewModel(repository) as T
    }
}
