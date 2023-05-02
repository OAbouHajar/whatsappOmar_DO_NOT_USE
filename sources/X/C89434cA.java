package X;

/* renamed from: X.4cA  reason: invalid class name and case insensitive filesystem */
public final class C89434cA {
    public int A00;
    public int A01;
    public C89434cA A02;
    public C89434cA A03;
    public boolean A04;
    public boolean A05;
    public final byte[] A06;

    public C89434cA() {
        this.A06 = new byte[8192];
        this.A04 = true;
        this.A05 = false;
    }

    public C89434cA(byte[] bArr, int i2, int i3) {
        this.A06 = bArr;
        this.A01 = i2;
        this.A00 = i3;
        this.A05 = true;
        this.A04 = false;
    }

    public final C89434cA A00() {
        C89434cA r3 = this.A02;
        C89434cA r0 = r3;
        if (r3 == this) {
            r3 = null;
        }
        C89434cA r1 = this.A03;
        if (r1 != null) {
            r1.A02 = r0;
            C89434cA r02 = this.A02;
            if (r02 != null) {
                r02.A03 = r1;
                this.A02 = null;
                this.A03 = null;
                return r3;
            }
        }
        C18450wi.A07();
        throw AnonymousClass000.A0Z();
    }

    public final C89434cA A01() {
        this.A05 = true;
        return new C89434cA(this.A06, this.A01, this.A00);
    }

    public final C89434cA A02(int i2) {
        C89434cA A002;
        if (i2 <= 0 || i2 > this.A00 - this.A01) {
            throw AnonymousClass000.A0T("byteCount out of range");
        }
        if (i2 >= 1024) {
            A002 = A01();
        } else {
            A002 = C90404e5.A00();
            byte[] bArr = this.A06;
            int i3 = this.A01;
            byte[] bArr2 = A002.A06;
            C18450wi.A0G(bArr, 0);
            System.arraycopy(bArr, i3, bArr2, 0, i2);
        }
        A002.A00 = A002.A01 + i2;
        this.A01 += i2;
        C89434cA r0 = this.A03;
        if (r0 == null) {
            C18450wi.A07();
            throw AnonymousClass000.A0Z();
        }
        r0.A04(A002);
        return A002;
    }

    public final void A03() {
        C89434cA r4 = this.A03;
        int i2 = 0;
        if (r4 == this) {
            throw AnonymousClass000.A0V("cannot compact");
        } else if (r4 == null) {
            C18450wi.A07();
            throw AnonymousClass000.A0Z();
        } else if (r4.A04) {
            int i3 = this.A00 - this.A01;
            int i4 = 8192 - r4.A00;
            if (!r4.A05) {
                i2 = r4.A01;
            }
            if (i3 <= i4 + i2) {
                A05(r4, i3);
                A00();
                C90404e5.A01(this);
            }
        }
    }

    public final void A04(C89434cA r2) {
        r2.A03 = this;
        r2.A02 = this.A02;
        C89434cA r0 = this.A02;
        if (r0 == null) {
            C18450wi.A07();
            throw AnonymousClass000.A0Z();
        }
        r0.A03 = r2;
        this.A02 = r2;
    }

    public final void A05(C89434cA r7, int i2) {
        if (r7.A04) {
            int i3 = r7.A00;
            int i4 = i3 + i2;
            if (i4 > 8192) {
                if (!r7.A05) {
                    int i5 = r7.A01;
                    if (i4 - i5 <= 8192) {
                        byte[] bArr = r7.A06;
                        C18450wi.A0G(bArr, 0);
                        System.arraycopy(bArr, i5, bArr, 0, i3 - i5);
                        i3 = r7.A00 - r7.A01;
                        r7.A00 = i3;
                        r7.A01 = 0;
                    } else {
                        throw AnonymousClass3K3.A0f();
                    }
                } else {
                    throw AnonymousClass3K3.A0f();
                }
            }
            byte[] bArr2 = this.A06;
            int i6 = this.A01;
            byte[] bArr3 = r7.A06;
            C18450wi.A0G(bArr2, 0);
            System.arraycopy(bArr2, i6, bArr3, i3, i2);
            r7.A00 += i2;
            this.A01 += i2;
            return;
        }
        throw AnonymousClass000.A0V("only owner can write");
    }
}
