package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.1BN  reason: invalid class name */
public class AnonymousClass1BN {
    public Boolean A00 = null;
    public String A01;
    public final C16980tz A02;
    public final AnonymousClass01D A03;
    public final AnonymousClass01D A04;
    public final AnonymousClass01D A05;

    public AnonymousClass1BN(C16980tz r2, AnonymousClass01D r3, AnonymousClass01D r4, AnonymousClass01D r5) {
        this.A05 = r3;
        this.A04 = r4;
        this.A03 = r5;
        this.A02 = r2;
    }

    public final synchronized String A00() {
        String str;
        str = this.A01;
        if (str == null) {
            str = UUID.randomUUID().toString();
            this.A01 = str;
        }
        return str;
    }

    public void A01(String str) {
        if (A07()) {
            HashMap hashMap = new HashMap();
            String A002 = A00();
            if (A002 != null) {
                hashMap.put("funnel_id", A002.getBytes());
            }
            A06(str, hashMap);
        }
    }

    public void A02(String str) {
        TelephonyManager telephonyManager;
        if (A07()) {
            HashMap hashMap = new HashMap();
            String A002 = A00();
            if (A002 != null) {
                hashMap.put("funnel_id", A002.getBytes());
            }
            Context context = this.A02.A00;
            boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.telephony");
            hashMap.put("sim_card_supported", (hasSystemFeature ? "1" : "0").getBytes());
            if (hasSystemFeature) {
                int i2 = -1;
                if (context.getPackageManager().hasSystemFeature("android.hardware.telephony")) {
                    Object systemService = context.getSystemService("phone");
                    if ((systemService instanceof TelephonyManager) && (telephonyManager = (TelephonyManager) systemService) != null) {
                        i2 = telephonyManager.getSimState();
                    }
                }
                hashMap.put("sim_state", Integer.toString(i2).getBytes());
            }
            if (C15450qv.A00()) {
                AnonymousClass2CF A022 = C26791Pe.A02(context);
                if (A022 != null) {
                    hashMap.put("screen_diagonal_inches", Integer.toString(A022.A00).getBytes());
                }
                Configuration configuration = C47142Ht.A00(context).getResources().getConfiguration();
                hashMap.put("screen_width_dp", Integer.toString(configuration.screenWidthDp).getBytes());
                hashMap.put("screen_height_dp", Integer.toString(configuration.screenHeightDp).getBytes());
            }
            A06(str, hashMap);
        }
    }

    public void A03(String str, String str2) {
        if (A07()) {
            A01(str);
            A04(str, str2);
        }
    }

    public void A04(String str, String str2) {
        if (A07()) {
            C15860rz r2 = (C15860rz) this.A04.get();
            r2.A0K().putString("previous_registration_screen", str).apply();
            r2.A0K().putString("previous_registration_action", str2).apply();
        }
    }

    public void A05(String str, String str2, String str3, String str4, long j2) {
        if (A07()) {
            HashMap hashMap = new HashMap();
            String A002 = A00();
            if (A002 != null) {
                hashMap.put("funnel_id", A002.getBytes());
            }
            if (str3 != null) {
                hashMap.put("ios_attempt_id", str3.getBytes());
            }
            if (str4 != null) {
                hashMap.put("ios_export_duration", str4.getBytes());
            }
            if (str2 != null) {
                hashMap.put("google_migrate_import_error", str2.getBytes());
            }
            if (j2 > 0) {
                hashMap.put("google_migrate_import_duration", Long.toString(j2).getBytes());
            }
            A06(str, hashMap);
        }
    }

    public final void A06(String str, Map map) {
        AnonymousClass01D r3 = this.A04;
        String string = ((SharedPreferences) ((C15860rz) r3.get()).A01.get()).getString("previous_registration_screen", (String) null);
        if (string == null) {
            string = "unknown";
        }
        String string2 = ((SharedPreferences) ((C15860rz) r3.get()).A01.get()).getString("previous_registration_action", (String) null);
        if (string2 == null) {
            string2 = "unknown";
        }
        StringBuilder sb = new StringBuilder("funnel-logger/");
        sb.append(string);
        sb.append("/");
        sb.append(string2);
        sb.append("/");
        sb.append(str);
        Log.i(sb.toString());
        ((C16320sq) this.A05.get()).Acl(new AnonymousClass56C(this, str, string, string2, map));
    }

    public final boolean A07() {
        Boolean bool = this.A00;
        if (bool == null) {
            bool = true;
            this.A00 = bool;
        }
        return bool.booleanValue();
    }
}
