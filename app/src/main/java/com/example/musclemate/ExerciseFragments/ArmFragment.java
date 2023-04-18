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
import com.example.musclemate.databinding.ArmFragmentBinding;

public class ArmFragment extends Fragment implements View.OnClickListener {

    private ArmFragmentBinding binding;

    private ExerciseDatabase db;

    private Exercises curls;

    private Exercises overhead;

    private Exercises chinUps;

    private Exercises closeGrip;

    private Exercises latRaises;

    private Exercises military;

    private ExerciseDao dao;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = ArmFragmentBinding.inflate(inflater, container, false);
        binding.buttonPrevious.setOnClickListener(this);
        binding.buttonCurls.setOnClickListener(this);
        binding.buttonOverhead.setOnClickListener(this);
        binding.buttonChinups.setOnClickListener(this);
        binding.buttonClosegrip.setOnClickListener(this);
        binding.buttonLatRaise.setOnClickListener(this);
        binding.buttonMilitary.setOnClickListener(this);
        curls = new Exercises("curls", "arm");
        overhead = new Exercises("overhead press", "arm");
        chinUps = new Exercises("chin-ups", "arm");
        closeGrip = new Exercises( "close-grip press", "arm");
        latRaises = new Exercises("lateral raises", "arm");
        military = new Exercises("shoulder press", "arm");
        db = ExerciseDatabase.getInstance(getContext());
        dao = db.exerciseDao();
        return binding.getRoot();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button_previous) {
            NavHostFragment.findNavController(this)
                    .navigate(R.id.action_ArmFragment_to_MainMenuFragment);
        } else if (view.getId() == R.id.button_curls) {
            NavHostFragment.findNavController(this)
                    .navigate(R.id.action_ArmFragment_to_CurlFragment);
            if(dao.getRowCount() >= 5){
                dao.delete(dao.getTopExercise());
                dao.insert(curls);
            }else{
                dao.insert(curls);
            }

        } else if (view.getId() == R.id.button_overhead) {
            NavHostFragment.findNavController(this)
                    .navigate(R.id.action_ArmFragment_to_OverheadFragment);
            if(dao.getRowCount() >= 5){
                dao.delete(dao.getTopExercise());
                dao.insert(overhead);
            }else{
                dao.insert(overhead);
            }

        } else if (view.getId() == R.id.button_chinups) {
            NavHostFragment.findNavController(this)
                    .navigate(R.id.action_ArmFragment_to_ChinUpsFragment);
            if(dao.getRowCount() >= 5){
                dao.delete(dao.getTopExercise());
                dao.insert(chinUps);
            }else{
                dao.insert(chinUps);
            }

        } else if (view.getId() == R.id.button_closegrip) {
            NavHostFragment.findNavController(this)
                    .navigate(R.id.action_ArmFragment_to_CloseGripFragment);
            if(dao.getRowCount() >= 5){
                dao.delete(dao.getTopExercise());
                dao.insert(closeGrip);
            }else{
                dao.insert(closeGrip);
            }

        } else if (view.getId() == R.id.button_military) {
            NavHostFragment.findNavController(this)
                    .navigate(R.id.action_ArmFragment_to_ShoulderPressFragment);
            if(dao.getRowCount() >= 5){
                dao.delete(dao.getTopExercise());
                dao.insert(military);
            }else{
                dao.insert(military);
            }

        } else if (view.getId() == R.id.button_latRaise) {
        NavHostFragment.findNavController(this)
                .navigate(R.id.action_ArmFragment_to_LateralRaiseFragment);
            if(dao.getRowCount() >= 5){
                dao.delete(dao.getTopExercise());
                dao.insert(latRaises);
            }else{
                dao.insert(latRaises);
            }

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