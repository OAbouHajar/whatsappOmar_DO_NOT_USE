package X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.3QD  reason: invalid class name */
public class AnonymousClass3QD extends AnonymousClass0F8 {
    public final C16460t6 A00;
    public final long[] A01;

    public AnonymousClass3QD(Context context, C16460t6 r2, long[] jArr) {
        super(context);
        this.A01 = jArr;
        this.A00 = r2;
    }

    public void A01() {
        A00();
    }

    public void A02() {
        A00();
    }

    public void A03() {
        boolean z2 = this.A03;
        this.A03 = false;
        this.A04 |= z2;
        A09();
    }

    public /* bridge */ /* synthetic */ void A04(Object obj) {
        if (!this.A05 && this.A06) {
            super.A04(obj);
        }
    }

    public /* bridge */ /* synthetic */ Object A06() {
        ArrayList A0u = AnonymousClass000.A0u();
        for (long j2 : this.A01) {
            synchronized (this) {
                if (AnonymousClass000.A1V(this.A01)) {
                    throw new AnonymousClass057();
                }
            }
            C16740tZ A002 = this.A00.A0K.A00(j2);
            if (A002 instanceof C16730tY) {
                A0u.add(A002);
            }
        }
        return A0u;
    }
}
