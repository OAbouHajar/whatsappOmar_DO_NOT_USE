package X;

import java.util.ArrayList;

/* renamed from: X.0Dl  reason: invalid class name */
public class AnonymousClass0Dl extends AnonymousClass0SN {
    public float A00 = -1.0f;
    public int A01;
    public int A02 = -1;
    public int A03 = -1;
    public AnonymousClass0S1 A04;

    public AnonymousClass0Dl() {
        AnonymousClass0S1 r3 = this.A0Y;
        this.A04 = r3;
        this.A01 = 0;
        ArrayList arrayList = this.A0g;
        arrayList.clear();
        arrayList.add(r3);
        AnonymousClass0S1[] r1 = this.A0n;
        int length = r1.length;
        for (int i2 = 0; i2 < length; i2++) {
            r1[i2] = r3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        throw new java.lang.AssertionError(r3.name());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r2.A01 == 1) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r2.A01 == 0) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return r2.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0S1 A07(X.AnonymousClass0KD r3) {
        /*
            r2 = this;
            int r0 = r3.ordinal()
            switch(r0) {
                case 0: goto L_0x001e;
                case 1: goto L_0x0011;
                case 2: goto L_0x0017;
                case 3: goto L_0x0011;
                case 4: goto L_0x0017;
                case 5: goto L_0x001e;
                case 6: goto L_0x001e;
                case 7: goto L_0x001e;
                case 8: goto L_0x001e;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.String r1 = r3.name()
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x0011:
            int r1 = r2.A01
            r0 = 1
            if (r1 != r0) goto L_0x0007
            goto L_0x001b
        L_0x0017:
            int r0 = r2.A01
            if (r0 != 0) goto L_0x0007
        L_0x001b:
            X.0S1 r0 = r2.A04
            return r0
        L_0x001e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Dl.A07(X.0KD):X.0S1");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r0.A0o[0] != X.C03810Jy.A04) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(X.AnonymousClass0VD r10) {
        /*
            r9 = this;
            X.0SN r3 = r9.A0Z
            if (r3 == 0) goto L_0x005d
            X.0KD r0 = X.AnonymousClass0KD.LEFT
            X.0S1 r7 = r3.A07(r0)
            X.0KD r0 = X.AnonymousClass0KD.RIGHT
            X.0S1 r6 = r3.A07(r0)
            X.0SN r0 = r9.A0Z
            r2 = 1
            r4 = 0
            if (r0 == 0) goto L_0x001f
            X.0Jy[] r0 = r0.A0o
            r1 = r0[r4]
            X.0Jy r0 = X.C03810Jy.WRAP_CONTENT
            r8 = 1
            if (r1 == r0) goto L_0x0020
        L_0x001f:
            r8 = 0
        L_0x0020:
            int r0 = r9.A01
            if (r0 != 0) goto L_0x003d
            X.0KD r0 = X.AnonymousClass0KD.TOP
            X.0S1 r7 = r3.A07(r0)
            X.0KD r0 = X.AnonymousClass0KD.BOTTOM
            X.0S1 r6 = r3.A07(r0)
            X.0SN r0 = r9.A0Z
            if (r0 == 0) goto L_0x00a7
            X.0Jy[] r0 = r0.A0o
            r1 = r0[r2]
            X.0Jy r0 = X.C03810Jy.WRAP_CONTENT
            if (r1 != r0) goto L_0x00a7
        L_0x003c:
            r8 = r2
        L_0x003d:
            int r0 = r9.A02
            r5 = 8
            r1 = -1
            r3 = 5
            if (r0 == r1) goto L_0x005e
            X.0S1 r0 = r9.A04
            X.0SA r2 = r10.A06(r0)
            X.0SA r1 = r10.A06(r7)
            int r0 = r9.A02
            r10.A0E(r2, r1, r0, r5)
            if (r8 == 0) goto L_0x005d
            X.0SA r0 = r10.A06(r6)
            r10.A0F(r0, r2, r4, r3)
        L_0x005d:
            return
        L_0x005e:
            int r0 = r9.A03
            if (r0 == r1) goto L_0x007f
            X.0S1 r0 = r9.A04
            X.0SA r2 = r10.A06(r0)
            X.0SA r1 = r10.A06(r6)
            int r0 = r9.A03
            int r0 = -r0
            r10.A0E(r2, r1, r0, r5)
            if (r8 == 0) goto L_0x005d
            X.0SA r0 = r10.A06(r7)
            r10.A0F(r2, r0, r4, r3)
            r10.A0F(r1, r2, r4, r3)
            return
        L_0x007f:
            float r1 = r9.A00
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x005d
            X.0S1 r0 = r9.A04
            X.0SA r5 = r10.A06(r0)
            X.0SA r4 = r10.A06(r6)
            float r3 = r9.A00
            X.0an r2 = r10.A02()
            X.0lx r1 = r2.A01
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.Ab0(r5, r0)
            X.0lx r0 = r2.A01
            r0.Ab0(r4, r3)
            r10.A0A(r2)
            return
        L_0x00a7:
            r2 = 0
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Dl.A0C(X.0VD):void");
    }

    public void A0E(AnonymousClass0VD r6) {
        AnonymousClass0SN r4 = this.A0Z;
        if (r4 != null) {
            int A002 = AnonymousClass0VD.A00(this.A04);
            if (this.A01 == 1) {
                this.A0P = A002;
                this.A0Q = 0;
                A09(r4.A03());
                A0A(0);
                return;
            }
            this.A0P = 0;
            this.A0Q = A002;
            A0A(r4.A04());
            A09(0);
        }
    }

    public boolean A0I() {
        return true;
    }

    public void A0L(int i2) {
        if (this.A01 != i2) {
            this.A01 = i2;
            ArrayList arrayList = this.A0g;
            arrayList.clear();
            AnonymousClass0S1 r3 = i2 == 1 ? this.A0W : this.A0Y;
            this.A04 = r3;
            arrayList.add(r3);
            AnonymousClass0S1[] r2 = this.A0n;
            int length = r2.length;
            for (int i3 = 0; i3 < length; i3++) {
                r2[i3] = r3;
            }
        }
    }
}
