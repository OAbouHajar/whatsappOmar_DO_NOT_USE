package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.obwhatsapp.wabloks.ui.WaFcsPreloadedBloksActivity;

/* renamed from: X.5db  reason: invalid class name and case insensitive filesystem */
public class C110155db extends BroadcastReceiver {
    public final /* synthetic */ WaFcsPreloadedBloksActivity A00;

    public C110155db(WaFcsPreloadedBloksActivity waFcsPreloadedBloksActivity) {
        this.A00 = waFcsPreloadedBloksActivity;
    }

    public void onReceive(Context context, Intent intent) {
        int i2;
        C52372dh r1;
        if (intent.getAction() != null && intent.getAction().equals("com.obwhatsapp.payments.phoenix.action.launch_activity_for_phoenix_result")) {
            if (TextUtils.isEmpty(intent.getStringExtra("app_to_app_partner_app_package")) || TextUtils.isEmpty(intent.getStringExtra("app_to_app_partner_intent_action"))) {
                i2 = 0;
                r1 = this.A00.A00;
            } else {
                Intent intent2 = new Intent(intent.getStringExtra("app_to_app_partner_intent_action")).setPackage(intent.getStringExtra("app_to_app_partner_app_package"));
                if (!TextUtils.isEmpty(intent.getStringExtra("app_to_app_request_payload"))) {
                    intent2.putExtra("android.intent.extra.TEXT", intent.getStringExtra("app_to_app_request_payload"));
                }
                WaFcsPreloadedBloksActivity waFcsPreloadedBloksActivity = this.A00;
                if (intent2.resolveActivity(waFcsPreloadedBloksActivity.getPackageManager()) == null) {
                    i2 = 0;
                    r1 = waFcsPreloadedBloksActivity.A00;
                } else {
                    waFcsPreloadedBloksActivity.startActivityForResult(intent2, 100);
                    return;
                }
            }
            if (r1 != null) {
                r1.A01(new C1206962q(i2, (Bundle) null));
            }
        }
    }
}
