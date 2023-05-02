package X;

import org.json.JSONObject;

/* renamed from: X.22I  reason: invalid class name */
public final class AnonymousClass22I extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ JSONObject $jsonObject;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass22I(JSONObject jSONObject) {
        super(1);
        this.$jsonObject = jSONObject;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        String str = (String) obj;
        C18450wi.A0C(str);
        boolean z2 = true;
        if (str.length() <= 0 || !this.$jsonObject.has(str)) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
