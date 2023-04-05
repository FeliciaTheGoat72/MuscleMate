package com.example.musclemate;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.fragment.NavHostFragment;

import com.example.musclemate.ExerciseFragments.MuscleListFragment;
import com.github.nisrulz.sensey.Sensey;
import com.github.nisrulz.sensey.ShakeDetector;

import java.util.Random;

public class RandomActivity extends AppCompatActivity {


    ShakeDetector.ShakeListener shakeListener = new ShakeDetector.ShakeListener() {
        @Override
        public void onShakeDetected() {
            System.out.println("shaking");
            setContentView(R.layout.activity_random);

            final TextView randomWorkout = (TextView) findViewById(R.id.random_workout);


            Random rand = new Random();

            int randNumb = rand.nextInt(5);

            switch (randNumb) {
                case 0:
                    randNumb = rand.nextInt(5);
                    switch (randNumb) {
                        case 0:
                            randomWorkout.setText("Try a Chest workout - how about bench pressing?");
                            break;
                        case 1:
                            randomWorkout.setText("Try a Chest workout - let's hit an incline bench.");
                            break;
                        case 2:
                            randomWorkout.setText("Try a Chest workout - hit some flies!");
                            break;
                        case 3:
                            randomWorkout.setText("Try a Chest workout - get some dips in!");
                            break;
                        case 4:
                            randomWorkout.setText("Try a Chest workout - drop and give me 20! Do some pushups!");
                            break;
                    }
                    break;
                case 1:
                    randNumb = rand.nextInt(5);
                    switch (randNumb) {
                        case 0:
                            randomWorkout.setText("Try a Back workout - hit some Bend-over Rows");
                            break;
                        case 1:
                            randomWorkout.setText("Try a Back workout - do some pullups!");
                            break;
                        case 2:
                            randomWorkout.setText("Try a Back workout - hit a new deadlift PR!");
                            break;
                        case 3:
                            randomWorkout.setText("Try a Back workout - let's see some upright rows.");
                            break;
                        case 4:
                            randomWorkout.setText("Try a Back workout - dumbbell rows- go!");
                            break;
                    }
                    break;
                case 2:
                    randNumb = rand.nextInt(6);
                    switch (randNumb) {
                        case 0:
                            randomWorkout.setText("Try an Arm workout - hit some curls.");
                            break;
                        case 1:
                            randomWorkout.setText("Try an Arm workout - do some overhead presses!");
                            break;
                        case 2:
                            randomWorkout.setText("Try an Arm workout - let's see some chinups!");
                            break;
                        case 3:
                            randomWorkout.setText("Try an Arm workout - close grips are great for forearms.");
                            break;
                        case 4:
                            randomWorkout.setText("Try an Arm workout - go go go! Military press!");
                            break;
                        case 5:
                            randomWorkout.setText("Try an Arm workout - lateral raises will build your shoulders!");
                            break;
                    }
                    break;
                case 3:
                    randNumb = rand.nextInt(5);
                    switch (randNumb) {
                        case 0:
                            randomWorkout.setText("Try a Leg workout - work those glutes with a bridge.");
                            break;
                        case 1:
                            randomWorkout.setText("Try a Leg workout - RDLs for your hamstrings!");
                            break;
                        case 2:
                            randomWorkout.setText("Try a Leg workout - hit some squats!");
                            break;
                        case 3:
                            randomWorkout.setText("Try a Leg workout - lunges will help you build your legs quickly!");
                            break;
                        case 4:
                            randomWorkout.setText("Try a Leg workout - let's see you do some splits.");
                            break;
                    }
                    break;
                case 4:
                    randNumb = rand.nextInt(5);
                    switch (randNumb) {
                        case 0:
                            randomWorkout.setText("Try an Ab workout - hit some crunches!");
                            break;
                        case 1:
                            randomWorkout.setText("Try an Ab workout - situps will work your core!");
                            break;
                        case 2:
                            randomWorkout.setText("Try an Ab workout - planking: it's still a thing!");
                            break;
                        case 3:
                            randomWorkout.setText("Try an Ab workout - Russian twists are killer on your obliques.");
                            break;
                        case 4:
                            randomWorkout.setText("Try an Ab workout - leg raises are great for your lower abs!");
                            break;
                    }
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("RandomActivity entered");
        setContentView(R.layout.activity_random);

        Sensey.getInstance().init(this);

        Sensey.getInstance().startShakeDetection(shakeListener);

    }

    protected void onDestroy() {
        super.onDestroy();
        Sensey.getInstance().stopShakeDetection(shakeListener);
    }

    public void randomFrag() {
//        Fragment newFragment = new BenchFragment();
//        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//
//        // Replace whatever is in the fragment_container view with this fragment,
//        // and add the transaction to the back stack if needed
//        transaction.replace(R.id.ChestFragment, newFragment);
//        transaction.addToBackStack(null);
//
//        // Commit the transaction
//        transaction.commit();


//        Fragment fragment = new BenchFragment();
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        fragmentManager.beginTransaction().replace(R.id.benchFragment, fragment).commit();
    }


}
