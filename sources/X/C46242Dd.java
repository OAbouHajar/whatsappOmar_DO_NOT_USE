package X;

import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.jid.Jid;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.2Dd  reason: invalid class name and case insensitive filesystem */
public class C46242Dd implements C19550yc {
    public final AnonymousClass155 A00;
    public final C16440t3 A01;
    public final C17190ug A02;

    public C46242Dd(AnonymousClass155 r1, C16440t3 r2, C17190ug r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void A00() {
        C17190ug r7 = this.A02;
        String A022 = r7.A02();
        r7.A0G(this, new C28371Vv(new C28371Vv("mobile_config", new C35081lL[]{new C35081lL((String) FacebookFacade.RequestParameter.NAME, "biz_block_reasons"), new C35081lL("v", 2)}), "iq", new C35081lL[]{new C35081lL("id", A022), new C35081lL((Jid) C34791ks.A00, "to"), new C35081lL("type", "get"), new C35081lL("xmlns", "w:biz")}), A022, 234, 20000);
    }

    public void APb(String str) {
    }

    public void AQe(C28371Vv r7, String str) {
        long A022;
        TimeUnit timeUnit;
        long j2;
        int A002 = C34451kH.A00(r7);
        AnonymousClass155 r5 = this.A00;
        if (A002 == 404) {
            r5.A08(-1);
            return;
        }
        int A003 = r5.A00();
        if (A003 == 0) {
            r5.A08(1);
            A022 = this.A01.A00();
            timeUnit = TimeUnit.DAYS;
            j2 = 1;
        } else if (A003 > 0 && A003 < 16) {
            r5.A08(A003 << 1);
            A022 = r5.A02();
            timeUnit = TimeUnit.DAYS;
            j2 = (long) A003;
        } else {
            return;
        }
        r5.A03().edit().putLong("biz_block_reasons_api_cooling_timestamp", A022 + timeUnit.toMillis(j2)).apply();
    }

    public void AYG(C28371Vv r12, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C28371Vv A0J = r12.A0J("mobile_config");
        if (A0J != null) {
            C28371Vv A0J2 = A0J.A0J("list");
            if (!(A0J2 == null || A0J2.A03 == null || !"biz_block_reasons".equals(A0J2.A0N(FacebookFacade.RequestParameter.NAME, (String) null)))) {
                int A002 = C29501aj.A00(A0J2.A0N("v", (String) null), 0);
                String A0N = A0J2.A0N("language", (String) null);
                if (A002 > 0 && A0N != null) {
                    for (C28371Vv r2 : A0J2.A0O("item")) {
                        linkedHashMap.put(r2.A0N("id", (String) null), r2.A0L());
                    }
                    String A0N2 = A0J2.A0N("country", (String) null);
                    if (!linkedHashMap.isEmpty()) {
                        AnonymousClass155 r6 = this.A00;
                        r6.A03().edit().putInt("biz_block_reasons_version", A002).apply();
                        r6.A03().edit().putString("biz_block_reasons_language", A0N).apply();
                        r6.A03().edit().putString("biz_block_reasons_country", A0N2).apply();
                        r6.A03().edit().putString("biz_block_reasons", new JSONObject(linkedHashMap).toString()).apply();
                    }
                }
            }
            AnonymousClass155 r0 = this.A00;
            r0.A08(0);
            r0.A03().edit().putLong("biz_block_reasons_api_cooling_timestamp", 0).apply();
        }
    }
}
