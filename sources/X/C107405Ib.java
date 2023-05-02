package X;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Enumeration;

/* renamed from: X.5Ib  reason: invalid class name and case insensitive filesystem */
public abstract class C107405Ib extends C32051fZ implements AnonymousClass5VN {
    public byte[] A00;

    public C107405Ib(byte[] bArr) {
        if (bArr != null) {
            this.A00 = bArr;
            return;
        }
        throw AnonymousClass000.A0W("'string' cannot be null");
    }

    public static C33011hn A00(StringBuffer stringBuffer, C107405Ib r3, AnonymousClass5IH r4) {
        C33011hn r1 = new C33011hn(r3.A00);
        stringBuffer.append("                       critical(");
        stringBuffer.append(r4.A02);
        stringBuffer.append(") ");
        return r1;
    }

    public static C107405Ib A01(Object obj) {
        if (obj == null || (obj instanceof C107405Ib)) {
            return (C107405Ib) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return A01(C32051fZ.A02((byte[]) obj));
            } catch (IOException e2) {
                throw AnonymousClass000.A0T(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("failed to construct OCTET STRING from byte[]: ")));
            }
        } else {
            if (obj instanceof C32071fb) {
                C32051fZ Agm = ((C32071fb) obj).Agm();
                if (Agm instanceof C107405Ib) {
                    return (C107405Ib) Agm;
                }
            }
            throw AnonymousClass000.A0T(AnonymousClass000.A0h(AnonymousClass000.A0d(obj), AnonymousClass000.A0r("illegal object in getInstance: ")));
        }
    }

    public static C107405Ib A03(C107525In r6, boolean z2) {
        String str;
        C32051fZ r0;
        AnonymousClass5IU r02;
        if (!z2) {
            C32051fZ A002 = C107525In.A00(r6);
            if (r6.A02) {
                boolean z3 = r6 instanceof C107605Iv;
                C107405Ib[] r1 = {A01(A002)};
                if (z3) {
                    return r02;
                }
                r02 = new AnonymousClass5IU(r1);
            } else if (A002 instanceof C107405Ib) {
                C107405Ib r5 = (C107405Ib) A002;
                if (r6 instanceof C107605Iv) {
                    return r5;
                }
                r0 = r5.A06();
                return (C107405Ib) r0;
            } else if (A002 instanceof C32411gJ) {
                C32411gJ r52 = (C32411gJ) A002;
                boolean z4 = r6 instanceof C107605Iv;
                int A0A = r52.A0A();
                C107405Ib[] r2 = new C107405Ib[A0A];
                for (int i2 = 0; i2 < A0A; i2++) {
                    r2[i2] = A01(r52.A0C(i2));
                }
                r02 = new AnonymousClass5IU(r2);
                if (z4) {
                    return r02;
                }
            } else {
                str = AnonymousClass000.A0h(AnonymousClass000.A0d(r6), AnonymousClass000.A0r("unknown object in getInstance: "));
            }
            r0 = r02.A06();
            return (C107405Ib) r0;
        } else if (r6.A02) {
            return A01(C107525In.A00(r6));
        } else {
            str = "object implicit - explicit expected.";
        }
        throw AnonymousClass000.A0T(str);
    }

    public C32051fZ A05() {
        return new AnonymousClass5IT(this.A00);
    }

    public C32051fZ A06() {
        return new AnonymousClass5IT(this.A00);
    }

    public void A07(C33061hs r5, boolean z2) {
        if (this instanceof AnonymousClass5IT) {
            r5.A06(this.A00, 4, z2);
            return;
        }
        Enumeration A0A = ((AnonymousClass5IU) this).A0A();
        if (z2) {
            r5.A00.write(36);
        }
        OutputStream outputStream = r5.A00;
        outputStream.write(128);
        while (A0A.hasMoreElements()) {
            r5.A04(((C32071fb) A0A.nextElement()).Agm(), true);
        }
        outputStream.write(0);
        outputStream.write(0);
    }

    public boolean A09(C32051fZ r3) {
        if (!(r3 instanceof C107405Ib)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C107405Ib) r3).A00);
    }

    public C32051fZ ADB() {
        return this;
    }

    public InputStream AE1() {
        return new ByteArrayInputStream(this.A00);
    }

    public int hashCode() {
        return C33111hx.A00(this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("#");
        byte[] bArr = this.A00;
        return AnonymousClass000.A0h(C32941ha.A02(C90584eP.A03(bArr, 0, bArr.length)), A0r);
    }
}
