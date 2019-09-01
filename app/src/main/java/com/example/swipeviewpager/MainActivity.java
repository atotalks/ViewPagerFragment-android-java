package com.example.swipeviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private FragmentManager fm;
    private ArrayList<Fragment> fList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = (ViewPager) findViewById(R.id.pager);

        fm = getSupportFragmentManager();

        fList = new ArrayList<Fragment>();
        fList.add(Type_1.newInstance());
        fList.add(Type_2.newInstance());
        fList.add(Type_3.newInstance());


        mViewPager.setOnPageChangeListener(viewPagerListener);


        CFPagerAdapter adapter = new CFPagerAdapter(fm, fList);
        mViewPager.setAdapter(adapter);
    }

    ViewPager.SimpleOnPageChangeListener viewPagerListener = new ViewPager.SimpleOnPageChangeListener(){
        @Override
        public void onPageSelected(int position) {
            super.onPageSelected(position);

        }
    };
}
