package X;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* renamed from: X.4bq  reason: invalid class name and case insensitive filesystem */
public class C89254bq {
    public int A00;
    public int A01;
    public ArrayList A02;
    public Map A03;

    public C89254bq() {
        this.A00 = 0;
        this.A01 = 0;
        this.A02 = AnonymousClass000.A0u();
    }

    public C89254bq(byte[] bArr) {
        int length = bArr.length;
        this.A03 = AnonymousClass000.A0x();
        int i2 = 0;
        this.A01 = 0;
        this.A00 = 0;
        ArrayList A0u = AnonymousClass000.A0u();
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        while (i2 < length) {
            short s2 = wrap.getShort();
            byte[] bArr2 = new byte[2];
            wrap.get(bArr2);
            int A012 = C32311g7.A01(bArr2);
            byte[] bArr3 = new byte[A012];
            wrap.get(bArr3);
            A0u.add(new C86024Qx(bArr3, s2));
            this.A03.put(Short.valueOf(s2), Integer.valueOf(this.A00));
            this.A00++;
            i2 += A012 + 4;
        }
        if (i2 == length) {
            this.A01 = i2;
            this.A02 = AnonymousClass000.A0u();
            this.A02 = C13680ns.A0n(A0u);
            return;
        }
        throw AnonymousClass3K2.A0S("Error while parsing extension", (byte) 80);
    }

    public C86024Qx A00(short s2) {
        int intValue;
        Number number = (Number) this.A03.get(Short.valueOf(s2));
        if (number == null || (intValue = number.intValue()) >= this.A00) {
            return null;
        }
        return (C86024Qx) this.A02.get(intValue);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("extensions{extensions=");
        A0r.append(Arrays.toString(this.A02.toArray()));
        A0r.append(", idx=");
        A0r.append(this.A00);
        A0r.append(", totalNetworkBytes=");
        A0r.append(this.A01);
        return AnonymousClass000.A0k(A0r);
    }
}
