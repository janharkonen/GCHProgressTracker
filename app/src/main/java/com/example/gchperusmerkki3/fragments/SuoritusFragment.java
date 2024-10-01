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

public class SuoritusFragment extends Fragment {

    public static SuoritusFragment getInstance(){
        SuoritusFragment suoritusFragment = new SuoritusFragment();
        return suoritusFragment;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_suoritus,container,false);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.linearLayout_suoritus);

        TextView textView;
        CustomTextBox customTextBox;

        customTextBox = new CustomTextBox(linearLayout, getActivity(),"Miten perusmerkki suoritetaan?",40);


        customTextBox = new CustomTextBox(linearLayout, getActivity(),"\nKoe perusmerkin saamiseksi suoritetaan siinä kuorossa, johon suorittaja kuuluu tai kuoron suostumuksen perusteella jossakin muussa Liiton jäsenkuorossa. Koetta valvoo kuoron asettama tutkintolautakunta. Perusmerkki voidaan myös suorittaa Liiton musiikkilautakunnan asettamalle lautakunnalle esim. kuorokursseilla.");


        customTextBox = new CustomTextBox(linearLayout, getActivity(),"\nPerusmerkkiä suoritettaessa on osattava ulkoa määrätyt 40 laulua. Kokeessa on näistä laulettava ulkoa viisi arvottua laulua.");


        customTextBox = new CustomTextBox(linearLayout, getActivity(),"\nMerkkien suoritustilaisuudesta on laadittava pöytäkirja, josta ilmenee tentin aika ja paikka, tenttijöiden nimet, tutkintolautakunnan kokoonpano sekä esitetyt koelaulut. Pöytäkirja tulee toimittaa Liittoon merkkitilauksen yhteydessä.");


        customTextBox = new CustomTextBox(linearLayout, getActivity(),"\nKadonneen merkin tilalle Liitto voi myydä uuden.");


        customTextBox = new CustomTextBox(linearLayout, getActivity(),"\nLähde: http://mieskuoro.fi/project/perusmerkki/");




        return view;
    }
}