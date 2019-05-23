package com.example.android.viewpagerfragment;

import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Fragment> fragmentList=new ArrayList<>();
    public List<String> tabNames = new ArrayList<String>() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.view_pager);
        addPagesToFragmentList();

        TabLayout tabLayout = findViewById(R.id.tab_layout);

        tabNames.add("tab1");
        tabNames.add("tab2");
        PagerAdapter pagerAdapter = new com.example.android.viewpagerfragment.PagerAdapter(getSupportFragmentManager(),fragmentList,tabNames);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setOffscreenPageLimit(1);
        viewPager.setCurrentItem(0);
        viewPager.setOverScrollMode(View.OVER_SCROLL_ALWAYS);
        tabLayout.setupWithViewPager(viewPager);
        }

    private void addPagesToFragmentList() {
        Bundle bundle = new Bundle();
        bundle.putString("string1","This is fragment 1");
        Example fragment1= new Example();
        fragment1.setArguments(bundle);
        fragmentList.add(fragment1);
        bundle = new Bundle();
        bundle.putString("string1","This is fragment 2");
        Fragment fragment2 = Example.newInstance(bundle);
        fragmentList.add(fragment2);
    }
}
