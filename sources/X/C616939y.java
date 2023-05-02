package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: X.39y  reason: invalid class name and case insensitive filesystem */
public class C616939y {
    public static void A00(Intent intent, String str) {
        Bundle A0D = C13690nt.A0D();
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        if (stringExtra != null) {
            A0D.putString("_nmid", stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("google.c.a.c_l");
        if (stringExtra2 != null) {
            A0D.putString("_nmn", stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("google.c.a.m_l");
        if (!TextUtils.isEmpty(stringExtra3)) {
            A0D.putString("label", stringExtra3);
        }
        String stringExtra4 = intent.getStringExtra("google.c.a.m_c");
        if (!TextUtils.isEmpty(stringExtra4)) {
            A0D.putString("message_channel", stringExtra4);
        }
        String stringExtra5 = intent.getStringExtra("from");
        if (stringExtra5 != null && stringExtra5.startsWith("/topics/")) {
            A0D.putString("_nt", stringExtra5);
        }
        if (intent.hasExtra("google.c.a.ts")) {
            try {
                A0D.putInt("_nmt", Integer.parseInt(intent.getStringExtra("google.c.a.ts")));
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e2);
            }
        }
        if (intent.hasExtra("google.c.a.udt")) {
            try {
                A0D.putInt("_ndt", Integer.parseInt(intent.getStringExtra("google.c.a.udt")));
            } catch (NumberFormatException e3) {
                Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e3);
            }
        }
        if ("_nr".equals(str) || "_nf".equals(str)) {
            A0D.putString("_nmc", (intent.getExtras() == null || !C61793Ai.A01(intent.getExtras())) ? "data" : "display");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf = String.valueOf(A0D);
            StringBuilder A0g = C13690nt.A0g(C13680ns.A06(str) + 22 + valueOf.length());
            A0g.append("Sending event=");
            A0g.append(str);
            A0g.append(" params=");
            Log.d("FirebaseMessaging", AnonymousClass000.A0h(valueOf, A0g));
        }
        C13720nx A00 = C13720nx.A00();
        A00.A02();
        A00.A02.A02(AnonymousClass5MK.class);
        Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
    }

    public static boolean A01(Intent intent) {
        if ("com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
            return false;
        }
        return "1".equals(intent.getStringExtra("google.c.a.e"));
    }
}
