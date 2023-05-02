package X;

import java.util.ArrayList;

/* renamed from: X.0an  reason: invalid class name and case insensitive filesystem */
public class C07210an implements C12330kD {
    public float A00 = 0.0f;
    public C13390lx A01;
    public AnonymousClass0SA A02 = null;
    public ArrayList A03 = AnonymousClass000.A0u();
    public boolean A04 = false;

    public C07210an() {
    }

    public C07210an(AnonymousClass0OZ r3) {
        this.A01 = new C07190al(this, r3);
    }

    public static void A00(C07210an r1, AnonymousClass0SA r2, AnonymousClass0SA r3, float f2, float f3) {
        r1.A01.Ab0(r2, f2);
        r1.A01.Ab0(r3, f3);
    }

    public final AnonymousClass0SA A01(AnonymousClass0SA r11, boolean[] zArr) {
        C03800Jx r1;
        C13390lx r7 = this.A01;
        int ABU = r7.ABU();
        AnonymousClass0SA r8 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < ABU; i2++) {
            float AGs = r7.AGs(i2);
            if (AGs < 0.0f) {
                AnonymousClass0SA AGr = r7.AGr(i2);
                if ((zArr == null || !zArr[AGr.A02]) && AGr != r11 && (((r1 = AGr.A06) == C03800Jx.SLACK || r1 == C03800Jx.ERROR) && AGs < f2)) {
                    f2 = AGs;
                    r8 = AGr;
                }
            }
        }
        return r8;
    }

    public void A02(C07210an r4, boolean z2) {
        this.A00 += r4.A00 * this.A01.Ahf(r4, z2);
        if (z2) {
            r4.A02.A03(this);
        }
    }

    public void A03(AnonymousClass0SA r5) {
        AnonymousClass0SA r1 = this.A02;
        if (r1 != null) {
            this.A01.Ab0(r1, -1.0f);
            this.A02 = null;
        }
        C13390lx r2 = this.A01;
        float Abq = r2.Abq(r5, true) * -1.0f;
        this.A02 = r5;
        if (Abq != 1.0f) {
            this.A00 /= Abq;
            r2.A88(Abq);
        }
    }

    public void A04(AnonymousClass0SA r5, AnonymousClass0SA r6, AnonymousClass0SA r7, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 = -i2;
                z2 = true;
            }
            this.A00 = (float) i2;
        }
        C13390lx r0 = this.A01;
        if (!z2) {
            r0.Ab0(r5, -1.0f);
            this.A01.Ab0(r6, 1.0f);
            this.A01.Ab0(r7, 1.0f);
            return;
        }
        r0.Ab0(r5, 1.0f);
        this.A01.Ab0(r6, -1.0f);
        this.A01.Ab0(r7, -1.0f);
    }

    public void A05(AnonymousClass0SA r5, AnonymousClass0SA r6, AnonymousClass0SA r7, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 = -i2;
                z2 = true;
            }
            this.A00 = (float) i2;
        }
        C13390lx r0 = this.A01;
        if (!z2) {
            r0.Ab0(r5, -1.0f);
            A00(this, r6, r7, 1.0f, -1.0f);
            return;
        }
        r0.Ab0(r5, 1.0f);
        A00(this, r6, r7, -1.0f, 1.0f);
    }

    public AnonymousClass0SA AF1(AnonymousClass0VD r2, boolean[] zArr) {
        return A01((AnonymousClass0SA) null, zArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            X.0SA r2 = r10.A02
            java.lang.String r0 = ""
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            if (r2 != 0) goto L_0x009c
            r1.append(r0)
            java.lang.String r0 = "0"
            r1.append(r0)
        L_0x0012:
            java.lang.String r0 = r1.toString()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r0)
            java.lang.String r0 = " = "
            java.lang.String r7 = X.AnonymousClass000.A0h(r0, r1)
            float r1 = r10.A00
            r6 = 0
            r9 = 0
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x009a
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r7)
            r0.append(r1)
            java.lang.String r7 = r0.toString()
            r8 = 1
        L_0x0034:
            X.0lx r0 = r10.A01
            int r5 = r0.ABU()
        L_0x003a:
            if (r6 >= r5) goto L_0x00a4
            X.0lx r0 = r10.A01
            X.0SA r1 = r0.AGr(r6)
            if (r1 == 0) goto L_0x0075
            float r4 = r0.AGs(r6)
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0075
            java.lang.String r3 = r1.toString()
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r8 != 0) goto L_0x0082
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0063
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r7)
            java.lang.String r0 = "- "
        L_0x005e:
            java.lang.String r7 = X.AnonymousClass000.A0h(r0, r1)
            float r4 = r4 * r2
        L_0x0063:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0078
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0o()
        L_0x006d:
            r0.append(r7)
            java.lang.String r7 = X.AnonymousClass000.A0h(r3, r0)
            r8 = 1
        L_0x0075:
            int r6 = r6 + 1
            goto L_0x003a
        L_0x0078:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r7)
            r0.append(r4)
            java.lang.String r7 = " "
            goto L_0x006d
        L_0x0082:
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            if (r0 <= 0) goto L_0x0094
            r1.append(r7)
            java.lang.String r0 = " + "
            java.lang.String r7 = X.AnonymousClass000.A0h(r0, r1)
            goto L_0x0063
        L_0x0094:
            r1.append(r7)
            java.lang.String r0 = " - "
            goto L_0x005e
        L_0x009a:
            r8 = 0
            goto L_0x0034
        L_0x009c:
            r1.append(r0)
            r1.append(r2)
            goto L_0x0012
        L_0x00a4:
            if (r8 != 0) goto L_0x00b0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r7)
            java.lang.String r0 = "0.0"
            java.lang.String r7 = X.AnonymousClass000.A0h(r0, r1)
        L_0x00b0:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07210an.toString():java.lang.String");
    }
}
