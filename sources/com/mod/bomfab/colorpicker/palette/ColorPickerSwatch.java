package com.mod.bomfab.colorpicker.palette;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.mod.bomfab.utils.Tools;

public class ColorPickerSwatch extends FrameLayout implements View.OnClickListener {
    private ImageView mCheckmarkImage = ((ImageView) findViewById(Tools.intId("color_picker_checkmark")));
    private int mColor;
    private OnColorSelectedListener mOnColorSelectedListener;
    private ImageView mSwatchImage = ((ImageView) findViewById(Tools.intId("color_picker_swatch")));

    public interface OnColorSelectedListener {
        void onColorSelected(int i2);
    }

    public ColorPickerSwatch(Context context, int i2, boolean z2, OnColorSelectedListener onColorSelectedListener) {
        super(context);
        this.mColor = i2;
        this.mOnColorSelectedListener = onColorSelectedListener;
        LayoutInflater.from(context).inflate(Tools.intLayout("delta_color_swatch"), this);
        setColor(i2);
        setChecked(z2);
        setOnClickListener(this);
    }

    private void setChecked(boolean z2) {
        if (z2) {
            this.mCheckmarkImage.setVisibility(0);
        } else {
            this.mCheckmarkImage.setVisibility(8);
        }
    }

    public void onClick(View view) {
        if (this.mOnColorSelectedListener != null) {
            this.mOnColorSelectedListener.onColorSelected(this.mColor);
        }
    }

    /* access modifiers changed from: protected */
    public void setColor(int i2) {
        this.mSwatchImage.setImageDrawable(new ColorStateDrawable(new Drawable[]{Tools.getDrawable("delta_aw_swatch")}, i2));
    }
}
