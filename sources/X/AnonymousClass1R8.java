package X;

import android.app.Activity;
import android.content.Intent;
import com.whatsapp.util.Log;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1R8  reason: invalid class name */
public final class AnonymousClass1R8 extends AnonymousClass1R9 {
    public final C20190ze A00;
    public final C17030uP A01;
    public final AnonymousClass01V A02;
    public final C15860rz A03;
    public final AnonymousClass013 A04;
    public final C14710pd A05;
    public final C16490t9 A06;
    public final C18440wh A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1R8(C20190ze r2, C17030uP r3, AnonymousClass01V r4, C15860rz r5, AnonymousClass013 r6, C14710pd r7, C16490t9 r8, C18440wh r9) {
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
        C35001lD r2;
        long j3;
        String str3 = str;
        C18450wi.A0H(str3, 2);
        String str4 = str2;
        C18450wi.A0H(str4, 3);
        Activity activity2 = activity;
        C35071lK r22 = r28;
        long j4 = j2;
        super.A05(activity2, r22, str3, str4, j4);
        Activity A002 = AnonymousClass22N.A00(activity2);
        AnonymousClass22D r1 = (AnonymousClass22D) ((Map) this.A07.A01.getValue()).get("galaxy_message");
        if (r1 == null || r1.A03) {
            String str5 = r22.A01;
            Map A012 = C438921y.A01(str5);
            if (A002 != null && A012.containsKey("flow_id") && A012.containsKey("flow_version_id") && A012.containsKey("flow_data_endpoint") && A012.containsKey("flow_token") && A012.containsKey("flow_cta")) {
                String valueOf = String.valueOf(A012.get("flow_version_id"));
                AnonymousClass22P r0 = new AnonymousClass22P("\\d+");
                C18450wi.A0H(valueOf, 0);
                if (r0.nativePattern.matcher(valueOf).matches()) {
                    String valueOf2 = String.valueOf(A012.get("flow_id"));
                    AnonymousClass22P r02 = new AnonymousClass22P("\\d+");
                    C18450wi.A0H(valueOf2, 0);
                    if (r02.nativePattern.matcher(valueOf2).matches()) {
                        if (str5 == null) {
                            str5 = "";
                        }
                        try {
                            JSONObject jSONObject = new JSONObject(str5);
                            String str6 = (String) A012.get("flow_version_id");
                            String str7 = (String) A012.get("flow_data_endpoint");
                            String obj = jSONObject.toString();
                            C18450wi.A0F(str6);
                            AnonymousClass013 r13 = this.A04;
                            if (r1 != null) {
                                str6 = C18450wi.A06(str6, r1.A02);
                                j3 = r1.A00 * 1000;
                                if (j3 == 0) {
                                    r2 = null;
                                    Intent intent = new Intent();
                                    intent.setClassName(A002.getPackageName(), "com.obwhatsapp.wabloks.commerce.ui.view.WaExtensionsBottomsheetModalActivity");
                                    intent.putExtra("screen_name", "com.bloks.www.whatsapp.commerce.galaxy_message");
                                    intent.putExtra("screen_params", obj);
                                    intent.putExtra("screen_cache_config", r2);
                                    A06(A002, intent, str3, A012, j4);
                                    intent.putExtra("flow_data_endpoint", str7);
                                    intent.putExtra("session_id", str4);
                                    activity2.startActivity(intent);
                                }
                            } else {
                                j3 = 3600000;
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append(str6);
                            sb.append(':');
                            sb.append(r13.A07());
                            r2 = new C35001lD(sb.toString(), j3, true);
                            Intent intent2 = new Intent();
                            intent2.setClassName(A002.getPackageName(), "com.obwhatsapp.wabloks.commerce.ui.view.WaExtensionsBottomsheetModalActivity");
                            intent2.putExtra("screen_name", "com.bloks.www.whatsapp.commerce.galaxy_message");
                            intent2.putExtra("screen_params", obj);
                            intent2.putExtra("screen_cache_config", r2);
                            A06(A002, intent2, str3, A012, j4);
                            intent2.putExtra("flow_data_endpoint", str7);
                            intent2.putExtra("session_id", str4);
                            activity2.startActivity(intent2);
                        } catch (JSONException e2) {
                            Log.e(C18450wi.A06("ExtensionsV1Action/execute/Error during json payload parsing: ", e2.getMessage()));
                        }
                    }
                }
            }
        }
    }
}
