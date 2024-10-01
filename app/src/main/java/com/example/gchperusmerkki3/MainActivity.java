package com.example.gchperusmerkki3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Handler;

import com.example.gchperusmerkki3.fragments.AikatauluFragment;
import com.example.gchperusmerkki3.fragments.BiisitFragment;
import com.example.gchperusmerkki3.fragments.SuoritusFragment;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    public ViewPager viewPager;
    public static int[] SongButtonColorIndexes = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    public SharedPreferences sharedPreferences;
    public Editor editor;
    public final ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
    private boolean mAlreadySaved = false;

    public void setPref(){
        int a = 1;
        sharedPreferences = getPreferences(MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setPref();

        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.view_pager);

        getTabs();
    }

    public void getTabs(){



        new Handler().post(new Runnable() {

            @Override
            public void run() {


                UpdateSongButtonColorIndexes();
                //SongButtonColorIndexes = new int[]{3,3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                Bundle args = new Bundle();
                args.putIntArray("SongButtonColorIndexes",SongButtonColorIndexes);

                viewPagerAdapter.addFragment(BiisitFragment.getInstance(args), "Biisit");
                viewPagerAdapter.addFragment(AikatauluFragment.getInstance(), "Aikataulu");
                //viewPagerAdapter.addFragment(StatsitFragment.getInstance(), "Statsit");
                viewPagerAdapter.addFragment(SuoritusFragment.getInstance(), "Suoritus");


                viewPager.setAdapter(viewPagerAdapter);

                tabLayout.setupWithViewPager(viewPager);
            }
        });


    }

    @Override
    protected void onPause() {
        super.onPause();
        String SongButtonColorIndexesString = getSongButtonColorIndexesString(SongButtonColorIndexes);
        editor.putString("SongButtonColorIndexesString",SongButtonColorIndexesString);
        editor.commit();
    }

    //public interface SaveAndLoad {
    //    public void Save(this.editor);
    //    //public void Load();
    //}

    private void UpdateSongButtonColorIndexes(){
        String string = sharedPreferences.getString("SongButtonColorIndexesString","0000000000000000000000000000000000000000");

        for (int i = 0 ; i < string.length() ; i++){
            SongButtonColorIndexes[i] = Integer.parseInt(string.substring(i,i+1));
        }
    }

    private String IntArrayToString(int[] SongButtonColorIndexes){
        String out = "";
        for (int i = 0 ; i < SongButtonColorIndexes.length ; i++){
            out = out + Integer.toString(SongButtonColorIndexes[i]);
        }
        return out;
    }

    public String getSongButtonColorIndexesString(int[] SongButtonColorIndexes) {
        String out = "";
        int num = SongButtonColorIndexes.length;
        for (int i = 0 ; i < num ; i++) {
            out = out + Integer.toString(SongButtonColorIndexes[i]);
        }
        return out;
    }
}