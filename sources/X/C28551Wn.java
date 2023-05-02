package X;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.1Wn  reason: invalid class name and case insensitive filesystem */
public abstract class C28551Wn implements AnonymousClass1Wo {
    public int A00 = 0;

    public C28631Ww A00() {
        try {
            int AFw = AFw();
            byte[] bArr = new byte[AFw];
            C58142sx r0 = new C58142sx(bArr, AFw);
            AiJ(r0);
            if (r0.A01 - r0.A00 == 0) {
                return new C28611Wu(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            StringBuilder sb = new StringBuilder("Serializing ");
            sb.append(getClass().getName());
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    public void A01(OutputStream outputStream) {
        int i2;
        int AFw = AFw();
        if ((AFw & -128) == 0) {
            i2 = 1;
        } else if ((AFw & -16384) == 0) {
            i2 = 2;
        } else if ((-2097152 & AFw) == 0) {
            i2 = 3;
        } else {
            i2 = 5;
            if ((-268435456 & AFw) == 0) {
                i2 = 4;
            }
        }
        int i3 = i2 + AFw;
        if (i3 > 4096) {
            i3 = 4096;
        }
        C446224u r1 = new C446224u(outputStream, i3);
        r1.A07(AFw);
        AiJ(r1);
        if (r1.A00 > 0) {
            r1.A0J();
        }
    }

    public byte[] A02() {
        try {
            int AFw = AFw();
            byte[] bArr = new byte[AFw];
            C58142sx r0 = new C58142sx(bArr, AFw);
            AiJ(r0);
            if (r0.A01 - r0.A00 == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            StringBuilder sb = new StringBuilder("Serializing ");
            sb.append(getClass().getName());
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }
}
