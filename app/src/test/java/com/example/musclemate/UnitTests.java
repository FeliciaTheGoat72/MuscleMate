package com.example.musclemate;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.musclemate.ExerciseFragments.MuscleListFragment;
import com.example.musclemate.databinding.MainmenuFragmentBinding;

import java.util.Random;

/**
 * Local unit tests, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class UnitTests {
    @Test
    public void random_isWithinBound() {
        Random rand = new Random();
        int randNumb = rand.nextInt(5);
        String msg = "Random exercise unavailable";
        assertTrue(msg, randNumb <= 5);
    }

    @Test
    public void chest_button_text_isCorrect() {
        MuscleListFragment frag = new MuscleListFragment();
        assertEquals(frag.binding.buttonChest.getText(), "Chest");
    }

    @Test
    public void back_button_text_isCorrect() {
        MuscleListFragment frag = new MuscleListFragment();
        assertEquals(frag.binding.buttonBack.getText(), "Back");
    }

    @Test
    public void arms_button_text_isCorrect() {
        MuscleListFragment frag = new MuscleListFragment();
        assertEquals(frag.binding.buttonArms.getText(), "Arms");
    }

    @Test
    public void legs_button_text_isCorrect() {
        MuscleListFragment frag = new MuscleListFragment();
        assertEquals(frag.binding.buttonLegs.getText(), "Legs");
    }

    @Test
    public void ab_button_text_isCorrect() {
        MuscleListFragment frag = new MuscleListFragment();
        assertEquals(frag.binding.buttonAbs.getText(), "Abs");
    }
}