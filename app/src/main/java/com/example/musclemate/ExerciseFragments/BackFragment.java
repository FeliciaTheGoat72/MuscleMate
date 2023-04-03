package com.example.musclemate.ExerciseFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.musclemate.R;
import com.example.musclemate.databinding.BackFragmentBinding;

public class BackFragment extends Fragment implements View.OnClickListener {

    private BackFragmentBinding binding;

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
        } else if (view.getId() == R.id.button_pullup) {
            NavHostFragment.findNavController(BackFragment.this)
                    .navigate(R.id.action_BackFragment_to_pullupFragment);
        } else if (view.getId() == R.id.button_deadlift) {
            NavHostFragment.findNavController(BackFragment.this)
                    .navigate(R.id.action_BackFragment_to_deadliftFragment);
        } else if (view.getId() == R.id.button_upright) {
            NavHostFragment.findNavController(BackFragment.this)
                    .navigate(R.id.action_BackFragment_to_uprightRowFragment);
        } else if (view.getId() == R.id.button_dbRow) {
            NavHostFragment.findNavController(BackFragment.this)
                    .navigate(R.id.action_BackFragment_to_bendOverRowFragment);
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