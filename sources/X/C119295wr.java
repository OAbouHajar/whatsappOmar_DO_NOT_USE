package X;

import android.content.Context;
import android.os.Build;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: X.5wr  reason: invalid class name and case insensitive filesystem */
public class C119295wr {
    public AnonymousClass5xK A00;
    public final AnonymousClass1G1 A01;
    public final C16040sK A02;
    public final C15900s5 A03;
    public final AnonymousClass01V A04;
    public final C16440t3 A05;
    public final C16980tz A06;
    public final C14710pd A07;
    public final C17190ug A08;
    public final C119365wy A09;
    public final AnonymousClass60V A0A;
    public final C18310wU A0B;
    public final AnonymousClass61W A0C;
    public final AnonymousClass1Vo A0D;
    public final AnonymousClass0y5 A0E;

    public C119295wr(AnonymousClass1G1 r9, C16040sK r10, C15900s5 r11, AnonymousClass01V r12, C16440t3 r13, C16980tz r14, C14710pd r15, C17190ug r16, C119365wy r17, AnonymousClass60V r18, C18310wU r19, AnonymousClass61W r20, AnonymousClass0y5 r21) {
        AnonymousClass1Vo A002 = AnonymousClass1Vo.A00("IndiaUpiSimSwapDetectionUtils", "payment", "IN");
        this.A0D = A002;
        C16980tz r2 = r14;
        this.A06 = r14;
        this.A05 = r13;
        this.A07 = r15;
        this.A02 = r10;
        this.A03 = r11;
        this.A08 = r16;
        AnonymousClass01V r3 = r12;
        this.A04 = r12;
        AnonymousClass1G1 r5 = r9;
        this.A01 = r9;
        this.A0E = r21;
        this.A09 = r17;
        this.A0B = r19;
        AnonymousClass61W r6 = r20;
        this.A0C = r6;
        AnonymousClass60V r7 = r18;
        this.A0A = r7;
        if (Build.VERSION.SDK_INT >= 22) {
            this.A00 = new AnonymousClass5xK(r2, r3, A002, r5, r6, r7);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r4 > 10) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.AnonymousClass1G1 r8, X.AnonymousClass61W r9, java.lang.String r10, java.lang.String r11) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r7 = 0
            if (r0 == 0) goto L_0x0008
            return r7
        L_0x0008:
            if (r10 != 0) goto L_0x0048
            r2 = 0
        L_0x000b:
            if (r11 != 0) goto L_0x003f
            r6 = 0
        L_0x000e:
            java.lang.String r0 = X.C39851tA.A02(r6)
            java.lang.String r5 = X.AnonymousClass2JO.A02(r8, r0, r2)
            int r4 = r5.length()
            r0 = 12
            java.lang.String r3 = "91"
            if (r4 == r0) goto L_0x0034
            boolean r0 = r5.startsWith(r3)
            if (r0 == 0) goto L_0x0030
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r1 = 0
            java.lang.String r0 = "incorrect_country_prefix_validation"
            r9.AKS(r2, r1, r0, r1)
        L_0x0030:
            r0 = 10
            if (r4 <= r0) goto L_0x0051
        L_0x0034:
            boolean r0 = r5.startsWith(r3)
            if (r0 == 0) goto L_0x0051
            boolean r0 = android.text.TextUtils.equals(r5, r6)
            return r0
        L_0x003f:
            java.lang.String r1 = "\\D"
            java.lang.String r0 = ""
            java.lang.String r6 = r11.replaceAll(r1, r0)
            goto L_0x000e
        L_0x0048:
            java.lang.String r1 = "\\D"
            java.lang.String r0 = ""
            java.lang.String r2 = r10.replaceAll(r1, r0)
            goto L_0x000b
        L_0x0051:
            java.lang.String r0 = ""
            java.lang.String r0 = r6.replaceFirst(r3, r0)
            boolean r0 = android.text.TextUtils.equals(r5, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119295wr.A00(X.1G1, X.61W, java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008e, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008f, code lost:
        com.whatsapp.util.Log.w("PAY: IndiaUpiPaymentSharedPrefs logDeviceBindingStatus threw: ", r5);
        r3 = "";
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01() {
        /*
            r13 = this;
            X.0s5 r1 = r13.A03
            X.0s8 r0 = X.C15910s6.A0p
            boolean r0 = r1.A05(r0)
            r4 = 0
            if (r0 == 0) goto L_0x00d8
            X.0sK r0 = r13.A02
            r0.A0B()
            X.1Zb r0 = r0.A01
            java.lang.String r1 = X.C24561Gk.A01(r0)
            X.1Vo r2 = r13.A0D
            java.lang.String r0 = "checkSimWithWaRegisteredNumberIsInstalled : device binding status: "
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0r(r0)
            X.60V r0 = r13.A0A
            java.lang.String r5 = "device_binding_sim_id"
            java.lang.String r9 = "device_binding_sim_iccid"
            org.json.JSONObject r8 = X.C13700nu.A0J()     // Catch:{ JSONException -> 0x008e }
            java.lang.String r11 = "skipDevBinding"
            monitor-enter(r0)     // Catch:{ JSONException -> 0x008e }
            r10 = 0
            X.0wT r3 = r0.A03     // Catch:{ JSONException -> 0x0041 }
            java.lang.String r6 = r3.A04()     // Catch:{ JSONException -> 0x0041 }
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch:{ JSONException -> 0x0041 }
            if (r3 != 0) goto L_0x0047
            org.json.JSONObject r3 = X.C13700nu.A0K(r6)     // Catch:{ JSONException -> 0x0041 }
            boolean r10 = r3.optBoolean(r11, r4)     // Catch:{ JSONException -> 0x0041 }
            goto L_0x0047
        L_0x0041:
            r6 = move-exception
            java.lang.String r3 = "PAY: IndiaUpiPaymentSharedPrefs readDeviceBinding threw: "
            com.whatsapp.util.Log.w(r3, r6)     // Catch:{ all -> 0x008b }
        L_0x0047:
            monitor-exit(r0)     // Catch:{ JSONException -> 0x008e }
            r8.put(r11, r10)     // Catch:{ JSONException -> 0x008e }
            r6 = 1
            java.lang.String[] r3 = new java.lang.String[r6]     // Catch:{ JSONException -> 0x008e }
            r3[r4] = r9     // Catch:{ JSONException -> 0x008e }
            java.lang.String[] r3 = r0.A0U(r3)     // Catch:{ JSONException -> 0x008e }
            r3 = r3[r4]     // Catch:{ JSONException -> 0x008e }
            java.lang.String r3 = X.AnonymousClass5x3.A01(r3)     // Catch:{ JSONException -> 0x008e }
            r8.put(r9, r3)     // Catch:{ JSONException -> 0x008e }
            java.lang.String[] r3 = new java.lang.String[r6]     // Catch:{ JSONException -> 0x008e }
            r3[r4] = r5     // Catch:{ JSONException -> 0x008e }
            java.lang.String[] r3 = r0.A0U(r3)     // Catch:{ JSONException -> 0x008e }
            r3 = r3[r4]     // Catch:{ JSONException -> 0x008e }
            java.lang.String r3 = X.AnonymousClass5x3.A01(r3)     // Catch:{ JSONException -> 0x008e }
            r8.put(r5, r3)     // Catch:{ JSONException -> 0x008e }
            java.lang.String r6 = r0.A08()     // Catch:{ JSONException -> 0x008e }
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch:{ JSONException -> 0x008e }
            if (r3 != 0) goto L_0x0086
            java.lang.String r3 = "psp"
            r8.put(r3, r6)     // Catch:{ JSONException -> 0x008e }
            java.lang.String r5 = "devBinding"
            boolean r3 = r0.A0T(r6)     // Catch:{ JSONException -> 0x008e }
            r8.put(r5, r3)     // Catch:{ JSONException -> 0x008e }
        L_0x0086:
            java.lang.String r3 = r8.toString()     // Catch:{ JSONException -> 0x008e }
            goto L_0x0096
        L_0x008b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ JSONException -> 0x008e }
            throw r3     // Catch:{ JSONException -> 0x008e }
        L_0x008e:
            r5 = move-exception
            java.lang.String r3 = "PAY: IndiaUpiPaymentSharedPrefs logDeviceBindingStatus threw: "
            com.whatsapp.util.Log.w(r3, r5)
            java.lang.String r3 = ""
        L_0x0096:
            java.lang.String r3 = X.AnonymousClass000.A0h(r3, r7)
            r2.A06(r3)
            X.0t3 r7 = r13.A05
            X.0pd r8 = r13.A07
            X.0ug r9 = r13.A08
            X.5wy r10 = r13.A09
            X.0wU r11 = r13.A0B
            X.5iD r6 = new X.5iD
            r6.<init>(r7, r8, r9, r10, r11)
            int r5 = android.os.Build.VERSION.SDK_INT
            r3 = 22
            if (r5 < r3) goto L_0x00b9
            X.5xK r0 = r13.A00
            int r0 = r0.A03(r6, r1)
            return r0
        L_0x00b9:
            r12 = 1
            java.lang.String r3 = "Check sim on version < 22"
            r2.A06(r3)
            X.01V r3 = r13.A04
            android.telephony.TelephonyManager r5 = r3.A0N()
            java.lang.String r9 = r5.getLine1Number()
            X.1G1 r11 = r13.A01
            X.61W r10 = r13.A0C
            boolean r3 = A00(r11, r10, r9, r1)
            if (r3 == 0) goto L_0x00d9
            java.lang.String r0 = "Phone 1 matched"
        L_0x00d5:
            r2.A06(r0)
        L_0x00d8:
            return r4
        L_0x00d9:
            java.lang.String r3 = "checkSimWithWaRegisteredNumberIsInstalled Phone 1 not matched | sim number : "
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0r(r3)
            r3.append(r9)
            java.lang.String r8 = " | waNumber : "
            r3.append(r8)
            java.lang.String r3 = X.AnonymousClass000.A0h(r1, r3)
            r2.A06(r3)
            java.lang.String r5 = r5.getSimSerialNumber()
            java.lang.String r6 = r0.A0A()
            boolean r0 = android.text.TextUtils.equals(r5, r6)
            if (r0 == 0) goto L_0x00ff
            java.lang.String r0 = "ICCID 1 matched"
            goto L_0x00d5
        L_0x00ff:
            java.lang.String r0 = "checkSimWithWaRegisteredNumberIsInstalled ICCID 1 not matched simId : "
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass5x3.A01(r5)
            r3.append(r0)
            java.lang.String r5 = " | storedId : "
            r3.append(r5)
            java.lang.String r0 = X.AnonymousClass5x3.A01(r6)
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r3)
            r2.A06(r0)
            java.lang.String r0 = "getLine1Number"
            java.lang.String r7 = r13.A04(r0)
            java.lang.String r0 = "Phone "
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0r(r0)
            r3.append(r7)
            java.lang.String r0 = " phone2 "
            r3.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r7, r3)
            r2.A06(r0)
            boolean r0 = A00(r11, r10, r7, r1)
            if (r0 == 0) goto L_0x0140
            java.lang.String r0 = "Phone 2 matched"
            goto L_0x00d5
        L_0x0140:
            java.lang.String r0 = "checkSimWithWaRegisteredNumberIsInstalled Phone 2 not matched | sim number : "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            r0.append(r9)
            r0.append(r8)
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            r2.A06(r0)
            java.lang.String r0 = "getSimSerialNumber"
            java.lang.String r3 = r13.A04(r0)
            java.lang.String r0 = "ID"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r6)
            java.lang.String r0 = " ID2 "
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r1)
            r2.A04(r0)
            boolean r0 = android.text.TextUtils.equals(r6, r3)
            if (r0 == 0) goto L_0x0178
            java.lang.String r0 = "ICCID 2 matched"
            goto L_0x00d5
        L_0x0178:
            java.lang.String r0 = "checkSimWithWaRegisteredNumberIsInstalled ICCID 2 not matched simId : "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass5x3.A01(r3)
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = X.AnonymousClass5x3.A01(r6)
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            r2.A06(r0)
            java.lang.String r0 = "IndiaUpiSimSwapDetectionUtils : No ICCID matched on API 22 or lower"
            r2.A06(r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119295wr.A01():int");
    }

    public SmsManager A02(int i2) {
        return AnonymousClass5xK.A00(i2);
    }

    public String A03() {
        int i2;
        try {
            Context context = this.A06.A00;
            if (AnonymousClass00T.A01(context, "android.permission.READ_PHONE_STATE") != 0 || ((i2 = Build.VERSION.SDK_INT) >= 30 && AnonymousClass00T.A01(context, "android.permission.READ_PHONE_NUMBERS") != 0)) {
                return null;
            }
            C16040sK r0 = this.A02;
            r0.A0B();
            String A012 = C24561Gk.A01(r0.A01);
            if (i2 >= 22) {
                return this.A00.A04(A012);
            }
            TelephonyManager A0N = this.A04.A0N();
            String line1Number = A0N.getLine1Number();
            AnonymousClass1G1 r2 = this.A01;
            AnonymousClass61W r1 = this.A0C;
            if (A00(r2, r1, line1Number, A012)) {
                this.A0D.A04("store first iccid");
                return A0N.getSimSerialNumber();
            } else if (A00(r2, r1, A04("getLine1Number"), A012)) {
                this.A0D.A04("store second iccid");
                return A04("getSimSerialNumber");
            } else {
                if (A0N.getSimSerialNumber() != null) {
                    return A0N.getSimSerialNumber();
                }
                return null;
            }
        } catch (Exception e2) {
            this.A0D.A0A("Unable to get device bind ICCID", e2);
        }
    }

    public final String A04(String str) {
        TelephonyManager A0N = this.A04.A0N();
        try {
            Method method = Class.forName(A0N.getClass().getName()).getMethod(str, new Class[]{Integer.TYPE});
            Object[] objArr = new Object[1];
            AnonymousClass000.A1M(objArr, 1, 0);
            Object invoke = method.invoke(A0N, objArr);
            if (invoke != null) {
                return invoke.toString();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return null;
    }

    public List A05(Context context) {
        return AnonymousClass5xK.A02(context);
    }
}
