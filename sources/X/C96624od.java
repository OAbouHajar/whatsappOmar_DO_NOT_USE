package X;

import android.support.v4.view.accessibility.AccessibilityEventCompat;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: X.4od  reason: invalid class name and case insensitive filesystem */
public final class C96624od implements C55142iu {
    public int A00;
    public int A01;
    public long A02;
    public byte[] A03 = new byte[AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED];
    public final long A04;
    public final C48622Of A05;
    public final byte[] A06 = new byte[4096];

    public C96624od(C48622Of r2, long j2, long j3) {
        this.A05 = r2;
        this.A02 = j2;
        this.A04 = j3;
    }

    public final int A00(byte[] bArr, int i2, int i3, int i4, boolean z2) {
        if (!Thread.interrupted()) {
            int read = this.A05.read(bArr, i2 + i4, i3 - i4);
            if (read != -1) {
                return i4 + read;
            }
            if (i4 == 0 && z2) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    public final void A01(int i2) {
        int i3 = this.A01 + i2;
        byte[] bArr = this.A03;
        int length = bArr.length;
        if (i3 > length) {
            this.A03 = Arrays.copyOf(bArr, AnonymousClass3K3.A0C(length << 1, i3 + AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END, AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED + i3));
        }
    }

    public final void A02(int i2) {
        int i3 = this.A00 - i2;
        this.A00 = i3;
        this.A01 = 0;
        byte[] bArr = this.A03;
        byte[] bArr2 = bArr;
        if (i3 < bArr.length - AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END) {
            bArr2 = new byte[(AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED + i3)];
        }
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        this.A03 = bArr2;
    }

    public boolean A03(int i2, boolean z2) {
        int i3 = i2;
        A01(i2);
        int i4 = this.A00;
        int i5 = this.A01;
        int i6 = i4 - i5;
        while (i6 < i2) {
            i6 = A00(this.A03, i5, i3, i6, z2);
            if (i6 == -1) {
                return false;
            }
            i5 = this.A01;
            this.A00 = i5 + i6;
        }
        this.A01 = i5 + i2;
        return true;
    }

    public void A4m(int i2) {
        A03(i2, false);
    }

    public long AEy() {
        return this.A02 + ((long) this.A01);
    }

    public long AF7() {
        return this.A02;
    }

    public int AaH(byte[] bArr, int i2, int i3) {
        int i4;
        int i5 = i3;
        A01(i3);
        int i6 = this.A00;
        int i7 = this.A01;
        int i8 = i6 - i7;
        if (i8 == 0) {
            i4 = A00(this.A03, i7, i5, 0, true);
            if (i4 == -1) {
                return -1;
            }
            this.A00 += i4;
        } else {
            i4 = Math.min(i3, i8);
        }
        System.arraycopy(this.A03, this.A01, bArr, i2, i4);
        this.A01 += i4;
        return i4;
    }

    public void AaL(byte[] bArr, int i2, int i3) {
        AaM(bArr, i2, i3, false);
    }

    public boolean AaM(byte[] bArr, int i2, int i3, boolean z2) {
        if (!A03(i3, z2)) {
            return false;
        }
        System.arraycopy(this.A03, this.A01 - i3, bArr, i2, i3);
        return true;
    }

    public boolean AbV(byte[] bArr, int i2, int i3, boolean z2) {
        int i4;
        int i5 = this.A00;
        byte[] bArr2 = bArr;
        int i6 = i2;
        int i7 = i3;
        if (i5 == 0) {
            i4 = 0;
        } else {
            i4 = Math.min(i5, i3);
            System.arraycopy(this.A03, 0, bArr, i2, i4);
            A02(i4);
        }
        while (true) {
            if (i4 < i3) {
                if (i4 == -1) {
                    break;
                }
                i4 = A00(bArr2, i6, i7, i4, z2);
            } else if (i4 != -1) {
                this.A02 += (long) i4;
                return i4 != -1;
            }
        }
    }

    public void AcS() {
        this.A01 = 0;
    }

    public int Afv(int i2) {
        int min = Math.min(this.A00, 1);
        A02(min);
        if (min == 0) {
            byte[] bArr = this.A06;
            min = A00(bArr, 0, Math.min(1, bArr.length), 0, true);
        }
        if (min != -1) {
            this.A02 += (long) min;
        }
        return min;
    }

    public void Afx(int i2) {
        int min = Math.min(this.A00, i2);
        A02(min);
        while (min < i2) {
            if (min != -1) {
                byte[] bArr = this.A06;
                min = A00(bArr, -min, Math.min(i2, bArr.length + min), min, false);
            } else {
                return;
            }
        }
        if (min != -1) {
            this.A02 += (long) min;
        }
    }

    public long getLength() {
        return this.A04;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r4 == 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(byte[] r12, int r13, int r14) {
        /*
            r11 = this;
            r5 = r11
            int r0 = r11.A00
            r9 = 0
            r6 = r12
            r7 = r13
            r8 = r14
            if (r0 == 0) goto L_0x0017
            int r4 = java.lang.Math.min(r0, r14)
            byte[] r0 = r11.A03
            java.lang.System.arraycopy(r0, r9, r12, r13, r4)
            r11.A02(r4)
            if (r4 != 0) goto L_0x001c
        L_0x0017:
            r10 = 1
            int r4 = r5.A00(r6, r7, r8, r9, r10)
        L_0x001c:
            r0 = -1
            if (r4 == r0) goto L_0x0025
            long r2 = r11.A02
            long r0 = (long) r4
            long r2 = r2 + r0
            r11.A02 = r2
        L_0x0025:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96624od.read(byte[], int, int):int");
    }

    public void readFully(byte[] bArr, int i2, int i3) {
        AbV(bArr, i2, i3, false);
    }
}
