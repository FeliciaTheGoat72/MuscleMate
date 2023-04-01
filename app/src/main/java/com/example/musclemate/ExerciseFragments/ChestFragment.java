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
import com.example.musclemate.databinding.ChestFragmentBinding;

public class ChestFragment extends Fragment implements View.OnClickListener {

    private ChestFragmentBinding binding;

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_bench) {
            NavHostFragment.findNavController(ChestFragment.this)
                    .navigate(R.id.action_ChestFragment_to_benchFragment);
        } else if (v.getId() == R.id.button_incline) {
            NavHostFragment.findNavController(ChestFragment.this)
                    .navigate(R.id.action_ChestFragment_to_inclineFragment);
        } else if (v.getId() == R.id.button_dbFly) {
            NavHostFragment.findNavController(ChestFragment.this)
                    .navigate(R.id.action_ChestFragment_to_fliesFragment);
        } else if (v.getId() == R.id.button_dips) {
            NavHostFragment.findNavController(ChestFragment.this)
                    .navigate(R.id.action_ChestFragment_to_dipsFragment);
        } else if (v.getId() == R.id.button_pushups) {
            NavHostFragment.findNavController(ChestFragment.this)
                    .navigate(R.id.action_ChestFragment_to_pushUpsFragment);
        } else if (v.getId() == R.id.button_previous) {
            NavHostFragment.findNavController(ChestFragment.this)
                    .navigate(R.id.action_ChestFragment_to_MainMenuFragment);
        }

    }

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = ChestFragmentBinding.inflate(inflater, container, false);
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

//        binding.buttonBench.setOnClickListener(view1 -> NavHostFragment.findNavController(ChestFragment.this)
//                .navigate(R.id.action_ChestFragment_to_benchFragment));
//        binding.buttonIncline.setOnClickListener(view1 -> NavHostFragment.findNavController(ChestFragment.this)
//                .navigate(R.id.action_ChestFragment_to_inclineFragment));
//
//        binding.buttonPrevious.setOnClickListener(view12 -> NavHostFragment.findNavController(ChestFragment.this)
//                .navigate(R.id.action_ChestFragment_to_MainMenuFragment));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.w("MuscleMate Curl Fragment: ", "Destroying View");
        binding = null;
    }

}
