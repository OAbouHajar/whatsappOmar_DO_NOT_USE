package X;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.0zc  reason: invalid class name and case insensitive filesystem */
public final class C20170zc {
    public final AnonymousClass013 A00;
    public final C20140zZ A01;
    public final C35001lD A02;
    public final C20160zb A03;
    public final AnonymousClass5wM A04;

    public C20170zc(AnonymousClass013 r6, C14710pd r7, C20140zZ r8, C20160zb r9, AnonymousClass5wM r10) {
        C18450wi.A0H(r7, 1);
        C18450wi.A0H(r8, 2);
        C18450wi.A0H(r10, 3);
        C18450wi.A0H(r6, 4);
        this.A01 = r8;
        this.A04 = r10;
        this.A00 = r6;
        this.A03 = r9;
        this.A02 = new C35001lD("PHOENIX", ((long) r7.A03(C16620tM.A02, 1269)) * 1000, true);
    }

    public final AnonymousClass2WZ A00(String str) {
        C18450wi.A0H(str, 0);
        C20140zZ r3 = this.A01;
        String str2 = this.A02.A01;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("BloksLayoutData:046877784a36a1a3e5fbca72104f0172b903681b904c7b907b2e2fab4cad66cf:");
        sb.append(AnonymousClass013.A00(this.A00.A00));
        return (AnonymousClass2WZ) r3.A01(str2, sb.toString());
    }

    public final void A01(AnonymousClass4Ro r9, Boolean bool, String str, String str2, Map map) {
        C20160zb r1 = this.A03;
        String obj = new JSONObject(map).toString();
        AnonymousClass4LB r0 = new AnonymousClass4LB(r9, this, str);
        r1.A00.A01(this.A02, new AnonymousClass3HR(r0), bool, str, obj, str2);
    }

    public final void A02(AnonymousClass4Ro r9, String str, Map map, int i2) {
        String str2 = str;
        C18450wi.A0H(str, 0);
        AnonymousClass2WZ A002 = A00(str);
        AnonymousClass4Ro r3 = r9;
        if (A002 == null || A002.A00 != 5) {
            String A003 = AnonymousClass5wM.A00(Integer.valueOf(i2));
            if (A003 == null) {
                A003 = "";
            }
            A01(r3, Boolean.FALSE, str2, A003, map);
            return;
        }
        r9.A00();
    }
}
