package X;

import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2Ds  reason: invalid class name and case insensitive filesystem */
public final class C46332Ds extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ AnonymousClass13J this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46332Ds(AnonymousClass13J r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AnonymousClass13H r0 = this.this$0.A03;
        HashMap hashMap = new HashMap();
        String string = r0.A01().getString("user_notices_metadata", (String) null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(Integer.valueOf(next), C46352Dw.A00(new JSONObject(jSONObject.get(next).toString())));
                }
            } catch (JSONException e2) {
                Log.e("UserNoticeSharedPreferences/getUserNoticeMap/parsing failed", e2);
            }
        }
        linkedHashMap.putAll(hashMap);
        return linkedHashMap;
    }
}
