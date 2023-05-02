package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.19f  reason: invalid class name and case insensitive filesystem */
public final class C227719f {
    public AnonymousClass60V A00;
    public Set A01 = new LinkedHashSet();

    public C227719f(AnonymousClass60V r10) {
        C18450wi.A0H(r10, 1);
        this.A00 = r10;
        String A09 = this.A00.A09();
        if (A09 != null && A09.length() != 0) {
            JSONArray jSONArray = new JSONArray(A09);
            Iterator it = C008203t.A03(0, jSONArray.length()).iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = jSONArray.getJSONObject(((C52222dL) it).A00());
                this.A01.add(new C53872gR(new C35301lh(new C53852gP(), String.class, jSONObject.getString("alias"), "upiAlias"), jSONObject.getString("aliasType"), jSONObject.getString("aliasId"), jSONObject.getString("aliasStatus")));
            }
        }
    }

    public final Set A00() {
        Set set = this.A01;
        ArrayList arrayList = new ArrayList();
        for (Object next : set) {
            String str = ((C53872gR) next).A02;
            if (C18450wi.A0R(str, "deregistered_pending") || C18450wi.A0R(str, "active") || C18450wi.A0R(str, "active_pending")) {
                arrayList.add(next);
            }
        }
        return C003101j.A0F(arrayList);
    }

    public synchronized void A01(C53872gR r8) {
        Object obj;
        C18450wi.A0H(r8, 0);
        Set set = this.A01;
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C18450wi.A0R(((C53872gR) obj).A01, r8.A01)) {
                break;
            }
        }
        C53872gR r5 = (C53872gR) obj;
        if (r5 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(C25421Js.A07(set.size()));
            boolean z2 = false;
            for (Object next : set) {
                if (z2 || !C18450wi.A0R(next, r5)) {
                    linkedHashSet.add(next);
                } else {
                    z2 = true;
                }
            }
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(C25421Js.A07(linkedHashSet.size() + 1));
            linkedHashSet2.addAll(linkedHashSet);
            linkedHashSet2.add(r8);
            if (A02(linkedHashSet2)) {
                set.remove(r5);
                set.add(r8);
            }
        }
    }

    public final boolean A02(Set set) {
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C53872gR r3 = (C53872gR) it.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("alias", r3.A00.A00);
                jSONObject.put("aliasType", r3.A03);
                jSONObject.put("aliasId", r3.A01);
                jSONObject.put("aliasStatus", r3.A02);
                jSONArray.put(jSONObject);
            }
            this.A00.A0M(jSONArray);
            return true;
        } catch (JSONException unused) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs setAlias threw: an exception ");
            return false;
        }
    }
}
