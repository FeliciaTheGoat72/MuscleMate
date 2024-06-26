package com.example.musclemate.ExerciseFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.room.Room;

import com.example.musclemate.Database.Entity.ExerciseDao;
import com.example.musclemate.Database.Entity.ExerciseDatabase;
import com.example.musclemate.Database.Entity.Exercises;
import com.example.musclemate.R;
import com.example.musclemate.databinding.AbFragmentBinding;

public class AbFragment extends Fragment implements View.OnClickListener {

    private AbFragmentBinding binding;

    private ExerciseDatabase db;

    private Exercises crunch;

    private Exercises situp;

    private Exercises plank;

    private Exercises rtwist;

    private Exercises legRaises;

    private ExerciseDao dao;

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
        crunch = new Exercises("crunch", "ab");
        situp = new Exercises("sit-up", "ab");
        plank = new Exercises("plank", "ab");
        rtwist = new Exercises( "russian twist", "ab");
        legRaises = new Exercises("leg raises", "ab");
        db = ExerciseDatabase.getInstance(getContext());
        dao = db.exerciseDao();
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
            if(dao.getRowCount() >= 5){
                dao.delete(dao.getTopExercise());
                dao.insert(crunch);
            }else{
                dao.insert(crunch);
            }

        } else if (view.getId() == R.id.button_situp) {
            NavHostFragment.findNavController(AbFragment.this)
                    .navigate(R.id.action_AbFragment_to_situpFragment);
            if(dao.getRowCount() >= 5){
                dao.delete(dao.getTopExercise());
                dao.insert(situp);
            }else{
                dao.insert(situp);
            }

        } else if (view.getId() == R.id.button_plank) {
            NavHostFragment.findNavController(AbFragment.this)
                    .navigate(R.id.action_AbFragment_to_plankFragment);
            if(dao.getRowCount() >= 5){
                dao.delete(dao.getTopExercise());
                dao.insert(plank);
            }else{
                dao.insert(plank);
            }

        } else if (view.getId() == R.id.button_rTwist) {
            NavHostFragment.findNavController(AbFragment.this)
                    .navigate(R.id.action_AbFragment_to_rTwistFragment);
            if(dao.getRowCount() >= 5){
                dao.delete(dao.getTopExercise());
                dao.insert(rtwist);
            }else{
                dao.insert(rtwist);
            }

        } else if (view.getId() == R.id.button_legRaises) {
            NavHostFragment.findNavController(AbFragment.this)
                    .navigate(R.id.action_AbFragment_to_legRaiseFragment);
            if(dao.getRowCount() >= 5){
                dao.delete(dao.getTopExercise());
                dao.insert(legRaises);
            }else{
                dao.insert(legRaises);
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