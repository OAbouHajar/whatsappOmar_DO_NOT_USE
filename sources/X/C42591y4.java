package X;

/* renamed from: X.1y4  reason: invalid class name and case insensitive filesystem */
public class C42591y4 {
    public boolean A00;
    public boolean A01;
    public byte[] A02;
    public int[] A03;
    public final C16730tY A04;
    public transient boolean A05;

    public C42591y4(C16730tY r1) {
        this.A04 = r1;
    }

    public static boolean A00(AnonymousClass1XK r2) {
        return r2 == AnonymousClass1XK.A0X || r2 == AnonymousClass1XK.A0a || r2 == AnonymousClass1XK.A0W || r2 == AnonymousClass1XK.A0B || r2 == AnonymousClass1XK.A0Z || r2 == AnonymousClass1XK.A0G || r2 == AnonymousClass1XK.A0V || r2 == AnonymousClass1XK.A0R || r2 == AnonymousClass1XK.A0E || r2 == AnonymousClass1XK.A0F || r2 == AnonymousClass1XK.A06 || r2 == AnonymousClass1XK.A0L || r2 == AnonymousClass1XK.A07;
    }

    public synchronized void A01() {
        this.A03 = null;
        this.A02 = null;
        C16750ta r1 = this.A04.A02;
        AnonymousClass00B.A06(r1);
        r1.A0M = false;
        this.A01 = true;
        this.A00 = true;
    }

    public synchronized void A02(byte[] bArr, int[] iArr) {
        if (iArr != null) {
            this.A03 = iArr;
        }
        if (bArr != null && bArr.length > 0) {
            C16730tY r1 = this.A04;
            if ((r1 instanceof C38711rI) || this.A03 != null) {
                C16750ta r0 = r1.A02;
                AnonymousClass00B.A06(r0);
                r0.A0M = true;
                this.A02 = bArr;
                this.A00 = true;
            }
        }
        C16750ta r12 = this.A04.A02;
        AnonymousClass00B.A06(r12);
        r12.A0M = false;
        bArr = null;
        this.A02 = bArr;
        this.A00 = true;
    }

    public synchronized void A03(byte[] bArr, int[] iArr) {
        A02(bArr, iArr);
        this.A01 = true;
    }

    public synchronized boolean A04() {
        return this.A00;
    }

    public synchronized byte[] A05() {
        return this.A02;
    }

    public synchronized int[] A06() {
        return this.A03;
    }
}
