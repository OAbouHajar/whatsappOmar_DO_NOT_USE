package X;

import android.app.Activity;
import android.content.Intent;
import com.whatsapp.util.Log;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1RA  reason: invalid class name */
public final class AnonymousClass1RA extends AnonymousClass1R9 {
    public final C20190ze A00;
    public final C17030uP A01;
    public final AnonymousClass01V A02;
    public final C15860rz A03;
    public final AnonymousClass013 A04;
    public final C14710pd A05;
    public final C16490t9 A06;
    public final C18440wh A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1RA(C20190ze r2, C17030uP r3, AnonymousClass01V r4, C15860rz r5, AnonymousClass013 r6, C14710pd r7, C16490t9 r8, C18440wh r9) {
        super(r2, r3, r4, r5, r6, r7, r8);
        C18450wi.A0H(r6, 1);
        C18450wi.A0H(r7, 2);
        C18450wi.A0H(r5, 3);
        C18450wi.A0H(r9, 5);
        C18450wi.A0H(r4, 6);
        C18450wi.A0H(r8, 7);
        C18450wi.A0H(r3, 8);
        this.A04 = r6;
        this.A05 = r7;
        this.A03 = r5;
        this.A00 = r2;
        this.A07 = r9;
        this.A02 = r4;
        this.A06 = r8;
        this.A01 = r3;
    }

    public void A05(Activity activity, C35071lK r28, String str, String str2, long j2) {
        C35001lD r3;
        long j3;
        String str3 = str;
        C18450wi.A0H(str3, 2);
        String str4 = str2;
        C18450wi.A0H(str4, 3);
        Activity activity2 = activity;
        C35071lK r0 = r28;
        long j4 = j2;
        Activity activity3 = activity2;
        super.A05(activity3, r0, str3, str4, j4);
        Activity A002 = AnonymousClass22N.A00(activity2);
        String str5 = r0.A01;
        Map A012 = C438921y.A01(str5);
        if (A002 != null && A012.containsKey("flow_id") && A012.containsKey("flow_token") && A012.containsKey("flow_cta")) {
            String valueOf = String.valueOf(A012.get("flow_id"));
            AnonymousClass22P r1 = new AnonymousClass22P("\\d+");
            C18450wi.A0H(valueOf, 0);
            if (r1.nativePattern.matcher(valueOf).matches()) {
                AnonymousClass22D r2 = (AnonymousClass22D) ((Map) this.A07.A01.getValue()).get("galaxy_message");
                if (r2 == null || r2.A03) {
                    if (str5 == null) {
                        str5 = "";
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str5);
                        String str6 = (String) A012.get("flow_id");
                        String obj = jSONObject.toString();
                        C18450wi.A0F(str6);
                        AnonymousClass013 r13 = this.A04;
                        if (r2 != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str6);
                            sb.append(':');
                            sb.append(r2.A02);
                            str6 = sb.toString();
                            j3 = r2.A00 * 1000;
                            if (j3 == 0) {
                                r3 = null;
                                Intent intent = new Intent();
                                intent.setClassName(A002.getPackageName(), "com.obwhatsapp.wabloks.commerce.ui.view.WaExtensionsBottomsheetModalActivity");
                                intent.putExtra("screen_name", "com.bloks.www.whatsapp.commerce.extensions_message_v2");
                                intent.putExtra("screen_params", obj);
                                intent.putExtra("screen_cache_config", r3);
                                A06(A002, intent, str3, A012, j4);
                                intent.putExtra("session_id", str4);
                                intent.putExtra("make_metadata_request", true);
                                activity2.startActivity(intent);
                            }
                        } else {
                            j3 = 3600000;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str6);
                        sb2.append(':');
                        sb2.append(r13.A07());
                        r3 = new C35001lD(sb2.toString(), j3, true);
                        Intent intent2 = new Intent();
                        intent2.setClassName(A002.getPackageName(), "com.obwhatsapp.wabloks.commerce.ui.view.WaExtensionsBottomsheetModalActivity");
                        intent2.putExtra("screen_name", "com.bloks.www.whatsapp.commerce.extensions_message_v2");
                        intent2.putExtra("screen_params", obj);
                        intent2.putExtra("screen_cache_config", r3);
                        A06(A002, intent2, str3, A012, j4);
                        intent2.putExtra("session_id", str4);
                        intent2.putExtra("make_metadata_request", true);
                        activity2.startActivity(intent2);
                    } catch (JSONException e2) {
                        Log.e(C18450wi.A06("ExtensionsV2Action/execute/Error during json payload parsing: ", e2.getMessage()));
                    }
                }
            }
        }
    }
}
