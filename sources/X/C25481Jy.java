package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Jy  reason: invalid class name and case insensitive filesystem */
public final class C25481Jy implements C25471Jx {
    public final C20180zd A00;

    public C25481Jy(C20180zd r2) {
        C18450wi.A0H(r2, 1);
        this.A00 = r2;
    }

    public void AdR(Activity activity, AnonymousClass4R8 r9, Map map) {
        Intent intent;
        Bundle extras;
        String string;
        if (activity != null && (intent = activity.getIntent()) != null && (extras = intent.getExtras()) != null && (string = extras.getString("fds_observer_id")) != null && map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (!(entry.getKey() == null || entry.getValue() == null)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C25421Js.A07(linkedHashMap.size()));
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                linkedHashMap2.put(String.valueOf(entry2.getKey()), entry2.getValue());
            }
            this.A00.A02(string).A01(new C1037052k(linkedHashMap2));
        }
    }
}
