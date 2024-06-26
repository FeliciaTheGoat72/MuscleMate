package com.example.musclemate.ExerciseActivities;

import android.os.Bundle;

import com.example.musclemate.Database.Entity.DatabaseThread;
import com.example.musclemate.Database.Entity.ExerciseDatabase;
import com.example.musclemate.R;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.musclemate.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    int x = 0;

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    private ExerciseDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Log.w("MuscleMate Main Activity: ", "Creating View");

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);



        DatabaseThread d = new DatabaseThread(getApplicationContext());
        Thread dbThread = new Thread(d);
        dbThread.start();

    }


    public void onStart(Bundle savedInstanceState) {
        super.onStart();
        Log.w("MuscleMate Main Activity: ", "Starting View");
    }


    public void onResume(Bundle savedInstanceState) {
        super.onResume();
        Log.w("MuscleMate Main Activity: ", "Resuming View");
    }


    public void onPause(Bundle savedInstanceState) {
        super.onPause();
        Log.w("MuscleMate Main Activity: ", "Pausing View");
    }


    public void onStop(Bundle savedInstanceState) {
        super.onStop();
        Log.w("MuscleMate Main Activity: ", "Stopping View");
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}