package X;

import java.io.File;

/* renamed from: X.3uk  reason: invalid class name and case insensitive filesystem */
public class C76823uk extends AnonymousClass21C {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final boolean A04;
    public final int[] A05;

    public C76823uk(File file, String str, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, boolean z2, boolean z3) {
        super(file, str, bArr, z2);
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i4;
        this.A01 = i5;
        this.A04 = z3;
        if (iArr == null || iArr.length < 2) {
            this.A05 = new int[0];
        } else {
            this.A05 = iArr;
        }
    }
}
