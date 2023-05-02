package com.facebook.redex;

import X.C108535Oj;
import X.C62723Er;
import android.graphics.Bitmap;
import android.widget.ImageView;

public class IDxSListenerShape35S0000000_2_I1 implements C108535Oj {
    public final int A00;

    public IDxSListenerShape35S0000000_2_I1(int i2) {
        this.A00 = i2;
    }

    public final void ASw(Bitmap bitmap, C62723Er r4, boolean z2) {
        ImageView ACj = r4.ACj();
        if (ACj != null) {
            ACj.setBackgroundColor(0);
            ACj.setImageBitmap(bitmap);
            ACj.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }
}
