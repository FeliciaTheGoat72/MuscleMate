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
import com.github.nisrulz.sensey.ShakeDetector;

import java.util.Random;

public class MuscleListFragment extends Fragment implements View.OnClickListener {


    ShakeDetector.ShakeListener shakeListener = new ShakeDetector.ShakeListener() {
        @Override
        public void onShakeDetected() {
            System.out.println("shaking");

            Random rand = new Random();

            int randNumb = rand.nextInt(5);

            switch (randNumb) {
                case 0:
                    NavHostFragment.findNavController(MuscleListFragment.this)
                            .navigate(R.id.action_MainMenuFragment_to_ChestFragment);
                    break;
                case 1:
                    NavHostFragment.findNavController(MuscleListFragment.this)
                            .navigate(R.id.action_MainMenuFragment_to_BackFragment);
                    break;
                case 2:
                    NavHostFragment.findNavController(MuscleListFragment.this)
                            .navigate(R.id.action_MainMenuFragment_to_ArmFragment);
                    break;
                case 3:
                    NavHostFragment.findNavController(MuscleListFragment.this)
                            .navigate(R.id.action_MainMenuFragment_to_LegFragment);
                    break;
                case 4:
                    NavHostFragment.findNavController(MuscleListFragment.this)
                            .navigate(R.id.action_MainMenuFragment_to_AbFragment);
                    break;
                default:
                    System.out.println("how the fuck did you get here bruh");
            }
        }

        @Override
        public void onShakeStopped() {
            System.out.println("shaking stopped");
        }

    };
    private MainmenuFragmentBinding binding;

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_chest) {
            NavHostFragment.findNavController(MuscleListFragment.this)
                    .navigate(R.id.action_MainMenuFragment_to_ChestFragment);
        } else if (v.getId() == R.id.button_back) {
            NavHostFragment.findNavController(MuscleListFragment.this)
                    .navigate(R.id.action_MainMenuFragment_to_BackFragment);
        } else if (v.getId() == R.id.button_arms) {
            NavHostFragment.findNavController(MuscleListFragment.this)
                    .navigate(R.id.action_MainMenuFragment_to_ArmFragment);
        } else if (v.getId() == R.id.button_legs) {
            NavHostFragment.findNavController(MuscleListFragment.this)
                    .navigate(R.id.action_MainMenuFragment_to_LegFragment);
        } else if (v.getId() == R.id.button_abs) {
            NavHostFragment.findNavController(MuscleListFragment.this)
                    .navigate(R.id.action_MainMenuFragment_to_AbFragment);
        }

    }

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
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