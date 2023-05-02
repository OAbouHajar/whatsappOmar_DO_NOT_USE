package X;

import android.net.Uri;
import android.os.Bundle;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.29Q  reason: invalid class name */
public class AnonymousClass29Q {
    public final Map A00 = new HashMap();

    public AnonymousClass29Q() {
    }

    public AnonymousClass29Q(AnonymousClass20I r2) {
        A03(r2);
    }

    public AnonymousClass20I A00(Uri uri) {
        Map map = this.A00;
        AnonymousClass20I r0 = (AnonymousClass20I) map.get(uri);
        if (r0 != null) {
            return r0;
        }
        Log.e("mediapreviewparams/get/item should be explicitly added");
        AnonymousClass20I r02 = new AnonymousClass20I(uri);
        map.put(uri, r02);
        return r02;
    }

    public void A01(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("media_preview_params");
        if (bundle2 != null) {
            Map map = this.A00;
            map.clear();
            ArrayList parcelableArrayList = bundle2.getParcelableArrayList("items");
            if (parcelableArrayList != null) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    AnonymousClass20I r1 = ((C35331lk) it.next()).A00;
                    map.put(r1.A0G, r1);
                }
            }
        }
    }

    public final void A02(Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass20I r1 : this.A00.values()) {
            arrayList.add(new C35331lk(r1));
        }
        bundle.putParcelableArrayList("items", arrayList);
    }

    public void A03(AnonymousClass20I r4) {
        Map map = this.A00;
        Uri uri = r4.A0G;
        if (map.containsKey(uri)) {
            Log.e("mediapreviewparams/add/item was already added");
        }
        map.put(uri, r4);
    }
}
