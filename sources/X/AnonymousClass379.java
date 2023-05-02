package X;

import android.content.Intent;
import android.os.Bundle;
import com.obwhatsapp.LegacyMessageDialogFragment;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.379  reason: invalid class name */
public class AnonymousClass379 extends C16690tT {
    public WeakReference A00;
    public HashMap A01;
    public final Bundle A02;
    public final AnonymousClass1KO A03;
    public final C18260wP A04;
    public final AnonymousClass01V A05;
    public final C16260sj A06;
    public final AnonymousClass1Y3 A07;
    public final AnonymousClass15W A08;
    public final AnonymousClass1KP A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public AnonymousClass379(Bundle bundle, C14550pN r3, AnonymousClass1KO r4, C18260wP r5, AnonymousClass01V r6, C16260sj r7, AnonymousClass1Y3 r8, AnonymousClass15W r9, AnonymousClass1KP r10, String str, boolean z2, boolean z3, boolean z4) {
        super(r3, true);
        this.A00 = C13690nt.A0h(r3);
        this.A03 = r4;
        this.A05 = r6;
        this.A08 = r9;
        this.A09 = r10;
        this.A04 = r5;
        this.A06 = r7;
        this.A0C = z2;
        this.A0B = z3;
        this.A0D = z4;
        this.A0A = str;
        this.A02 = bundle;
        this.A07 = r8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0138, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0139, code lost:
        r0 = "checksystemstatus/ioerror ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x013c, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x013d, code lost:
        r0 = "checksystemstatus/error ";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x012b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x0132 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:76:0x0137 */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0138 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:3:0x000e] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x00c2=Splitter:B:34:0x00c2, B:54:0x0103=Splitter:B:54:0x0103, B:76:0x0137=Splitter:B:76:0x0137} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r20) {
        /*
            r19 = this;
            r3 = r19
            java.lang.ref.WeakReference r0 = r3.A00
            java.lang.Object r2 = r0.get()
            android.content.Context r2 = (android.content.Context) r2
            if (r2 == 0) goto L_0x0149
            r10 = -1
            r14 = 0
            X.1KP r1 = r3.A09     // Catch:{ IOException -> 0x0138, Exception -> 0x013c }
            java.util.HashMap r5 = X.AnonymousClass000.A0x()     // Catch:{ IOException -> 0x0138, Exception -> 0x013c }
            java.lang.String r13 = X.AnonymousClass021.A0E     // Catch:{ IOException -> 0x0138, Exception -> 0x013c }
            X.0zG r11 = r1.A0E     // Catch:{ IOException -> 0x0138, Exception -> 0x013c }
            X.16H r11 = (X.AnonymousClass16H) r11     // Catch:{ IOException -> 0x0138, Exception -> 0x013c }
            java.lang.Integer r12 = X.C13690nt.A0U()     // Catch:{ IOException -> 0x0138, Exception -> 0x013c }
            r7 = 0
            r16 = r14
            r17 = 0
            r18 = 0
            r15 = r14
            X.1pl r4 = r11.A00(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ IOException -> 0x0138, Exception -> 0x013c }
            int r6 = r4.A6O()     // Catch:{ all -> 0x0133 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r6 == r0) goto L_0x0041
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = "http/serverstatus/error status="
            java.lang.String r0 = X.C13680ns.A0i(r0, r1, r6)     // Catch:{ all -> 0x0133 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0133 }
            goto L_0x00c2
        L_0x0041:
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0133 }
            X.0ua r1 = r1.A03     // Catch:{ all -> 0x0133 }
            java.lang.Integer r0 = X.C13680ns.A0Y()     // Catch:{ all -> 0x0133 }
            java.io.InputStream r8 = r4.A9k(r1, r14, r0)     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = X.AnonymousClass01S.A08     // Catch:{ all -> 0x012c }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x012c }
            r6.<init>(r8, r0)     // Catch:{ all -> 0x012c }
            r0 = 4096(0x1000, float:5.74E-42)
            char[] r1 = new char[r0]     // Catch:{ all -> 0x0127 }
        L_0x005a:
            int r0 = r6.read(r1)     // Catch:{ all -> 0x0127 }
            if (r0 < 0) goto L_0x0064
            r9.append(r1, r7, r0)     // Catch:{ all -> 0x0127 }
            goto L_0x005a
        L_0x0064:
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x0127 }
            r6.close()     // Catch:{ all -> 0x012c }
            if (r8 == 0) goto L_0x0070
            r8.close()     // Catch:{ all -> 0x0133 }
        L_0x0070:
            org.json.JSONObject r6 = X.C13700nu.A0K(r0)     // Catch:{ JSONException -> 0x011e }
            java.util.Iterator r9 = r6.keys()     // Catch:{ JSONException -> 0x011e }
        L_0x0078:
            boolean r0 = r9.hasNext()     // Catch:{ JSONException -> 0x011e }
            if (r0 == 0) goto L_0x00c2
            java.lang.String r8 = X.AnonymousClass000.A0m(r9)     // Catch:{ JSONException -> 0x011e }
            org.json.JSONObject r1 = r6.getJSONObject(r8)     // Catch:{ JSONException -> 0x011e }
            java.lang.String r0 = "available"
            java.lang.String r7 = r1.getString(r0)     // Catch:{ JSONException -> 0x011e }
            java.lang.String r0 = "false"
            boolean r0 = r0.equals(r7)     // Catch:{ JSONException -> 0x011e }
            if (r0 == 0) goto L_0x009a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ JSONException -> 0x011e }
            r5.put(r8, r0)     // Catch:{ JSONException -> 0x011e }
            goto L_0x0078
        L_0x009a:
            java.lang.String r0 = "true"
            boolean r0 = r0.equals(r7)     // Catch:{ JSONException -> 0x011e }
            if (r0 == 0) goto L_0x00a9
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ JSONException -> 0x011e }
            r5.put(r8, r0)     // Catch:{ JSONException -> 0x011e }
            goto L_0x0078
        L_0x00a9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ JSONException -> 0x011e }
            java.lang.String r0 = "http/serverstatus/error "
            r1.append(r0)     // Catch:{ JSONException -> 0x011e }
            r1.append(r8)     // Catch:{ JSONException -> 0x011e }
            java.lang.String r0 = "="
            r1.append(r0)     // Catch:{ JSONException -> 0x011e }
            java.lang.String r0 = X.AnonymousClass000.A0h(r7, r1)     // Catch:{ JSONException -> 0x011e }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ JSONException -> 0x011e }
            goto L_0x0078
        L_0x00c2:
            r4.close()     // Catch:{ IOException -> 0x0138, Exception -> 0x013c }
            r3.A01 = r5     // Catch:{ IOException -> 0x0138, Exception -> 0x013c }
            boolean r0 = r3.A0C     // Catch:{ IOException -> 0x0138, Exception -> 0x013c }
            if (r0 != 0) goto L_0x0149
            android.content.ContentResolver r1 = r2.getContentResolver()     // Catch:{ SettingNotFoundException -> 0x00fc, Exception -> 0x0100, IOException -> 0x0138 }
            java.lang.String r0 = "wifi_sleep_policy"
            int r1 = android.provider.Settings.System.getInt(r1, r0)     // Catch:{ SettingNotFoundException -> 0x00fc, Exception -> 0x0100, IOException -> 0x0138 }
            if (r1 == 0) goto L_0x00e5
            r0 = 1
            if (r1 == r0) goto L_0x00e2
            r0 = 2
            if (r1 == r0) goto L_0x00df
            goto L_0x00e8
        L_0x00df:
            java.lang.String r2 = "never"
            goto L_0x00eb
        L_0x00e2:
            java.lang.String r2 = "never-while-plugged"
            goto L_0x00eb
        L_0x00e5:
            java.lang.String r2 = "default"
            goto L_0x00eb
        L_0x00e8:
            java.lang.String r2 = "unknown"
        L_0x00eb:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ SettingNotFoundException -> 0x00fc, Exception -> 0x0100, IOException -> 0x0138 }
            java.lang.String r0 = "about/wifisleep/"
            r1.append(r0)     // Catch:{ SettingNotFoundException -> 0x00fc, Exception -> 0x0100, IOException -> 0x0138 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r2, r1)     // Catch:{ SettingNotFoundException -> 0x00fc, Exception -> 0x0100, IOException -> 0x0138 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SettingNotFoundException -> 0x00fc, Exception -> 0x0100, IOException -> 0x0138 }
            goto L_0x0106
        L_0x00fc:
            r1 = move-exception
            java.lang.String r0 = "about/wifisleep/not-found"
            goto L_0x0103
        L_0x0100:
            r1 = move-exception
            java.lang.String r0 = "about/wifisleep/error "
        L_0x0103:
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ IOException -> 0x0138, Exception -> 0x013c }
        L_0x0106:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()     // Catch:{ IOException -> 0x0138, Exception -> 0x013c }
            java.lang.String r0 = "about/contacts/count "
            r2.append(r0)     // Catch:{ IOException -> 0x0138, Exception -> 0x013c }
            X.01V r1 = r3.A05     // Catch:{ IOException -> 0x0138, Exception -> 0x013c }
            X.0sj r0 = r3.A06     // Catch:{ IOException -> 0x0138, Exception -> 0x013c }
            java.lang.Integer r0 = X.AnonymousClass46T.A00(r1, r0)     // Catch:{ IOException -> 0x0138, Exception -> 0x013c }
            r2.append(r0)     // Catch:{ IOException -> 0x0138, Exception -> 0x013c }
            X.C13680ns.A1V(r2)     // Catch:{ IOException -> 0x0138, Exception -> 0x013c }
            goto L_0x0149
        L_0x011e:
            r2 = move-exception
            java.lang.String r1 = "error parsing json"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0133 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0133 }
            throw r0     // Catch:{ all -> 0x0133 }
        L_0x0127:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x012b }
        L_0x012b:
            throw r0     // Catch:{ all -> 0x012c }
        L_0x012c:
            r0 = move-exception
            if (r8 == 0) goto L_0x0132
            r8.close()     // Catch:{ all -> 0x0132 }
        L_0x0132:
            throw r0     // Catch:{ all -> 0x0133 }
        L_0x0133:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0137 }
        L_0x0137:
            throw r0     // Catch:{ IOException -> 0x0138, Exception -> 0x013c }
        L_0x0138:
            r1 = move-exception
            java.lang.String r0 = "checksystemstatus/ioerror "
            goto L_0x013f
        L_0x013c:
            r1 = move-exception
            java.lang.String r0 = "checksystemstatus/error "
        L_0x013f:
            com.whatsapp.util.Log.w(r0, r1)
            r3.A01 = r14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            return r0
        L_0x0149:
            java.lang.Integer r0 = X.C13680ns.A0X()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass379.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Intent intent;
        boolean z2;
        ArrayList arrayList;
        String str;
        String str2;
        AnonymousClass1Y3 r12;
        Bundle bundle;
        AnonymousClass1KO r9;
        AnonymousClass2T3 A012;
        C14550pN r10 = (C14550pN) this.A00.get();
        if (r10 != null && !r10.AIm()) {
            r10.Ac1();
            int i2 = null;
            if (!this.A04.A0A()) {
                Log.i("checksystemstatus/no-connectivity");
                A012 = LegacyMessageDialogFragment.A01(new Object[]{r10.getString(R.string.str053b)}, R.string.str1372);
            } else {
                HashMap hashMap = this.A01;
                if (hashMap == null || hashMap.size() == 0) {
                    Log.i("checksystemstatus/no-server-status");
                    if (this.A0C) {
                        A012 = LegacyMessageDialogFragment.A01(new Object[0], R.string.str1596);
                        A012.A01(C91484fz.A00, R.string.str0e89);
                    } else {
                        StringBuilder A0o = AnonymousClass000.A0o();
                        boolean z3 = this.A0B;
                        A0o.append(z3 ? "chat" : "reg");
                        str = AnonymousClass000.A0h("-unknown", A0o);
                        if (z3) {
                            i2 = 1;
                        }
                        r9 = this.A03;
                        z2 = this.A08.A00();
                        str2 = this.A0A;
                        arrayList = null;
                        bundle = this.A02;
                        r12 = this.A07;
                    }
                } else {
                    ArrayList A0u = AnonymousClass000.A0u();
                    boolean z4 = true;
                    boolean z5 = true;
                    for (Object next : hashMap.keySet()) {
                        if ("version".equals(next)) {
                            Object obj2 = this.A01.get(next);
                            AnonymousClass00B.A06(obj2);
                            z5 = AnonymousClass000.A1X(obj2);
                        } else {
                            boolean equals = "email".equals(next);
                            Object obj3 = this.A01.get(next);
                            AnonymousClass00B.A06(obj3);
                            if (equals) {
                                z4 = AnonymousClass000.A1X(obj3);
                            } else if (!AnonymousClass000.A1X(obj3)) {
                                A0u.add(next);
                            }
                        }
                    }
                    if (A0u.size() != 0 || !z5 || this.A0C) {
                        String str3 = this.A0A;
                        if (this.A0B) {
                            i2 = 1;
                        }
                        boolean z6 = this.A0C;
                        Bundle bundle2 = this.A02;
                        intent = C13680ns.A09().setClassName(r10.getPackageName(), "com.obwhatsapp.systemstatus.SystemStatusActivity");
                        intent.putExtra("com.obwhatsapp.SystemStatusActivity.from", str3);
                        intent.putExtra("com.obwhatsapp.SystemStatusActivity.email", z4);
                        intent.putExtra("com.obwhatsapp.SystemStatusActivity.version", z5);
                        intent.putStringArrayListExtra("com.obwhatsapp.SystemStatusActivity.serverfeaturesunavailable", A0u);
                        intent.putExtra("com.obwhatsapp.SystemStatusActivity.statusonly", z6);
                        if (i2 != null) {
                            intent.putExtra("com.obwhatsapp.SystemStatusActivity.type", i2);
                        }
                        if (bundle2 != null) {
                            intent.putExtra("com.obwhatsapp.SystemStatusActivity.describeProblemBundle", bundle2);
                        }
                        r10.A2X(intent, this.A0D);
                        return;
                    }
                    if (this.A0B) {
                        i2 = 1;
                    }
                    r9 = this.A03;
                    z2 = this.A08.A00();
                    str2 = this.A0A;
                    str = null;
                    bundle = this.A02;
                    r12 = this.A07;
                    arrayList = null;
                }
                intent = r9.A00(r10, bundle, r12, i2, str2, str, arrayList, arrayList, z2);
                r10.A2X(intent, this.A0D);
                return;
            }
            A012.A00().A1G(r10.AGM(), (String) null);
        }
    }
}
