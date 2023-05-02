package com.mod2.mainbar;

import android.content.Context;
import android.util.AttributeSet;
import com.mod2.libs.Const;
import com.mod2.libs.TLabel;
import com.mod2.libs.TTR;

public class TextMainbar extends TLabel {
    private TTR TR = new TTR(this.context);
    private Context context;

    public TextMainbar(Context context2, AttributeSet attributeSet) {
        super(context2, attributeSet);
        this.context = context2;
        setTextSize((float) this.TR.GetSharedInteger("TrackBarFontSize.Position", Const.TrackBarDef));
    }
}
