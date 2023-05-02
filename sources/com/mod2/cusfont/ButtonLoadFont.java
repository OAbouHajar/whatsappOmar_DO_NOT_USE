package com.mod2.cusfont;

import android.content.Context;
import android.util.AttributeSet;
import com.mod2.libs.TButtonMod;
import com.mod2.libs.TTR;

public class ButtonLoadFont extends TButtonMod {
    private TTR TR = new TTR(this.context);
    private Context context;

    public ButtonLoadFont(Context context2, AttributeSet attributeSet) {
        super(context2, attributeSet);
        this.context = context2;
        setOnClickListener(this);
    }

    public void onClick(String str) {
        this.TR.StartActivity(LoadFontActivity.class);
    }

    public void onDeliverData(String str, byte[] bArr) {
    }

    public void onDeliverText(String str, String str2) {
    }
}
