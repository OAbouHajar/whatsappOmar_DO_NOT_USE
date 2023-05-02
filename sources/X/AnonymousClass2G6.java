package X;

import java.io.OutputStream;

/* renamed from: X.2G6  reason: invalid class name */
public abstract class AnonymousClass2G6 {
    public AnonymousClass2G7 A00() {
        if (!(this instanceof C59382xA)) {
            return null;
        }
        AnonymousClass2GB r2 = ((C59382xA) this).A00;
        if ((r2.A00 & 8) != 8) {
            return null;
        }
        AnonymousClass2G7 r0 = r2.A02;
        return r0 == null ? AnonymousClass2G7.A0f : r0;
    }

    public String A01() {
        if (!(this instanceof C59382xA)) {
            return null;
        }
        AnonymousClass2GB r2 = ((C59382xA) this).A00;
        if ((r2.A00 & 8) != 8) {
            return null;
        }
        AnonymousClass2G7 r0 = r2.A02;
        AnonymousClass2G7 r22 = r0;
        if (r0 == null) {
            r0 = AnonymousClass2G7.A0f;
        }
        if ((r0.A01 & 4) != 4) {
            return null;
        }
        if (r22 == null) {
            r22 = AnonymousClass2G7.A0f;
        }
        return r22.A06;
    }

    public void A02(C16980tz r1) {
    }

    public void A03(OutputStream outputStream) {
        ((C59382xA) this).A00.A01(outputStream);
    }

    public boolean A04(String str) {
        if (this instanceof C59382xA) {
            return C40691uX.A0F(((C59382xA) this).A00, str);
        }
        return false;
    }

    public byte[] A05() {
        return ((C59382xA) this).A01;
    }

    public byte[] A06() {
        byte[] bArr = ((C59382xA) this).A02;
        boolean z2 = false;
        if (bArr != null) {
            z2 = true;
        }
        AnonymousClass00B.A0D("backup-prefix/get-key/key is null", z2);
        return bArr;
    }
}
