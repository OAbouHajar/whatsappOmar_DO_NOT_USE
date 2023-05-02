package X;

import android.graphics.Bitmap;
import com.facebook.redex.IDxSListenerShape2S0210000_2_I1;
import com.obwhatsapp.R;
import java.util.ArrayList;

/* renamed from: X.3Ep  reason: invalid class name and case insensitive filesystem */
public final class C62703Ep implements C38431qm {
    public C59472yL A00;
    public final int A01;

    public C62703Ep(int i2) {
        this.A01 = i2;
    }

    public /* bridge */ /* synthetic */ void AMd(AnonymousClass5TC r2) {
        C108515Oh r0;
        C62723Er r22 = (C62723Er) r2;
        if (r22.A00() && (r0 = r22.A06) != null) {
            r0.AMe(r22);
        }
    }

    public /* bridge */ /* synthetic */ void ASn(AnonymousClass5TC r20) {
        C108525Oi r0;
        C62723Er r3 = (C62723Er) r20;
        if (r3.A04 == 1) {
            ArrayList A0i = C13690nt.A0i(2);
            IDxSListenerShape2S0210000_2_I1 iDxSListenerShape2S0210000_2_I1 = new IDxSListenerShape2S0210000_2_I1(r3, 0, this);
            C35691mL r6 = r3.A05;
            int i2 = this.A01;
            C62723Er r4 = new C62723Er(r3.ACj(), r6, (C108515Oh) null, (C108525Oi) null, iDxSListenerShape2S0210000_2_I1, 2, i2, i2);
            C62723Er r10 = new C62723Er(r3.ACj(), r6, (C108515Oh) null, (C108525Oi) null, iDxSListenerShape2S0210000_2_I1, 3, Integer.MAX_VALUE, Integer.MAX_VALUE);
            A0i.add(r4);
            A0i.add(r10);
            r3.A02 = A0i;
            C59472yL r02 = this.A00;
            if (r02 != null) {
                r02.A01(r4, true);
                this.A00.A01(r10, true);
            }
        } else if (r3.A00() && (r0 = r3.A07) != null) {
            r0.ASp(r3);
        }
    }

    public /* bridge */ /* synthetic */ void ASt(AnonymousClass5TC r1) {
    }

    public /* bridge */ /* synthetic */ void ASx(Bitmap bitmap, AnonymousClass5TC r5, boolean z2) {
        C62723Er r52 = (C62723Er) r5;
        if (r52.A00()) {
            if (r52.ACj() != null) {
                r52.ACj().setTag(R.id.loaded_image_url, r52.AGp());
            }
            r52.A08.ASw(bitmap, r52, z2);
        }
    }
}
