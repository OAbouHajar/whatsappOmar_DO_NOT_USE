package X;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;
import com.mod2.fblibs.Facebook;
import com.obwhatsapp.Me;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0so  reason: invalid class name and case insensitive filesystem */
public abstract class C16300so implements AnonymousClass01K {
    public String A00() {
        StringBuilder sb;
        C23401Bv r3 = (C23401Bv) this;
        C16040sK r2 = r3.A03;
        r2.A0B();
        Me me = r2.A00;
        int A00 = r2.A00();
        if (me != null) {
            sb = new StringBuilder();
            sb.append(me.jabber_id);
            sb.append(":");
            sb.append(A00);
        } else {
            String replaceAll = r2.A07().toLowerCase(Locale.US).replaceAll("\\W", "-");
            if (!replaceAll.equals("")) {
                return replaceAll;
            }
            ContentResolver A0C = r3.A06.A0C();
            if (A0C == null) {
                Log.w("crashlogs/get-from-parameter cr=null");
                return replaceAll;
            }
            String yoAndroidID = yo.getYoAndroidID(Settings.Secure.getString(A0C, "android_id"));
            if (yoAndroidID == null || yoAndroidID.length() < 6) {
                yoAndroidID = "123456";
            }
            sb = new StringBuilder("new-");
            sb.append(yoAndroidID.substring(yoAndroidID.length() - 6));
        }
        return sb.toString();
    }

    public String A01(String str) {
        int memoryClass;
        C23401Bv r1 = (C23401Bv) this;
        ActivityManager A03 = r1.A06.A03();
        if (A03 == null) {
            Log.w("memorydumpuploadservice/get-upload-params am=null");
            memoryClass = 16;
        } else {
            memoryClass = A03.getMemoryClass();
        }
        r1.A0D.A01(r1.A07, C003901s.A00());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_version_code", 230176001);
            jSONObject.put("brand", Build.BRAND);
            jSONObject.put("memclass", memoryClass);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("android_version", Build.VERSION.RELEASE);
            jSONObject.put("app_version_name", "2.23.1.76");
            jSONObject.put("app", "Whatsapp");
            jSONObject.put("process_name", "Main Process");
            jSONObject.put("uid", "1");
            jSONObject.putOpt("dump_cause", str);
            jSONObject.put("platform_abi", AnonymousClass1U8.A02());
            return jSONObject.toString();
        } catch (JSONException e2) {
            return String.format(Locale.US, "{ 'error' : '%s' }", new Object[]{e2.getMessage()});
        }
    }

    public String A02(String str, String str2, boolean z2) {
        C23401Bv r2 = (C23401Bv) this;
        C29571aq r1 = new C29571aq();
        C29551ao r4 = new C29551ao(r2.A04, new C29581ar(r1, r2), r2.A0B, "https://crashlogs.whatsapp.net/wa_fls_upload_check", r2.A0D.A00(), 6, false, false, false);
        r4.A06(Facebook.TOKEN, "1063127757113399|745146ffa34413f9dbb5469f5370b7af");
        r4.A06("from_jid", str);
        r4.A06("type", str2);
        r4.A06("support_exception_only_upload", String.valueOf(z2));
        int A02 = r4.A02((C29561ap) null);
        if (A02 == 200) {
            return r1.A00;
        }
        if (A02 == 403) {
            r1.A00 = "no_upload";
            return "no_upload";
        } else if (A02 != 500) {
            StringBuilder sb = new StringBuilder("Unknown response code ");
            sb.append(A02);
            sb.append(" from crash upload server");
            throw new IOException(sb.toString());
        } else {
            throw new IOException("Response 500 received from server");
        }
    }

    public void A03(String str, String str2, Throwable th) {
        Log.e(str, th);
        ((C23401Bv) this).A08(new C29491ai(str, th), str, str2, new HashMap(), true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c2, code lost:
        r1 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fe, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ff, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0146, code lost:
        r1.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0149, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(java.util.HashSet r22, java.util.Map r23, boolean r24, boolean r25, boolean r26, boolean r27) {
        /*
            r21 = this;
            r0 = r21
            X.1Bv r0 = (X.C23401Bv) r0
            boolean r1 = com.whatsapp.util.Log.rotate()
            r12 = 0
            r5 = r25
            if (r1 != 0) goto L_0x0018
            java.lang.String r1 = "crash-log/whatsapp/no_file"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            java.lang.String r1 = "no-file"
            r0.A0A(r1, r5)
        L_0x0017:
            return
        L_0x0018:
            r1 = 0
            r4 = r23
            r20 = r27
            java.io.File r7 = com.whatsapp.util.Log.compress()     // Catch:{ Exception -> 0x00fe, all -> 0x014d }
            X.12X r6 = r0.A0A     // Catch:{ Exception -> 0x00fe, all -> 0x014d }
            r3 = 1048576(0x100000, float:1.469368E-39)
            r2 = 5242880(0x500000, float:7.34684E-39)
            if (r26 == 0) goto L_0x002d
            r3 = 8388608(0x800000, float:1.17549435E-38)
            r2 = 41943040(0x2800000, float:1.880791E-37)
        L_0x002d:
            android.util.Pair r3 = X.AnonymousClass1XI.A02(r6, r7, r3, r2)     // Catch:{ Exception -> 0x00fe, all -> 0x014d }
            java.lang.Object r2 = r3.first     // Catch:{ Exception -> 0x00fe, all -> 0x014d }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x00fe, all -> 0x014d }
            boolean r11 = r2.booleanValue()     // Catch:{ Exception -> 0x00fe, all -> 0x014d }
            java.lang.Object r3 = r3.second     // Catch:{ Exception -> 0x00fc, all -> 0x0187 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ Exception -> 0x00fc, all -> 0x0187 }
            if (r3 == 0) goto L_0x0056
            java.lang.String r14 = r3.getPath()     // Catch:{ Exception -> 0x00bb, all -> 0x014a }
            java.lang.String r15 = r0.A00()     // Catch:{ Exception -> 0x00bb, all -> 0x014a }
            java.lang.String r16 = X.C23401Bv.A01(r22)     // Catch:{ Exception -> 0x00bb, all -> 0x014a }
            r13 = r0
            r17 = r4
            r18 = r5
            r19 = r20
            boolean r12 = r13.A0B(r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x00bb, all -> 0x014a }
        L_0x0056:
            if (r24 == 0) goto L_0x00be
            java.io.File r7 = com.whatsapp.util.Log.logFile     // Catch:{ Exception -> 0x00bb, all -> 0x014a }
            java.lang.String r6 = ".gz"
            java.util.Date r2 = new java.util.Date     // Catch:{ Exception -> 0x00bb, all -> 0x014a }
            r2.<init>()     // Catch:{ Exception -> 0x00bb, all -> 0x014a }
            java.lang.String r1 = r7.getName()     // Catch:{ Exception -> 0x00bb, all -> 0x014a }
            java.lang.String r9 = X.AnonymousClass02N.A03(r1, r2)     // Catch:{ Exception -> 0x00bb, all -> 0x014a }
            java.lang.String r1 = r7.getName()     // Catch:{ Exception -> 0x00bb, all -> 0x014a }
            java.lang.String r8 = X.AnonymousClass02N.A02(r1, r6)     // Catch:{ Exception -> 0x00bb, all -> 0x014a }
            java.lang.String r10 = X.AnonymousClass02N.A00(r7, r6, r2)     // Catch:{ Exception -> 0x00bb, all -> 0x014a }
            int r1 = r9.length()     // Catch:{ Exception -> 0x00bb, all -> 0x014a }
            int r6 = r1 + 1
            int r2 = r10.length()     // Catch:{ Exception -> 0x00bb, all -> 0x014a }
            int r1 = r8.length()     // Catch:{ Exception -> 0x00bb, all -> 0x014a }
            int r2 = r2 - r1
            if (r6 >= r2) goto L_0x0095
            java.lang.String r1 = r10.substring(r6, r2)     // Catch:{ NumberFormatException -> 0x0095 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0095 }
            int r1 = r1 + 1
            java.lang.String r6 = java.lang.Integer.toString(r1)     // Catch:{ NumberFormatException -> 0x0095 }
            goto L_0x0097
        L_0x0095:
            java.lang.String r6 = "1"
        L_0x0097:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bb, all -> 0x014a }
            r2.<init>()     // Catch:{ Exception -> 0x00bb, all -> 0x014a }
            r2.append(r9)     // Catch:{ Exception -> 0x00bb, all -> 0x014a }
            java.lang.String r1 = "."
            r2.append(r1)     // Catch:{ Exception -> 0x00bb, all -> 0x014a }
            r2.append(r6)     // Catch:{ Exception -> 0x00bb, all -> 0x014a }
            r2.append(r8)     // Catch:{ Exception -> 0x00bb, all -> 0x014a }
            java.lang.String r6 = r2.toString()     // Catch:{ Exception -> 0x00bb, all -> 0x014a }
            java.lang.String r2 = r7.getParent()     // Catch:{ Exception -> 0x00bb, all -> 0x014a }
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x00bb, all -> 0x014a }
            r1.<init>(r2, r6)     // Catch:{ Exception -> 0x00bb, all -> 0x014a }
            r1.createNewFile()     // Catch:{ Exception -> 0x00bb, all -> 0x014a }
            goto L_0x00be
        L_0x00bb:
            r6 = move-exception
            r1 = r3
            goto L_0x0100
        L_0x00be:
            if (r3 == 0) goto L_0x00f4
            if (r12 != 0) goto L_0x00f4
            long r1 = java.lang.System.currentTimeMillis()
            java.io.File r6 = r0.A06(r3, r1)
            if (r6 == 0) goto L_0x00f4
            java.util.Map r16 = r0.A07(r4)
            java.lang.String r13 = r6.getPath()
            java.lang.String r14 = r0.A00()
            java.lang.String r15 = X.C23401Bv.A01(r22)
            X.1al r12 = new X.1al
            r19 = r5
            r17 = r1
            r12.<init>(r13, r14, r15, r16, r17, r19, r20)
            r0.A09(r12)
            android.os.Handler r4 = r0.A01
            r2 = 24
            com.facebook.redex.RunnableRunnableShape8S0100000_I0_7 r1 = new com.facebook.redex.RunnableRunnableShape8S0100000_I0_7
            r1.<init>(r0, r2)
            r4.post(r1)
        L_0x00f4:
            if (r11 == 0) goto L_0x0017
            if (r3 == 0) goto L_0x0017
            r3.delete()
            return
        L_0x00fc:
            r6 = move-exception
            goto L_0x0100
        L_0x00fe:
            r6 = move-exception
            r11 = 0
        L_0x0100:
            java.lang.String r2 = "crash-log/failedupload"
            com.whatsapp.util.Log.e(r2, r6)     // Catch:{ all -> 0x014f }
            java.lang.String r2 = r6.getMessage()     // Catch:{ all -> 0x014f }
            r0.A0A(r2, r5)     // Catch:{ all -> 0x014f }
            if (r1 == 0) goto L_0x0142
            if (r12 != 0) goto L_0x0142
            long r2 = java.lang.System.currentTimeMillis()
            java.io.File r6 = r0.A06(r1, r2)
            if (r6 == 0) goto L_0x0142
            java.util.Map r16 = r0.A07(r4)
            java.lang.String r13 = r6.getPath()
            java.lang.String r14 = r0.A00()
            java.lang.String r15 = X.C23401Bv.A01(r22)
            X.1al r12 = new X.1al
            r19 = r5
            r17 = r2
            r12.<init>(r13, r14, r15, r16, r17, r19, r20)
            r0.A09(r12)
            android.os.Handler r4 = r0.A01
            r3 = 24
            com.facebook.redex.RunnableRunnableShape8S0100000_I0_7 r2 = new com.facebook.redex.RunnableRunnableShape8S0100000_I0_7
            r2.<init>(r0, r3)
            r4.post(r2)
        L_0x0142:
            if (r11 == 0) goto L_0x0017
            if (r1 == 0) goto L_0x0017
            r1.delete()
            return
        L_0x014a:
            r7 = move-exception
            r1 = r3
            goto L_0x0150
        L_0x014d:
            r7 = move-exception
            throw r7
        L_0x014f:
            r7 = move-exception
        L_0x0150:
            if (r1 == 0) goto L_0x0188
            if (r12 != 0) goto L_0x0188
            long r2 = java.lang.System.currentTimeMillis()
            java.io.File r6 = r0.A06(r1, r2)
            if (r6 == 0) goto L_0x0188
            java.util.Map r16 = r0.A07(r4)
            java.lang.String r13 = r6.getPath()
            java.lang.String r14 = r0.A00()
            java.lang.String r15 = X.C23401Bv.A01(r22)
            X.1al r12 = new X.1al
            r19 = r5
            r17 = r2
            r12.<init>(r13, r14, r15, r16, r17, r19, r20)
            r0.A09(r12)
            android.os.Handler r4 = r0.A01
            r3 = 24
            com.facebook.redex.RunnableRunnableShape8S0100000_I0_7 r2 = new com.facebook.redex.RunnableRunnableShape8S0100000_I0_7
            r2.<init>(r0, r3)
            r4.post(r2)
            goto L_0x0188
        L_0x0187:
            r7 = move-exception
        L_0x0188:
            if (r11 == 0) goto L_0x018f
            if (r1 == 0) goto L_0x018f
            r1.delete()
        L_0x018f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16300so.A04(java.util.HashSet, java.util.Map, boolean, boolean, boolean, boolean):void");
    }

    public void AcB(String str, String str2, boolean z2) {
        HashMap hashMap = new HashMap();
        ((C23401Bv) this).A08(new C29491ai(str), str, str2, hashMap, z2);
    }
}
