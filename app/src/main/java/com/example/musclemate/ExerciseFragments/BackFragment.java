package com.example.musclemate.ExerciseFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.musclemate.Database.Entity.ExerciseDao;
import com.example.musclemate.Database.Entity.ExerciseDatabase;
import com.example.musclemate.Database.Entity.Exercises;
import com.example.musclemate.R;
import com.example.musclemate.databinding.BackFragmentBinding;

public class BackFragment extends Fragment implements View.OnClickListener {

    private BackFragmentBinding binding;

    private ExerciseDatabase db;

    private Exercises bRow;

    private Exercises pullUps;

    private Exercises deadLift;

    private Exercises uRow;

    private Exercises dRow;

    private ExerciseDao dao;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = BackFragmentBinding.inflate(inflater, container, false);
        binding.buttonPrevious.setOnClickListener(this);
        binding.buttonBoRow.setOnClickListener(this);
        binding.buttonPullup.setOnClickListener(this);
        binding.buttonDeadlift.setOnClickListener(this);
        binding.buttonUpright.setOnClickListener(this);
        binding.buttonDbRow.setOnClickListener(this);
        bRow = new Exercises("bend over row", "back");
        pullUps = new Exercises("pull-ups", "back");
        deadLift = new Exercises("dead lift", "back");
        uRow = new Exercises( "upright row", "back");
        dRow = new Exercises("dumbbell row", "back");
        db = ExerciseDatabase.getInstance(getContext());
        dao = db.exerciseDao();
        return binding.getRoot();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button_previous) {
            NavHostFragment.findNavController(BackFragment.this)
                    .navigate(R.id.action_BackFragment_to_MainMenuFragment);
        } else if (view.getId() == R.id.button_boRow) {
            NavHostFragment.findNavController(BackFragment.this)
                    .navigate(R.id.action_BackFragment_to_bendOverRowFragment);
            dao.insert(bRow);

        } else if (view.getId() == R.id.button_pullup) {
            NavHostFragment.findNavController(BackFragment.this)
                    .navigate(R.id.action_BackFragment_to_pullupFragment);
            dao.insert(pullUps);

        } else if (view.getId() == R.id.button_deadlift) {
            NavHostFragment.findNavController(BackFragment.this)
                    .navigate(R.id.action_BackFragment_to_deadliftFragment);
            dao.insert(deadLift);

        } else if (view.getId() == R.id.button_upright) {
            NavHostFragment.findNavController(BackFragment.this)
                    .navigate(R.id.action_BackFragment_to_uprightRowFragment);
            dao.insert(uRow);

        } else if (view.getId() == R.id.button_dbRow) {
            NavHostFragment.findNavController(BackFragment.this)
                    .navigate(R.id.action_BackFragment_to_dbRowFragment);
            dao.insert(dRow);

        }
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}