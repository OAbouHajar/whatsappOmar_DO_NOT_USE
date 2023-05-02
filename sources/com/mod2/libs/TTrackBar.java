package com.mod2.libs;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.SeekBar;

public abstract class TTrackBar extends SeekBar implements SeekBar.OnSeekBarChangeListener {
    private TTR TR;
    private Context context;
    private String idOwner;
    private String idPosition;
    private int vMax;
    private int vMin;

    public TTrackBar(Context context2, AttributeSet attributeSet) {
        super(context2, attributeSet);
    }

    public TTrackBar(Context context2, AttributeSet attributeSet, int i2, int i3) {
        super(context2, attributeSet);
        this.context = context2;
        if (!isInEditMode()) {
            this.TR = new TTR(this.context);
            this.idOwner = this.TR.GetOwner(this);
            this.idPosition = String.valueOf(this.idOwner) + ".Position";
            this.vMax = i2;
            this.vMin = i3;
            setMax(this.vMax - this.vMin);
            setProgress(this.TR.GetSharedInteger(this.idPosition, this.vMin) - this.vMin);
            setOnSeekBarChangeListener(this);
        }
    }

    public void SetPosition(int i2) {
        if (!isInEditMode()) {
            setProgress(this.TR.GetSharedInteger(this.idPosition, i2) - this.vMin);
        }
    }

    public abstract void onChange(String str, int i2);

    public void onProgressChanged(SeekBar seekBar, int i2, boolean z2) {
        int i3 = this.vMin + i2;
        this.TR.SetSharedInteger(this.idPosition, i3);
        onChange(seekBar.getClass().getSimpleName(), i3);
    }

    public abstract void onStart(String str);

    public void onStartTrackingTouch(SeekBar seekBar) {
        onStart(seekBar.getClass().getSimpleName());
    }

    public abstract void onStop(String str);

    public void onStopTrackingTouch(SeekBar seekBar) {
        onStop(seekBar.getClass().getSimpleName());
    }
}
