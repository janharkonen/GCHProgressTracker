package com.example.gchperusmerkki3.helperclasses;

import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.appcompat.widget.AppCompatTextView;

import com.example.gchperusmerkki3.R;


public class CustomTextBox extends AppCompatTextView {

    public CustomTextBox(LinearLayout linearLayout, Context context) {
        this(linearLayout, context,"N/A");
    }

    public CustomTextBox(LinearLayout linearLayout, Context context, String boxText){
        this(linearLayout, context,boxText,18);
    }

    public CustomTextBox(LinearLayout linearLayout, Context context, String boxText, int textSize){
        super(context);

        this.setText(boxText);
        this.setTextColor(getResources().getColor(R.color.textcolor));
        this.setTextSize(textSize);
        this.setBackgroundResource(R.color.perusmerkki);
        this.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT));
        this.setPadding(20,1,0,1);
        //linearLayout.addView(new OutlineView(context));
        linearLayout.addView(this);
        //linearLayout.addView(new OutlineView(context));
    }
}