package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.3Il  reason: invalid class name */
public final class AnonymousClass3Il extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ AnonymousClass1N5 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3Il(AnonymousClass1N5 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String A0B = this.this$0.A00.A0B();
        if (!(A0B == null || A0B.length() == 0)) {
            JSONArray jSONArray = new JSONArray(A0B);
            Iterator it = C008203t.A03(0, jSONArray.length()).iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = jSONArray.getJSONObject(((C52222dL) it).A00());
                String string = jSONObject.getString("credentialId");
                C18450wi.A0B(string);
                String string2 = jSONObject.getString("credentialId");
                C18450wi.A0B(string2);
                String string3 = jSONObject.getString("internationalActivationStatus");
                C18450wi.A0B(string3);
                String string4 = jSONObject.getString("startTime");
                C18450wi.A0B(string4);
                String string5 = jSONObject.getString("endTime");
                C18450wi.A0B(string5);
                linkedHashMap.put(string, new AnonymousClass4WN(string2, string3, string4, string5));
            }
        }
        return linkedHashMap;
    }
}
