package com.obwhatsapp.push;

import X.AnonymousClass006;
import X.AnonymousClass01J;
import X.AnonymousClass01V;
import X.AnonymousClass03I;
import X.AnonymousClass03J;
import X.AnonymousClass1CE;
import X.AnonymousClass1TZ;
import X.AnonymousClass54H;
import X.AnonymousClass54I;
import X.C14710pd;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16150sX;
import X.C16300so;
import X.C16340ss;
import X.C16440t3;
import X.C16980tz;
import X.C17190ug;
import X.C17810vg;
import X.C18450wi;
import X.C19110xm;
import X.C20250zk;
import X.C59132uj;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;

public class RegistrationIntentService extends AnonymousClass03I implements AnonymousClass006 {
    public C16300so A00;
    public C15900s5 A01;
    public AnonymousClass01V A02;
    public C16440t3 A03;
    public C15860rz A04;
    public C14710pd A05;
    public C20250zk A06;
    public AnonymousClass1TZ A07;
    public C15960sC A08;
    public AnonymousClass1CE A09;
    public boolean A0A;
    public final Object A0B;
    public volatile AnonymousClass54I A0C;

    public RegistrationIntentService() {
        this(0);
    }

    public RegistrationIntentService(int i2) {
        this.A0B = new Object();
        this.A0A = false;
    }

    public static void A01(Context context) {
        Log.i("GCM: force replacing gcm token");
        Class<RegistrationIntentService> cls = RegistrationIntentService.class;
        AnonymousClass03J.A00(context, new Intent("com.obwhatsapp.action.FORCE_REPLACE", (Uri) null, context, cls), cls, 4);
    }

    public static void A02(Context context) {
        Log.i("GCM: refreshing gcm token");
        Class<RegistrationIntentService> cls = RegistrationIntentService.class;
        AnonymousClass03J.A00(context, new Intent("com.obwhatsapp.action.REFRESH", (Uri) null, context, cls), cls, 4);
    }

    public static void A03(Context context, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder("GCM: verifying registration; serverRegistrationId=");
        sb.append(str);
        Log.i(sb.toString());
        Class<RegistrationIntentService> cls = RegistrationIntentService.class;
        Intent intent = new Intent("com.obwhatsapp.action.VERIFY", (Uri) null, context, cls);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("registrationId", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("mutedChatsHash", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            intent.putExtra("appMuteConfig", str3);
        }
        AnonymousClass03J.A00(context, intent, cls, 4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        r13 = X.AnonymousClass01S.A0A;
        r17 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x024b, code lost:
        if (r17.hasNext() == false) goto L_0x0298;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x024d, code lost:
        r12 = (X.AnonymousClass2f0) r17.next();
        r0 = r12.A01.getRawString();
        X.C18450wi.A0B(r0);
        X.C18450wi.A0D(r13);
        r0 = r0.getBytes(r13);
        X.C18450wi.A0B(r0);
        r14.update(r0);
        r0 = r12.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x026b, code lost:
        if (r0 != null) goto L_0x0285;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x026d, code lost:
        r0 = r12.A02.longValue();
        r15 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0277, code lost:
        if (r0 == -1) goto L_0x027f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0279, code lost:
        r15 = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x027f, code lost:
        r0 = java.lang.Long.valueOf(r15);
        r12.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0285, code lost:
        r0 = java.lang.String.valueOf(r0.longValue()).getBytes(r13);
        X.C18450wi.A0B(r0);
        r14.update(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0298, code lost:
        r1 = new byte[6];
        java.lang.System.arraycopy(r14.digest(), 0, r1, 0, 6);
        r0 = android.util.Base64.encodeToString(r1, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02a7, code lost:
        if (r0 == null) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02af, code lost:
        if ((!r0.equalsIgnoreCase(r6)) == false) goto L_0x049c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02b1, code lost:
        com.whatsapp.util.Log.i("GCM: sending client config with new muted chats");
        r2.A07.A00(r3, r4, "gcm");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02c7, code lost:
        r2.A04.A0K().putString("c2dm_reg_id", r4).putInt("c2dm_app_vers", 230176001).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02d8, code lost:
        if (r19 != false) goto L_0x02e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02de, code lost:
        if (android.text.TextUtils.equals(r4, r3) != false) goto L_0x0326;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02e6, code lost:
        if (r2.A08.A01() == false) goto L_0x0326;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02e8, code lost:
        com.whatsapp.util.Log.i("GCM: sending client config with new token");
        r5 = r2.A09;
        r1 = r2.A05;
        r3 = X.C16620tM.A02;
        r5 = r5.A00(r1.A03(r3, 1657));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0305, code lost:
        if (r2.A05.A0E(r3, 283) != false) goto L_0x0312;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0307, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0310, code lost:
        if (r2.A05.A0E(r3, 2792) == false) goto L_0x0313;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0312, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0315, code lost:
        if (r0 == false) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0317, code lost:
        r2.A07.A00(r5, r4, "gcm");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x031d, code lost:
        r1 = r2.A07;
        X.C18450wi.A0H(r4, 0);
        r1.A00((X.C53102ez) null, r4, "gcm");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0326, code lost:
        if (r16 == false) goto L_0x049c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0328, code lost:
        if (r18 == false) goto L_0x049c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x032a, code lost:
        if (r6 != false) goto L_0x049c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x033d, code lost:
        if (((android.content.SharedPreferences) r2.A04.A01.get()).getBoolean("saved_gcm_token_server_unreg", false) != false) goto L_0x049c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x033f, code lost:
        com.whatsapp.util.Log.i("GCM: verifying tokenUnregisteredOnServer fetched saved token");
        r2.A00.AcB("gcm-retrieved-saved-token", (java.lang.String) null, false);
        r2.A04.A0K().putBoolean("saved_gcm_token_server_unreg", true).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0363, code lost:
        throw new java.lang.AssertionError("GCM: empty token returned but no exception thrown");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0364, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0369, code lost:
        if (r3.getMessage() == null) goto L_0x038f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0383, code lost:
        com.whatsapp.util.Log.e("GCM: security exception caught; switching to long-connect", r3);
        r2.A04.A0V();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0091, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x038f, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0390, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0395, code lost:
        if (r3.getMessage() != null) goto L_0x0397;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0397, code lost:
        r1 = r3.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03a0, code lost:
        switch(r1.hashCode()) {
            case -1992442893: goto L_0x0455;
            case -1800638118: goto L_0x042f;
            case -1579216525: goto L_0x03fd;
            case -1515255836: goto L_0x03f4;
            case -829011630: goto L_0x03eb;
            case -630263762: goto L_0x03e2;
            case -595928767: goto L_0x03d9;
            case 370784008: goto L_0x03cf;
            case 855732677: goto L_0x03c6;
            case 901541140: goto L_0x03bd;
            case 1750400351: goto L_0x03a9;
            default: goto L_0x03a3;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03a3, code lost:
        r0 = new java.lang.AssertionError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03a8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03af, code lost:
        if (r1.equals("MISSING_INSTANCEID_SERVICE") != false) goto L_0x03b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03b1, code lost:
        com.whatsapp.util.Log.e("GCM: attempted to register for GCM but Google Play Services was missing");
        r2.A04.A0V();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03c3, code lost:
        if (r1.equals("ACCOUNT_MISSING") != false) goto L_0x03c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03cc, code lost:
        if (r1.equals("TOO_MANY_REGISTRATIONS") != false) goto L_0x03ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03d5, code lost:
        if (r1.equals("BACKOFF") != false) goto L_0x03d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0095, code lost:
        if (r20 != false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03df, code lost:
        if (r1.equals("TIMEOUT") != false) goto L_0x03e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03e8, code lost:
        if (r1.equals("INTERNAL_SERVER_ERROR") != false) goto L_0x03ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03f1, code lost:
        if (r1.equals("INVALID_PARAMETERS") != false) goto L_0x03f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0097, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03fa, code lost:
        if (r1.equals("AUTHENTICATION_FAILED") != false) goto L_0x03fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0403, code lost:
        if (r1.equals("PHONE_REGISTRATION_ERROR") != false) goto L_0x0405;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0405, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("GCM: attempted to register for GCM but received undocumented error; exceptionMessage=");
        r1.append(r3.getMessage());
        r1.append("; playServicesAvailable=");
        r1.append(X.C437421i.A00(r2));
        com.whatsapp.util.Log.e(r1.toString());
        r2.A04.A0V();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0435, code lost:
        if (r1.equals("QUOTA_EXCEEDED") != false) goto L_0x0437;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0437, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("GCM: attempted to register for GCM but registration count was exceeded already; exceptionMessage=");
        r1.append(r3.getMessage());
        com.whatsapp.util.Log.e(r1.toString());
        r2.A04.A0V();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x009c, code lost:
        if (android.text.TextUtils.equals(r3, r13) == false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x045b, code lost:
        if (r1.equals("SERVICE_NOT_AVAILABLE") != false) goto L_0x045d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x045d, code lost:
        r4 = java.lang.Math.min(r8.getLongExtra("delay_ms", 15000), 86400000);
        r8.putExtra("delay_ms", 2 * r4);
        r3 = r2.A02.A04();
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0479, code lost:
        if (X.C42341xd.A00 == false) goto L_0x0485;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x047c, code lost:
        r0 = new java.lang.AssertionError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0483, code lost:
        r1 = 67108864;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0485, code lost:
        r2 = android.app.PendingIntent.getService(r2, 0, r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0489, code lost:
        if (r3 == null) goto L_0x0497;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x048b, code lost:
        r3.cancel(r2);
        r3.set(3, android.os.SystemClock.elapsedRealtime() + r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0497, code lost:
        com.whatsapp.util.Log.w("RegistrationIntentService/onHandleWork AlarmManager is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009e, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x049f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009f, code lost:
        r17 = android.text.TextUtils.isEmpty(r13);
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a4, code lost:
        if (230176001 == r14) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a6, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a7, code lost:
        if (r18 != false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a9, code lost:
        if (r17 != false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ab, code lost:
        if (r4 != false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ad, code lost:
        if (r0 != false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00af, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b1, code lost:
        if (r15 == false) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b3, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b5, code lost:
        if (r18 == false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b7, code lost:
        if (r17 != false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ca, code lost:
        if (((android.content.SharedPreferences) r2.A04.A01.get()).getBoolean("saved_gcm_token_server_unreg", false) == false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d4, code lost:
        if (r2.A01.A05(X.C15910s6.A0I) != false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d6, code lost:
        if (r15 == false) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d8, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("GCM: verifying tokenUnregisteredOnServer deleting savedToken:");
        r4.append(r13);
        com.whatsapp.util.Log.i(r4.toString());
        r0 = r2.A06.A00;
        X.AnonymousClass00B.A06(r0);
        r14 = (java.lang.String) r0.get();
        r6 = com.google.firebase.iid.FirebaseInstanceId.getInstance(X.C13720nx.A00());
        r4 = "FCM";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010b, code lost:
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0111, code lost:
        if (r4.isEmpty() != false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0119, code lost:
        if (r4.equalsIgnoreCase("fcm") != false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0121, code lost:
        if (r4.equalsIgnoreCase("gcm") == false) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0123, code lost:
        r4 = "*";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0125, code lost:
        r6.A04(r6.A06.A04(com.google.firebase.iid.FirebaseInstanceId.A01(), r14, r4));
        r6 = com.google.firebase.iid.FirebaseInstanceId.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0134, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r4 = X.C14110od.A01(r14, r4);
        r0 = r6.A01.edit();
        r0.remove(r4);
        r0.commit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0150, code lost:
        throw new java.io.IOException("MAIN_THREAD");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0151, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0152, code lost:
        r2.A04.A0K().putBoolean("saved_gcm_token_server_unreg", false).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0162, code lost:
        r0 = r2.A06.A00;
        X.AnonymousClass00B.A06(r0);
        r4 = com.google.firebase.iid.FirebaseInstanceId.getInstance(X.C13720nx.A00()).A05((java.lang.String) r0.get(), "FCM");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0181, code lost:
        if (android.text.TextUtils.isEmpty(r4) != false) goto L_0x035c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0183, code lost:
        r6 = new java.lang.StringBuilder();
        r6.append("GCM: token retrieved successfully; token=");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018d, code lost:
        if (r4 == null) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0190, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0192, code lost:
        r0 = r4.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0196, code lost:
        r6.append(r0);
        r6.append(" bytes; applicationVersion=");
        r6.append(230176001);
        com.whatsapp.util.Log.i(r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a8, code lost:
        if (r17 == false) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01aa, code lost:
        com.whatsapp.util.Log.i("GCM: no previously saved token");
        r2.A04.A0K().putInt("logins_with_messages", 0).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01be, code lost:
        r6 = !android.text.TextUtils.equals(r4, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01c4, code lost:
        if (r16 != false) goto L_0x02c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01c6, code lost:
        if (r6 != false) goto L_0x02c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01c8, code lost:
        if (r20 == false) goto L_0x049c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ca, code lost:
        r6 = r8.getStringExtra("mutedChatsHash");
        r13 = r8.getStringExtra("appMuteConfig");
        r3 = r2.A09;
        r1 = r2.A05;
        r15 = X.C16620tM.A02;
        r3 = r3.A00(r1.A03(r15, 1657));
        r1 = r3.A01;
        r14 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01f2, code lost:
        if (r2.A05.A0E(r15, 283) != false) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01fc, code lost:
        if (r2.A05.A0E(r15, 2792) == false) goto L_0x049c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01fe, code lost:
        r16 = !android.text.TextUtils.isEmpty(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0204, code lost:
        if (r1 == null) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0206, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x020b, code lost:
        if (r1.isEmpty() == false) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x020d, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x020e, code lost:
        if (r16 != false) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0210, code lost:
        if (r12 == false) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x021c, code lost:
        if (r2.A05.A0E(r15, 2792) == false) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x021e, code lost:
        if (r14 != 0) goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0220, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0222, code lost:
        r0 = java.lang.String.valueOf(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0226, code lost:
        r0 = X.C34901l3.A00(r0, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x022b, code lost:
        r0 = android.text.TextUtils.isEmpty(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x022f, code lost:
        if (r0 == false) goto L_0x02b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0231, code lost:
        if (r16 == false) goto L_0x049c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0233, code lost:
        if (r12 == false) goto L_0x02b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0235, code lost:
        X.C18450wi.A0H(r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        r14 = java.security.MessageDigest.getInstance("SHA-256");
        X.C18450wi.A0B(r14);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(android.content.Intent r22) {
        /*
            r21 = this;
            java.lang.String r9 = "delay_ms"
            r8 = r22
            java.lang.String r1 = r8.getAction()
            java.lang.String r0 = "com.obwhatsapp.action.VERIFY"
            boolean r20 = r0.equals(r1)
            java.lang.String r1 = r8.getAction()
            java.lang.String r0 = "com.obwhatsapp.action.REFRESH"
            boolean r19 = r0.equals(r1)
            java.lang.String r1 = r8.getAction()
            java.lang.String r0 = "com.obwhatsapp.action.FORCE_REPLACE"
            boolean r15 = r0.equals(r1)
            if (r19 != 0) goto L_0x003a
            if (r20 != 0) goto L_0x003a
            if (r15 != 0) goto L_0x003a
            java.lang.String r1 = "GCM: registration intent action was unknown; intent="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x003a:
            r2 = r21
            android.content.Context r0 = r2.getApplicationContext()
            X.0nx r0 = X.C13720nx.A01(r0)
            r3 = 0
            if (r0 == 0) goto L_0x0048
            r3 = 1
        L_0x0048:
            java.lang.String r1 = "GCM: Init firebase success:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            long r10 = android.os.Binder.clearCallingIdentity()
            java.lang.String r0 = "registrationId"
            java.lang.String r3 = r8.getStringExtra(r0)     // Catch:{ all -> 0x04a0 }
            r5 = 230176001(0xdb83501, float:1.1352636E-30)
            X.0rz r0 = r2.A04     // Catch:{ all -> 0x04a0 }
            X.01D r0 = r0.A01     // Catch:{ all -> 0x04a0 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x04a0 }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ all -> 0x04a0 }
            java.lang.String r12 = "c2dm_reg_id"
            r0 = 0
            java.lang.String r13 = r1.getString(r12, r0)     // Catch:{ all -> 0x04a0 }
            X.0rz r0 = r2.A04     // Catch:{ all -> 0x04a0 }
            X.01D r0 = r0.A01     // Catch:{ all -> 0x04a0 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x04a0 }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ all -> 0x04a0 }
            java.lang.String r1 = "c2dm_app_vers"
            r6 = 0
            int r14 = r0.getInt(r1, r6)     // Catch:{ all -> 0x04a0 }
            r7 = 0
            if (r20 == 0) goto L_0x0093
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x04a0 }
            r18 = 1
            if (r0 != 0) goto L_0x0097
        L_0x0093:
            r18 = 0
            if (r20 == 0) goto L_0x009e
        L_0x0097:
            boolean r0 = android.text.TextUtils.equals(r3, r13)     // Catch:{ all -> 0x04a0 }
            r4 = 1
            if (r0 == 0) goto L_0x009f
        L_0x009e:
            r4 = 0
        L_0x009f:
            boolean r17 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x04a0 }
            r0 = 0
            if (r5 == r14) goto L_0x00a7
            r0 = 1
        L_0x00a7:
            if (r18 != 0) goto L_0x00b3
            if (r17 != 0) goto L_0x00b3
            if (r4 != 0) goto L_0x00b3
            if (r0 != 0) goto L_0x00b3
            r16 = 0
            if (r15 == 0) goto L_0x0162
        L_0x00b3:
            r16 = 1
            if (r18 == 0) goto L_0x00d6
            if (r17 != 0) goto L_0x00d6
            X.0rz r0 = r2.A04     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.01D r0 = r0.A01     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            java.lang.Object r4 = r0.get()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            java.lang.String r0 = "saved_gcm_token_server_unreg"
            boolean r0 = r4.getBoolean(r0, r6)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            if (r0 == 0) goto L_0x00d6
            X.0s5 r4 = r2.A01     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.0s8 r0 = X.C15910s6.A0I     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            boolean r0 = r4.A05(r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            if (r0 != 0) goto L_0x00d8
        L_0x00d6:
            if (r15 == 0) goto L_0x0162
        L_0x00d8:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r4.<init>()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            java.lang.String r0 = "GCM: verifying tokenUnregisteredOnServer deleting savedToken:"
            r4.append(r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r4.append(r13)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            java.lang.String r0 = r4.toString()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.0zk r0 = r2.A06     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.01D r0 = r0.A00     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            java.lang.Object r14 = r0.get()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.0nx r0 = X.C13720nx.A00()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            com.google.firebase.iid.FirebaseInstanceId r6 = com.google.firebase.iid.FirebaseInstanceId.getInstance(r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            java.lang.String r4 = "FCM"
            android.os.Looper r15 = android.os.Looper.getMainLooper()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            if (r15 == r0) goto L_0x0149
            boolean r0 = r4.isEmpty()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            if (r0 != 0) goto L_0x0123
            java.lang.String r0 = "fcm"
            boolean r0 = r4.equalsIgnoreCase(r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            if (r0 != 0) goto L_0x0123
            java.lang.String r0 = "gcm"
            boolean r0 = r4.equalsIgnoreCase(r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            if (r0 == 0) goto L_0x0125
        L_0x0123:
            java.lang.String r4 = "*"
        L_0x0125:
            java.lang.String r15 = com.google.firebase.iid.FirebaseInstanceId.A01()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.0oe r0 = r6.A06     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.0on r0 = r0.A04(r15, r14, r4)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r6.A04(r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.0od r6 = com.google.firebase.iid.FirebaseInstanceId.A08     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            monitor-enter(r6)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            java.lang.String r4 = X.C14110od.A01(r14, r4)     // Catch:{ all -> 0x0146 }
            android.content.SharedPreferences r0 = r6.A01     // Catch:{ all -> 0x0146 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0146 }
            r0.remove(r4)     // Catch:{ all -> 0x0146 }
            r0.commit()     // Catch:{ all -> 0x0146 }
            goto L_0x0151
        L_0x0146:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            throw r0     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
        L_0x0149:
            java.lang.String r1 = "MAIN_THREAD"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            throw r0     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
        L_0x0151:
            monitor-exit(r6)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.0rz r0 = r2.A04     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            android.content.SharedPreferences$Editor r4 = r0.A0K()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            java.lang.String r0 = "saved_gcm_token_server_unreg"
            android.content.SharedPreferences$Editor r0 = r4.putBoolean(r0, r7)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r0.apply()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
        L_0x0162:
            X.0zk r0 = r2.A06     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.01D r0 = r0.A00     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            java.lang.Object r6 = r0.get()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.0nx r0 = X.C13720nx.A00()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            com.google.firebase.iid.FirebaseInstanceId r4 = com.google.firebase.iid.FirebaseInstanceId.getInstance(r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            java.lang.String r0 = "FCM"
            java.lang.String r4 = r4.A05(r6, r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            if (r0 != 0) goto L_0x035c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r6.<init>()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            java.lang.String r0 = "GCM: token retrieved successfully; token="
            r6.append(r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            if (r4 == 0) goto L_0x0190
            goto L_0x0192
        L_0x0190:
            r0 = 0
            goto L_0x0196
        L_0x0192:
            int r0 = r4.length()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
        L_0x0196:
            r6.append(r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            java.lang.String r0 = " bytes; applicationVersion="
            r6.append(r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r6.append(r5)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            java.lang.String r0 = r6.toString()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            if (r17 == 0) goto L_0x01be
            java.lang.String r0 = "GCM: no previously saved token"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.0rz r0 = r2.A04     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            android.content.SharedPreferences$Editor r6 = r0.A0K()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            java.lang.String r0 = "logins_with_messages"
            android.content.SharedPreferences$Editor r0 = r6.putInt(r0, r7)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r0.apply()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
        L_0x01be:
            boolean r0 = android.text.TextUtils.equals(r4, r13)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r6 = r0 ^ 1
            if (r16 != 0) goto L_0x02c7
            if (r6 != 0) goto L_0x02c7
            if (r20 == 0) goto L_0x049c
            java.lang.String r0 = "mutedChatsHash"
            java.lang.String r6 = r8.getStringExtra(r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            java.lang.String r0 = "appMuteConfig"
            java.lang.String r13 = r8.getStringExtra(r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.1CE r3 = r2.A09     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.0pd r1 = r2.A05     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r0 = 1657(0x679, float:2.322E-42)
            X.0tM r15 = X.C16620tM.A02     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            int r0 = r1.A03(r15, r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.2ez r3 = r3.A00(r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            java.util.List r1 = r3.A01     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            int r14 = r3.A00     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.0pd r5 = r2.A05     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r0 = 283(0x11b, float:3.97E-43)
            boolean r0 = r5.A0E(r15, r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            if (r0 != 0) goto L_0x01fe
            X.0pd r5 = r2.A05     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r0 = 2792(0xae8, float:3.912E-42)
            boolean r0 = r5.A0E(r15, r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            if (r0 == 0) goto L_0x049c
        L_0x01fe:
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r16 = r0 ^ 1
            if (r1 == 0) goto L_0x020d
            boolean r0 = r1.isEmpty()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r12 = 1
            if (r0 == 0) goto L_0x020e
        L_0x020d:
            r12 = 0
        L_0x020e:
            if (r16 != 0) goto L_0x0214
            if (r12 == 0) goto L_0x0214
            goto L_0x02b1
        L_0x0214:
            X.0pd r5 = r2.A05     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r0 = 2792(0xae8, float:3.912E-42)
            boolean r0 = r5.A0E(r15, r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            if (r0 == 0) goto L_0x022b
            if (r14 != 0) goto L_0x0222
            r0 = 0
            goto L_0x0226
        L_0x0222:
            java.lang.String r0 = java.lang.String.valueOf(r14)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
        L_0x0226:
            boolean r0 = X.C34901l3.A00(r0, r13)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            goto L_0x022f
        L_0x022b:
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
        L_0x022f:
            if (r0 == 0) goto L_0x02b1
            if (r16 == 0) goto L_0x049c
            if (r12 == 0) goto L_0x02b1
            X.C18450wi.A0H(r1, r7)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r14 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x02bf }
            X.C18450wi.A0B(r14)     // Catch:{ NoSuchAlgorithmException -> 0x02bf }
            java.nio.charset.Charset r13 = X.AnonymousClass01S.A0A     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            java.util.Iterator r17 = r1.iterator()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
        L_0x0247:
            boolean r0 = r17.hasNext()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            if (r0 == 0) goto L_0x0298
            java.lang.Object r12 = r17.next()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.2f0 r12 = (X.AnonymousClass2f0) r12     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.0rv r0 = r12.A01     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            java.lang.String r0 = r0.getRawString()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.C18450wi.A0B(r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.C18450wi.A0D(r13)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            byte[] r0 = r0.getBytes(r13)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.C18450wi.A0B(r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r14.update(r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            java.lang.Long r0 = r12.A00     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            if (r0 != 0) goto L_0x0285
            java.lang.Long r0 = r12.A02     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            long r0 = r0.longValue()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r15 = -1
            int r5 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r5 == 0) goto L_0x027f
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            long r15 = r5.toSeconds(r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
        L_0x027f:
            java.lang.Long r0 = java.lang.Long.valueOf(r15)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r12.A00 = r0     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
        L_0x0285:
            long r0 = r0.longValue()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            byte[] r0 = r0.getBytes(r13)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.C18450wi.A0B(r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r14.update(r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            goto L_0x0247
        L_0x0298:
            byte[] r5 = r14.digest()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r0 = 6
            byte[] r1 = new byte[r0]     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            java.lang.System.arraycopy(r5, r7, r1, r7, r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            if (r0 == 0) goto L_0x02bf
            boolean r0 = r0.equalsIgnoreCase(r6)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x049c
        L_0x02b1:
            java.lang.String r0 = "GCM: sending client config with new muted chats"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.1TZ r1 = r2.A07     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            java.lang.String r0 = "gcm"
            r1.A00(r3, r4, r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            goto L_0x049c
        L_0x02bf:
            java.lang.String r1 = "No SHA-256 alg. available"
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            throw r0     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
        L_0x02c7:
            X.0rz r0 = r2.A04     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            android.content.SharedPreferences$Editor r0 = r0.A0K()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            android.content.SharedPreferences$Editor r0 = r0.putString(r12, r4)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            android.content.SharedPreferences$Editor r0 = r0.putInt(r1, r5)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r0.apply()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            if (r19 != 0) goto L_0x02e0
            boolean r0 = android.text.TextUtils.equals(r4, r3)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            if (r0 != 0) goto L_0x0326
        L_0x02e0:
            X.0sC r0 = r2.A08     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            boolean r0 = r0.A01()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            if (r0 == 0) goto L_0x0326
            java.lang.String r0 = "GCM: sending client config with new token"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.1CE r5 = r2.A09     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.0pd r1 = r2.A05     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r0 = 1657(0x679, float:2.322E-42)
            X.0tM r3 = X.C16620tM.A02     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            int r0 = r1.A03(r3, r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.2ez r5 = r5.A00(r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.0pd r1 = r2.A05     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r0 = 283(0x11b, float:3.97E-43)
            boolean r0 = r1.A0E(r3, r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            if (r0 != 0) goto L_0x0312
            X.0pd r1 = r2.A05     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r0 = 2792(0xae8, float:3.912E-42)
            boolean r1 = r1.A0E(r3, r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r0 = 0
            if (r1 == 0) goto L_0x0313
        L_0x0312:
            r0 = 1
        L_0x0313:
            java.lang.String r3 = "gcm"
            if (r0 == 0) goto L_0x031d
            X.1TZ r0 = r2.A07     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r0.A00(r5, r4, r3)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            goto L_0x0326
        L_0x031d:
            X.1TZ r1 = r2.A07     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.C18450wi.A0H(r4, r7)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r0 = 0
            r1.A00(r0, r4, r3)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
        L_0x0326:
            if (r16 == 0) goto L_0x049c
            if (r18 == 0) goto L_0x049c
            if (r6 != 0) goto L_0x049c
            X.0rz r0 = r2.A04     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.01D r0 = r0.A01     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            java.lang.String r4 = "saved_gcm_token_server_unreg"
            boolean r0 = r0.getBoolean(r4, r7)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            if (r0 != 0) goto L_0x049c
            java.lang.String r0 = "GCM: verifying tokenUnregisteredOnServer fetched saved token"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.0so r3 = r2.A00     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            java.lang.String r1 = "gcm-retrieved-saved-token"
            r0 = 0
            r3.AcB(r1, r0, r7)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            X.0rz r0 = r2.A04     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r1 = 1
            android.content.SharedPreferences$Editor r0 = r0.A0K()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r4, r1)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r0.apply()     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            goto L_0x049c
        L_0x035c:
            java.lang.String r1 = "GCM: empty token returned but no exception thrown"
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
            throw r0     // Catch:{ IOException -> 0x0390, SecurityException -> 0x0364 }
        L_0x0364:
            r3 = move-exception
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x04a0 }
            if (r0 == 0) goto L_0x038f
            java.lang.String r1 = r3.getMessage()     // Catch:{ all -> 0x04a0 }
            java.lang.String r0 = "com.google.android.c2dm.permission.RECEIVE"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x04a0 }
            if (r0 != 0) goto L_0x0383
            java.lang.String r1 = r3.getMessage()     // Catch:{ all -> 0x04a0 }
            java.lang.String r0 = "process is bad"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x04a0 }
            if (r0 == 0) goto L_0x038f
        L_0x0383:
            java.lang.String r0 = "GCM: security exception caught; switching to long-connect"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ all -> 0x04a0 }
            X.0rz r0 = r2.A04     // Catch:{ all -> 0x04a0 }
            r0.A0V()     // Catch:{ all -> 0x04a0 }
            goto L_0x049c
        L_0x038f:
            throw r3     // Catch:{ all -> 0x04a0 }
        L_0x0390:
            r3 = move-exception
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x04a0 }
            if (r0 == 0) goto L_0x047c
            java.lang.String r1 = r3.getMessage()     // Catch:{ all -> 0x04a0 }
            int r0 = r1.hashCode()     // Catch:{ all -> 0x04a0 }
            r6 = 3
            switch(r0) {
                case -1992442893: goto L_0x0455;
                case -1800638118: goto L_0x042f;
                case -1579216525: goto L_0x03fd;
                case -1515255836: goto L_0x03f4;
                case -829011630: goto L_0x03eb;
                case -630263762: goto L_0x03e2;
                case -595928767: goto L_0x03d9;
                case 370784008: goto L_0x03cf;
                case 855732677: goto L_0x03c6;
                case 901541140: goto L_0x03bd;
                case 1750400351: goto L_0x03a9;
                default: goto L_0x03a3;
            }     // Catch:{ all -> 0x04a0 }
        L_0x03a3:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x04a0 }
            r0.<init>(r3)     // Catch:{ all -> 0x04a0 }
        L_0x03a8:
            throw r0     // Catch:{ all -> 0x04a0 }
        L_0x03a9:
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x04a0 }
            if (r0 == 0) goto L_0x03a3
            java.lang.String r0 = "GCM: attempted to register for GCM but Google Play Services was missing"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x04a0 }
            X.0rz r0 = r2.A04     // Catch:{ all -> 0x04a0 }
            r0.A0V()     // Catch:{ all -> 0x04a0 }
            goto L_0x049c
        L_0x03bd:
            java.lang.String r0 = "ACCOUNT_MISSING"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x04a0 }
            if (r0 == 0) goto L_0x03a3
            goto L_0x0405
        L_0x03c6:
            java.lang.String r0 = "TOO_MANY_REGISTRATIONS"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x04a0 }
            if (r0 == 0) goto L_0x03a3
            goto L_0x0437
        L_0x03cf:
            java.lang.String r0 = "BACKOFF"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x04a0 }
            if (r0 == 0) goto L_0x03a3
            goto L_0x045d
        L_0x03d9:
            java.lang.String r0 = "TIMEOUT"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x04a0 }
            if (r0 == 0) goto L_0x03a3
            goto L_0x045d
        L_0x03e2:
            java.lang.String r0 = "INTERNAL_SERVER_ERROR"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x04a0 }
            if (r0 == 0) goto L_0x03a3
            goto L_0x0405
        L_0x03eb:
            java.lang.String r0 = "INVALID_PARAMETERS"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x04a0 }
            if (r0 == 0) goto L_0x03a3
            goto L_0x0405
        L_0x03f4:
            java.lang.String r0 = "AUTHENTICATION_FAILED"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x04a0 }
            if (r0 == 0) goto L_0x03a3
            goto L_0x0405
        L_0x03fd:
            java.lang.String r0 = "PHONE_REGISTRATION_ERROR"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x04a0 }
            if (r0 == 0) goto L_0x03a3
        L_0x0405:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x04a0 }
            r1.<init>()     // Catch:{ all -> 0x04a0 }
            java.lang.String r0 = "GCM: attempted to register for GCM but received undocumented error; exceptionMessage="
            r1.append(r0)     // Catch:{ all -> 0x04a0 }
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x04a0 }
            r1.append(r0)     // Catch:{ all -> 0x04a0 }
            java.lang.String r0 = "; playServicesAvailable="
            r1.append(r0)     // Catch:{ all -> 0x04a0 }
            int r0 = X.C437421i.A00(r2)     // Catch:{ all -> 0x04a0 }
            r1.append(r0)     // Catch:{ all -> 0x04a0 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x04a0 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x04a0 }
            X.0rz r0 = r2.A04     // Catch:{ all -> 0x04a0 }
            r0.A0V()     // Catch:{ all -> 0x04a0 }
            goto L_0x049c
        L_0x042f:
            java.lang.String r0 = "QUOTA_EXCEEDED"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x04a0 }
            if (r0 == 0) goto L_0x03a3
        L_0x0437:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x04a0 }
            r1.<init>()     // Catch:{ all -> 0x04a0 }
            java.lang.String r0 = "GCM: attempted to register for GCM but registration count was exceeded already; exceptionMessage="
            r1.append(r0)     // Catch:{ all -> 0x04a0 }
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x04a0 }
            r1.append(r0)     // Catch:{ all -> 0x04a0 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x04a0 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x04a0 }
            X.0rz r0 = r2.A04     // Catch:{ all -> 0x04a0 }
            r0.A0V()     // Catch:{ all -> 0x04a0 }
            goto L_0x049c
        L_0x0455:
            java.lang.String r0 = "SERVICE_NOT_AVAILABLE"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x04a0 }
            if (r0 == 0) goto L_0x03a3
        L_0x045d:
            r0 = 15000(0x3a98, double:7.411E-320)
            long r3 = r8.getLongExtra(r9, r0)     // Catch:{ all -> 0x04a0 }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r4 = java.lang.Math.min(r3, r0)     // Catch:{ all -> 0x04a0 }
            r0 = 2
            long r0 = r0 * r4
            r8.putExtra(r9, r0)     // Catch:{ all -> 0x04a0 }
            X.01V r0 = r2.A02     // Catch:{ all -> 0x04a0 }
            android.app.AlarmManager r3 = r0.A04()     // Catch:{ all -> 0x04a0 }
            r1 = 0
            boolean r0 = X.C42341xd.A00     // Catch:{ all -> 0x04a0 }
            if (r0 == 0) goto L_0x0485
            goto L_0x0483
        L_0x047c:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x04a0 }
            r0.<init>(r3)     // Catch:{ all -> 0x04a0 }
            goto L_0x03a8
        L_0x0483:
            r1 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x0485:
            android.app.PendingIntent r2 = android.app.PendingIntent.getService(r2, r7, r8, r1)     // Catch:{ all -> 0x04a0 }
            if (r3 == 0) goto L_0x0497
            r3.cancel(r2)     // Catch:{ all -> 0x04a0 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x04a0 }
            long r0 = r0 + r4
            r3.set(r6, r0, r2)     // Catch:{ all -> 0x04a0 }
            goto L_0x049c
        L_0x0497:
            java.lang.String r0 = "RegistrationIntentService/onHandleWork AlarmManager is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x04a0 }
        L_0x049c:
            android.os.Binder.restoreCallingIdentity(r10)
            return
        L_0x04a0:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.push.RegistrationIntentService.A05(android.content.Intent):void");
    }

    public final Object generatedComponent() {
        if (this.A0C == null) {
            synchronized (this.A0B) {
                if (this.A0C == null) {
                    this.A0C = new AnonymousClass54I(this);
                }
            }
        }
        return this.A0C.generatedComponent();
    }

    public void onCreate() {
        if (!this.A0A) {
            this.A0A = true;
            C16150sX r4 = ((C59132uj) ((AnonymousClass54H) generatedComponent())).A04;
            this.A03 = (C16440t3) r4.AP2.get();
            AnonymousClass01J r2 = r4.A05;
            this.A05 = (C14710pd) r2.get();
            this.A00 = (C16300so) r4.A5p.get();
            this.A01 = (C15900s5) r4.ALm.get();
            this.A06 = (C20250zk) r4.AAx.get();
            this.A02 = (AnonymousClass01V) r4.AOi.get();
            C19110xm r1 = (C19110xm) r4.A6c.get();
            C18450wi.A0H(r1, 0);
            C17810vg A002 = r1.A00(AnonymousClass1CE.class);
            C18450wi.A0B(A002);
            AnonymousClass1CE r0 = (AnonymousClass1CE) A002;
            C16340ss.A01(r0);
            this.A09 = r0;
            this.A07 = new AnonymousClass1TZ((C16980tz) r4.AQB.get(), (C14710pd) r2.get(), (C17190ug) r4.AEu.get());
            this.A04 = (C15860rz) r4.AQh.get();
            this.A08 = (C15960sC) r4.AKz.get();
        }
        super.onCreate();
    }
}
