package com.facebook.redex;

import X.AnonymousClass22J;
import X.AnonymousClass3SN;
import X.C108535Oj;
import X.C18450wi;
import X.C62723Er;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.obwhatsapp.mediaview.PhotoView;

public class IDxSListenerShape268S0100000_2_I1 implements C108535Oj {
    public Object A00;
    public final int A01;

    public IDxSListenerShape268S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void ASw(Bitmap bitmap, C62723Er r6, boolean z2) {
        ImageView imageView;
        switch (this.A01) {
            case 0:
                AnonymousClass3SN r1 = (AnonymousClass3SN) this.A00;
                ImageView imageView2 = r1.A01;
                imageView2.setImageBitmap(bitmap);
                if (r1.A00) {
                    r1.A00 = false;
                    imageView2.post(new RunnableRunnableShape17S0100000_I1((Object) r1.A03, 27));
                    return;
                }
                return;
            case 1:
            case 2:
                imageView = (ImageView) this.A00;
                imageView.setBackgroundColor(0);
                break;
            case 3:
                ((PhotoView) this.A00).A06(bitmap);
                return;
            case 4:
                imageView = (ImageView) this.A00;
                break;
            default:
                C18450wi.A0H(bitmap, 2);
                ((AnonymousClass22J) this.A00).AIU(bitmap);
                return;
        }
        imageView.setImageBitmap(bitmap);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}
