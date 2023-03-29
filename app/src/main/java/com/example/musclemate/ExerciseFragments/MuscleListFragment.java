package com.example.musclemate.ExerciseFragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.musclemate.R;
import com.example.musclemate.databinding.MainmenuFragmentBinding;

public class MuscleListFragment extends Fragment {

    private MainmenuFragmentBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = MainmenuFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.buttonChest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MuscleListFragment.this)
                        .navigate(R.id.action_MainMenuFragment_to_ChestFragment);
            }
        });
        binding.buttonArms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MuscleListFragment.this)
                        .navigate(R.id.action_MainMenuFragment_to_ArmFragment);
            }
        });
        binding.buttonLegs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MuscleListFragment.this)
                        .navigate(R.id.action_MainMenuFragment_to_LegFragment);
            }
        });
        binding.buttonAbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MuscleListFragment.this)
                        .navigate(R.id.action_MainMenuFragment_to_AbFragment);
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