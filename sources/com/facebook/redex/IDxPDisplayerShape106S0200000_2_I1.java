package com.facebook.redex;

import X.AnonymousClass2OY;
import X.AnonymousClass2SR;
import X.C16010sH;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.obwhatsapp.community.JoinGroupBottomSheetFragment;
import com.obwhatsapp.community.SubgroupPileView;

public class IDxPDisplayerShape106S0200000_2_I1 implements AnonymousClass2OY {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxPDisplayerShape106S0200000_2_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void AfW(Bitmap bitmap, ImageView imageView, boolean z2) {
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            Afn(imageView);
        }
    }

    public void Afn(ImageView imageView) {
        int i2 = this.A02;
        Object obj = this.A00;
        imageView.setImageDrawable(AnonymousClass2SR.A01(imageView.getContext(), (i2 != 0 ? ((SubgroupPileView) obj).A02 : ((JoinGroupBottomSheetFragment) obj).A0U).A01((C16010sH) this.A01)));
    }
}
