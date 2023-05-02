package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.1TI  reason: invalid class name */
public class AnonymousClass1TI implements AnonymousClass101 {
    public final AnonymousClass101 A00;

    public AnonymousClass1TI(AnonymousClass101 r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A6j(JSONObject jSONObject, long j2) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        AnonymousClass2GH r6;
        Object A6j;
        try {
            HashSet hashSet = new HashSet();
            Collections.addAll(hashSet, new String[]{"xwa_product_catalog_get_product_catalog"});
            if (C87624Xt.A01(hashSet, jSONObject) && (optJSONObject = jSONObject.optJSONObject("xwa_product_catalog_get_product_catalog")) != null) {
                HashSet hashSet2 = new HashSet();
                Collections.addAll(hashSet2, new String[]{"product_catalog"});
                if (C87624Xt.A01(hashSet2, optJSONObject) && (optJSONObject2 = optJSONObject.optJSONObject("product_catalog")) != null) {
                    boolean z2 = true;
                    HashSet hashSet3 = new HashSet();
                    Collections.addAll(hashSet3, new String[]{"products"});
                    if (C87624Xt.A01(hashSet3, optJSONObject2)) {
                        JSONArray optJSONArray = optJSONObject2.optJSONArray("products");
                        if (optJSONArray == null) {
                            return new AnonymousClass4H2((AnonymousClass2GI) null, false);
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            JSONObject optJSONObject3 = optJSONArray.optJSONObject(i2);
                            if (!(optJSONObject3 == null || (A6j = this.A00.A6j(optJSONObject3, j2)) == null)) {
                                arrayList.add(A6j);
                            }
                        }
                        HashSet hashSet4 = new HashSet();
                        Collections.addAll(hashSet4, new String[]{"paging"});
                        if (!C87624Xt.A01(hashSet4, optJSONObject2)) {
                            r6 = new AnonymousClass2GH((String) null, false);
                        } else {
                            String A002 = C87624Xt.A00("after", optJSONObject2.optJSONObject("paging"));
                            r6 = new AnonymousClass2GH(A002, !TextUtils.isEmpty(A002));
                        }
                        String A003 = C87624Xt.A00("cart_enabled", optJSONObject2);
                        if (TextUtils.isEmpty(A003) || !A003.equals("CARTENABLED_TRUE")) {
                            z2 = false;
                        }
                        return new AnonymousClass4H2(new AnonymousClass2GI(r6, arrayList), z2);
                    }
                }
            }
            return new AnonymousClass4H2((AnonymousClass2GI) null, false);
        } catch (Exception e2) {
            Log.e("GetProductCatalogGraphQLResponseConverter/convert/Could not create GetProductCatalogPageResult from GetProductCatalog GraphQL response", e2);
            return new AnonymousClass4H2((AnonymousClass2GI) null, false);
        }
    }
}
