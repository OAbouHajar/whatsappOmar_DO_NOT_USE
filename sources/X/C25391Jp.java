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

/* renamed from: X.1Jp  reason: invalid class name and case insensitive filesystem */
public final class C25391Jp implements C25301Jg {
    public final C25371Jn A00;
    public final C14870pt A01;
    public final C25271Jd A02;
    public final C16460t6 A03;
    public final C16320sq A04;
    public final C25381Jo A05;

    public C25391Jp(C25371Jn r2, C14870pt r3, C25271Jd r4, C16460t6 r5, C16320sq r6, C25381Jo r7) {
        C18450wi.A0H(r4, 1);
        C18450wi.A0H(r6, 2);
        C18450wi.A0H(r5, 3);
        C18450wi.A0H(r3, 4);
        C18450wi.A0H(r2, 5);
        this.A02 = r4;
        this.A04 = r6;
        this.A03 = r5;
        this.A01 = r3;
        this.A00 = r2;
        this.A05 = r7;
    }

    public void AaS(Activity activity, AnonymousClass1Z6 r34, Map map) {
        Intent intent;
        Bundle extras;
        boolean z2;
        boolean z3;
        Activity activity2 = activity;
        if (activity != null && (intent = activity2.getIntent()) != null && (extras = intent.getExtras()) != null) {
            String string = extras.getString("chat_id");
            UserJid nullable = UserJid.getNullable(string);
            String string2 = extras.getString("flow_token");
            String string3 = extras.getString("flow_message_version");
            String string4 = extras.getString("flow_id");
            String string5 = extras.getString("flow_data_endpoint");
            ArrayList A012 = AnonymousClass16J.A01();
            String str = (String) A012.get(0);
            String str2 = (String) A012.get(1);
            String string6 = extras.getString("user_locale");
            if (string3 != null && string != null && nullable != null && string2 != null && string4 != null && str != null && str2 != null && string6 != null) {
                Map map2 = map;
                if (map != null && map2.containsKey("business_payload") && map2.containsKey("client_params")) {
                    Object obj = map2.get("business_payload");
                    if (obj != null) {
                        Map A002 = C90284dt.A00(obj);
                        A002.put("flow_token", string2);
                        A002.put("user_locale", string6);
                        Object obj2 = map2.get("client_params");
                        if (obj2 != null) {
                            Map A003 = C90284dt.A00(obj2);
                            if (A003.containsKey("show_loading")) {
                                Object obj3 = A003.get("show_loading");
                                if (obj3 != null) {
                                    z2 = ((Boolean) obj3).booleanValue();
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                                }
                            } else {
                                z2 = false;
                            }
                            if (A003.containsKey("show_full_screen_error")) {
                                Object obj4 = A003.get("show_full_screen_error");
                                if (obj4 != null) {
                                    z3 = ((Boolean) obj4).booleanValue();
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                                }
                            } else {
                                z3 = false;
                            }
                            ((WaExtensionsBottomsheetModalActivity) activity2).A03.A03.A0B(Boolean.valueOf(z2));
                            if (Build.VERSION.SDK_INT <= 18) {
                                C813147r.A00(A002);
                            }
                            JSONObject jSONObject = new JSONObject(A002);
                            C25271Jd r14 = this.A02;
                            String obj5 = jSONObject.toString();
                            C18450wi.A0B(obj5);
                            C25381Jo r5 = this.A05;
                            C25371Jn r12 = this.A00;
                            C14870pt r13 = this.A01;
                            C16320sq r4 = this.A04;
                            C62753Eu r10 = new C62753Eu(activity2, r12, r13, r14, r34, this.A03, r4, r5, string3, string5, string4, obj5, str, str2, true, z3);
                            String obj6 = jSONObject.toString();
                            C18450wi.A0B(obj6);
                            r5.A01(r10, nullable, obj6, str, str2, false);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.Any, kotlin.Any>");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.Any, kotlin.Any>");
                }
            }
        }
    }
}
