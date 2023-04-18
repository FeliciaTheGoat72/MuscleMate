package com.example.musclemate.Database.Entity;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ExerciseDao {
    @Query("SELECT * FROM exercises")
    List<Exercises> getAll();

    @Query("SELECT * FROM exercises WHERE exerciseName = (:exerciseName)")
    List<Exercises> loadAllByName(String exerciseName);

    @Query("SELECT * FROM exercises WHERE exerciseMuscleGroup = (:exerciseMuscleGroup)")
    List<Exercises> findByMuscleGroup(String exerciseMuscleGroup);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Exercises exercise);

    @Update
    void update(Exercises exercise);

    @Delete
    void delete(Exercises exercise);
}

