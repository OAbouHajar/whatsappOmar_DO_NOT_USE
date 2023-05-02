package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.obwhatsapp.Me;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1KP  reason: invalid class name */
public class AnonymousClass1KP {
    public final AnonymousClass1S0 A00;
    public final AnonymousClass1G1 A01;
    public final C16040sK A02;
    public final C17130ua A03;
    public final C18260wP A04;
    public final AnonymousClass01V A05;
    public final C16440t3 A06;
    public final C16980tz A07;
    public final C16260sj A08;
    public final C15860rz A09;
    public final AnonymousClass013 A0A;
    public final AnonymousClass10J A0B;
    public final C14710pd A0C;
    public final AnonymousClass1ST A0D;
    public final C19950zG A0E;
    public final AnonymousClass1SB A0F;
    public final C229519x A0G;
    public final C17670vS A0H;
    public final C17660vR A0I;
    public final C16320sq A0J;
    public final C18980xZ A0K;
    public final AnonymousClass1SU A0L;

    public AnonymousClass1KP(AnonymousClass1S0 r2, AnonymousClass1G1 r3, C16040sK r4, C17130ua r5, C18260wP r6, AnonymousClass01V r7, C16440t3 r8, C16980tz r9, C16260sj r10, C15860rz r11, AnonymousClass013 r12, AnonymousClass10J r13, C14710pd r14, AnonymousClass1ST r15, C19950zG r16, AnonymousClass1SB r17, C229519x r18, C17670vS r19, C17660vR r20, C16320sq r21, C18980xZ r22, AnonymousClass1SU r23) {
        this.A06 = r8;
        this.A0C = r14;
        this.A02 = r4;
        this.A0I = r20;
        this.A07 = r9;
        this.A0J = r21;
        this.A03 = r5;
        this.A0K = r22;
        this.A0F = r17;
        this.A05 = r7;
        this.A0A = r12;
        this.A0B = r13;
        this.A01 = r3;
        this.A0G = r18;
        this.A0H = r19;
        this.A0E = r16;
        this.A08 = r10;
        this.A09 = r11;
        this.A00 = r2;
        this.A0D = r15;
        this.A04 = r6;
        this.A0L = r23;
    }

    public C31601ej A00(C47002Hc r23, String str, String str2, String str3, String str4, JSONObject jSONObject, byte[] bArr) {
        String str5;
        A08();
        String str6 = str;
        String str7 = str2;
        byte[] A0C2 = A0C(str6, str7);
        C14710pd r1 = this.A0C;
        Context context = this.A07.A00;
        AnonymousClass10J r0 = this.A0B;
        C15860rz r6 = this.A09;
        byte[] A072 = AnonymousClass2FR.A07(context, r6, r0, r1, str7);
        if (A072 == null) {
            A072 = C004101u.A0D();
        }
        r6.A1V(A072);
        boolean A0C3 = this.A08.A0C();
        AnonymousClass01V r12 = this.A05;
        TelephonyManager A0N = r12.A0N();
        String valueOf = String.valueOf(A0N == null ? -1 : A0N.getSimState());
        TelephonyManager A0N2 = r12.A0N();
        String str8 = "";
        if (A0N2 != null) {
            str5 = A0N2.getNetworkOperatorName();
            str8 = A0N2.getSimOperatorName();
        } else {
            str5 = str8;
        }
        Log.i("http/registration/wamsys/checkifexists");
        HashMap hashMap = new HashMap();
        hashMap.put("token", str3.getBytes());
        hashMap.put("mistyped", str4.getBytes());
        if (jSONObject != null) {
            hashMap.put("offline_ab", jSONObject.toString().getBytes());
        }
        JSONObject A002 = r23.A00();
        try {
            A002.put("was_activated_from_stub", context.getSharedPreferences("downloader_stub", 0).getBoolean("activated", false));
        } catch (JSONException unused) {
            Log.e("Failed to add stub activation metric.");
        }
        hashMap.put("client_metrics", A002.toString().getBytes());
        hashMap.put("read_phone_permission_granted", (A0C3 ? "1" : "0").getBytes());
        hashMap.put("sim_state", valueOf.getBytes());
        hashMap.put("network_operator_name", str5.getBytes());
        hashMap.put("sim_operator_name", str8.getBytes());
        hashMap.put("device_name", Build.DEVICE.getBytes());
        AnonymousClass01D r9 = r6.A01;
        String string = ((SharedPreferences) r9.get()).getString("pref_autoconf_feo2_query_status", "did_not_query");
        AnonymousClass00B.A06(string);
        hashMap.put("feo2_query_status", string.getBytes());
        A0A(hashMap);
        String l2 = Long.toString(((SharedPreferences) r9.get()).getLong("language_selector_time_spent", 0));
        String num = Integer.toString(((SharedPreferences) r9.get()).getInt("language_selector_clicked_count", 0));
        hashMap.put("language_selector_time_spent", l2.getBytes());
        hashMap.put("language_selector_clicked_count", num.getBytes());
        r6.A0K().remove("language_selector_clicked_count").apply();
        r6.A0K().remove("language_selector_time_spent").apply();
        A09(hashMap);
        return (C31601ej) C31591ei.A00(new C47012Hd(this.A00, this.A0L, str6, str7, A03(str6, "exist_entrypoint"), A04(), hashMap, A0C2, A072, bArr));
    }

    public C46582Ez A01(String str, String str2) {
        A08();
        Log.i("http/registration/wamsys/reg-onboard-abprop-request");
        HashMap hashMap = new HashMap();
        hashMap.put("rc", String.valueOf(C46992Hb.A01.value).getBytes());
        AnonymousClass01D r3 = this.A09.A01;
        if (((SharedPreferences) r3.get()).getString("pref_pre_chatd_ab_hash", (String) null) != null) {
            hashMap.put("ab_hash", ((SharedPreferences) r3.get()).getString("pref_pre_chatd_ab_hash", (String) null).getBytes());
        }
        return (C46582Ez) C31591ei.A00(new C47022He(this.A00, this.A0L, str, str2, hashMap));
    }

    public C47112Hq A02(C47002Hc r14, String str, String str2, String str3, String str4) {
        int i2;
        A08();
        String str5 = str;
        String str6 = str2;
        byte[] A0C2 = A0C(str, str6);
        byte[] A0B2 = A0B("resetSecurityCode");
        Log.i("http/registration/wamsys/resetsecuritycode");
        HashMap hashMap = new HashMap();
        hashMap.put("client_metrics", r14.A00().toString().getBytes());
        A09(hashMap);
        byte[] bytes = str4 != null ? str4.getBytes() : null;
        String str7 = str3;
        if ("wipe".equals(str7)) {
            i2 = 2;
        } else {
            i2 = 0;
            if ("email".equals(str7)) {
                i2 = 1;
            }
        }
        return (C47112Hq) C31591ei.A00(new C47102Hp(this.A00, this.A0L, (String) null, str5, str6, A03(str, "security_entrypoint"), A04(), hashMap, bytes, A0C2, A0B2, i2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A03(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            r3 = 0
            java.lang.String r1 = "eu"
            X.1G1 r0 = r4.A01     // Catch:{ 2Hl | 2Hm | IOException -> 0x0018 }
            java.lang.String r0 = r0.A03(r5)     // Catch:{ 2Hl | 2Hm | IOException -> 0x0018 }
            boolean r0 = r1.equals(r0)     // Catch:{ 2Hl | 2Hm | IOException -> 0x0018 }
            if (r0 != 0) goto L_0x002f
            X.0tz r0 = r4.A07     // Catch:{ 2Hl | 2Hm | IOException -> 0x0018 }
            android.content.Context r0 = r0.A00     // Catch:{ 2Hl | 2Hm | IOException -> 0x0018 }
            X.2Hk r0 = X.C47072Hj.A00(r0)     // Catch:{ 2Hl | 2Hm | IOException -> 0x0018 }
            goto L_0x0030
        L_0x0018:
            r2 = move-exception
            java.lang.String r0 = "RegistrationHelper/getAdvertisingId at "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r6)
            java.lang.String r0 = " failed"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
        L_0x002f:
            r0 = r3
        L_0x0030:
            if (r0 == 0) goto L_0x0034
            java.lang.String r3 = r0.A00
        L_0x0034:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1KP.A03(java.lang.String, java.lang.String):java.lang.String");
    }

    public final List A04() {
        ArrayList arrayList = new ArrayList();
        AnonymousClass1ST r2 = this.A0D;
        try {
            r2.A00();
        } catch (IOException e2) {
            Log.e("DomainFrontingManager/get-providers/error getting providers from the file", e2);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(r2.A07);
        arrayList2.addAll(r2.A08);
        arrayList2.addAll(r2.A06);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            AnonymousClass2Ho r3 = (AnonymousClass2Ho) it.next();
            StringBuilder sb = new StringBuilder();
            sb.append(r3.A02);
            sb.append(" ");
            sb.append(r3.A01);
            sb.append(" ");
            sb.append(r3.A03);
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    public final Map A05(C47052Hh r9, C47062Hi r10, String str) {
        String str2;
        int i2 = 1;
        switch (r9.ordinal()) {
            case 0:
                break;
            case 1:
                i2 = 2;
                break;
            case 2:
                i2 = 3;
                break;
            case 3:
                i2 = 4;
                break;
            default:
                Log.w("http/registration/entrymethod/unknown");
                i2 = 0;
                break;
        }
        String valueOf = String.valueOf(i2);
        TelephonyManager A0N = this.A05.A0N();
        String str3 = null;
        C47032Hf A002 = C47032Hf.A00(A0N != null ? A0N.getNetworkOperator() : null);
        if (A0N != null) {
            str3 = A0N.getSimOperator();
        }
        C47032Hf A003 = C47032Hf.A00(str3);
        String str4 = "";
        if (A0N != null) {
            str2 = A0N.getNetworkOperatorName();
            str4 = A0N.getSimOperatorName();
        } else {
            str2 = str4;
        }
        Log.i("http/registration/wamsys/verifycode");
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("mistyped", str.getBytes());
        }
        hashMap.put("client_metrics", r10.A00().toString().getBytes());
        hashMap.put("entered", valueOf.getBytes());
        hashMap.put("mcc", A002.A00.getBytes());
        hashMap.put("mnc", A002.A01.getBytes());
        hashMap.put("sim_mcc", A003.A00.getBytes());
        hashMap.put("sim_mnc", A003.A01.getBytes());
        hashMap.put("network_operator_name", str2.getBytes());
        hashMap.put("sim_operator_name", str4.getBytes());
        A09(hashMap);
        return hashMap;
    }

    public final Map A06(C47002Hc r4, C47032Hf r5, C47032Hf r6, String str, String str2) {
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put("mistyped", str2.getBytes());
        }
        hashMap.put("reason", str.getBytes());
        hashMap.put("client_metrics", r4.A00().toString().getBytes());
        hashMap.put("mcc", r5.A00.getBytes());
        hashMap.put("mnc", r5.A01.getBytes());
        hashMap.put("sim_mcc", r6.A00.getBytes());
        hashMap.put("sim_mnc", r6.A01.getBytes());
        A09(hashMap);
        return hashMap;
    }

    public final Map A07(C47042Hg r6, C47032Hf r7, C47032Hf r8, String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put("mistyped", str2.getBytes());
        }
        hashMap.put("reason", str.getBytes());
        if (str3 != null) {
            hashMap.put("hasav", str3.getBytes());
        }
        hashMap.put("client_metrics", r6.A00().toString().getBytes());
        hashMap.put("mcc", r7.A00.getBytes());
        hashMap.put("mnc", r7.A01.getBytes());
        hashMap.put("sim_mcc", r8.A00.getBytes());
        hashMap.put("sim_mnc", r8.A01.getBytes());
        AnonymousClass01D r4 = this.A09.A01;
        hashMap.put("education_screen_displayed", String.valueOf(((SharedPreferences) r4.get()).getBoolean("pref_flash_call_education_screen_displayed", false)).getBytes());
        hashMap.put("prefer_sms_over_flash", String.valueOf(((SharedPreferences) r4.get()).getBoolean("pref_prefer_sms_over_flash", false)).getBytes());
        A09(hashMap);
        return hashMap;
    }

    public void A08() {
        String str = this.A0F.A00().A01;
        C18980xZ r0 = this.A0K;
        C16980tz r2 = this.A07;
        C17660vR r6 = this.A0I;
        C16320sq r7 = this.A0J;
        r0.A03(this.A03, r2, this.A09, this.A0A, this.A0H, r6, r7, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002f, code lost:
        if (r2 < 6) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(java.util.Map r7) {
        /*
            r6 = this;
            r7.size()
            X.0wP r0 = r6.A04
            X.1UW r0 = r0.A06()
            java.lang.Integer r0 = X.AnonymousClass2CG.A00(r0)
            if (r0 != 0) goto L_0x0087
            r0 = -1
        L_0x0010:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            byte[] r1 = r0.getBytes()
            java.lang.String r0 = "network_radio_type"
            r7.put(r0, r1)
            X.0tz r5 = r6.A07
            X.01V r1 = r6.A05
            X.0sj r0 = r6.A08
            java.lang.String r0 = X.C39851tA.A01(r1, r5, r0)
            if (r0 == 0) goto L_0x0031
            int r2 = r0.length()
            r1 = 6
            r0 = 1
            if (r2 >= r1) goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            java.lang.String r4 = "1"
            java.lang.String r3 = "0"
            r1 = r3
            if (r0 == 0) goto L_0x003a
            r1 = r4
        L_0x003a:
            byte[] r1 = r1.getBytes()
            java.lang.String r0 = "simnum"
            r7.put(r0, r1)
            android.content.Context r0 = r5.A00
            java.io.File r2 = r0.getFilesDir()
            java.lang.String r1 = "rc2"
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0058
            r4 = r3
        L_0x0058:
            byte[] r1 = r4.getBytes()
            java.lang.String r0 = "hasinrc"
            r7.put(r0, r1)
            int r0 = android.os.Process.myPid()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            byte[] r1 = r0.getBytes()
            java.lang.String r0 = "pid"
            r7.put(r0, r1)
            X.2Hb r0 = X.C46992Hb.A01
            int r0 = r0.value
            java.lang.String r0 = java.lang.String.valueOf(r0)
            byte[] r1 = r0.getBytes()
            java.lang.String r0 = "rc"
            r7.put(r0, r1)
            r7.size()
            return
        L_0x0087:
            int r0 = r0.intValue()
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1KP.A09(java.util.Map):void");
    }

    public final void A0A(Map map) {
        Me A012 = this.A02.A01();
        if (A012 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(A012.cc);
            sb.append(A012.number);
            map.put("old_phone_number", sb.toString().getBytes());
        }
    }

    public byte[] A0B(String str) {
        C15860rz r2 = this.A09;
        byte[] A1o = r2.A1o();
        if (A1o.length != 0) {
            return A1o;
        }
        StringBuilder sb = new StringBuilder("RegistrationHttpManager/");
        sb.append(str);
        sb.append("/no backup token read from shared preferences, generate a new one");
        Log.i(sb.toString());
        byte[] A0D2 = C004101u.A0D();
        r2.A1V(A0D2);
        return A0D2;
    }

    public byte[] A0C(String str, String str2) {
        Context context = this.A07.A00;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        String A002 = AnonymousClass293.A00(sb.toString());
        byte[] A0G2 = C004101u.A0G(context, A002);
        if (A0G2 != null) {
            return A0G2;
        }
        byte[] A0D2 = C004101u.A0D();
        C004101u.A0B(context, A002, A0D2);
        return A0D2;
    }
}
