package X;

import android.support.v4.view.MotionEventCompat;

/* renamed from: X.3fR  reason: invalid class name and case insensitive filesystem */
public final class C69683fR extends C87354Wl {
    public final int A00;
    public final int A01;
    public final byte[] A02;

    public C69683fR(int i2, int[] iArr, int i3) {
        super(i2, i3);
        this.A01 = i2;
        this.A00 = i3;
        int i4 = 0;
        int i5 = i2 * i3;
        byte[] bArr = new byte[i5];
        this.A02 = bArr;
        while (i4 < i5) {
            int i6 = iArr[i4];
            i4 = AnonymousClass3K4.A0C(bArr, ((((i6 >> 16) & MotionEventCompat.ACTION_MASK) + ((i6 >> 7) & 510)) + (i6 & MotionEventCompat.ACTION_MASK)) >> 2, i4);
        }
    }
}
