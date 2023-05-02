package X;

import android.util.Base64;
import java.util.Map;

/* renamed from: X.61d  reason: invalid class name and case insensitive filesystem */
public final class C1203061d implements AnonymousClass1IH {
    public Class A8z() {
        return C114975ou.class;
    }

    public /* bridge */ /* synthetic */ Object AcV(Enum enumR, Object obj, Map map) {
        C35251lc r0;
        C35221lZ r02;
        C35251lc r03;
        C35251lc r04;
        C35251lc r1;
        C35251lc r05;
        C35251lc r06;
        byte[] bArr;
        C35251lc r07;
        C16830ti r7 = (C16830ti) obj;
        C114975ou r6 = (C114975ou) enumR;
        boolean A19 = C110115dX.A19(r7, r6);
        switch (C110115dX.A01(r6, C115415pi.A00)) {
            case 1:
                C16880tn r08 = r7.A00;
                if (r08 == null || (r04 = r08.A01) == null) {
                    return null;
                }
                return r04.A09;
            case 2:
                C16880tn r09 = r7.A00;
                if (r09 == null || (r07 = r09.A01) == null) {
                    return null;
                }
                return r07.A07;
            case 3:
                C16880tn r010 = r7.A00;
                if (r010 == null || (r06 = r010.A01) == null || (bArr = r06.A0E) == null) {
                    return null;
                }
                return Base64.encodeToString(bArr, 0);
            case 4:
                C16880tn r011 = r7.A00;
                if (r011 == null || (r05 = r011.A01) == null) {
                    return null;
                }
                return r05.A0A;
            case 5:
                C16880tn r012 = r7.A00;
                if (r012 == null || (r1 = r012.A01) == null) {
                    return null;
                }
                C35211lY r013 = r1.A06;
                C28411Vz r3 = r1.A04;
                if (r013 == null || r3 == null) {
                    return null;
                }
                long j2 = r013.A01;
                int i2 = r013.A00;
                if (i2 <= 0) {
                    i2 = 1;
                }
                return new C35431lv(r3, i2, j2);
            case 6:
                C16880tn r014 = r7.A00;
                if (r014 == null || (r0 = r014.A01) == null || (r02 = r0.A05) == null) {
                    return "UNKNOWN";
                }
                switch (C35251lc.A00(r02.A01)) {
                    case 1:
                        return "PENDING";
                    case 2:
                        return "PROCESSING";
                    case 3:
                        return "COMPLETED";
                    case 4:
                        return "CANCELED";
                    case 5:
                        return "PARTIALLY_SHIPPED";
                    case 6:
                        return "SHIPPED";
                    default:
                        return "UNKNOWN";
                }
            case 7:
                C16880tn r015 = r7.A00;
                if (r015 == null || (r03 = r015.A01) == null) {
                    return "UNKNOWN";
                }
                int A01 = r03.A01();
                return A01 != A19 ? A01 == 2 ? "PHYSICAL_GOODS" : "UNKNOWN" : "DIGITAL_GOODS";
            default:
                throw new AnonymousClass2Xe();
        }
    }
}
