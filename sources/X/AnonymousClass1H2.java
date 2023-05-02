package X;

import com.whatsapp.util.Log;

/* renamed from: X.1H2  reason: invalid class name */
public class AnonymousClass1H2 {
    public final C16490t9 A00;

    public AnonymousClass1H2(C16490t9 r1) {
        this.A00 = r1;
    }

    public static void A00(C16490t9 r3, String str, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/missing message secret");
        Log.e(sb.toString());
        AnonymousClass23R r2 = new AnonymousClass23R();
        r2.A02 = 0;
        r2.A00 = Integer.valueOf(i2);
        r2.A01 = 0;
        r3.A06(r2);
    }

    public static boolean A01(C16740tZ r1) {
        return ((r1 instanceof C39171s2) || (r1 instanceof C38791rQ) || r1.A0v) && !(r1 instanceof C38791rQ);
    }

    public void A02(int i2, int i3) {
        AnonymousClass23R r1 = new AnonymousClass23R();
        r1.A02 = Integer.valueOf(i2);
        r1.A00 = Integer.valueOf(i3);
        r1.A01 = 0;
        this.A00.A06(r1);
    }

    public void A03(C16740tZ r3, int i2) {
        if (A01(r3)) {
            byte[] bArr = r3.A1F;
            if (bArr == null) {
                A02(0, i2);
                throw new AnonymousClass23S(66);
            } else if (bArr.length != 32) {
                A02(1, i2);
                throw new AnonymousClass23S(67);
            }
        }
    }
}
