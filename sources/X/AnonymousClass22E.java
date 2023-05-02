package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* renamed from: X.22E  reason: invalid class name */
public final class AnonymousClass22E extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ C18440wh this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass22E(C18440wh r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        Object obj;
        C14710pd r2 = this.this$0.A00;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String A06 = r2.A06(C16620tM.A02, 1320);
        if (A06 != null) {
            try {
                JSONObject jSONObject = new JSONObject(A06);
                Iterator<String> keys = jSONObject.keys();
                C18450wi.A0B(keys);
                AnonymousClass22L r4 = new AnonymousClass22L(new AnonymousClass22K(new AnonymousClass22I(jSONObject), new AnonymousClass22H(new AnonymousClass22F(keys)), true));
                while (r4.hasNext()) {
                    String str = (String) r4.next();
                    JSONObject optJSONObject = jSONObject.optJSONObject(str);
                    C18450wi.A0F(optJSONObject);
                    String optString = optJSONObject.optString("app_id");
                    boolean optBoolean = optJSONObject.optBoolean("enabled", true);
                    long optLong = optJSONObject.optLong("expiration_secs", 0);
                    String optString2 = optJSONObject.optString("version", "");
                    C18450wi.A09(str);
                    linkedHashMap.put(str, new AnonymousClass22D(optString, optString2, optLong, optBoolean));
                }
                obj = AnonymousClass22M.A00;
            } catch (Throwable th) {
                obj = new C41211vQ(th);
            }
            Throwable A00 = C41201vP.A00(obj);
            if (A00 != null) {
                A00.getMessage();
            }
        }
        return linkedHashMap;
    }
}
