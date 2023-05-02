package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.4Zo  reason: invalid class name and case insensitive filesystem */
public final class C88014Zo {
    public final int A00;
    public final String A01;
    public final List A02;

    public C88014Zo(List list, int i2, String str) {
        this.A02 = list;
        this.A00 = i2;
        this.A01 = str;
    }

    public static C88014Zo A00(C90504eH r14) {
        try {
            int A012 = C90504eH.A01(r14, 21) & 3;
            int A0C = r14.A0C();
            int i2 = r14.A01;
            int i3 = 0;
            for (int i4 = 0; i4 < A0C; i4++) {
                r14.A0T(1);
                int A0F = r14.A0F();
                for (int i5 = 0; i5 < A0F; i5++) {
                    int A0F2 = r14.A0F();
                    i3 += A0F2 + 4;
                    r14.A0T(A0F2);
                }
            }
            r14.A0S(i2);
            byte[] bArr = new byte[i3];
            String str = null;
            int i6 = 0;
            for (int i7 = 0; i7 < A0C; i7++) {
                int A0C2 = r14.A0C() & 127;
                int A0F3 = r14.A0F();
                for (int i8 = 0; i8 < A0F3; i8++) {
                    int A0F4 = r14.A0F();
                    byte[] bArr2 = C90674eb.A02;
                    int length = bArr2.length;
                    System.arraycopy(bArr2, 0, bArr, i6, length);
                    int i9 = i6 + length;
                    System.arraycopy(r14.A02, r14.A01, bArr, i9, A0F4);
                    if (A0C2 == 33 && i8 == 0) {
                        str = AnonymousClass4Yu.A00(new AnonymousClass4XN(bArr, i9, i9 + A0F4));
                    }
                    i6 = i9 + A0F4;
                    r14.A0T(A0F4);
                }
            }
            return new C88014Zo(i3 == 0 ? null : Collections.singletonList(bArr), A012 + 1, str);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new AnonymousClass40M("Error parsing HEVC config", e2);
        }
    }
}
