package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.16I  reason: invalid class name */
public final class AnonymousClass16I {
    public C440022j A00 = new C440022j(this);
    public C440122k A01;
    public final AnonymousClass16C A02;
    public final C15860rz A03;
    public final AnonymousClass013 A04;
    public final C14710pd A05;
    public final AnonymousClass16D A06;
    public final AtomicBoolean A07 = new AtomicBoolean(false);
    public final C15220qW A08 = new AnonymousClass1DV(new C440722q(this));

    public AnonymousClass16I(AnonymousClass16C r3, C15860rz r4, AnonymousClass013 r5, C14710pd r6, AnonymousClass16D r7) {
        C18450wi.A0H(r4, 1);
        C18450wi.A0H(r5, 2);
        C18450wi.A0H(r6, 4);
        C18450wi.A0H(r7, 5);
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
        this.A05 = r6;
        this.A06 = r7;
    }

    public static final C439922i A00(JSONObject jSONObject) {
        List A0A;
        JSONObject jSONObject2 = jSONObject;
        C18450wi.A0H(jSONObject2, 0);
        String optString = jSONObject2.optString("url");
        String optString2 = jSONObject2.optString("locale");
        long optLong = jSONObject2.optLong("expiresData", 0);
        String optString3 = jSONObject2.optString("appId");
        String optString4 = jSONObject2.optString("version");
        String optString5 = jSONObject2.optString("platform");
        String optString6 = jSONObject2.optString("bizJid");
        long optLong2 = jSONObject2.optLong("flowVersionId");
        String optString7 = jSONObject2.optString("signature");
        String string = (!jSONObject2.has("minAppVersion") || jSONObject2.isNull("minAppVersion")) ? null : jSONObject2.getString("minAppVersion");
        String string2 = (!jSONObject2.has("bloksVersionId") || jSONObject2.isNull("bloksVersionId")) ? null : jSONObject2.getString("bloksVersionId");
        JSONArray optJSONArray = jSONObject2.optJSONArray("extraVersions");
        if (optJSONArray == null) {
            A0A = null;
        } else {
            ArrayList arrayList = new ArrayList();
            C441322x r1 = new C441322x(new AnonymousClass22w(new C441222v(optJSONArray), new C441122u(C008203t.A03(0, optJSONArray.length()))));
            while (r1.hasNext()) {
                arrayList.add(A00((JSONObject) r1.next()));
            }
            A0A = C003101j.A0A(arrayList);
        }
        C18450wi.A0B(optString);
        C18450wi.A0B(optString2);
        C18450wi.A0B(optString3);
        C18450wi.A0B(optString5);
        return new C439922i(Long.valueOf(optLong2), optString, optString2, optString3, optString4, optString5, optString6, optString7, string, string2, A0A, optLong);
    }

    public final C439922i A01(String str) {
        List list;
        C440322m A032 = A03();
        if (A032 == null) {
            list = C440222l.A00;
        } else {
            List list2 = A032.A00;
            ArrayList arrayList = new ArrayList();
            for (Object next : list2) {
                C439922i r1 = (C439922i) next;
                if (C18450wi.A0R(r1.A03, str) && C18450wi.A0R(r1.A08, "android")) {
                    arrayList.add(next);
                }
            }
            list = arrayList;
        }
        C439922i A022 = A02(list);
        Object obj = ((Map) this.A08.getValue()).get(str);
        if (obj == null || A022 == null || C18450wi.A0R(A022.A00, obj)) {
            return A022;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0076, code lost:
        if (r3 == null) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C439922i A02(java.util.List r9) {
        /*
            r8 = this;
            java.util.Iterator r2 = r9.iterator()
        L_0x0004:
            boolean r0 = r2.hasNext()
            r7 = 0
            if (r0 == 0) goto L_0x009a
            java.lang.Object r3 = r2.next()
            r0 = r3
            X.22i r0 = (X.C439922i) r0
            java.lang.String r1 = r0.A06
            X.013 r0 = r8.A04
            java.lang.String r0 = r0.A07()
            boolean r0 = X.C18450wi.A0R(r1, r0)
            if (r0 == 0) goto L_0x0004
        L_0x0020:
            X.22i r3 = (X.C439922i) r3
            if (r3 != 0) goto L_0x0082
            java.util.Iterator r2 = r9.iterator()
        L_0x0028:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0080
            java.lang.Object r3 = r2.next()
            r0 = r3
            X.22i r0 = (X.C439922i) r0
            java.lang.String r1 = r0.A06
            X.013 r0 = r8.A04
            android.content.Context r0 = r0.A00
            java.util.Locale r0 = X.AnonymousClass013.A00(r0)
            java.lang.String r0 = r0.getLanguage()
            boolean r0 = X.C18450wi.A0R(r1, r0)
            if (r0 == 0) goto L_0x0028
        L_0x0049:
            X.22i r3 = (X.C439922i) r3
            if (r3 != 0) goto L_0x0082
            java.util.Iterator r2 = r9.iterator()
        L_0x0051:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x007e
            java.lang.Object r3 = r2.next()
            r0 = r3
            X.22i r0 = (X.C439922i) r0
            java.lang.String r1 = r0.A06
            java.lang.String r0 = "en"
            boolean r0 = X.C18450wi.A0R(r1, r0)
            if (r0 == 0) goto L_0x0051
        L_0x0068:
            X.22i r3 = (X.C439922i) r3
            if (r3 != 0) goto L_0x0082
            r1 = 0
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x0079
            r3 = 0
        L_0x0074:
            X.22i r3 = (X.C439922i) r3
            if (r3 != 0) goto L_0x0082
        L_0x0078:
            return r7
        L_0x0079:
            java.lang.Object r3 = r9.get(r1)
            goto L_0x0074
        L_0x007e:
            r3 = r7
            goto L_0x0068
        L_0x0080:
            r3 = r7
            goto L_0x0049
        L_0x0082:
            X.22i r6 = X.C439922i.A00(r3)
            long r4 = r6.A01
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r2 = r0.getTime()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r2 = r2 / r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0078
            return r6
        L_0x009a:
            r3 = r7
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass16I.A02(java.util.List):X.22i");
    }

    public final C440322m A03() {
        String string = ((SharedPreferences) this.A03.A01.get()).getString("commerce_metadata", (String) null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                ArrayList arrayList = new ArrayList();
                JSONArray optJSONArray = jSONObject.optJSONArray("bloksLinks");
                int i2 = 0;
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    while (i2 < length) {
                        int i3 = i2 + 1;
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                        if (optJSONObject != null) {
                            arrayList.add(A00(optJSONObject));
                        }
                        i2 = i3;
                    }
                }
                return new C440322m(arrayList);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void A04() {
        AtomicBoolean atomicBoolean = this.A07;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            AnonymousClass16C r7 = this.A02;
            C440022j r0 = this.A00;
            C18450wi.A0H(r0, 0);
            r7.A00 = r0;
            C17190ug r6 = r7.A02;
            String A022 = r6.A02();
            C18450wi.A0B(A022);
            r6.A0A(r7, new C28371Vv(new C28371Vv(new C28371Vv("bloks_links", new C35081lL[0]), "commerce_metadata", new C35081lL[0]), "iq", new C35081lL[]{new C35081lL((Jid) C34791ks.A00, "to"), new C35081lL("xmlns", "fb:thrift_iq"), new C35081lL("type", "get"), new C35081lL("smax_id", "91"), new C35081lL("id", A022)}), A022, 326, 32000);
        }
    }
}
