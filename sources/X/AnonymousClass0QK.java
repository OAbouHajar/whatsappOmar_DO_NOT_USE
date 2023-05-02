package X;

import android.view.View;
import com.facebook.redex.IDxCallbackShape397S0100000_I0;

/* renamed from: X.0QK  reason: invalid class name */
public class AnonymousClass0QK {
    public C05180Pp A00 = new C05180Pp();
    public final C13300ln A01;

    public AnonymousClass0QK(C13300ln r2) {
        this.A01 = r2;
    }

    public View A00(int i2, int i3, int i4, int i5) {
        C13300ln r6 = this.A01;
        int AEI = r6.AEI();
        int AEG = r6.AEG();
        int i6 = -1;
        if (i3 > i2) {
            i6 = 1;
        }
        View view = null;
        while (i2 != i3) {
            View A0C = ((AnonymousClass02W) ((IDxCallbackShape397S0100000_I0) r6).A00).A0C(i2);
            int AAb = r6.AAb(A0C);
            int AAZ = r6.AAZ(A0C);
            C05180Pp r2 = this.A00;
            r2.A04 = AEI;
            r2.A03 = AEG;
            r2.A02 = AAb;
            r2.A01 = AAZ;
            r2.A00 = 0;
            r2.A00 = i4;
            if (r2.A00()) {
                return A0C;
            }
            if (i5 != 0) {
                r2.A00 = 0;
                r2.A00 = i5;
                if (r2.A00()) {
                    view = A0C;
                }
            }
            i2 += i6;
        }
        return view;
    }

    public boolean A01(View view) {
        C05180Pp r4 = this.A00;
        C13300ln r0 = this.A01;
        int AEI = r0.AEI();
        int AEG = r0.AEG();
        int AAb = r0.AAb(view);
        int AAZ = r0.AAZ(view);
        r4.A04 = AEI;
        r4.A03 = AEG;
        r4.A02 = AAb;
        r4.A01 = AAZ;
        r4.A00 = 0;
        r4.A00 = 24579;
        return r4.A00();
    }
}
