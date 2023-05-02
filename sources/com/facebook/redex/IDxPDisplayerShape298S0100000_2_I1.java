package com.facebook.redex;

import X.AnonymousClass2OY;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.obwhatsapp.R;

public class IDxPDisplayerShape298S0100000_2_I1 implements AnonymousClass2OY {
    public Object A00;
    public final int A01;

    public IDxPDisplayerShape298S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void AfW(Bitmap bitmap, ImageView imageView, boolean z2) {
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            Afn(imageView);
        }
    }

    public void Afn(ImageView imageView) {
        imageView.setImageResource(R.drawable.avatar_contact);
    }
}
