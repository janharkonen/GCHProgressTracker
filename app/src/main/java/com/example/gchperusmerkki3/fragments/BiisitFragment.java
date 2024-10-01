package com.example.gchperusmerkki3.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.content.res.Resources;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.gchperusmerkki3.MainActivity;
import com.example.gchperusmerkki3.R;
import com.example.gchperusmerkki3.helperclasses.SongButton;

import java.util.ArrayList;
import java.util.List;

import static android.content.Context.MODE_PRIVATE;

public class BiisitFragment extends Fragment { //} implements MainActivity.SaveAndLoad {

    public static int[] SongButtonColorIndexes;
    private static List<String> SongList;
    public List<SongButton> SongButtonList;

    public static BiisitFragment getInstance(Bundle savedInstanceState){
        BiisitFragment biisitFragment = new BiisitFragment();
        biisitFragment.setArguments(savedInstanceState);
        biisitFragment.setRetainInstance(true);
        return biisitFragment;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        InitSongList(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_biisit, container, false);


        if (getArguments() != null) {
            SongButtonColorIndexes = getArguments().getIntArray("SongButtonColorIndexes");
        }

        InitSongButtonList();

        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.linearLayout_biisit);
        for (int i = 0 ; i < 40 ; i++){
            linearLayout.addView(SongButtonList.get(i));
        }


        return view;
    }

    @Override
    public void onPause() {
        //int a1 = SongButtonColorIndexes[0];
        //int a2 = SongButtonColorIndexes[1];
        //int a3 = SongButtonColorIndexes[2];
        super.onPause();
        //TODO try to remove this sshit
        for (int i = 0 ; i < 40 ; i++){
            SongButtonColorIndexes[i] = SongButtonList.get(i).getColorIndex();
        }
        getArguments().putIntArray("SongButtonColorIndexes",SongButtonColorIndexes);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    public void setFirstToThree(){
        SongButtonColorIndexes[0] = 3;
    }

    private void InitSongButtonList() {
        SongButtonList = new ArrayList<SongButton>();
        SongButton songButton;

        for (int i = 0;i < 40; i++){
            songButton = new SongButton(getActivity(),SongList.get(i),SongButtonColorIndexes[i],i);
            SongButtonList.add(songButton);
        }
    }

    public String getSongButtonColorIndexesString() {
        String out = "";
        int num = SongButtonList.size();
        for (int i = 0 ; i < num ; i++) {
            out = out + Integer.toString(SongButtonList.get(i).getColorIndex());
        }
        return out;
    }

    private void InitSongList(@NonNull Context context) {
        SongList = new ArrayList<String>();
        SongList.add(getResources().getString(R.string.song1));
        SongList.add(getResources().getString(R.string.song2));
        SongList.add(getResources().getString(R.string.song3));
        SongList.add(getResources().getString(R.string.song4));
        SongList.add(getResources().getString(R.string.song5));
        SongList.add(getResources().getString(R.string.song6));
        SongList.add(getResources().getString(R.string.song7));
        SongList.add(getResources().getString(R.string.song8));
        SongList.add(getResources().getString(R.string.song9));
        SongList.add(getResources().getString(R.string.song10));
        SongList.add(getResources().getString(R.string.song11));
        SongList.add(getResources().getString(R.string.song12));
        SongList.add(getResources().getString(R.string.song13));
        SongList.add(getResources().getString(R.string.song14));
        SongList.add(getResources().getString(R.string.song15));
        SongList.add(getResources().getString(R.string.song16));
        SongList.add(getResources().getString(R.string.song17));
        SongList.add(getResources().getString(R.string.song18));
        SongList.add(getResources().getString(R.string.song19));
        SongList.add(getResources().getString(R.string.song20));
        SongList.add(getResources().getString(R.string.song21));
        SongList.add(getResources().getString(R.string.song22));
        SongList.add(getResources().getString(R.string.song23));
        SongList.add(getResources().getString(R.string.song24));
        SongList.add(getResources().getString(R.string.song25));
        SongList.add(getResources().getString(R.string.song26));
        SongList.add(getResources().getString(R.string.song27));
        SongList.add(getResources().getString(R.string.song28));
        SongList.add(getResources().getString(R.string.song29));
        SongList.add(getResources().getString(R.string.song30));
        SongList.add(getResources().getString(R.string.song31));
        SongList.add(getResources().getString(R.string.song32));
        SongList.add(getResources().getString(R.string.song33));
        SongList.add(getResources().getString(R.string.song34));
        SongList.add(getResources().getString(R.string.song35));
        SongList.add(getResources().getString(R.string.song36));
        SongList.add(getResources().getString(R.string.song37));
        SongList.add(getResources().getString(R.string.song38));
        SongList.add(getResources().getString(R.string.song39));
        SongList.add(getResources().getString(R.string.song40));
    }

}