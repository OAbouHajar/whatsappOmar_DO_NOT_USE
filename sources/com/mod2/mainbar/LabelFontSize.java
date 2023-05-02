package com.mod2.mainbar;

import android.content.Context;
import android.util.AttributeSet;
import com.mod2.libs.Const;
import com.mod2.libs.TLabel;
import com.mod2.libs.TTR;

public class LabelFontSize extends TLabel {
    private TTR TR;
    private Context context;

    public LabelFontSize(Context context2, AttributeSet attributeSet) {
        super(context2, attributeSet);
        this.context = context2;
        if (!isInEditMode()) {
            this.TR = new TTR(this.context);
            setText(String.valueOf(this.TR.GetSharedInteger("TrackBarFontSize.Position", Const.TrackBarDef)));
        }
    }
}
