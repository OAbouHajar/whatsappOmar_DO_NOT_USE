package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* renamed from: X.22q  reason: invalid class name and case insensitive filesystem */
public final class C440722q extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ AnonymousClass16I this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C440722q(AnonymousClass16I r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        AnonymousClass16I r0 = this.this$0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String A06 = r0.A05.A06(C16620tM.A02, 1320);
        if (A06 != null) {
            try {
                JSONObject jSONObject = new JSONObject(A06);
                Iterator<String> keys = jSONObject.keys();
                C18450wi.A0B(keys);
                AnonymousClass22L r3 = new AnonymousClass22L(new AnonymousClass22K(new AnonymousClass5FA(jSONObject), new AnonymousClass22H(new AnonymousClass22F(keys)), true));
                while (r3.hasNext()) {
                    JSONObject optJSONObject = jSONObject.optJSONObject((String) r3.next());
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("app_id");
                        String optString2 = optJSONObject.optString("version", "");
                        C18450wi.A0B(optString);
                        C18450wi.A0B(optString2);
                        linkedHashMap.put(optString, optString2);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return linkedHashMap;
    }
}
