package com.example.musclemate;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import java.util.List;

public class MainViewModel extends AndroidViewModel {
    private Repository mRepository;
    private final LiveData<List<IExercise>> mExercises;
}
