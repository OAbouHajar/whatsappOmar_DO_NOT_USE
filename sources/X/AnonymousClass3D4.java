package X;

import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import java.io.File;

/* renamed from: X.3D4  reason: invalid class name */
public class AnonymousClass3D4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AnonymousClass2Xz A00;

    public AnonymousClass3D4(AnonymousClass2Xz r1) {
        this.A00 = r1;
    }

    public void onGlobalLayout() {
        C35581mA r3;
        String str;
        AnonymousClass2Xz r5 = this.A00;
        C49662Uu r2 = r5.A0e;
        r2.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        C35611mD r0 = r5.A0K;
        int measuredWidth = r2.getMeasuredWidth();
        if (r0 == null || (r3 = r0.A01) == null || (str = r3.A00) == null || !r5.A0p.A0E(C16620tM.A02, 601)) {
            r2.A0C((Bitmap) null);
            return;
        }
        C100194vF r02 = r5.A0M;
        if (r02 != null) {
            if (!C34901l3.A00(r02.A03.A00, str)) {
                AnonymousClass4OY r03 = r5.A0x;
                C100194vF r1 = r5.A0M;
                C59472yL r04 = r03.A00;
                if (r04 != null) {
                    r04.A00(r1);
                }
            } else {
                return;
            }
        }
        C100194vF r22 = new C100194vF(new AnonymousClass4D1(r5), r3, measuredWidth, r2.A03(measuredWidth));
        r5.A0M = r22;
        AnonymousClass4OY r32 = r5.A0x;
        C59472yL r4 = r32.A00;
        if (r4 == null) {
            File A0C = C13700nu.A0C(r32.A03.A00.getCacheDir(), "cover_photos");
            C100174vD r7 = new C100174vD();
            C14710pd r8 = r32.A04;
            r4 = new C59472yL(r32.A01, r32.A02, r7, r8, r32.A05, r32.A06, r32.A07, A0C, "cover-photo-loader", 1);
            r32.A00 = r4;
        }
        r4.A01(r22, true);
    }
}
