package org.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tablayout;
    TabItem mhome, mscience, msports, mtech, mentertainment, mhealth;
    PagerAdapter pagerAdapter;
    Toolbar mtoolbar;
    String api ="0c1df04aa0d54aa8ad52845751cccebe";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtoolbar= findViewById(R.id.toolbar);
        setActionBar(mtoolbar);
        mhome= findViewById(R.id.home);
        mhealth= findViewById(R.id.health);
        mscience= findViewById(R.id.science);
        mtech= findViewById(R.id.technology);
        mentertainment= findViewById(R.id.entertainment);
        msports= findViewById(R.id.sports);
        ViewPager viewPager= findViewById(R.id.fragmentcontainer);
        tablayout= findViewById(R.id.include);

        pagerAdapter=new PagerAdapter(getSupportFragmentManager(),6);
        viewPager.setAdapter(pagerAdapter);


            tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                @Override
                public void onTabSelected(TabLayout.Tab tab) {
                    viewPager.setCurrentItem(tab.getPosition());
                    if(tab.getPosition()==0||tab.getPosition()==1||tab.getPosition()==2||tab.getPosition()==3||tab.getPosition()==4||tab.getPosition()==5)
                        pagerAdapter.notifyDataSetChanged();

                }

                @Override
                public void onTabUnselected(TabLayout.Tab tab) {

                }

                @Override
                public void onTabReselected(TabLayout.Tab tab) {

                }
            });

            viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout));




    }


}