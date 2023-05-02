package X;

import java.io.UnsupportedEncodingException;

/* renamed from: X.5wV  reason: invalid class name */
public class AnonymousClass5wV {
    public C118435ug A00;
    public AnonymousClass5wR A01;
    public final C14870pt A02;
    public final C18260wP A03;
    public final C16980tz A04;
    public final C18340wX A05;
    public final C118365uZ A06;
    public final C119285wq A07;
    public final AnonymousClass1Vo A08 = C110105dW.A0Q("PaymentPinHelper", "network");
    public final AnonymousClass5xG A09;
    public final C118915vc A0A;

    public AnonymousClass5wV(C14870pt r8, C16040sK r9, C18260wP r10, C16440t3 r11, C16980tz r12, C18340wX r13, C18310wU r14, C118365uZ r15, C119285wq r16, AnonymousClass5xG r17, C118915vc r18) {
        this.A04 = r12;
        this.A02 = r8;
        this.A06 = r15;
        this.A0A = r18;
        this.A03 = r10;
        this.A05 = r13;
        this.A09 = r17;
        C119285wq r5 = r16;
        this.A07 = r5;
        this.A01 = new AnonymousClass5wR(r9, r11, r14);
        this.A00 = new C118435ug(r12.A00, r8, r13, r14, r5, "PIN");
    }

    public static byte[] A00(Object... objArr) {
        int length = objArr.length;
        byte[][] bArr = new byte[length][];
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            try {
                if (objArr[i2] == null) {
                    bArr[i2] = new byte[0];
                } else if (objArr[i2] instanceof Long) {
                    bArr[i2] = String.valueOf(C13700nu.A01(objArr[i2])).getBytes(AnonymousClass01S.A08);
                } else if (objArr[i2] instanceof Integer) {
                    bArr[i2] = String.valueOf(AnonymousClass000.A0D(objArr[i2])).getBytes(AnonymousClass01S.A08);
                } else if (objArr[i2] instanceof byte[]) {
                    bArr[i2] = objArr[i2];
                } else if (objArr[i2] instanceof String) {
                    bArr[i2] = objArr[i2].getBytes(AnonymousClass01S.A08);
                } else {
                    throw AnonymousClass000.A0T(AnonymousClass1Vo.A01("PaymentPinHelper", "constructPayload: should only accept long, byte[], and String args"));
                }
                i3 += bArr[i2].length;
                i2++;
            } catch (UnsupportedEncodingException e2) {
                C110105dW.A1O("PaymentPinHelper", AnonymousClass000.A0g(" UTF-8 not supported: ", e2));
                throw new Error(e2);
            }
        }
        byte[] bArr2 = new byte[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            byte[] bArr3 = bArr[i5];
            System.arraycopy(bArr3, 0, bArr2, i4, bArr3.length);
            i4 += bArr3.length;
        }
        return bArr2;
    }

    public final void A01(AnonymousClass68W r3, AnonymousClass68X r4, String str) {
        AnonymousClass50C A0R = C110115dX.A0R(this.A07, str, "PIN");
        if (A0R == null) {
            this.A00.A00(new AnonymousClass61J(r3, r4), str);
        } else {
            r3.AWM(new C117915tl(A0R));
        }
    }
}
