package com.example.musclemate.ExerciseFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.musclemate.R;
import com.example.musclemate.databinding.ArmFragmentBinding;

public class ArmFragment extends Fragment implements View.OnClickListener {

    private ArmFragmentBinding binding;

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
        } else if (view.getId() == R.id.button_overhead) {
            NavHostFragment.findNavController(this)
                    .navigate(R.id.action_ArmFragment_to_OverheadFragment);
        } else if (view.getId() == R.id.button_chinups) {
            NavHostFragment.findNavController(this)
                    .navigate(R.id.action_ArmFragment_to_ChinUpsFragment);
        } else if (view.getId() == R.id.button_closegrip) {
            NavHostFragment.findNavController(this)
                    .navigate(R.id.action_ArmFragment_to_CloseGripFragment);
        } else if (view.getId() == R.id.button_military) {
            NavHostFragment.findNavController(this)
                    .navigate(R.id.action_ArmFragment_to_ShoulderPressFragment);
        } else if (view.getId() == R.id.button_latRaise) {
        NavHostFragment.findNavController(this)
                .navigate(R.id.action_ArmFragment_to_LateralRaiseFragment);
        }
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        binding.buttonPrevious.setOnClickListener(new View.OnClickListener() {
//
//        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}