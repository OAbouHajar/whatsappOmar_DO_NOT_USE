package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.jid.Jid;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.1Ju  reason: invalid class name and case insensitive filesystem */
public final class C25441Ju {
    public final C16760tb A00;
    public final C25271Jd A01;
    public final C16460t6 A02;
    public final C25321Ji A03;
    public final C16320sq A04;
    public final Map A05;

    public C25441Ju(C16760tb r2, C25271Jd r3, C16460t6 r4, C25321Ji r5, C16320sq r6, Map map) {
        C18450wi.A0H(r2, 1);
        C18450wi.A0H(r6, 2);
        C18450wi.A0H(r4, 3);
        C18450wi.A0H(r3, 5);
        C18450wi.A0H(r5, 6);
        this.A00 = r2;
        this.A04 = r6;
        this.A02 = r4;
        this.A05 = map;
        this.A01 = r3;
        this.A03 = r5;
    }

    public void A00(Activity activity, String str, String str2, Map map) {
        Intent intent;
        Bundle extras;
        if (activity != null && (intent = activity.getIntent()) != null && (extras = intent.getExtras()) != null) {
            String string = extras.getString("chat_id");
            C15830rv r6 = (C15830rv) Jid.getNullable(string);
            String string2 = extras.getString("message_id");
            long j2 = extras.getLong("message_row_id", 0);
            String string3 = extras.getString("action_name");
            if (r6 != null) {
                String str3 = str;
                if (str != null) {
                    String str4 = str2;
                    if (str2 != null) {
                        Map map2 = map;
                        if (map != null && string2 != null && string3 != null) {
                            this.A00.A0H(r6, str3, str4, new JSONObject(map2).toString(), j2);
                            this.A04.Acl(new C63353Hj(this, string2, string, string3));
                        }
                    }
                }
            }
        }
    }
}
