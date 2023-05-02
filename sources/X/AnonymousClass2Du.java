package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2Du  reason: invalid class name */
public final class AnonymousClass2Du extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ AnonymousClass13J this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2Du(AnonymousClass13J r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        C46362Dz r15;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, ?> all = this.this$0.A03.A01().getAll();
        ArrayList arrayList = new ArrayList();
        if (all != null) {
            for (Map.Entry next : all.entrySet()) {
                if (next.getValue() != null && (next.getValue() instanceof String) && ((String) next.getKey()).startsWith("badged_notice_")) {
                    try {
                        JSONObject jSONObject = new JSONObject((String) next.getValue());
                        try {
                            long optLong = jSONObject.optLong("start_time", -1);
                            long optLong2 = jSONObject.optLong("static_duration", -1);
                            long optLong3 = jSONObject.optLong("end_time", -1);
                            r15 = new C46362Dz(new C46312Dn(optLong2 == -1 ? null : new AnonymousClass2Dx((long[]) null, optLong2), optLong == -1 ? null : new AnonymousClass2Dy(optLong), optLong3 == -1 ? null : new AnonymousClass2Dy(optLong3)), jSONObject.getString("text"), jSONObject.getString("action"), jSONObject.getInt("id"), jSONObject.getInt("stage"), jSONObject.getInt("policy_version"), jSONObject.getLong("enabled_time"), jSONObject.getLong("selected_time"));
                        } catch (JSONException e2) {
                            Log.e("UserNoticeBadgeContent/fromJSON exception: ", e2);
                            r15 = null;
                        }
                    } catch (JSONException e3) {
                        Log.e("UserNoticeBadgeSharedPreferences/convertJsonStringToUserNoticeBadgeContent/parsing failed", e3);
                        r15 = null;
                    }
                    if (r15 != null) {
                        arrayList.add(r15);
                    }
                }
            }
        }
        int A07 = C25421Js.A07(AnonymousClass1J9.A0M(arrayList, 10));
        if (A07 < 16) {
            A07 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(A07);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            linkedHashMap2.put(Integer.valueOf(((C46362Dz) next2).A04.A00), next2);
        }
        linkedHashMap.putAll(new LinkedHashMap(linkedHashMap2));
        return linkedHashMap;
    }
}
