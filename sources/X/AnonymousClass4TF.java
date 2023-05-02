package X;

import java.util.List;

/* renamed from: X.4TF  reason: invalid class name */
public final class AnonymousClass4TF {
    public final List A00;
    public final C32481gS[] A01;

    public AnonymousClass4TF(List list) {
        this.A00 = list;
        this.A01 = new C32481gS[list.size()];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002b, code lost:
        if ("application/cea-708".equals(r6) != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C15060qG r8, X.AnonymousClass4WV r9) {
        /*
            r7 = this;
            r4 = 0
        L_0x0001:
            X.1gS[] r3 = r7.A01
            int r0 = r3.length
            if (r4 >= r0) goto L_0x0067
            r9.A03()
            int r1 = r9.A01()
            r0 = 3
            X.1gS r2 = r8.Ah1(r1, r0)
            java.util.List r0 = r7.A00
            java.lang.Object r5 = r0.get(r4)
            X.1gT r5 = (X.C32491gT) r5
            java.lang.String r6 = r5.A0T
            java.lang.String r0 = "application/cea-608"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r0.equals(r6)
            r1 = 0
            if (r0 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            java.lang.String r0 = "Invalid closed caption mime type provided: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r6, r0)
            if (r1 == 0) goto L_0x005e
            X.1gR r1 = X.AnonymousClass3K4.A0N()
            java.lang.String r0 = r9.A02()
            r1.A0O = r0
            r1.A0R = r6
            int r0 = r5.A0G
            r1.A0E = r0
            java.lang.String r0 = r5.A0S
            r1.A0Q = r0
            int r0 = r5.A03
            r1.A02 = r0
            java.util.List r0 = r5.A0U
            r1.A0S = r0
            X.AnonymousClass3K3.A19(r1, r2)
            r3[r4] = r2
            int r4 = r4 + 1
            goto L_0x0001
        L_0x005e:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4TF.A00(X.0qG, X.4WV):void");
    }

    public void A01(C90504eH r5, long j2) {
        if (C90504eH.A00(r5) >= 9) {
            int A07 = r5.A07();
            int A072 = r5.A07();
            int A0C = r5.A0C();
            if (A07 == 434 && A072 == 1195456820 && A0C == 3) {
                C87504Xd.A01(r5, this.A01, j2);
            }
        }
    }
}
