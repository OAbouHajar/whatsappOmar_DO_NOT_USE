package X;

import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.16F  reason: invalid class name */
public final class AnonymousClass16F implements C19550yc {
    public C441422y A00;
    public final AnonymousClass013 A01;
    public final C17190ug A02;

    public AnonymousClass16F(AnonymousClass013 r2, C17190ug r3) {
        C18450wi.A0H(r3, 1);
        C18450wi.A0H(r2, 2);
        this.A02 = r3;
        this.A01 = r2;
    }

    public void APb(String str) {
        C18450wi.A0H(str, 0);
        Log.e(C18450wi.A06("GetCommerceTranslationsMetadataProtocolHelper/onDeliveryFailure: Network failed  while sending the payload: ", str));
        C441422y r0 = this.A00;
        if (r0 == null) {
            C18450wi.A0O("listener");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else {
            r0.A00.A07.set(false);
        }
    }

    public void AQe(C28371Vv r4, String str) {
        C18450wi.A0H(r4, 1);
        Log.e("GetCommerceTranslationsMetadataProtocolHelper/response-error");
        C28371Vv A0J = r4.A0J("error");
        if (A0J != null) {
            A0J.A0A("code", 0);
        }
        C441422y r0 = this.A00;
        if (r0 == null) {
            C18450wi.A0O("listener");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else {
            r0.A00.A07.set(false);
        }
    }

    public void AYG(C28371Vv r13, String str) {
        String str2;
        C28371Vv A0J;
        C28371Vv[] r9;
        C28371Vv A0J2;
        String A0N;
        Long A0R;
        C28371Vv A0J3;
        C18450wi.A0H(r13, 1);
        C28371Vv A0J4 = r13.A0J("commerce_metadata");
        if (A0J4 == null || (A0J3 = A0J4.A0J("translations")) == null || (str2 = A0J3.A0N("locale", (String) null)) == null) {
            str2 = "";
        }
        int i2 = 0;
        boolean z2 = false;
        if (str2.length() == 0) {
            z2 = true;
        }
        if (z2) {
            Log.e("GetCommerceTranslationsMetadataProtocolHelper/onSuccess can not find locale value in response!");
            C441422y r0 = this.A00;
            if (r0 == null) {
                C18450wi.A0O("listener");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            } else {
                r0.A00.A07.set(false);
            }
        } else {
            long time = (new Date().getTime() / 1000) + 86400000;
            if (!(A0J4 == null || (A0J2 = A0J4.A0J("translations")) == null || (A0N = A0J2.A0N("expires_at", (String) null)) == null || (A0R = C441522z.A0R(A0N)) == null)) {
                time = A0R.longValue();
            }
            HashMap hashMap = new HashMap();
            if (!(A0J4 == null || (A0J = A0J4.A0J("translations")) == null || (r9 = A0J.A03) == null)) {
                ArrayList arrayList = new ArrayList();
                int length = r9.length;
                while (i2 < length) {
                    C28371Vv r4 = r9[i2];
                    i2++;
                    if (C18450wi.A0R(r4.A00, "string")) {
                        arrayList.add(r4);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C28371Vv r7 = (C28371Vv) it.next();
                    if (!(r7.A0N(FacebookFacade.RequestParameter.NAME, (String) null) == null || r7.A0N("value", (String) null) == null)) {
                        String A0N2 = r7.A0N(FacebookFacade.RequestParameter.NAME, (String) null);
                        C18450wi.A0F(A0N2);
                        C18450wi.A0B(A0N2);
                        String A0N3 = r7.A0N("value", (String) null);
                        C18450wi.A0F(A0N3);
                        C18450wi.A0B(A0N3);
                        hashMap.put(A0N2, A0N3);
                    }
                    arrayList2.add(AnonymousClass22M.A00);
                }
            }
            C441422y r02 = this.A00;
            if (r02 == null) {
                C18450wi.A0O("listener");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            AnonymousClass234 r3 = new AnonymousClass234(str2, hashMap, time);
            AnonymousClass16G r1 = r02.A00;
            r1.A07.set(false);
            C15860rz r6 = r1.A04;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("locale", r3.A01);
            jSONObject.put("expiresAt", r3.A00);
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry entry : r3.A02.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(FacebookFacade.RequestParameter.NAME, entry.getKey());
                jSONObject2.put("value", entry.getValue());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("strings", jSONArray);
            r6.A0K().putString("commerce_metadata_tanslations", jSONObject.toString()).apply();
        }
    }
}
