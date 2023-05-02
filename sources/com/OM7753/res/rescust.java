package com.OM7753.res;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity;
import com.obwhatsapp.youbasha.colorPicker.ColorSelectorDialog;

/* compiled from: OnCustomPicker */
public class rescust implements View.OnLongClickListener {
    TextStatusComposerActivity activity;
    int value;

    public rescust(TextStatusComposerActivity textStatusComposerActivity, int i2) {
        this.activity = textStatusComposerActivity;
        this.value = i2;
    }

    public boolean onLongClick(View view) {
        new ColorSelectorDialog(this.activity, new ColorSelectorDialog.OnColorChangedListener() {
            public final void colorChanged(int i2) {
                try {
                    rescust.this.value = i2;
                    rescust.this.activity.getWindow().setBackgroundDrawable(new ColorDrawable(rescust.this.value));
                    rescust.this.activity.A00 = i2;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }, this.value).show();
        return true;
    }
}
