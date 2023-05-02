package X;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: X.1TG  reason: invalid class name */
public class AnonymousClass1TG implements AnonymousClass101 {
    public final AnonymousClass101 A00;

    public AnonymousClass1TG(AnonymousClass101 r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A6j(JSONObject jSONObject, long j2) {
        C35701mM r2;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, new String[]{"xwa_product_catalog_get_product"});
        JSONObject jSONObject2 = null;
        if (C87624Xt.A01(hashSet, jSONObject) && (optJSONObject = jSONObject.optJSONObject("xwa_product_catalog_get_product")) != null) {
            HashSet hashSet2 = new HashSet();
            Collections.addAll(hashSet2, new String[]{"product_catalog"});
            if (C87624Xt.A01(hashSet2, optJSONObject) && (optJSONObject2 = optJSONObject.optJSONObject("product_catalog")) != null) {
                HashSet hashSet3 = new HashSet();
                Collections.addAll(hashSet3, new String[]{"product"});
                if (C87624Xt.A01(hashSet3, optJSONObject2)) {
                    jSONObject2 = optJSONObject2;
                }
            }
        }
        boolean z2 = false;
        if (jSONObject2 == null) {
            r2 = null;
        } else {
            r2 = (C35701mM) this.A00.A6j(jSONObject2.optJSONObject("product"), j2);
            String A002 = C87624Xt.A00("cart_enabled", jSONObject2);
            if (!TextUtils.isEmpty(A002) && A002.equals("CARTENABLED_TRUE")) {
                z2 = true;
            }
        }
        return new AnonymousClass4H3(r2, z2);
    }
}
