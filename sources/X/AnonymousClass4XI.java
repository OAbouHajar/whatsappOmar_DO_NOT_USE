package X;

/* renamed from: X.4XI  reason: invalid class name */
public class AnonymousClass4XI {
    public AnonymousClass5NL[] A00;
    public volatile /* synthetic */ int _size = 0;

    public static int A00(AnonymousClass5NL[] r0, int i2, int i3) {
        AnonymousClass5NL r1 = r0[i2];
        C18450wi.A0F(r1);
        AnonymousClass5NL r02 = r0[i3];
        C18450wi.A0F(r02);
        return ((Comparable) r1).compareTo(r02);
    }

    public final AnonymousClass5NL A01() {
        AnonymousClass5NL[] r1 = this.A00;
        if (r1 == null) {
            return null;
        }
        return r1[0];
    }

    public final AnonymousClass5NL A02() {
        AnonymousClass5NL A01;
        synchronized (this) {
            A01 = A01();
        }
        return A01;
    }

    public final AnonymousClass5NL A03() {
        AnonymousClass5NL r0;
        synchronized (this) {
            r0 = null;
            if (this._size > 0) {
                r0 = A04(0);
            }
        }
        return r0;
    }

    public final AnonymousClass5NL A04(int i2) {
        AnonymousClass5NL[] r4 = this.A00;
        C18450wi.A0F(r4);
        this._size--;
        if (i2 < this._size) {
            A05(i2, this._size);
            int i3 = (i2 - 1) >> 1;
            if (i2 > 0 && A00(r4, i2, i3) < 0) {
                A05(i2, i3);
                while (i3 > 0) {
                    AnonymousClass5NL[] r2 = this.A00;
                    C18450wi.A0F(r2);
                    int i4 = (i3 - 1) >> 1;
                    if (A00(r2, i4, i3) <= 0) {
                        break;
                    }
                    A05(i3, i4);
                    i3 = i4;
                }
            } else {
                while (true) {
                    int i5 = (i2 << 1) + 1;
                    if (i5 >= this._size) {
                        break;
                    }
                    AnonymousClass5NL[] r22 = this.A00;
                    C18450wi.A0F(r22);
                    int i6 = i5 + 1;
                    if (i6 < this._size && A00(r22, i6, i5) < 0) {
                        i5 = i6;
                    }
                    if (A00(r22, i2, i5) <= 0) {
                        break;
                    }
                    A05(i2, i5);
                    i2 = i5;
                }
            }
        }
        AnonymousClass5NL r5 = r4[this._size];
        C18450wi.A0F(r5);
        C1046256e r23 = (C1046256e) r5;
        if (r23.A02 != AnonymousClass4Z3.A01) {
            r23.A02 = null;
            r23.A00 = -1;
            r4[this._size] = null;
            return r5;
        }
        throw AnonymousClass000.A0T("Failed requirement.");
    }

    public final void A05(int i2, int i3) {
        AnonymousClass5NL[] r2 = this.A00;
        C18450wi.A0F(r2);
        AnonymousClass5NL r1 = r2[i3];
        C18450wi.A0F(r1);
        AnonymousClass5NL r0 = r2[i2];
        C18450wi.A0F(r0);
        r2[i2] = r1;
        r2[i3] = r0;
        ((C1046256e) r1).A00 = i2;
        ((C1046256e) r0).A00 = i3;
    }

    public final boolean A06() {
        return AnonymousClass000.A1P(this._size);
    }
}
