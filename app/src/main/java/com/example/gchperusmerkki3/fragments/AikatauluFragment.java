package com.example.gchperusmerkki3.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.gchperusmerkki3.R;
import com.example.gchperusmerkki3.helperclasses.CustomTextBox;
import com.example.gchperusmerkki3.helperclasses.OutlineView;

public class AikatauluFragment extends Fragment {

    public static AikatauluFragment getInstance(){
        AikatauluFragment aikatauluFragment = new AikatauluFragment();
        return aikatauluFragment;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_aikataulu,container,false);

        CustomTextBox customTextBox;
        View outline;
        TextView textView;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.linearLayout_aikataulu);

        outline = new OutlineView(getActivity());

        customTextBox = new CustomTextBox(linearLayout, getActivity(),"2.12. Löylyloitsu\n");

        //linearLayout.addView(outline);




        customTextBox = new CustomTextBox(linearLayout, getActivity(),"9.12. Jouluyö, juhlayö\n");


        customTextBox = new CustomTextBox(linearLayout, getActivity(),"16.12. Tule kanssani herra Jeesus\n");


        customTextBox = new CustomTextBox(linearLayout, getActivity(),"23.12. [hiomista]\n");


        customTextBox = new CustomTextBox(linearLayout, getActivity(),"30.12. Oi, kallis Suomenmaa\n");


        customTextBox = new CustomTextBox(linearLayout, getActivity(),"6.1. Eteläpohjalainen piirilaulu\n");


        customTextBox = new CustomTextBox(linearLayout, getActivity(),"13.1. Iltatunnelma\n");


        customTextBox = new CustomTextBox(linearLayout, getActivity(),"20.1. [hiomista]\n");


        return view;
    }
}