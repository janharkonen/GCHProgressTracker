package com.example.gchperusmerkki3.helperclasses;

import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.appcompat.widget.AppCompatTextView;

import com.example.gchperusmerkki3.R;


public class OutlineView extends AppCompatTextView {

    public OutlineView(Context context){
        super(context);

        this.setBackgroundResource(R.color.perusmerkkivariant);
        this.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT));
        this.setPadding(0,2,0,2);
    }
}