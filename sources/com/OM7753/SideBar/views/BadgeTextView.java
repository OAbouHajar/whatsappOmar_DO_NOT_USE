package com.OM7753.SideBar.views;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;
import com.OM7753.GOLD;
import com.obwhatsapp.youbasha.others;
import com.obwhatsapp.youbasha.store.ColorStore;

public class BadgeTextView extends TextView {
    public BadgeTextView(Context context) {
        super(context);
        init();
    }

    public BadgeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public BadgeTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        init();
    }

    /* access modifiers changed from: package-private */
    public void init() {
        setTextColor(others.getColor("HomeCounterText", ColorStore.homectrcolor(getContext())));
        int dpToPx = GOLD.dpToPx(4.0f);
        setPadding(dpToPx, 0, dpToPx, 0);
        int dpToPx2 = GOLD.dpToPx(1.0f);
        int color = others.getColor("HomeCounterText", ColorStore.homectrcolor(getContext()));
        int fabColorNormalAssem = ColorStore.getFabColorNormalAssem(getContext());
        if (!ColorStore.INM()) {
            fabColorNormalAssem = others.getColor("HomeCounterBK", fabColorNormalAssem);
        }
        setBackground(GOLD.circleBorder(dpToPx2, color, false, fabColorNormalAssem, 0));
        if (Build.VERSION.SDK_INT >= 21) {
            setElevation((float) GOLD.dpToPx(2.0f));
        }
    }
}
