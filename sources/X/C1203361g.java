package X;

import android.graphics.BitmapFactory;
import java.util.Map;

/* renamed from: X.61g  reason: invalid class name and case insensitive filesystem */
public final class C1203361g implements AnonymousClass1IH {
    public final C16980tz A00;

    public C1203361g(C16980tz r2) {
        C18450wi.A0H(r2, 1);
        this.A00 = r2;
    }

    public Class A8z() {
        return C114985ov.class;
    }

    public /* bridge */ /* synthetic */ Object AcV(Enum enumR, Object obj, Map map) {
        C35301lh r0;
        C39901tF r8 = (C39901tF) obj;
        C114985ov r7 = (C114985ov) enumR;
        C18450wi.A0H(r8, 0);
        C18450wi.A0H(r7, 1);
        if (!(r8 instanceof C111805hR)) {
            return null;
        }
        switch (C110115dX.A01(r7, C115405ph.A00)) {
            case 1:
                r0 = ((C111805hR) r8).A03;
                break;
            case 2:
                return ((C111805hR) r8).A0A;
            case 3:
                String str = ((C111805hR) r8).A0B;
                if (str == null) {
                    return "UNKNOWN";
                }
                switch (str.hashCode()) {
                    case -1704036199:
                        return str.equals("SAVINGS") ? "SAVINGS" : "UNKNOWN";
                    case -240997565:
                        return str.equals("OD_SECURED") ? "OD_SECURED" : "UNKNOWN";
                    case 358786314:
                        return str.equals("OD_UNSECURED") ? "OD_UNSECURED" : "UNKNOWN";
                    case 1844922713:
                        return !str.equals("CURRENT") ? "UNKNOWN" : "CURRENT";
                    default:
                        return "UNKNOWN";
                }
            case 4:
                return ((C39911tG) r8).A03;
            case 5:
                r0 = ((C111805hR) r8).A05;
                break;
            case 6:
                r0 = ((C111805hR) r8).A09;
                break;
            case 7:
                return ((C111805hR) r8).A0F;
            case 8:
                return C37741pe.A07(BitmapFactory.decodeResource(C16980tz.A00(this.A00), C115305pX.A00(((C111805hR) r8).A0A).A00));
            case 9:
                r0 = ((C111805hR) r8).A06;
                break;
            default:
                throw new AnonymousClass2Xe();
        }
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }
}
