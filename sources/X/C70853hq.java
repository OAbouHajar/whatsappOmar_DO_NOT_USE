package X;

import android.content.Context;
import java.io.OutputStream;
import java.util.Arrays;

/* renamed from: X.3hq  reason: invalid class name and case insensitive filesystem */
public class C70853hq extends AnonymousClass2G6 {
    public final C40731ub A00;
    public final byte[] A01;
    public final byte[] A02;
    public final byte[] A03;

    public C70853hq(C40731ub r1, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.A01 = bArr;
        this.A00 = r1;
        this.A03 = bArr2;
        this.A02 = bArr3;
    }

    public void A02(C16980tz r8) {
        byte[] bArr = this.A03;
        boolean z2 = true;
        AnonymousClass00B.A0D("backup-prefix/get-key/key is null", AnonymousClass000.A1V(bArr));
        byte[] bArr2 = this.A01;
        if (bArr2 == null) {
            z2 = false;
        }
        AnonymousClass00B.A0D("backup-prefix/get-key/account hash is null", z2);
        Context context = r8.A00;
        C40731ub r0 = this.A00;
        C40691uX.A0A(context, r0.A00, r0.A04, bArr, bArr2, r0.A02);
        AnonymousClass2Fy A05 = C40691uX.A05(context);
        if (A05 != null) {
            A05.toString();
        }
    }

    public void A03(OutputStream outputStream) {
        C40731ub r6 = this.A00;
        int i2 = 0;
        byte[][] bArr = {C40691uX.A02, new byte[]{Byte.parseByte(r6.A00)}, r6.A04, r6.A02, r6.A01};
        do {
            byte[] bArr2 = bArr[i2];
            Arrays.toString(bArr2);
            outputStream.write(bArr2);
            i2++;
        } while (i2 < 5);
    }

    public byte[] A05() {
        return this.A02;
    }

    public byte[] A06() {
        byte[] bArr = this.A03;
        AnonymousClass00B.A0D("backup-prefix/get-key/key is null", AnonymousClass000.A1V(bArr));
        return bArr;
    }
}
