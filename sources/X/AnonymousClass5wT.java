package X;

import android.content.Context;
import com.obwhatsapp.R;

/* renamed from: X.5wT  reason: invalid class name */
public class AnonymousClass5wT {
    public final C16040sK A00;
    public final C16980tz A01;
    public final AnonymousClass013 A02;
    public final C18290wS A03;
    public final C218315p A04;

    public AnonymousClass5wT(C16040sK r1, C16980tz r2, AnonymousClass013 r3, C18290wS r4, C218315p r5) {
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
    }

    public static boolean A00(AnonymousClass1Vt r2) {
        int i2 = r2.A03;
        return i2 == 100 || i2 == 200;
    }

    public final CharSequence A01(C16440t3 r9, long j2) {
        if (j2 <= 0) {
            return null;
        }
        Context context = this.A01.A00;
        Object[] A1b = C13680ns.A1b();
        AnonymousClass013 r3 = this.A02;
        return C13680ns.A0d(context, C42681yF.A05(r3, C28891Zc.A03(r3, r9.A02(j2)), C47672Jx.A00(r3, r9.A02(j2))), A1b, 0, R.string.str17a6);
    }
}
