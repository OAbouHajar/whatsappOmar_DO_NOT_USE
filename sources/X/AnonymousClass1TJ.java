package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.1TJ  reason: invalid class name */
public class AnonymousClass1TJ implements AnonymousClass101 {
    public final AnonymousClass101 A00;

    public AnonymousClass1TJ(AnonymousClass101 r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A6j(JSONObject jSONObject, long j2) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        Object A6j;
        try {
            HashSet hashSet = new HashSet();
            Collections.addAll(hashSet, new String[]{"xwa_product_catalog_get_product_list"});
            if (C87624Xt.A01(hashSet, jSONObject) && (optJSONObject = jSONObject.optJSONObject("xwa_product_catalog_get_product_list")) != null) {
                HashSet hashSet2 = new HashSet();
                Collections.addAll(hashSet2, new String[]{"product_list"});
                if (C87624Xt.A01(hashSet2, optJSONObject) && (optJSONObject2 = optJSONObject.optJSONObject("product_list")) != null) {
                    boolean z2 = true;
                    HashSet hashSet3 = new HashSet();
                    Collections.addAll(hashSet3, new String[]{"products"});
                    if (C87624Xt.A01(hashSet3, optJSONObject2)) {
                        JSONArray optJSONArray = optJSONObject2.optJSONArray("products");
                        if (optJSONArray == null) {
                            return new C49822Vz(4);
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            JSONObject optJSONObject3 = optJSONArray.optJSONObject(i2);
                            if (!(optJSONObject3 == null || (A6j = this.A00.A6j(optJSONObject3, j2)) == null)) {
                                arrayList.add(A6j);
                            }
                        }
                        String A002 = C87624Xt.A00("cart_enabled", optJSONObject2);
                        if (TextUtils.isEmpty(A002) || !A002.equals("CARTENABLED_TRUE")) {
                            z2 = false;
                        }
                        if (arrayList.isEmpty()) {
                            return new C49822Vz(4);
                        }
                        C49822Vz r1 = new C49822Vz(1);
                        r1.A01 = arrayList;
                        r1.A02 = z2;
                        return r1;
                    }
                }
            }
            return new C49822Vz(4);
        } catch (Exception e2) {
            Log.e("CatalogPageGraphQLResponseConverter/convert/Could not create CatalogPage from GetProductList GraphQL response", e2);
            return new C49822Vz(2);
        }
    }
}
