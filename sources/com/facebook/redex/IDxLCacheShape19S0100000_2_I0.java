package com.facebook.redex;

import X.AnonymousClass01A;
import X.AnonymousClass03L;
import X.AnonymousClass1OJ;
import X.C31781f1;
import X.C41821wi;
import X.C43201zV;
import X.C43211zc;
import android.graphics.Bitmap;
import com.obwhatsapp.status.playback.StatusPlaybackActivity;
import com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment;

public class IDxLCacheShape19S0100000_2_I0 extends AnonymousClass03L {
    public Object A00;
    public final int A01 = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxLCacheShape19S0100000_2_I0(AnonymousClass1OJ r2) {
        super(30);
        this.A00 = r2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxLCacheShape19S0100000_2_I0(C43201zV r2, int i2) {
        super(i2);
        this.A00 = r2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxLCacheShape19S0100000_2_I0(StatusPlaybackContactFragment statusPlaybackContactFragment) {
        super(3);
        this.A00 = statusPlaybackContactFragment;
    }

    public /* bridge */ /* synthetic */ int A00(Object obj, Object obj2) {
        return this.A01 != 0 ? super.A00(obj, obj2) : ((Bitmap) obj2).getByteCount() >> 10;
    }

    public /* bridge */ /* synthetic */ void A07(Object obj, Object obj2, Object obj3, boolean z2) {
        switch (this.A01) {
            case 0:
                String str = (String) obj;
                Bitmap bitmap = (Bitmap) obj2;
                C43201zV r1 = (C43201zV) this.A00;
                synchronized (r1.A03) {
                    if (z2) {
                        if (r1.A01) {
                            r1.A04.A04(bitmap.getWidth(), str, bitmap.getHeight());
                        }
                    }
                }
                return;
            case 1:
                C31781f1 r6 = (C31781f1) obj2;
                if (z2) {
                    ((AnonymousClass1OJ) this.A00).A05(r6);
                    return;
                }
                return;
            default:
                C41821wi r62 = (C41821wi) obj2;
                C43211zc r0 = (C43211zc) ((AnonymousClass01A) this.A00).A0C();
                int i2 = r0 != null ? ((StatusPlaybackActivity) r0).A03 : 0;
                if (r62 != null) {
                    if (r62.A05) {
                        r62.A06(i2);
                    }
                    if (r62.A04) {
                        r62.A05();
                    }
                    if (r62.A01) {
                        if (r62.A03) {
                            r62.A02();
                        }
                        r62.A01();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
