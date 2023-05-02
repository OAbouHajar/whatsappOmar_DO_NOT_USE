package X;

import android.os.Bundle;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* renamed from: X.09c  reason: invalid class name and case insensitive filesystem */
public final class C019609c {
    public static final C016407u A00(Bundle bundle, Bundle bundle2) {
        AbstractMap abstractMap;
        if (bundle != null) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            int i2 = 0;
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            abstractMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            while (i2 < size) {
                Object obj = parcelableArrayList.get(i2);
                if (obj != null) {
                    abstractMap.put(obj, parcelableArrayList2.get(i2));
                    i2++;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            }
        } else if (bundle2 == null) {
            return new C016407u();
        } else {
            abstractMap = new HashMap();
            for (String str : bundle2.keySet()) {
                C18450wi.A09(str);
                abstractMap.put(str, bundle2.get(str));
            }
        }
        return new C016407u(abstractMap);
    }
}
