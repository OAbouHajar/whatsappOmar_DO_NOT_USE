package com.facebook.redex;

import X.AnonymousClass04N;
import X.AnonymousClass1PP;
import X.AnonymousClass277;
import X.C109335Rq;
import X.C15830rv;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class IDxRHandlerShape107S0200000_2_I1 implements C109335Rq {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxRHandlerShape107S0200000_2_I1(AnonymousClass04N r1, AnonymousClass1PP r2, int i2) {
        this.A02 = i2;
        this.A00 = r2;
        this.A01 = r1;
    }

    public void AVJ(C15830rv r1, String str, int i2, long j2) {
    }

    public void AVK(AnonymousClass277 r4, long j2) {
        Bitmap bitmap;
        int i2 = this.A02;
        byte[] bArr = r4.A00;
        if (i2 != 0) {
            if (bArr == null || (bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) == null) {
                return;
            }
        } else if (bArr != null) {
            try {
                bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                if (bitmap == null) {
                    return;
                }
            } catch (OutOfMemoryError unused) {
                return;
            }
        } else {
            return;
        }
        ((AnonymousClass04N) this.A01).accept(bitmap);
    }
}
