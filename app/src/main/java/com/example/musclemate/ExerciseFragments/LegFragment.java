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
import com.example.musclemate.databinding.LegFragmentBinding;
import com.example.musclemate.databinding.LegFragmentBinding;

public class LegFragment extends Fragment implements View.OnClickListener {

    private LegFragmentBinding binding;

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_bench) {
            NavHostFragment.findNavController(LegFragment.this)
                    .navigate(R.id.action_LegFragment_to_benchFragment);
        } else if (v.getId() == R.id.button_incline) {
            NavHostFragment.findNavController(LegFragment.this)
                    .navigate(R.id.action_LegFragment_to_inclineFragment);
        } else if (v.getId() == R.id.button_dbFly) {
            NavHostFragment.findNavController(LegFragment.this)
                    .navigate(R.id.action_LegFragment_to_fliesFragment);
        } else if (v.getId() == R.id.button_dips) {
            NavHostFragment.findNavController(LegFragment.this)
                    .navigate(R.id.action_LegFragment_to_dipsFragment);
        } else if (v.getId() == R.id.button_pushups) {
            NavHostFragment.findNavController(LegFragment.this)
                    .navigate(R.id.action_LegFragment_to_pushUpsFragment);
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
        binding.buttonBench.setOnClickListener(this);
        binding.buttonIncline.setOnClickListener(this);
        binding.buttonDbFly.setOnClickListener(this);
        binding.buttonDips.setOnClickListener(this);
        binding.buttonPushups.setOnClickListener(this);
        binding.buttonPrevious.setOnClickListener(this);
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