package com.facebook.redex;

import X.C109245Rg;
import X.C56332nT;
import X.C57812rw;
import X.C57822rx;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.obwhatsapp.R;

public class IDxLListenerShape369S0100000_2_I1 implements C109245Rg {
    public Object A00;
    public final int A01;

    public IDxLListenerShape369S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void ANg() {
        if (this.A01 == 0) {
            C57822rx r2 = (C57822rx) this.A00;
            Context context = r2.A04;
            Bitmap bitmap = C57822rx.A0F;
            if (bitmap == null) {
                bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_business_cat);
                C57822rx.A0F = bitmap;
            }
            r2.A01 = bitmap;
            r2.A02();
        }
    }

    public void ANh(Bitmap bitmap) {
        switch (this.A01) {
            case 0:
                C57822rx r0 = (C57822rx) this.A00;
                r0.A01 = bitmap;
                r0.A02();
                return;
            case 1:
                C57822rx r1 = (C57822rx) this.A00;
                r1.A00 = bitmap;
                C56332nT r02 = r1.A0B;
                r02.A04(bitmap);
                r02.A03();
                r1.A02();
                return;
            default:
                C57812rw r12 = (C57812rw) this.A00;
                if (!r12.A00) {
                    C56332nT r03 = r12.A05;
                    r03.A04(bitmap);
                    r03.A03();
                    r12.A02();
                    return;
                }
                return;
        }
    }
}
