package X;

import android.content.SharedPreferences;
import com.mod2.fblibs.FacebookFacade;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.0w7  reason: invalid class name and case insensitive filesystem */
public final class C18080w7 {
    public final C17020u3 A00;
    public final C15220qW A01 = new AnonymousClass1DV(new C40011tQ(this));

    public C18080w7(C17020u3 r3) {
        C18450wi.A0H(r3, 1);
        this.A00 = r3;
    }

    public static final AnonymousClass2KI A00(String str) {
        C53892gT r3;
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("id");
        String string2 = jSONObject.getString("title");
        String string3 = jSONObject.getString(FacebookFacade.RequestParameter.DESCRIPTION);
        String string4 = jSONObject.getString("ctaText");
        String string5 = jSONObject.getString("scope");
        int i2 = jSONObject.getInt("type");
        boolean optBoolean = jSONObject.optBoolean("isCancelable", true);
        String optString = jSONObject.optString("phoenix_flow");
        C18450wi.A0B(optString);
        boolean z2 = false;
        if (optString.length() > 0) {
            z2 = true;
        }
        C35281lf r4 = null;
        if (z2) {
            new C53892gT("");
            String string6 = new JSONObject(optString).getString("config");
            C18450wi.A0B(string6);
            r3 = new C53892gT(string6);
        } else {
            r3 = null;
        }
        String optString2 = jSONObject.optString("legacy_payment_step_up_info");
        C18450wi.A0B(optString2);
        if (optString2.length() > 0) {
            r4 = C35281lf.A01(optString2);
        }
        C18450wi.A0B(string);
        C18450wi.A0B(string2);
        C18450wi.A0B(string3);
        C18450wi.A0B(string4);
        C18450wi.A0B(string5);
        return new AnonymousClass2KI(r3, r4, string, string2, string3, string4, string5, i2, optBoolean);
    }

    public AnonymousClass2KI A01(String str) {
        String string = ((SharedPreferences) this.A01.getValue()).getString("framework_alert_list_info", (String) null);
        if (string != null) {
            JSONObject jSONObject = new JSONObject(string);
            Iterator<String> keys = jSONObject.keys();
            C18450wi.A0B(keys);
            while (keys.hasNext()) {
                String next = keys.next();
                if (C18450wi.A0R(next, str)) {
                    String string2 = jSONObject.getString(next);
                    C18450wi.A0B(string2);
                    return A00(string2);
                }
            }
        }
        return null;
    }

    public List A02() {
        Map A03 = A03();
        ArrayList arrayList = new ArrayList();
        if (!A03.isEmpty()) {
            arrayList.addAll(A03.values());
        }
        return arrayList;
    }

    public final Map A03() {
        String string = ((SharedPreferences) this.A01.getValue()).getString("framework_alert_list_info", (String) null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (string != null) {
            JSONObject jSONObject = new JSONObject(string);
            Iterator<String> keys = jSONObject.keys();
            C18450wi.A0B(keys);
            while (keys.hasNext()) {
                String next = keys.next();
                C18450wi.A09(next);
                String string2 = jSONObject.getString(next);
                C18450wi.A0B(string2);
                linkedHashMap.put(next, A00(string2));
            }
        }
        return linkedHashMap;
    }

    public void A04(AnonymousClass2KI r6) {
        Map A06 = C25411Jr.A06(new C25401Jq(r6.A06, r6));
        Map A03 = A03();
        if (true ^ A03.isEmpty()) {
            A06.putAll(A03);
        }
        A06(A06);
    }

    public void A05(List list) {
        boolean z2;
        C18450wi.A0H(list, 0);
        Map A03 = A03();
        if (!A03.isEmpty()) {
            Iterator it = list.iterator();
            loop0:
            while (true) {
                z2 = false;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    Object next = it.next();
                    if (!z2) {
                        z2 = true;
                        if (A03.remove(next) == null) {
                        }
                    }
                }
            }
            if (z2) {
                A06(A03);
            }
        }
    }

    public final void A06(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            AnonymousClass2KI r6 = (AnonymousClass2KI) entry.getValue();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", r6.A06);
            jSONObject.put("title", r6.A08);
            jSONObject.put(FacebookFacade.RequestParameter.DESCRIPTION, r6.A05);
            jSONObject.put("ctaText", r6.A04);
            jSONObject.put("scope", r6.A07);
            jSONObject.put("type", r6.A01);
            jSONObject.put("isCancelable", r6.A09);
            C53892gT r0 = r6.A02;
            if (r0 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("config", r0.A00);
                String obj = jSONObject2.toString();
                C18450wi.A0B(obj);
                jSONObject.put("phoenix_flow", obj);
            }
            C35281lf r02 = r6.A03;
            if (r02 != null) {
                jSONObject.put("legacy_payment_step_up_info", r02.A02().toString());
            }
            String obj2 = jSONObject.toString();
            C18450wi.A0B(obj2);
            linkedHashMap.put(key, obj2);
        }
        SharedPreferences.Editor edit = ((SharedPreferences) this.A01.getValue()).edit();
        C18450wi.A0B(edit);
        edit.putString("framework_alert_list_info", new JSONObject(linkedHashMap).toString());
        edit.apply();
    }
}
