package com.OM7753.SideBar.quick;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;

public class QuickView extends FrameLayout {
    public QuickView(Context context) {
        super(context);
        init(context);
    }

    public QuickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public QuickView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        init(context);
    }

    /* access modifiers changed from: package-private */
    public void init(Context context) {
        LayoutInflater from = LayoutInflater.from(context);
        from.inflate(yo.getID("delta_quick_contact_" + shp.getPrefString("key_quick_position", "top"), "layout"), this);
        if (shp.getBoolean("key_quick_view")) {
            setVisibility(0);
        } else {
            setVisibility(8);
        }
    }
}
