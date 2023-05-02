package X;

import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0xE  reason: invalid class name and case insensitive filesystem */
public class C18770xE {
    public final C16040sK A00;
    public final C18760xD A01;
    public final C18720x9 A02;

    public C18770xE(C16040sK r1, C18760xD r2, C18720x9 r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final boolean A00(AnonymousClass26L r4) {
        if (this.A02.A00.A0E(C16620tM.A02, 1319)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 2498048);
                jSONObject.put(FacebookFacade.RequestParameter.DESCRIPTION, "Commerce features are not available.");
                r4.A00(new C32121fg(jSONObject), 451);
                return true;
            } catch (JSONException e2) {
                Log.e(e2.getMessage());
                r4.AQa(e2);
                return true;
            }
        } else if (r4 instanceof C55242j8) {
            C55242j8 r42 = (C55242j8) r4;
            if (!r42.A04.A0A()) {
                r42.A00.A00(-1);
                return true;
            }
            C55252j9 r2 = r42.A02;
            if (r2.A04 == null) {
                r42.A05.A02("view_collection_details_tag");
            }
            r42.A03();
            StringBuilder sb = new StringBuilder("GetSingleCollectionGraphQLService/sendRequest jid=");
            sb.append(r2.A03);
            sb.append(" success");
            Log.i(sb.toString());
            return true;
        } else if (r4 instanceof AnonymousClass2j5) {
            AnonymousClass2j5 r43 = (AnonymousClass2j5) r4;
            if (!r43.A05.A0A()) {
                return true;
            }
            UserJid userJid = r43.A04.A00;
            C18710x8 r1 = r43.A01;
            if (r1.A00.A09()) {
                r1.A01(r43, userJid);
                return true;
            }
            r43.A03();
            return true;
        } else if (r4 instanceof AnonymousClass26R) {
            AnonymousClass26R r44 = (AnonymousClass26R) r4;
            if (!r44.A05.A0A()) {
                r44.A02.A00(r44.A06, -1);
                return true;
            }
            UserJid userJid2 = r44.A06.A00;
            C18710x8 r12 = r44.A01;
            if (r12.A00.A09()) {
                r12.A01(r44, userJid2);
                return true;
            }
            r44.A03();
            return true;
        } else if (r4 instanceof AnonymousClass26K) {
            AnonymousClass26K r45 = (AnonymousClass26K) r4;
            if (!r45.A04.A0A()) {
                Log.i("GetProductCatalogGraphQLService/sendRequest failed : no network access");
                return true;
            }
            UserJid userJid3 = r45.A05.A05;
            C18710x8 r13 = r45.A01;
            if (r13.A00.A09()) {
                r13.A01(r45, userJid3);
                return true;
            }
            r45.A03();
            return true;
        } else if (r4 instanceof C59642yd) {
            C59642yd r46 = (C59642yd) r4;
            if (!r46.A04.A0A()) {
                r46.A00.A00(-1);
                return true;
            }
            UserJid userJid4 = r46.A02.A04;
            C18710x8 r14 = r46.A01;
            if (r14.A00.A09()) {
                r14.A01(r46, userJid4);
                return true;
            }
            r46.A03();
            return true;
        } else {
            C59632yc r47 = (C59632yc) r4;
            if (!r47.A04.A0A()) {
                r47.A05(-1);
                return true;
            }
            UserJid userJid5 = r47.A02.A02;
            C18710x8 r15 = r47.A01;
            if (r15.A00.A09()) {
                r15.A01(r47, userJid5);
                return true;
            }
            r47.A03();
            return true;
        }
    }

    public boolean A01(AnonymousClass5RX r23, AnonymousClass26O r24) {
        C18760xD r4 = this.A01;
        C16300so r7 = r4.A00;
        C18630x0 r3 = r4.A0B;
        C17150uc r8 = r4.A01;
        C18650x2 r10 = r4.A04;
        C18260wP r15 = r4.A08;
        C18620wz r13 = r4.A07;
        C17190ug r2 = r4.A0A;
        C16320sq r1 = r4.A0G;
        C18710x8 r9 = r4.A03;
        C18630x0 r19 = r3;
        C17190ug r18 = r2;
        return A00(new AnonymousClass26K(r7, r8, r9, r10, new C84734Lr(r9, r10), r4.A06, r13, r23, r15, r24, r4.A09, r18, r19, r4.A00(), r1));
    }
}
