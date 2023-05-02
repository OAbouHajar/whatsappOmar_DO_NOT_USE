package X;

import android.support.v4.view.accessibility.AccessibilityEventCompat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.2Ou  reason: invalid class name and case insensitive filesystem */
public final class C48732Ou {
    public int A00;
    public int A01 = AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED;
    public long A02;
    public byte[] A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final AnonymousClass02I A07;
    public final AnonymousClass2I6 A08;
    public final AnonymousClass1CK A09;
    public final boolean A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        if (r3.A0A != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C48732Ou(X.AnonymousClass2I6 r4, X.AnonymousClass1CK r5, java.io.RandomAccessFile r6, int r7, int r8, int r9, boolean r10) {
        /*
            r3 = this;
            r3.<init>()
            r2 = 65536(0x10000, float:9.18355E-41)
            r3.A01 = r2
            r3.A08 = r4
            r3.A06 = r7
            r3.A05 = r8
            byte[] r0 = X.C48722Ot.A00(r7)
            r3.A03 = r0
            r3.A04 = r9
            r3.A09 = r5
            r3.A0A = r10
            r1 = 0
            X.02I r0 = new X.02I
            r0.<init>(r5, r6, r1, r2)
            r3.A07 = r0
            if (r9 == 0) goto L_0x0032
            r0 = 1
            if (r9 != r0) goto L_0x002b
            r1 = 16384(0x4000, float:2.2959E-41)
        L_0x0028:
            r3.A00 = r1
            return
        L_0x002b:
            boolean r0 = r3.A0A
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r0 == 0) goto L_0x0028
        L_0x0032:
            r1 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48732Ou.<init>(X.2I6, X.1CK, java.io.RandomAccessFile, int, int, int, boolean):void");
    }

    public static long A00(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        long j2 = (long) byteBuffer.getInt();
        return 0 > j2 ? j2 + 4294967296L : j2;
    }

    public final void A01(int i2, int i3) {
        AnonymousClass02I r3 = this.A07;
        r3.A02();
        byte[] A002 = C48722Ot.A00(i2);
        ByteBuffer byteBuffer = r3.A05;
        byteBuffer.put(A002);
        if (i2 != 0) {
            byteBuffer.putInt(i3);
        }
        byteBuffer.putInt(this.A01);
        byteBuffer.putInt(this.A00);
        AnonymousClass2I6 r4 = this.A08;
        byteBuffer.putInt(r4.A01);
        if (i2 >= 2) {
            byteBuffer.putInt(r4.A00);
            byteBuffer.put(r4.A04 ? (byte) 1 : 0);
            r3.A05(r4.A03);
            byteBuffer.putInt(r4.A02);
        }
        int i4 = 0;
        while (i4 < i3) {
            AnonymousClass2I7[] r1 = r4.A05;
            AnonymousClass2I7 r7 = i4 < r1.length ? r1[i4] : new AnonymousClass2I7(this.A04);
            byteBuffer.putInt(r7.A01);
            r3.A05(r7.A04);
            if (i2 >= 2) {
                byteBuffer.putInt(r7.A02);
                byteBuffer.putInt(r7.A00);
            }
            r3.A05(r7.A03);
            i4++;
        }
        long A003 = r3.A00();
        this.A02 = A003;
        r3.A05(A003);
    }
}
