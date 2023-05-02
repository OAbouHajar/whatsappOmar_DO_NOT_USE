package X;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3V1  reason: invalid class name */
public final class AnonymousClass3V1 extends C97244pd {
    public AnonymousClass4X5 A00;
    public final C90204dh A01 = new C90204dh();
    public final C90504eH A02 = new C90504eH();

    public C93724jf A00(AnonymousClass3Ub r31, ByteBuffer byteBuffer) {
        boolean z2;
        long j2;
        boolean z3;
        long j3;
        int i2;
        int i3;
        int i4;
        boolean z4;
        boolean z5;
        boolean z6;
        long j4;
        boolean z7;
        long j5;
        int i5;
        int i6;
        int i7;
        boolean z8;
        List list;
        ArrayList arrayList;
        AnonymousClass4X5 r0 = this.A00;
        AnonymousClass3Ub r6 = r31;
        if (r0 == null || r6.A00 != r0.A00()) {
            long j6 = r6.A00;
            AnonymousClass4X5 r2 = new AnonymousClass4X5(j6);
            this.A00 = r2;
            r2.A01(j6 - r6.A00);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        C90504eH r7 = this.A02;
        r7.A0U(array, limit);
        C90204dh r62 = this.A01;
        r62.A03 = array;
        r62.A02 = 0;
        r62.A00 = 0;
        r62.A01 = limit;
        r62.A08(39);
        long A04 = (((long) r62.A04(1)) << 32) | ((long) r62.A04(32));
        r62.A08(20);
        int A042 = r62.A04(12);
        int A043 = r62.A04(8);
        C35731mP r12 = null;
        r7.A0T(14);
        if (A043 == 0) {
            r12 = new AnonymousClass3VF();
        } else if (A043 == 255) {
            long A0I = r7.A0I();
            int i8 = A042 - 4;
            byte[] bArr = new byte[i8];
            r7.A0V(bArr, 0, i8);
            r12 = new AnonymousClass3VI(bArr, A0I, A04);
        } else if (A043 == 4) {
            int A0C = r7.A0C();
            ArrayList A0i = C13690nt.A0i(A0C);
            for (int i9 = 0; i9 < A0C; i9++) {
                long A0I2 = r7.A0I();
                boolean A1O = AnonymousClass000.A1O(r7.A0C() & 128);
                ArrayList A0u = AnonymousClass000.A0u();
                if (!A1O) {
                    int A0C2 = r7.A0C();
                    z2 = AnonymousClass000.A1O(A0C2 & 128);
                    z4 = AnonymousClass000.A1O(A0C2 & 64);
                    boolean A1O2 = AnonymousClass000.A1O(A0C2 & 32);
                    if (z4) {
                        j2 = r7.A0I();
                    } else {
                        j2 = -9223372036854775807L;
                        int A0C3 = r7.A0C();
                        A0u = C13690nt.A0i(A0C3);
                        for (int i10 = 0; i10 < A0C3; i10++) {
                            A0u.add(new AnonymousClass4GF(r7.A0C(), r7.A0I()));
                        }
                    }
                    if (A1O2) {
                        long A0C4 = (long) r7.A0C();
                        z3 = AnonymousClass000.A1O(((128 & A0C4) > 0 ? 1 : ((128 & A0C4) == 0 ? 0 : -1)));
                        j3 = ((((A0C4 & 1) << 32) | r7.A0I()) * 1000) / 90;
                    } else {
                        z3 = false;
                        j3 = -9223372036854775807L;
                    }
                    i2 = r7.A0F();
                    i3 = r7.A0C();
                    i4 = r7.A0C();
                } else {
                    z2 = false;
                    j2 = -9223372036854775807L;
                    z3 = false;
                    j3 = -9223372036854775807L;
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    z4 = false;
                }
                A0i.add(new C88414aS(A0u, i2, i3, i4, A0I2, j2, j3, A1O, z2, z4, z3));
            }
            r12 = new AnonymousClass3VG((List) A0i);
        } else if (A043 == 5) {
            AnonymousClass4X5 r8 = this.A00;
            long A0I3 = r7.A0I();
            boolean A1O3 = AnonymousClass000.A1O(r7.A0C() & 128);
            List emptyList = Collections.emptyList();
            if (!A1O3) {
                int A0C5 = r7.A0C();
                z5 = AnonymousClass000.A1O(A0C5 & 128);
                z8 = AnonymousClass000.A1O(A0C5 & 64);
                boolean A1O4 = AnonymousClass000.A1O(A0C5 & 32);
                z6 = AnonymousClass000.A1O(A0C5 & 16);
                if (!z8 || z6) {
                    j4 = -9223372036854775807L;
                    arrayList = emptyList;
                    if (!z8) {
                        int A0C6 = r7.A0C();
                        ArrayList A0i2 = C13690nt.A0i(A0C6);
                        for (int i11 = 0; i11 < A0C6; i11++) {
                            int A0C7 = r7.A0C();
                            long A002 = !z6 ? AnonymousClass3VH.A00(r7, A04) : -9223372036854775807L;
                            A0i2.add(new AnonymousClass4JX(A0C7, A002, r8.A02(A002)));
                        }
                        arrayList = A0i2;
                    }
                } else {
                    j4 = AnonymousClass3VH.A00(r7, A04);
                    arrayList = emptyList;
                }
                if (A1O4) {
                    long A0C8 = (long) r7.A0C();
                    z7 = AnonymousClass000.A1O(((128 & A0C8) > 0 ? 1 : ((128 & A0C8) == 0 ? 0 : -1)));
                    j5 = ((((A0C8 & 1) << 32) | r7.A0I()) * 1000) / 90;
                } else {
                    z7 = false;
                    j5 = -9223372036854775807L;
                }
                i5 = r7.A0F();
                i6 = r7.A0C();
                i7 = r7.A0C();
                list = arrayList;
            } else {
                z5 = false;
                z6 = false;
                j4 = -9223372036854775807L;
                z7 = false;
                j5 = -9223372036854775807L;
                i5 = 0;
                i6 = 0;
                i7 = 0;
                z8 = false;
                list = emptyList;
            }
            r12 = new AnonymousClass3VJ(list, i5, i6, i7, A0I3, j4, r8.A02(j4), j5, A1O3, z5, z8, z6, z7);
        } else if (A043 == 6) {
            AnonymousClass4X5 r4 = this.A00;
            long A003 = AnonymousClass3VH.A00(r7, A04);
            r12 = new AnonymousClass3VH(A003, r4.A02(A003));
        }
        return new C93724jf(r12 == null ? new C35731mP[0] : new C35731mP[]{r12});
    }
}
