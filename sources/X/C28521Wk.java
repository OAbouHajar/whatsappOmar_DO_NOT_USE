package X;

import java.text.ParseException;

/* renamed from: X.1Wk  reason: invalid class name and case insensitive filesystem */
public class C28521Wk {
    public static final int[] A05 = {32, 32, 32, 32, 32};
    public final byte[] A00;
    public final byte[] A01;
    public final byte[] A02;
    public final byte[] A03;
    public final byte[] A04;

    public C28521Wk(C28511Wj r10) {
        ParseException parseException;
        int[] iArr = A05;
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += i3;
        }
        byte[] A002 = C40771uf.A00(r10.A02, "WhatsApp Mutation Keys".getBytes(AnonymousClass01S.A0A), i2);
        if (A002 != null) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i4 < r7) {
                    try {
                        int i6 = iArr[i4];
                        if (i6 < 0) {
                            StringBuilder sb = new StringBuilder("Invalid length: ");
                            sb.append(i6);
                            parseException = new ParseException(sb.toString(), 0);
                            break;
                        }
                        i5 += i6;
                        i4++;
                    } catch (ParseException e2) {
                        throw new AnonymousClass1X7(e2);
                    }
                } else if (A002.length >= i5) {
                    byte[][] bArr = new byte[r7][];
                    int i7 = 0;
                    for (int i8 = 0; i8 < r7; i8++) {
                        int i9 = iArr[i8];
                        bArr[i8] = new byte[i9];
                        System.arraycopy(A002, i7, bArr[i8], 0, i9);
                        i7 += i9;
                    }
                    this.A00 = bArr[0];
                    this.A03 = bArr[1];
                    this.A04 = bArr[2];
                    this.A02 = bArr[3];
                    this.A01 = bArr[4];
                    return;
                } else {
                    StringBuilder sb2 = new StringBuilder("Input too small: ");
                    sb2.append(C87794Yp.A00(A002));
                    parseException = new ParseException(sb2.toString(), 0);
                }
            }
        } else {
            parseException = new ParseException("Null input", 0);
        }
        throw parseException;
    }
}
