package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1T0  reason: invalid class name */
public class AnonymousClass1T0 {
    public final C16300so A00;
    public final C27751Sz A01;
    public final C17020u3 A02;

    public AnonymousClass1T0(C16300so r1, C27751Sz r2, C17020u3 r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void A00(UserJid userJid) {
        this.A02.A00("ctwa_ads_entry_points").edit().remove(userJid.getRawString()).apply();
    }

    public void A01(C47342Io r5, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/");
        sb.append(r5.getMessage());
        String obj = sb.toString();
        this.A00.AcB("JidKeyedSharedPreferencesStoreTransformationException", obj, true);
        StringBuilder sb2 = new StringBuilder("JidKeyedSharedPreferencesStore/");
        sb2.append(obj);
        Log.e(sb2.toString(), r5);
    }
}
