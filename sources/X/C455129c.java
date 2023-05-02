package X;

import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.29c  reason: invalid class name and case insensitive filesystem */
public class C455129c extends AnonymousClass01X {
    public final List A00;
    public final boolean A01;
    public final /* synthetic */ AnonymousClass291 A02;

    public C455129c(AnonymousClass291 r1, List list, boolean z2) {
        this.A02 = r1;
        this.A00 = list;
        this.A01 = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r3.A01 != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0C() {
        /*
            r3 = this;
            java.util.List r0 = r3.A00
            int r2 = r0.size()
            X.291 r1 = r3.A02
            X.1sx r0 = r1.A0n
            if (r0 != 0) goto L_0x0015
            X.1sx r0 = r1.A0m
            if (r0 != 0) goto L_0x0015
            boolean r1 = r3.A01
            r0 = 1
            if (r1 == 0) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            int r2 = r2 + r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C455129c.A0C():int");
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r4, int i2) {
        List list;
        C65093Sv r42 = (C65093Sv) r4;
        AnonymousClass291 r1 = this.A02;
        if (r1.A0n != null || r1.A0m != null || this.A01) {
            list = this.A00;
        } else if (i2 != 0) {
            list = this.A00;
            i2--;
        } else {
            return;
        }
        C39721sx r2 = (C39721sx) list.get(i2);
        C16010sH A08 = r1.A15.A08(r2.A06);
        if (A08 != null) {
            r42.A07(A08, r2);
        }
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        int i3;
        if (i2 == 0) {
            i3 = R.layout.layout03b7;
        } else if (i2 == 1) {
            i3 = R.layout.layout03b8;
        } else if (i2 != 3) {
            i3 = R.layout.layout03b6;
            if (i2 != 4) {
                i3 = R.layout.layout03b9;
            }
        } else {
            i3 = R.layout.layout03ba;
        }
        AnonymousClass291 r2 = this.A02;
        View inflate = r2.A0E.getLayoutInflater().inflate(i3, viewGroup, false);
        return i2 != 2 ? i2 != 3 ? i2 != 4 ? new C604632h(inflate, r2) : new AnonymousClass32f(inflate, r2) : new C76673uV(inflate, r2) : new C604532g(inflate, r2);
    }

    public int getItemViewType(int i2) {
        if (this.A01) {
            return 2;
        }
        AnonymousClass291 r3 = this.A02;
        if (r3.A0n == null && r3.A0m == null) {
            if (i2 == 0) {
                return 3;
            }
            i2--;
        }
        List list = this.A00;
        if (list.get(i2) == r3.A0m) {
            return 4;
        }
        return list.get(i2) == r3.A0n ? 0 : 1;
    }
}
