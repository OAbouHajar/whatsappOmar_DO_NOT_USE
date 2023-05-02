package com.facebook.redex;

import X.AnonymousClass00T;
import X.AnonymousClass25V;
import X.C16740tZ;
import X.C606634u;
import X.C606934x;
import X.C615139f;
import android.graphics.Bitmap;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.mediaview.PhotoView;

public class IDxTRendererShape14S0101000_2_I1 implements AnonymousClass25V {
    public int A00;
    public Object A01;
    public final int A02;

    public IDxTRendererShape14S0101000_2_I1(Object obj, int i2, int i3) {
        this.A02 = i3;
        this.A01 = obj;
        this.A00 = i2;
    }

    public int AG6() {
        return this.A00;
    }

    public /* synthetic */ void ARJ() {
    }

    public void AfV(Bitmap bitmap, View view, C16740tZ r6) {
        switch (this.A02) {
            case 0:
                C615139f r0 = (C615139f) this.A01;
                if (bitmap != null) {
                    r0.A0C.setImageLargeThumbWithBitmap(bitmap);
                    return;
                } else {
                    r0.A0C.setImageLargeThumbWithBackground(AnonymousClass00T.A00(r0.A03, R.color.color065f));
                    return;
                }
            case 1:
                C606634u r1 = (C606634u) this.A01;
                r1.A05.A06(bitmap);
                r1.A02 = true;
                return;
            default:
                ((C606934x) this.A01).A0F.A06(bitmap);
                return;
        }
    }

    public void Afm(View view) {
        switch (this.A02) {
            case 0:
                ((C615139f) this.A01).A0C.setImageLargeThumbWithBackground(-7829368);
                return;
            case 1:
                C606634u r2 = (C606634u) this.A01;
                PhotoView photoView = r2.A05;
                photoView.A0J = null;
                photoView.A04 = 0.0f;
                r2.A02 = false;
                return;
            default:
                PhotoView photoView2 = ((C606934x) this.A01).A0F;
                photoView2.A0J = null;
                photoView2.A04 = 0.0f;
                return;
        }
    }
}
