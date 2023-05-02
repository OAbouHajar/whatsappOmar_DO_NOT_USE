package X;

import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.36A  reason: invalid class name */
public class AnonymousClass36A extends C16690tT {
    public final AnonymousClass013 A00;
    public final C18210wK A01;
    public final WeakReference A02;
    public final List A03;

    public AnonymousClass36A(TextView textView, AnonymousClass013 r3, C18210wK r4, List list) {
        this.A01 = r4;
        this.A00 = r3;
        this.A03 = list;
        this.A02 = C13690nt.A0h(textView);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        long j2;
        C31781f1 A022;
        C18210wK r9 = this.A01;
        long j3 = 0;
        for (C16730tY r0 : this.A03) {
            C16750ta A002 = C16730tY.A00(r0);
            long j4 = r0.A01;
            if (A002.A0W) {
                j2 = 0;
            } else {
                String str = A002.A0I;
                j2 = 0;
                if (!(str == null || (A022 = r9.A0J.A02(str, 1)) == null)) {
                    j2 = A022.A0A;
                }
            }
            j3 += j4 - j2;
        }
        return Long.valueOf(j3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if ((r1 instanceof java.util.List) != false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0A(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Number r5 = (java.lang.Number) r5
            java.lang.ref.WeakReference r0 = r4.A02
            java.lang.Object r3 = r0.get()
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L_0x002a
            java.lang.Object r1 = r3.getTag()
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L_0x002a
        L_0x0014:
            java.util.List r0 = r4.A03
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0029
            X.013 r2 = r4.A00
            long r0 = r5.longValue()
            java.lang.String r0 = X.C38621r6.A0I(r2, r0)
            r3.setText(r0)
        L_0x0029:
            return
        L_0x002a:
            r1 = 0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36A.A0A(java.lang.Object):void");
    }
}
