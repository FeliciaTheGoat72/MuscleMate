package com.example.musclemate.ExerciseFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.musclemate.R;
import com.example.musclemate.databinding.AbFragmentBinding;

public class AbFragment extends Fragment implements View.OnClickListener {

    private AbFragmentBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = AbFragmentBinding.inflate(inflater, container, false);
        binding.buttonPrevious.setOnClickListener(this);
        binding.buttonCrunch.setOnClickListener(this);
        binding.buttonSitup.setOnClickListener(this);
        binding.buttonPlank.setOnClickListener(this);
        binding.buttonRTwist.setOnClickListener(this);
        binding.buttonLegRaises.setOnClickListener(this);
        return binding.getRoot();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button_previous) {
            NavHostFragment.findNavController(AbFragment.this)
                    .navigate(R.id.action_AbFragment_to_MainMenuFragment);
        } else if (view.getId() == R.id.button_crunch) {
            NavHostFragment.findNavController(AbFragment.this)
                    .navigate(R.id.action_AbFragment_to_crunchFragment);
        } else if (view.getId() == R.id.button_situp) {
            NavHostFragment.findNavController(AbFragment.this)
                    .navigate(R.id.action_AbFragment_to_situpFragment);
        } else if (view.getId() == R.id.button_plank) {
            NavHostFragment.findNavController(AbFragment.this)
                    .navigate(R.id.action_AbFragment_to_plankFragment);
        } else if (view.getId() == R.id.button_rTwist) {
            NavHostFragment.findNavController(AbFragment.this)
                    .navigate(R.id.action_AbFragment_to_rTwistFragment);
        } else if (view.getId() == R.id.button_legRaises) {
            NavHostFragment.findNavController(AbFragment.this)
                    .navigate(R.id.action_AbFragment_to_legRaiseFragment);
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