package X;

import java.util.Map;

/* renamed from: X.1JD  reason: invalid class name */
public final class AnonymousClass1JD implements C1221268j {
    public final C14870pt A00;
    public final AnonymousClass013 A01;
    public final AnonymousClass1JC A02;
    public final C16320sq A03;
    public final C20140zZ A04;
    public final AnonymousClass5wM A05;

    public AnonymousClass1JD(C14870pt r2, AnonymousClass013 r3, AnonymousClass1JC r4, C16320sq r5, C20140zZ r6, AnonymousClass5wM r7) {
        C18450wi.A0H(r6, 1);
        C18450wi.A0H(r2, 2);
        C18450wi.A0H(r5, 3);
        C18450wi.A0H(r7, 4);
        C18450wi.A0H(r3, 5);
        this.A04 = r6;
        this.A00 = r2;
        this.A03 = r5;
        this.A05 = r7;
        this.A01 = r3;
        this.A02 = r4;
    }

    public static /* synthetic */ void A00(AnonymousClass1JD r11, C35001lD r12, C118755vC r13, String str, String str2, Map map) {
        AnonymousClass1JD r2 = r11;
        AnonymousClass1JC r7 = r11.A02;
        Object obj = map.get("static_url");
        if (obj != null) {
            String str3 = (String) obj;
            AnonymousClass3FX r1 = new AnonymousClass3FX(r2, r12, r13, str2, str);
            C18450wi.A0H(str3, 1);
            r7.A00 = str;
            r7.A03(r1, (C108005Mh) null, (Object) null, str3, "");
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public void Aai(C35001lD r12, C118755vC r13, String str, String str2, String str3) {
        String str4 = str;
        C18450wi.A0H(str, 0);
        C35001lD r6 = r12;
        C118755vC r7 = r13;
        String str5 = str3;
        if (r12 != null) {
            C20140zZ r3 = this.A04;
            String str6 = r12.A01;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(":046877784a36a1a3e5fbca72104f0172b903681b904c7b907b2e2fab4cad66cf:");
            sb.append(AnonymousClass013.A00(this.A01.A00));
            String str7 = (String) r3.A01(str6, sb.toString());
            if (str7 != null) {
                this.A05.A01(C25421Js.A09(new C25401Jq("size", String.valueOf(str7.length()))), str5, "bloksCacheHit");
                r13.A01(str7);
                return;
            }
        }
        if (str2 != null) {
            this.A00.Acq(new AnonymousClass56I(this, r6, r7, str4, str5, C438921y.A01(str2)));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
