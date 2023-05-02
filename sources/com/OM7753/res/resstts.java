package com.OM7753.res;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.colorPicker.ColorSelectorDialog;

/* compiled from: OnStatusColorPicker */
public class resstts implements View.OnLongClickListener {
    TextStatusComposerActivity activity;
    int value;

    public resstts(TextStatusComposerActivity textStatusComposerActivity, int i2) {
        this.activity = textStatusComposerActivity;
        this.value = i2;
    }

    public boolean onLongClick(View view) {
        new ColorSelectorDialog(this.activity, new ColorSelectorDialog.OnColorChangedListener() {
            public void colorChanged(int i2) {
                try {
                    resstts.this.value = i2;
                    resstts.this.activity.fmTColor = i2;
                    TextStatusComposerActivity textStatusComposerActivity = resstts.this.activity;
                    ((EditText) textStatusComposerActivity.findViewById(yo.getID("entry", "id"))).setTextColor(i2);
                    ((TextView) textStatusComposerActivity.findViewById(yo.getID("font_picker_btn", "id"))).setTextColor(i2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }, this.value).show();
        return true;
    }
}
