package X;

/* renamed from: X.4c4  reason: invalid class name and case insensitive filesystem */
public class C89384c4 {
    public static final C89384c4 A0D = new C89384c4();
    public int A00;
    public AnonymousClass4LG A01;
    public C90494eG A02;
    public C89384c4 A03;
    public C89384c4 A04;
    public short A05;
    public short A06;
    public short A07;
    public short A08;
    public short A09;
    public short A0A;
    public int[] A0B;
    public int[] A0C;

    public final void A00(int i2, int i3, int i4) {
        int[] iArr = this.A0B;
        if (iArr == null) {
            iArr = new int[6];
            this.A0B = iArr;
        }
        int i5 = iArr[0];
        int i6 = i5 + 2;
        int length = iArr.length;
        if (i6 >= length) {
            int[] iArr2 = new int[(length + 6)];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.A0B = iArr2;
            iArr = iArr2;
        }
        int i7 = i5 + 1;
        iArr[i7] = i2;
        int i8 = i7 + 1;
        iArr[i8] = i3 | i4;
        iArr[0] = i8;
    }

    public final void A01(C89454cD r4, int i2, boolean z2) {
        if ((this.A05 & 4) != 0) {
            int i3 = this.A00 - i2;
            if (z2) {
                r4.A05(i3);
            } else {
                r4.A06(i3);
            }
        } else if (z2) {
            A00(i2, 536870912, r4.A00);
            r4.A05(-1);
        } else {
            A00(i2, 268435456, r4.A00);
            r4.A06(-1);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A02(short r8) {
        /*
            r7 = this;
            X.4c4 r6 = A0D
            r7.A04 = r6
            r5 = r7
        L_0x0005:
            if (r5 == r6) goto L_0x0030
            X.4c4 r4 = r5.A04
            r0 = 0
            r5.A04 = r0
            short r0 = r5.A0A
            if (r0 != 0) goto L_0x002e
            r5.A0A = r8
            X.4LG r3 = r5.A01
            r2 = r3
        L_0x0015:
            if (r3 == 0) goto L_0x002e
            short r0 = r5.A05
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0024
            X.4LG r0 = r2.A00
            if (r3 != r0) goto L_0x0024
        L_0x0021:
            X.4LG r3 = r3.A00
            goto L_0x0015
        L_0x0024:
            X.4c4 r1 = r3.A02
            X.4c4 r0 = r1.A04
            if (r0 != 0) goto L_0x0021
            r1.A04 = r4
            r4 = r1
            goto L_0x0021
        L_0x002e:
            r5 = r4
            goto L_0x0005
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89384c4.A02(short):void");
    }

    public String toString() {
        return AnonymousClass000.A0l(AnonymousClass000.A0r("L"), System.identityHashCode(this));
    }
}
