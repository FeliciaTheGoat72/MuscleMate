package com.example.musclemate;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.nisrulz.sensey.Sensey;
import com.github.nisrulz.sensey.ShakeDetector;

public class RandomActivity extends AppCompatActivity {


    ShakeDetector.ShakeListener shakeListener = new ShakeDetector.ShakeListener() {
        @Override
        public void onShakeDetected() {
            System.out.println("shaking");
            randomFrag();
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
