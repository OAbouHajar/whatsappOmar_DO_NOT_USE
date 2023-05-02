package X;

import java.util.Arrays;

/* renamed from: X.4qD  reason: invalid class name and case insensitive filesystem */
public final class C97574qD implements AnonymousClass5RB {
    public int A00;
    public int A01 = 0;
    public int A02;
    public C82224By[] A03 = new C82224By[100];
    public final int A04;
    public final C82224By[] A05 = new C82224By[1];

    public C97574qD(int i2) {
        this.A04 = i2;
    }

    public synchronized void A00(int i2) {
        boolean A1Q = AnonymousClass3K3.A1Q(i2, this.A02);
        this.A02 = i2;
        if (A1Q) {
            Ah4();
        }
    }

    public synchronized void Abh(C82224By[] r7) {
        int i2 = this.A01;
        int i3 = r5 + i2;
        C82224By[] r4 = this.A03;
        int length = r4.length;
        if (i3 >= length) {
            r4 = (C82224By[]) Arrays.copyOf(r4, Math.max(length << 1, i3));
            this.A03 = r4;
        }
        for (C82224By r2 : r7) {
            int i4 = this.A01;
            this.A01 = i4 + 1;
            r4[i4] = r2;
        }
        this.A00 -= r5;
        notifyAll();
    }

    public synchronized void Ah4() {
        int i2 = this.A02;
        int i3 = this.A04;
        int max = Math.max(0, (((i2 + i3) - 1) / i3) - this.A00);
        int i4 = this.A01;
        if (max < i4) {
            Arrays.fill(this.A03, max, i4, (Object) null);
            this.A01 = max;
        }
    }
}
