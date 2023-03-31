package com.example.musclemate.ExerciseActivities;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.musclemate.ExerciseFragments.MuscleListFragment;
import com.example.musclemate.R;
import com.example.musclemate.databinding.MainmenuFragmentBinding;

public class MuscleGroupActivity extends Fragment implements View.OnClickListener{

    private MainmenuFragmentBinding binding;

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button_chest){
            NavHostFragment.findNavController(MuscleGroupActivity.this)
                    .navigate(R.id.action_MainMenuFragment_to_ChestFragment);
        } else if (v.getId() == R.id.button_back) {
            NavHostFragment.findNavController(MuscleGroupActivity.this)
                        .navigate(R.id.action_MainMenuFragment_to_BackFragment);
        } else if (v.getId() == R.id.button_arms) {
            NavHostFragment.findNavController(MuscleGroupActivity.this)
                        .navigate(R.id.action_MainMenuFragment_to_ArmFragment);
        } else if (v.getId() == R.id.button_legs) {
            NavHostFragment.findNavController(MuscleGroupActivity.this)
                        .navigate(R.id.action_MainMenuFragment_to_LegFragment);
        } else if (v.getId() == R.id.button_abs) {
            NavHostFragment.findNavController(MuscleGroupActivity.this)
                        .navigate(R.id.action_MainMenuFragment_to_AbFragment);
        }

    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = MainmenuFragmentBinding.inflate(inflater, container, false);
        binding.buttonChest.setOnClickListener(this);
        binding.buttonBack.setOnClickListener(this);
        binding.buttonArms.setOnClickListener(this);
        binding.buttonLegs.setOnClickListener(this);
        binding.buttonAbs.setOnClickListener(this);

        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        Log.w("MuscleMate Main Activity: ", "Destroying Frag1 View");
        super.onDestroyView();
        binding = null;
    }
}

