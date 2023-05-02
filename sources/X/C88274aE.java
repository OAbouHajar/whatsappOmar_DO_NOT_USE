package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4aE  reason: invalid class name and case insensitive filesystem */
public final class C88274aE {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final List A05;

    public C88274aE(String str, List list, float f2, int i2, int i3, int i4) {
        this.A05 = list;
        this.A02 = i2;
        this.A03 = i3;
        this.A01 = i4;
        this.A00 = f2;
        this.A04 = str;
    }

    public static C88274aE A00(C90504eH r15) {
        int i2;
        float f2;
        try {
            int A012 = (C90504eH.A01(r15, 4) & 3) + 1;
            if (A012 != 3) {
                ArrayList A0u = AnonymousClass000.A0u();
                int A0C = r15.A0C() & 31;
                for (int i3 = 0; i3 < A0C; i3++) {
                    int A0F = r15.A0F();
                    int i4 = r15.A01;
                    r15.A0T(A0F);
                    byte[] bArr = r15.A02;
                    byte[] bArr2 = AnonymousClass4Yu.A00;
                    int length = bArr2.length;
                    byte[] bArr3 = new byte[(length + A0F)];
                    System.arraycopy(bArr2, 0, bArr3, 0, length);
                    System.arraycopy(bArr, i4, bArr3, length, A0F);
                    A0u.add(bArr3);
                }
                int A0C2 = r15.A0C();
                for (int i5 = 0; i5 < A0C2; i5++) {
                    int A0F2 = r15.A0F();
                    int i6 = r15.A01;
                    r15.A0T(A0F2);
                    byte[] bArr4 = r15.A02;
                    byte[] bArr5 = AnonymousClass4Yu.A00;
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[(length2 + A0F2)];
                    System.arraycopy(bArr5, 0, bArr6, 0, length2);
                    System.arraycopy(bArr4, i6, bArr6, length2, A0F2);
                    A0u.add(bArr6);
                }
                String str = null;
                int i7 = -1;
                if (A0C > 0) {
                    AnonymousClass4O0 A022 = C90674eb.A02((byte[]) A0u.get(0), A012, ((byte[]) A0u.get(0)).length);
                    i7 = A022.A06;
                    i2 = A022.A02;
                    f2 = A022.A00;
                    int i8 = A022.A04;
                    int i9 = A022.A01;
                    int i10 = A022.A03;
                    Object[] objArr = new Object[3];
                    AnonymousClass000.A1M(objArr, i8, 0);
                    AnonymousClass000.A1L(objArr, i9);
                    AnonymousClass3K2.A1W(objArr, i10);
                    str = String.format("avc1.%02X%02X%02X", objArr);
                } else {
                    i2 = -1;
                    f2 = 1.0f;
                }
                return new C88274aE(str, A0u, f2, A012, i7, i2);
            }
            throw AnonymousClass3K4.A0V();
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new AnonymousClass40M("Error parsing AVC config", e2);
        }
    }
}
