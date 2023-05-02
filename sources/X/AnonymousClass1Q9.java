package X;

import android.text.TextUtils;
import android.util.Base64;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Q9  reason: invalid class name */
public class AnonymousClass1Q9 implements AnonymousClass1Q5 {
    public void A5i(C16740tZ r10, AnonymousClass21Q r11, AnonymousClass1GC r12) {
        AnonymousClass436 r2;
        if (r10 instanceof C29871bM) {
            C29871bM r102 = (C29871bM) r10;
            C33221iE r5 = r11.A04;
            C53002eo r0 = ((C33211iD) r5.A00).A0b;
            if (r0 == null) {
                r0 = C53002eo.A0F;
            }
            C69613fK r4 = (C69613fK) r0.A0U();
            C58922uN r02 = ((C53002eo) r4.A00).A09;
            if (r02 == null) {
                r02 = C58922uN.A0B;
            }
            C28581Wr A0U = r02.A0U();
            long j2 = r102.A05;
            A0U.A03();
            C58922uN r3 = (C58922uN) A0U.A00;
            r3.A00 |= 2;
            r3.A04 = j2;
            int i2 = r102.A03;
            if (i2 == 0) {
                r2 = AnonymousClass436.A02;
            } else if (i2 == 1) {
                r2 = AnonymousClass436.A03;
            } else if (i2 == 2) {
                r2 = AnonymousClass436.A06;
            } else if (i2 == 3) {
                r2 = AnonymousClass436.A01;
            } else if (i2 == 4) {
                r2 = AnonymousClass436.A05;
            } else if (i2 == 5) {
                r2 = AnonymousClass436.A04;
            } else {
                StringBuilder sb = new StringBuilder("Unexpected type (");
                sb.append(i2);
                sb.append(")");
                throw new IllegalArgumentException(sb.toString());
            }
            A0U.A03();
            C58922uN r1 = (C58922uN) A0U.A00;
            r1.A00 |= 32;
            r1.A03 = r2.value;
            int i3 = r102.A00;
            if (i3 > 0) {
                A0U.A03();
                C58922uN r13 = (C58922uN) A0U.A00;
                r13.A00 |= 64;
                r13.A01 = i3;
            }
            String str = r102.A0B;
            if (str != null) {
                A0U.A03();
                C58922uN r14 = (C58922uN) A0U.A00;
                r14.A00 |= 16;
                r14.A09 = str;
            }
            String str2 = r102.A0D;
            if (str2 != null) {
                byte[] decode = Base64.decode(str2, 0);
                C28631Ww A01 = C28631Ww.A01(decode, 0, decode.length);
                A0U.A03();
                C58922uN r15 = (C58922uN) A0U.A00;
                r15.A00 |= 1;
                r15.A07 = A01;
            }
            String str3 = r102.A0C;
            if (str3 != null) {
                byte[] decode2 = Base64.decode(str3, 0);
                C28631Ww A012 = C28631Ww.A01(decode2, 0, decode2.length);
                A0U.A03();
                C58922uN r16 = (C58922uN) A0U.A00;
                r16.A00 |= 8;
                r16.A06 = A012;
            }
            byte[] bArr = r102.A0H;
            if (bArr != null) {
                C28631Ww A013 = C28631Ww.A01(bArr, 0, bArr.length);
                A0U.A03();
                C58922uN r17 = (C58922uN) A0U.A00;
                r17.A00 |= 4;
                r17.A08 = A013;
            }
            if (!TextUtils.isEmpty(r102.A0E)) {
                String str4 = r102.A0E;
                A0U.A03();
                C58922uN r18 = (C58922uN) A0U.A00;
                r18.A00 |= 128;
                r18.A0A = str4;
            }
            int i4 = r102.A03;
            if (i4 == 2 || i4 == 3) {
                int i5 = r102.A01;
                A0U.A03();
                C58922uN r19 = (C58922uN) A0U.A00;
                r19.A00 |= 256;
                r19.A02 = i5;
            }
            long j3 = r102.A0A;
            if (j3 > 0) {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(j3);
                A0U.A03();
                C58922uN r110 = (C58922uN) A0U.A00;
                r110.A00 |= 512;
                r110.A05 = seconds;
            }
            r4.A05(AnonymousClass43A.A06);
            r4.A03();
            C53002eo r111 = (C53002eo) r4.A00;
            r111.A09 = (C58922uN) A0U.A02();
            r111.A00 |= 16;
            r5.A09(r4);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Message type is not supported ");
        sb2.append(r10.getClass());
        throw new IllegalArgumentException(sb2.toString());
    }

    public int[] ACW() {
        return new int[]{35};
    }
}
