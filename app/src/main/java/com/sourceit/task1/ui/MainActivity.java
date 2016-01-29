package com.sourceit.task1.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.sourceit.task1.R;
import com.sourceit.task1.utils.L;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        TopFragment topFragment = TopFragment.newInstance();
        BottomFragment bottomFragment = BottomFragment.newInstance();

        fragmentTransaction.add(R.id.container_top, topFragment, TopFragment.class.getSimpleName());
        fragmentTransaction.add(R.id.container_bottom, bottomFragment, BottomFragment.class.getSimpleName());
        fragmentTransaction.commit();
        L.d("ft commit");
    }
}
