package X;

import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.0x9  reason: invalid class name and case insensitive filesystem */
public class C18720x9 {
    public final C14710pd A00;
    public final C17190ug A01;

    public C18720x9(C14710pd r1, C17190ug r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static final boolean A00(C19550yc r6, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C28371Vv("error", new C35081lL[]{new C35081lL("code", 451), new C35081lL("text", "commerce-features-disabled")}));
        r6.AQe(new C28371Vv("iq", new C35081lL[]{new C35081lL((String) FacebookFacade.RequestParameter.NAME, "IQErrorResponse")}, (C28371Vv[]) arrayList.toArray(new C28371Vv[0])), str);
        return false;
    }

    public void A01(C19550yc r8, C28371Vv r9, String str, int i2) {
        try {
            C19550yc r1 = r8;
            String str2 = str;
            if (this.A00.A0E(C16620tM.A02, 1319)) {
                A00(r8, str);
            } else {
                this.A01.A0A(r1, r9, str2, i2, 32000);
            }
        } catch (AnonymousClass1W9 e2) {
            Log.e(e2.getMessage());
        }
    }

    public void A02(C19550yc r8, C28371Vv r9, String str, int i2) {
        try {
            C19550yc r1 = r8;
            String str2 = str;
            if (this.A00.A0E(C16620tM.A02, 1319)) {
                A00(r8, str);
            } else {
                this.A01.A0B(r1, r9, str2, i2, 32000);
            }
        } catch (AnonymousClass1W9 e2) {
            Log.e(e2.getMessage());
        }
    }
}
