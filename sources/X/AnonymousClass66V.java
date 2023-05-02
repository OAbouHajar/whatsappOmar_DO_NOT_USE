package X;

import android.content.Context;
import com.obwhatsapp.R;

/* renamed from: X.66V  reason: invalid class name */
public final /* synthetic */ class AnonymousClass66V implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C110645ea A02;

    public /* synthetic */ AnonymousClass66V(C110645ea r1, int i2, int i3) {
        this.A02 = r1;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final void run() {
        C117705tQ r2;
        C110645ea r6 = this.A02;
        int i2 = this.A00;
        int i3 = this.A01;
        AnonymousClass160 r22 = r6.A0D;
        AnonymousClass1Vt r1 = r6.A08;
        C30671cl A08 = r22.A08(r1.A0H);
        r6.A06 = A08;
        if (A08 == null) {
            r2 = new C117705tQ(3);
            Context context = r6.A05.A00;
            r2.A08 = context.getString(R.string.str1904);
            r2.A07 = context.getString(i2);
        } else {
            r2 = new C117705tQ(i3);
            r2.A03 = r1;
        }
        r6.A0A.A09(r2);
    }
}
