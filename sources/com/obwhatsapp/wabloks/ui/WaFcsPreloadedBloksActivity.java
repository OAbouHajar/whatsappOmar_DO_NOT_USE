package com.obwhatsapp.wabloks.ui;

import X.AnonymousClass01S;
import X.C110105dW;
import X.C110155db;
import X.C114695oP;
import X.C1206962q;
import X.C35001lD;
import X.C52372dh;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;

public class WaFcsPreloadedBloksActivity extends C114695oP {
    public final BroadcastReceiver A00 = new C110155db(this);

    public static Intent A02(Context context, C35001lD r2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        return C110105dW.A05(C110105dW.A04(context, WaFcsPreloadedBloksActivity.class).putExtra("screen_name", str).putExtra("data_module_job_id", str2).putExtra("data_module_namespace", str3).putExtra("screen_params", str4), str6, str7, str8, str9).putExtra("fds_observer_id", str5).putExtra("qpl_param_map", str10).putExtra("screen_cache_config", r2);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 100) {
            Bundle extras = intent != null ? intent.getExtras() : null;
            C52372dh r1 = this.A00;
            if (r1 != null) {
                r1.A01(new C1206962q(i3, extras));
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        registerReceiver(this.A00, new IntentFilter("com.obwhatsapp.payments.phoenix.action.launch_activity_for_phoenix_result"), AnonymousClass01S.A09, (Handler) null);
    }

    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.A00);
    }
}
