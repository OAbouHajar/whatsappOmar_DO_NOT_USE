package X;

import com.facebook.redex.IDxEnumerationShape16S0101000_2_I1;
import java.util.Enumeration;

/* renamed from: X.5IU  reason: invalid class name */
public class AnonymousClass5IU extends C107405Ib {
    public final C107405Ib[] A00;

    public AnonymousClass5IU(byte[] bArr) {
        super(bArr);
        this.A00 = null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5IU(X.C107405Ib[] r4) {
        /*
            r3 = this;
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            r1 = 0
        L_0x0006:
            int r0 = r4.length
            if (r1 == r0) goto L_0x0027
            r0 = r4[r1]     // Catch:{ IOException -> 0x0013 }
            byte[] r0 = r0.A00     // Catch:{ IOException -> 0x0013 }
            r2.write(r0)     // Catch:{ IOException -> 0x0013 }
            int r1 = r1 + 1
            goto L_0x0006
        L_0x0013:
            r2 = move-exception
            java.lang.String r0 = "exception converting octets "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x0027:
            byte[] r0 = r2.toByteArray()
            r3.<init>(r0)
            r3.A00 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5IU.<init>(X.5Ib[]):void");
    }

    public int A03() {
        Enumeration A0A = A0A();
        int i2 = 0;
        while (A0A.hasMoreElements()) {
            i2 += ((C32071fb) A0A.nextElement()).Agm().A03();
        }
        return i2 + 2 + 2;
    }

    public boolean A08() {
        return true;
    }

    public Enumeration A0A() {
        return new IDxEnumerationShape16S0101000_2_I1(this, this.A00 == null ? 1 : 2);
    }
}
