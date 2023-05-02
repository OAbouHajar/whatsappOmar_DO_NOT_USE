package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.redex.RunnableRunnableShape11S0200000_I0_9;
import com.whatsapp.jid.Jid;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.1Jj  reason: invalid class name and case insensitive filesystem */
public final class C25331Jj implements C25301Jg {
    public final C14870pt A00;
    public final C16760tb A01;
    public final C25271Jd A02;
    public final C17030uP A03;
    public final C16460t6 A04;
    public final C25321Ji A05;
    public final C16320sq A06;

    public C25331Jj(C14870pt r2, C16760tb r3, C25271Jd r4, C17030uP r5, C16460t6 r6, C25321Ji r7, C16320sq r8) {
        C18450wi.A0H(r3, 1);
        C18450wi.A0H(r8, 2);
        C18450wi.A0H(r6, 3);
        C18450wi.A0H(r2, 4);
        C18450wi.A0H(r4, 5);
        C18450wi.A0H(r5, 6);
        C18450wi.A0H(r7, 7);
        this.A01 = r3;
        this.A06 = r8;
        this.A04 = r6;
        this.A00 = r2;
        this.A02 = r4;
        this.A03 = r5;
        this.A05 = r7;
    }

    public void AaS(Activity activity, AnonymousClass1Z6 r23, Map map) {
        Intent intent;
        Bundle extras;
        boolean z2;
        if (activity != null && (intent = activity.getIntent()) != null && (extras = intent.getExtras()) != null) {
            C15830rv r7 = (C15830rv) Jid.getNullable(extras.getString("chat_id"));
            String string = extras.getString("message_id");
            long j2 = extras.getLong("message_row_id", 0);
            String string2 = extras.getString("action_name");
            String string3 = extras.getString("flow_id");
            String string4 = extras.getString("session_id");
            AnonymousClass1Z6 r2 = r23;
            if (!(string4 == null || r7 == null || string == null || string3 == null || string2 == null)) {
                Map map2 = map;
                if (map != null && map2.containsKey("extension_message_response")) {
                    Object obj = map2.get("extension_message_response");
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                    } else if (((Map) obj).containsKey("body")) {
                        Object obj2 = map2.get("extension_message_response");
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                        } else if (((Map) obj2).containsKey("params")) {
                            Object obj3 = map2.get("extension_message_response");
                            if (obj3 != null) {
                                Map map3 = (Map) obj3;
                                Object obj4 = map3.get("body");
                                if (obj4 != null) {
                                    String str = (String) obj4;
                                    Object obj5 = map3.get("params");
                                    if (obj5 != null) {
                                        Map map4 = (Map) obj5;
                                        if (map2.containsKey("disable_cta")) {
                                            Object obj6 = map2.get("disable_cta");
                                            if (obj6 != null) {
                                                z2 = ((Boolean) obj6).booleanValue();
                                            } else {
                                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                                            }
                                        } else {
                                            z2 = true;
                                        }
                                        C15830rv r15 = r7;
                                        String str2 = str;
                                        this.A01.A0H(r15, str2, "galaxy_message", new JSONObject(map4).toString(), j2);
                                        this.A06.Acl(new AnonymousClass3I1(r7, this, string4, string, string3, string2, z2));
                                        this.A00.A0K(new RunnableRunnableShape11S0200000_I0_9(this, 32, r2));
                                        return;
                                    }
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                                }
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                        }
                    }
                }
            }
            this.A00.A0K(new RunnableRunnableShape11S0200000_I0_9(this, 33, r2));
        }
    }
}
