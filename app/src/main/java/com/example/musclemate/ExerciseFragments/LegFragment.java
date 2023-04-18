package com.example.musclemate.ExerciseFragments;

import android.os.Bundle;
import android.util.Log;
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
import com.example.musclemate.databinding.LegFragmentBinding;

public class LegFragment extends Fragment implements View.OnClickListener {

    private LegFragmentBinding binding;

    private ExerciseDatabase db;

    private Exercises squat;

    private Exercises rDeadlift;

    private Exercises sSquat;

    private Exercises gBridges;

    private Exercises lunges;

    private ExerciseDao dao;

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_bridge) {
            NavHostFragment.findNavController(LegFragment.this)
                    .navigate(R.id.action_LegFragment_to_bridgeFragment);
            if(dao.getRowCount() >= 5){
                dao.delete(dao.getTopExercise());
                dao.insert(gBridges);
            }else{
                dao.insert(gBridges);
            }

        } else if (v.getId() == R.id.button_rdl) {
            NavHostFragment.findNavController(LegFragment.this)
                    .navigate(R.id.action_LegFragment_to_RDLFragment);
            if(dao.getRowCount() >= 5){
                dao.delete(dao.getTopExercise());
                dao.insert(rDeadlift);
            }else{
                dao.insert(rDeadlift);
            }

        } else if (v.getId() == R.id.button_split) {
            NavHostFragment.findNavController(LegFragment.this)
                    .navigate(R.id.action_LegFragment_to_splitSquatFragment);
            if(dao.getRowCount() >= 5){
                dao.delete(dao.getTopExercise());
                dao.insert(sSquat);
            }else{
                dao.insert(sSquat);
            }

        } else if (v.getId() == R.id.button_squat) {
            NavHostFragment.findNavController(LegFragment.this)
                    .navigate(R.id.action_LegFragment_to_squatFragment);
            if(dao.getRowCount() >= 5){
                dao.delete(dao.getTopExercise());
                dao.insert(squat);
            }else{
                dao.insert(squat);
            }

        } else if (v.getId() == R.id.button_lunge) {
            NavHostFragment.findNavController(LegFragment.this)
                    .navigate(R.id.action_LegFragment_to_lungeFragment);
            if(dao.getRowCount() >= 5){
                dao.delete(dao.getTopExercise());
                dao.insert(lunges);
            }else{
                dao.insert(lunges);
            }

        } else if (v.getId() == R.id.button_previous) {
            NavHostFragment.findNavController(LegFragment.this)
                    .navigate(R.id.action_LegFragment_to_MainMenuFragment);
        }

    }

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = LegFragmentBinding.inflate(inflater, container, false);
        binding.buttonSquat.setOnClickListener(this);
        binding.buttonSplit.setOnClickListener(this);
        binding.buttonRdl.setOnClickListener(this);
        binding.buttonLunge.setOnClickListener(this);
        binding.buttonBridge.setOnClickListener(this);
        binding.buttonPrevious.setOnClickListener(this);
        squat = new Exercises("squat", "leg");
        rDeadlift = new Exercises("romanian deadlift", "leg");
        sSquat = new Exercises("split squat", "leg");
        gBridges = new Exercises( "glute bridges", "leg");
        lunges = new Exercises("lunges", "leg");
        db = ExerciseDatabase.getInstance(getContext());
        dao = db.exerciseDao();
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.buttonPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(LegFragment.this)
                        .navigate(R.id.action_LegFragment_to_MainMenuFragment);
            }
        });
    }

    @Override
    public void onDestroyView() {
        Log.w("MuscleMate Main Activity: ", "Destroying Frag1 View");
        super.onDestroyView();
        binding = null;
    }

}