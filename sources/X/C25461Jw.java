package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.obwhatsapp.wabloks.commerce.ui.view.WaExtensionsBottomsheetModalActivity;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.1Jw  reason: invalid class name and case insensitive filesystem */
public final class C25461Jw implements C25471Jx {
    public final C25371Jn A00;
    public final C14870pt A01;
    public final C16460t6 A02;
    public final C16320sq A03;
    public final C25381Jo A04;

    public C25461Jw(C25371Jn r2, C14870pt r3, C16460t6 r4, C16320sq r5, C25381Jo r6) {
        C18450wi.A0H(r5, 1);
        C18450wi.A0H(r4, 2);
        C18450wi.A0H(r3, 3);
        C18450wi.A0H(r2, 4);
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
        this.A04 = r6;
    }

    public void AdR(Activity activity, AnonymousClass4R8 r35, Map map) {
        Intent intent;
        Bundle extras;
        boolean z2;
        Activity activity2 = activity;
        if (activity != null && (intent = activity2.getIntent()) != null && (extras = intent.getExtras()) != null) {
            String string = extras.getString("chat_id");
            UserJid nullable = UserJid.getNullable(string);
            String string2 = extras.getString("flow_token");
            String string3 = extras.getString("flow_message_version");
            ArrayList A012 = AnonymousClass16J.A01();
            boolean z3 = false;
            String str = (String) A012.get(0);
            String str2 = (String) A012.get(1);
            String string4 = extras.getString("user_locale");
            C25401Jq r1 = C18450wi.A0R(string3, "1") ? new C25401Jq(extras.getString("flow_data_endpoint"), (Object) null) : new C25401Jq((Object) null, extras.getString("flow_id"));
            String str3 = (String) r1.first;
            String str4 = (String) r1.second;
            if (string3 != null && string != null && nullable != null && string2 != null && str != null && str2 != null && string4 != null) {
                Map map2 = map;
                if (map == null) {
                    return;
                }
                if (str3 != null || str4 != null) {
                    map2.put("flow_token", string2);
                    map2.put("user_locale", string4);
                    if (map2.containsKey("show_loading")) {
                        Object obj = map2.get("show_loading");
                        if (obj != null) {
                            z3 = ((Boolean) obj).booleanValue();
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                        }
                    }
                    if (map2.containsKey("show_full_screen_error")) {
                        Object obj2 = map2.get("show_full_screen_error");
                        if (obj2 != null) {
                            z2 = ((Boolean) obj2).booleanValue();
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                        }
                    } else {
                        z2 = false;
                    }
                    map2.remove("show_loading");
                    map2.remove("show_full_screen_error");
                    ((WaExtensionsBottomsheetModalActivity) activity2).A03.A03.A0B(Boolean.valueOf(z3));
                    if (Build.VERSION.SDK_INT <= 18) {
                        C813147r.A00(map2);
                    }
                    JSONObject jSONObject = new JSONObject(map2);
                    String obj3 = jSONObject.toString();
                    C18450wi.A0B(obj3);
                    C25381Jo r8 = this.A04;
                    C62743Et r12 = new C62743Et(activity2, this.A00, this.A01, r35, this.A02, this.A03, r8, string3, str3, str4, obj3, str, str2, true, z2);
                    String obj4 = jSONObject.toString();
                    C18450wi.A0B(obj4);
                    r8.A01(r12, nullable, obj4, str, str2, false);
                }
            }
        }
    }
}
