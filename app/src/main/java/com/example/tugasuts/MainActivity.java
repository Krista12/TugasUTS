package com.example.tugasuts;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.tugasuts.Fragment.AboutFragment;
import com.example.tugasuts.Fragment.MenuFragment;
import com.example.tugasuts.Fragment.ResultFragment;
import com.example.tugasuts.Fragment.TensiFragment;


public class MainActivity extends AppCompatActivity implements MenuFragment.OnFragmentInteractionListener,
        TensiFragment.OnFragmentInteractionListener, ResultFragment.OnFragmentInteractionListener {

    private AboutFragment aboutFragment;
    private MenuFragment menuFragment;
    private TensiFragment tensiFragment;
    private ResultFragment resultFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aboutFragment = new AboutFragment();
        menuFragment = new MenuFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_layout, menuFragment)
                .commit();
        tensiFragment = new TensiFragment();
        resultFragment = new ResultFragment();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        if (item.getItemId() == R.id.menu_about){
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .replace(R.id.fragment_layout, aboutFragment)
                    .addToBackStack(null)
                    .commit();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCekDisiniButtonClicked() {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .replace(R.id.fragment_layout, tensiFragment)
                .addToBackStack(null)
                .commit();

    }

    @Override
    public void onCekTensiButtonClicked(String tekanan) {
        resultFragment.setInformation(String.format("Hasil : %s", tekanan));
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .replace(R.id.fragment_layout, resultFragment)
                .commit();
    }

    @Override
    public void onTryAgainButtonClicked() {
        getSupportFragmentManager().beginTransaction();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .replace(R.id.fragment_layout, tensiFragment)
                .commit();

    }
}
