package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Ta  reason: invalid class name and case insensitive filesystem */
public class C49402Ta {
    public final C30671cl A00;
    public final List A01 = new ArrayList();

    public C49402Ta(C35441lw r2) {
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        r0 = ((X.C39931tI) r0).A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A00() {
        /*
            r2 = this;
            X.1cl r0 = r2.A00
            if (r0 == 0) goto L_0x0008
            X.1tF r0 = r0.A08
            if (r0 != 0) goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            java.lang.String r1 = "NONE"
            if (r0 == 0) goto L_0x0014
            X.1tI r0 = (X.C39931tI) r0
            java.lang.String r0 = r0.A06
            if (r0 == 0) goto L_0x0014
            return r0
        L_0x0014:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49402Ta.A00():java.lang.String");
    }

    public String A01() {
        C39901tF r1;
        C39931tI r12;
        C30671cl r0 = this.A00;
        if (r0 == null || (r1 = r0.A08) == null || !(r1 instanceof C39931tI) || (r12 = (C39931tI) r1) == null) {
            return null;
        }
        return r12.A05;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r0 = (r0 = r0.A09).A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A02() {
        /*
            r1 = this;
            X.1cl r0 = r1.A00
            if (r0 == 0) goto L_0x000f
            X.1lh r0 = r0.A09
            if (r0 == 0) goto L_0x000f
            java.lang.Object r0 = r0.A00
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x000f:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49402Ta.A02():java.lang.String");
    }
}
