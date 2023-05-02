package X;

import java.io.IOException;

/* renamed from: X.5In  reason: invalid class name and case insensitive filesystem */
public abstract class C107525In extends C32051fZ implements AnonymousClass5VM {
    public final int A00;
    public final C32071fb A01;
    public final boolean A02;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if ((r3 instanceof X.AnonymousClass5NM) != false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C107525In(X.C32071fb r3, int r4, boolean r5) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L_0x0014
            r2.A00 = r4
            if (r5 != 0) goto L_0x000e
            boolean r1 = r3 instanceof X.AnonymousClass5NM
            r0 = 0
            if (r1 == 0) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            r2.A02 = r0
            r2.A01 = r3
            return
        L_0x0014:
            java.lang.String r0 = "'obj' cannot be null"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107525In.<init>(X.1fb, int, boolean):void");
    }

    public static C32051fZ A00(C107525In r0) {
        return r0.A01.Agm();
    }

    public static C107525In A01(Object obj) {
        if (obj == null || (obj instanceof C107525In)) {
            return (C107525In) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return A01(C32051fZ.A02((byte[]) obj));
            } catch (IOException e2) {
                throw AnonymousClass000.A0T(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("failed to construct tagged object from byte[]: ")));
            }
        } else {
            throw AnonymousClass000.A0T(AnonymousClass000.A0h(AnonymousClass000.A0d(obj), AnonymousClass000.A0r("unknown object in getInstance: ")));
        }
    }

    public static void A03(C32071fb r1, C32391gH r2, int i2, boolean z2) {
        r2.A02(new C107625Ix(r1, i2, z2));
    }

    public static void A04(C32071fb r1, C32391gH r2, boolean z2) {
        r2.A02(new C107625Ix(r1, z2 ? 1 : 0, z2));
    }

    public C32051fZ A05() {
        boolean z2 = this.A02;
        return new C107625Ix(this.A01, this.A00, z2);
    }

    public C32051fZ A06() {
        boolean z2 = this.A02;
        return new C107615Iw(this.A01, this.A00, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (r3.A08() != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r3.A08() != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C33061hs r6, boolean r7) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.C107615Iw
            if (r0 == 0) goto L_0x0030
            X.1fZ r0 = A00(r5)
            X.1fZ r3 = r0.A06()
            boolean r2 = r5.A02
            if (r2 != 0) goto L_0x0018
            boolean r0 = r3.A08()
            r1 = 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x001a
        L_0x0018:
            r1 = 160(0xa0, float:2.24E-43)
        L_0x001a:
            int r0 = r5.A00
            r6.A03(r1, r0, r7)
            if (r2 == 0) goto L_0x0028
            int r0 = r3.A03()
            r6.A02(r0)
        L_0x0028:
            X.1hs r0 = r6.A00()
            r0.A04(r3, r2)
            return
        L_0x0030:
            boolean r0 = r5 instanceof X.C107625Ix
            if (r0 == 0) goto L_0x0060
            X.1fZ r0 = A00(r5)
            X.1fZ r3 = r0.A05()
            boolean r2 = r5.A02
            if (r2 != 0) goto L_0x0048
            boolean r0 = r3.A08()
            r1 = 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x004a
        L_0x0048:
            r1 = 160(0xa0, float:2.24E-43)
        L_0x004a:
            int r0 = r5.A00
            r6.A03(r1, r0, r7)
            if (r2 == 0) goto L_0x0058
            int r0 = r3.A03()
            r6.A02(r0)
        L_0x0058:
            X.1ht r0 = r6.A01()
            r3.A07(r0, r2)
            return
        L_0x0060:
            int r1 = r5.A00
            r0 = 160(0xa0, float:2.24E-43)
            r6.A03(r0, r1, r7)
            r0 = 128(0x80, float:1.794E-43)
            java.io.OutputStream r3 = r6.A00
            r3.write(r0)
            boolean r0 = r5.A02
            X.1fb r4 = r5.A01
            if (r0 != 0) goto L_0x00d0
            boolean r0 = r4 instanceof X.C107405Ib
            if (r0 == 0) goto L_0x00a5
            boolean r0 = r4 instanceof X.AnonymousClass5IU
            if (r0 == 0) goto L_0x0097
            X.5IU r4 = (X.AnonymousClass5IU) r4
            java.util.Enumeration r2 = r4.A0A()
        L_0x0082:
            boolean r0 = r2.hasMoreElements()
            if (r0 == 0) goto L_0x00d8
            java.lang.Object r0 = r2.nextElement()
            X.1fb r0 = (X.C32071fb) r0
            X.1fZ r1 = r0.Agm()
            r0 = 1
            r6.A04(r1, r0)
            goto L_0x0082
        L_0x0097:
            X.5Ib r4 = (X.C107405Ib) r4
            byte[] r1 = r4.A00
            X.5IU r0 = new X.5IU
            r0.<init>((byte[]) r1)
            java.util.Enumeration r2 = r0.A0A()
            goto L_0x0082
        L_0x00a5:
            boolean r0 = r4 instanceof X.C32411gJ
            if (r0 == 0) goto L_0x00b0
            X.1gJ r4 = (X.C32411gJ) r4
            java.util.Enumeration r2 = r4.A0B()
            goto L_0x0082
        L_0x00b0:
            boolean r0 = r4 instanceof X.C107595Iu
            if (r0 == 0) goto L_0x00bc
            X.5Iu r4 = (X.C107595Iu) r4
            com.facebook.redex.IDxEnumerationShape16S0101000_2_I1 r2 = new com.facebook.redex.IDxEnumerationShape16S0101000_2_I1
            r2.<init>(r4)
            goto L_0x0082
        L_0x00bc:
            java.lang.String r0 = "not implemented: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass000.A0d(r4)
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            X.40L r0 = new X.40L
            r0.<init>(r1)
            throw r0
        L_0x00d0:
            X.1fZ r1 = r4.Agm()
            r0 = 1
            r6.A04(r1, r0)
        L_0x00d8:
            r0 = 0
            r3.write(r0)
            r3.write(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107525In.A07(X.1hs, boolean):void");
    }

    public boolean A09(C32051fZ r4) {
        if (!(r4 instanceof C107525In)) {
            return false;
        }
        C107525In r42 = (C107525In) r4;
        if (this.A00 != r42.A00 || this.A02 != r42.A02) {
            return false;
        }
        C32051fZ A002 = A00(this);
        C32051fZ A003 = A00(r42);
        return A002 == A003 || A002.A09(A003);
    }

    public C32051fZ ADB() {
        return this;
    }

    public int hashCode() {
        int i2 = this.A00;
        int i3 = 240;
        if (this.A02) {
            i3 = 15;
        }
        return (i2 ^ i3) ^ A00(this).hashCode();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[");
        A0r.append(this.A00);
        A0r.append("]");
        return AnonymousClass000.A0f(this.A01, A0r);
    }
}
