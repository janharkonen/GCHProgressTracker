package com.example.gchperusmerkki3.helperclasses;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatButton;

import com.example.gchperusmerkki3.R;

public class SongButton extends AppCompatButton implements View.OnClickListener{

    private String buttonText;
    //TODO: public static int[] SongButtonColorIndexes;
    public int colorIndex;
    public int index;
    private boolean isNumbered = true;

    public SongButton(@NonNull Context context) {
        this(context, "N/A");
    }

    public SongButton(@NonNull Context context, String buttonText){
        this(context, buttonText, 0);
    }

    public SongButton(@NonNull Context context, String buttonText, int colorIndex){
        this(context, buttonText, colorIndex, 1);
    }

    public SongButton(@NonNull Context context, String buttonText, int colorIndex, int index){
        super(context);
        this.buttonText = buttonText;
        this.colorIndex = colorIndex;
        this.index = index;
        if (isNumbered){
            buttonText = Integer.toString(index+1) + ". " +buttonText;
        }
        this.setText(buttonText);
        setTextColor(getResources().getColor(R.color.buttontext));
        setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT));
        setSongButtonColor(colorIndex);
        setOnClickListener(this);
        setHeight(160);
    }


    public void setSongButtonColor(int colorIndex){
        int colorId;
        switch (colorIndex){
            case 0:
                colorId = R.color.black;
                break;
            case 1:
                colorId = R.color.red;
                break;
            case 2:
                colorId = R.color.yellow;
                break;
            case 3:
                colorId = R.color.green;
                break;
            default:
                throw new IllegalStateException("Unexpected value: index = " + colorIndex + ", but index should be 0, 1, 2 or 3.");
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            this.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(colorId)));
        } else {
            this.setBackgroundResource(colorId);
        }

    }

    @Override
    public void onClick(View v) {
        changeSongButtonColor();
    }//

    public void changeSongButtonColor() {
        colorIndex = changeSongButtonColorIndex();
        setSongButtonColor(colorIndex);
        //TODO int a = SongButtonColorIndexes[0];
    }

    private int changeSongButtonColorIndex() {
        //add 1 modulo 4 for the purpose of rotating to black -> red -> yellow -> greem -> black again etc...
        return (colorIndex+1)%4;
    }

    public int getColorIndex() {
        return colorIndex;
    }


}
